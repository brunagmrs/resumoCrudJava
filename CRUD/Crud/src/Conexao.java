//Primeiramente adicionar Driver de conex�o � biblioteca do projeto, depois prosseguir com o c�digo da classe Conexao

import java.sql.*; //biblioteca para acessar o banco de dados com algumas fun��es

public class Conexao {

    public Connection conectar(){ //fun��o conectar do tipo Connection respons�vel por fazer a ponte entre o JDBC e MySQL 
        
        try { //verifica��o de exce��es
        
        Class.forName("com.mysql.cj.jdbc.Driver"); //carrega drive adicionado � biblioteca do projeto
        
        //Par�metros de conex�o
        
        //par�metro da url
        String dataBasePrefix = "jdbc:mysql:/", //prefixo do banco de dados
               hostName = "/localhost:", //endere�o IP local
               dataBasePort = "3306/", //porta padr�o do mysql
               dataBaseName = "dbCrud"; //nome do banco de dados, este banco se chama dbCrud
        
        //par�metros de comportamento de conex�o na url
        String create = "createDatabaseIfNotExist=true", //se n�o existir o banco de dados, ele cria um novo banco de dados
               unicode = "useUnicode=yes", //c�digo padronizado em diversas linguagens
               utf = "characterEncoding=UTF-8"; //utiliza��o de caracteres especiais unicode
      
        //Par�metros da URL Final
        String url = dataBasePrefix + hostName + dataBasePort + dataBaseName +
                    "?" + create + "&" + unicode + "&" + utf;
        //url = "jdbc:mysql://localhost:3306/dbCrud?createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8";
       
        
        //Par�metro de usu�rio
        String usuario = "root";
        
        //Par�metro de senha
        String senha = "";
        
        //Retorno de Conex�o
        return DriverManager.getConnection(url,usuario,senha);
        
        } catch (ClassNotFoundException ex) { //exce��o caso o arquivo do driver n�o for encontrado
            System.out.println(ex);
            System.out.println("N�o foi poss�vel encontrar o Drive");
            System.exit(1);
            
        } catch (SQLException ex) { //exce��o caso os par�metros estiverem incorretos para execu��o
            System.out.println("N�o foi poss�vel conectar com o banco de dados. Verifique os par�metros de conex�o novamente.");
            System.out.println(ex);
            System.exit(2);
        }
    
        return null; //caso n�o for retornado conex�o por outro motivo n�o espec�ficado
        
    }
    
}
