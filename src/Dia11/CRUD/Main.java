package Dia11.CRUD;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Connection connection = null;
        PreparedStatement statement = null;
        Scanner input = new Scanner(System.in);
        int linhasAfetadas = 0;

        try {
            connection = ConnectionFactory.getConnection();
            System.out.println("Conectado ao Banco de Dados com Sucesso !!");
            

            // INSERINDO DADOS //
            statement = connection.prepareStatement(SQLQueries.insert());

            System.out.print("Informe o nome: ");
            String nome = input.nextLine();
            System.out.println("Informe o RA: ");
            Integer RA = input.nextInt();

            statement.setString(1, nome);
            statement.setInt(2, RA);

            linhasAfetadas = statement.executeUpdate();
            System.out.println("Linhas afetadas pela Query " + linhasAfetadas);

            // RECUPERANDO DADOS //
            statement = connection.prepareStatement(SQLQueries.retrieve());
            statement.setInt(1, 2);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nomeRecuperado = rs.getString("nome");
                Integer raRecuperado = rs.getInt("RA");

                System.out.println("Nome: " + nomeRecuperado + "\nRA " + raRecuperado);
            }

            // ATUALIZANDO DADOS //
            statement = connection.prepareStatement(SQLQueries.updateName());
            statement.setString(1, "Henrique");
            statement.setInt(2, 1);
            linhasAfetadas = statement.executeUpdate();
            System.out.println("Linhas afetadas pela Query " + linhasAfetadas);

            // DELETANDO DADOS //
            statement = connection.prepareStatement(SQLQueries.delete());
            statement.setString(1, "Henrique");
            linhasAfetadas = statement.executeUpdate();
            System.out.println("Linhas afetadas pela Query " + linhasAfetadas);

            connection.commit();
            System.out.println("Query Feita");
            connection.close();
        } catch (SQLException exception) {
            System.out.println("Problema na conexão");
            exception.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(connection);

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }

    }

}
