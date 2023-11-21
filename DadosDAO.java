package t2front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosDAO {
    private static final String INSERIR_DADOS_SQL = "INSERT INTO javalar (nome, matricula, id, nome_arquivo, "
            + "bug_python, bug_javascript, bug_ruby, bug_php, bug_csharp, bug_cmais, bug_c, "
            + "dev_python, dev_javascript, dev_ruby, dev_php, dev_csharp, dev_cmais, dev_c, "
            + "v_python, v_javascript, v_ruby, v_php, v_csharp, v_cmais, v_c, "
            + "d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c, "
            + "a_python, a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c, "
            + "bug_q1, bug_q2, bug_q3, bug_q4) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


    public void inserirDados(Dados dados) {
    	
    	Conexao conexao = new Conexao();
    	System.out.println("Query SQL: " + INSERIR_DADOS_SQL);

        try (Connection connection = conexao.getConexao();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERIR_DADOS_SQL)) {

            configurarParametros(preparedStatement, dados);

            preparedStatement.executeUpdate();

            System.out.println("Dados inseridos com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
    }

    private void configurarParametros(PreparedStatement preparedStatement, Dados dados) throws SQLException {
        preparedStatement.setString(1, dados.getNome());
        preparedStatement.setString(2, dados.getMatricula());
        preparedStatement.setString(3, dados.getId());
        preparedStatement.setString(4, dados.getNomeArquivo());
        preparedStatement.setInt(5, dados.getBugPython());
        preparedStatement.setInt(6, dados.getBugJavaScript());
        preparedStatement.setInt(7, dados.getBugRuby());
        preparedStatement.setInt(8, dados.getBugPHP());
        preparedStatement.setInt(9, dados.getBugCSharp());
        preparedStatement.setInt(10, dados.getBugCPlusPlus());
        preparedStatement.setInt(11, dados.getBugC());
        preparedStatement.setInt(12, dados.getDevPython());
        preparedStatement.setInt(13, dados.getDevJavaScript());
        preparedStatement.setInt(14, dados.getDevRuby());
        preparedStatement.setInt(15, dados.getDevPHP());
        preparedStatement.setInt(16, dados.getDevCSharp());
        preparedStatement.setInt(17, dados.getDevCPlusPlus());
        preparedStatement.setInt(18, dados.getDevC());
        preparedStatement.setInt(19, dados.getvPython());
        preparedStatement.setInt(20, dados.getvJavaScript());
        preparedStatement.setInt(21, dados.getvRuby());
        preparedStatement.setInt(22, dados.getvPHP());
        preparedStatement.setInt(23, dados.getvCSharp());
        preparedStatement.setInt(24, dados.getvCPlusPlus());
        preparedStatement.setInt(25, dados.getvC());
        preparedStatement.setInt(26, dados.getdPython());
        preparedStatement.setInt(27, dados.getdJavaScript());
        preparedStatement.setInt(28, dados.getdRuby());
        preparedStatement.setInt(29, dados.getdPHP());
        preparedStatement.setInt(30, dados.getdCSharp());
        preparedStatement.setInt(31, dados.getdCPlusPlus());
        preparedStatement.setInt(32, dados.getdC());
        preparedStatement.setInt(33, dados.getaPython());
        preparedStatement.setInt(34, dados.getaJavaScript());
        preparedStatement.setInt(35, dados.getaRuby());
        preparedStatement.setInt(36, dados.getaPHP());
        preparedStatement.setInt(37, dados.getaCSharp());
        preparedStatement.setInt(38, dados.getaCPlusPlus());
        preparedStatement.setInt(39, dados.getaC());
        preparedStatement.setInt(40, dados.getBugQ1());
        preparedStatement.setInt(41, dados.getBugQ2());
        preparedStatement.setInt(42, dados.getBugQ3());
        preparedStatement.setInt(43, dados.getBugQ4());
    }
}
