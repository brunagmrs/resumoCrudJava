//Após a criação da classe Conexão, podemos escrever a classe Script com o método main para criar o banco de dados e suas tabelas

import java.sql.*;

public class ScriptBancoDados {

    public static void criarBancoDados(){ //cria banco de dados vazio
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
    }
    

    public static void criarTabelaObjeto(){ //cria tabela com os respectivos atributos
        try {
            Conexao conexao = new Conexao(); //instancia um objeto da classe conexao
            Connection con = conexao.conectar(); //utiliza a função conectar com a instancia de connection
            Statement st = con.createStatement(); //declaração do objeto Statement para executar a query de criação de tabela
            String sql = "CREATE TABLE IF NOT EXISTS tabelaObjeto(" //descrição da query
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "atributo1 VARCHAR(100),"
                    + "atributo2 INT,"
                    + "atributo3 DOUBLE,"
                    + "PRIMARY KEY (id));";
            System.out.println(sql); //impressão da query
            st.execute(sql); //execução da query
            st.close(); //fecha statement
            con.close(); //fecha conexão
        } catch (SQLException ex) { //exceção
            System.out.println(ex.getMessage()); //imprime mensagem
            ex.printStackTrace(); //imprime exceção no terminal
        }
    }
    
    
    public static void main(String[] args) {
            criarBancoDados(); //método que cria banco de dados vazio (sem tabelas)
            criarTabelaObjeto(); //método que cria tabela objeto no banco de dados
    }
    
}
