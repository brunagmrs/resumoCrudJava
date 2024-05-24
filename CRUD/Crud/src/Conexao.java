//Primeiramente adicionar Driver de conexão à biblioteca do projeto, depois prosseguir com o código da classe Conexao

import java.sql.*; //biblioteca para acessar o banco de dados com algumas funções

public class Conexao {

    public Connection conectar(){ //função conectar do tipo Connection responsável por fazer a ponte entre o JDBC e MySQL 
        
        try { //verificação de exceções
        
        Class.forName("com.mysql.cj.jdbc.Driver"); //carrega drive adicionado à biblioteca do projeto
        
        //Parâmetros de conexão
        
        //parâmetro da url
        String dataBasePrefix = "jdbc:mysql:/", //prefixo do banco de dados
               hostName = "/localhost:", //endereço IP local
               dataBasePort = "3306/", //porta padrão do mysql
               dataBaseName = "dbCrud"; //nome do banco de dados, este banco se chama dbCrud
        
        //parâmetros de comportamento de conexão na url
        String create = "createDatabaseIfNotExist=true", //se não existir o banco de dados, ele cria um novo banco de dados
               unicode = "useUnicode=yes", //código padronizado em diversas linguagens
               utf = "characterEncoding=UTF-8"; //utilização de caracteres especiais unicode
      
        //Parâmetros da URL Final
        String url = dataBasePrefix + hostName + dataBasePort + dataBaseName +
                    "?" + create + "&" + unicode + "&" + utf;
        //url = "jdbc:mysql://localhost:3306/dbCrud?createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8";
       
        
        //Parâmetro de usuário
        String usuario = "root";
        
        //Parâmetro de senha
        String senha = "";
        
        //Retorno de Conexão
        return DriverManager.getConnection(url,usuario,senha);
        
        } catch (ClassNotFoundException ex) { //exceção caso o arquivo do driver não for encontrado
            System.out.println(ex);
            System.out.println("Não foi possível encontrar o Drive");
            System.exit(1);
            
        } catch (SQLException ex) { //exceção caso os parâmetros estiverem incorretos para execução
            System.out.println("Não foi possível conectar com o banco de dados. Verifique os parâmetros de conexão novamente.");
            System.out.println(ex);
            System.exit(2);
        }
    
        return null; //caso não for retornado conexão por outro motivo não específicado
        
    }
    
}
