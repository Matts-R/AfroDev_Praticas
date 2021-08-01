package Dia11.CRUD;

/**
 *
 * @author matheus
 */
public enum RespostasParaExceptions {
    TIMEOUTEXCEPTION_RESPOSTA("O Driver tentou se conectar "
            + "ao banco de dados por 5 minutos e não obteve resposta."
            + "\nFavor tente se conectar novamente."),
    SQLEXCEPTION_RESPOSTA("Ocorreu um erro ao tentar acessaro banco de dados."
            + "Possíveis Soluções ..."
            + "\nVerifique se seu respectivo Banco de Dados está funcionando corretamente."
            + "\nVerifique se o arquivo com as informações sobre o banco "
            + "de dados está preenchido corretamente ou se seus dados são"),
    FILENOTFOUNDEXCEPTION_RESPOSTA(
            "Arquivo para as informações não pôde ser encontrado"
            + "\nFavor informe um novo caminho: "),
    IOEXCEPTION_RESPOSTA("Arquivo com as informações sobre o banco de dados não pode ser carregado");

    private String resposta;

    private RespostasParaExceptions(String resposta) {
        this.resposta = resposta;
    }
    
    public String getResposta() {
        return resposta;
    }
}
