package Dia11.CRUD;

import java.io.*;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public final class ConnectionFactory {

    private static Connection connection = null;
    private static String dbPropertiesPath;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties dbProperties = loadProperties();

                String dataBaseAdress = dbProperties.getProperty("DataBaseAdress");
                String username = dbProperties.getProperty("username");
                String password = dbProperties.getProperty("password");

                DriverManager.setLoginTimeout(300);
                connection = DriverManager.getConnection(dataBaseAdress, username, password);
                connection.setAutoCommit(false);

            } catch (SQLTimeoutException e) {
                JOptionPane.showMessageDialog(null, RespostasParaExceptions.TIMEOUTEXCEPTION_RESPOSTA.getResposta());
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, RespostasParaExceptions.SQLEXCEPTION_RESPOSTA.getResposta());

            }
        }
        return connection;
    }

    private static Properties loadProperties() {
        if (dbPropertiesPath == null || dbPropertiesPath.trim().equals("")) {
            dbPropertiesPath = JOptionPane.showInputDialog("Favor informe o caminho absoluto "
                    + "para o arquivo que contêm as informações sobre o banco de dados: ");
        }
        dbPropertiesPath.trim();

        Properties dbProperties = null;
        FileReader reader = null;

        try {
            reader = new FileReader(dbPropertiesPath);
            dbProperties = new Properties();
            dbProperties.load(reader);
         
            reader.close();
        } catch (FileNotFoundException fnfe) {
            setNewPropertiesPath();
        } catch (IOException exception) {
            tryLoadReader(reader, dbProperties);
        }
        
        return dbProperties;
    }

    private static void setNewPropertiesPath() {
        dbPropertiesPath = JOptionPane
                .showInputDialog(RespostasParaExceptions.FILENOTFOUNDEXCEPTION_RESPOSTA.getResposta());

        loadProperties();
    }

    private static void tryLoadReader(FileReader reader, Properties dbProperties) {
        try {
            for (int i = 0; i < 3; i++) {
                reader = new FileReader(dbPropertiesPath);
                dbProperties = new Properties();
                dbProperties.load(reader);
            }

        } catch (IOException ioe) {
            JOptionPane
                    .showMessageDialog(null, RespostasParaExceptions.IOEXCEPTION_RESPOSTA.getResposta());
        }
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                for (int i = 0; i < 10; i++) {
                    connection.close();
                    if (connection.isClosed()) {
                        JOptionPane
                                .showMessageDialog(null, "Conexão encerrada com sucesso !!",
                                        "Status Conexão: ENCERRADA",
                                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            } catch (SQLException e) {
                JOptionPane
                        .showMessageDialog(null, "Após 10 tentativas, a conexão não pode ser encerrada",
                                "Status Conexão: ERRO DE ACESSO",
                                JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe uma conexão para ser fechada");
        }
    }
}
