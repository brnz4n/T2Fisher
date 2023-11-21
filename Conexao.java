package t2front;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String host;
    private String usuario;
    private String senha;
    private String banco;
    private Connection conexao;
    
    public Conexao() {
       
        this.host = "da_java.mysql.dbaas.com.br";
        this.banco = "da_java";
        this.usuario = "da_java";
        this.senha = "Tecnicas*2023@";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL não encontrado");
            e.printStackTrace();
        }
    
    }
    public Connection getConexao() {
    	String url="jdbc:mysql://" + this.host + ":3306/" + this.banco + "?enabledTLSProtocols=TLSv1.2&verifyServerCertificate=false&useSSL=true";
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Conexão com MYSQL não realizada");
            ex.printStackTrace();
        }
        return null;
    }
    public void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
