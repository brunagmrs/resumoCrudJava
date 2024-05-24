//Ap�s a cria��o da classe Conex�o, podemos escrever a classe Script com o m�todo main para criar o banco de dados e suas tabelas

import java.sql.*;

public class ScriptBancoDados {

    public static void criarBancoDados(){ //cria banco de dados vazio
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
    }
    

    public static void criarTabelaObjeto(){ //cria tabela com os respectivos atributos
        try {
            Conexao conexao = new Conexao(); //instancia um objeto da classe conexao
            Connection con = conexao.conectar(); //utiliza a fun��o conectar com a instancia de connection
            Statement st = con.createStatement(); //declara��o do objeto Statement para executar a query de cria��o de tabela
            String sql = "CREATE TABLE IF NOT EXISTS tabelaObjeto(" //descri��o da query
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "atributo1 VARCHAR(100),"
                    + "atributo2 INT,"
                    + "atributo3 DOUBLE,"
                    + "PRIMARY KEY (id));";
            System.out.println(sql); //impress�o da query
            st.execute(sql); //execu��o da query
            st.close(); //fecha statement
            con.close(); //fecha conex�o
        } catch (SQLException ex) { //exce��o
            System.out.println(ex.getMessage()); //imprime mensagem
            ex.printStackTrace(); //imprime exce��o no terminal
        }
    }
    
    
    public static void main(String[] args) {
            criarBancoDados(); //m�todo que cria banco de dados vazio (sem tabelas)
            criarTabelaObjeto(); //m�todo que cria tabela objeto no banco de dados
    }
    
}
