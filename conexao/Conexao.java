package conexao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar(){
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");

           return conn;

        }catch (SQLException e){
            System.out.println("Erro ao conectar: "+ e.getMessage());

            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = Conexao.conectar();

        if (conn != null) {
            System.out.println("Banco conectado!");
        } else {
            System.out.println("Falha ao conectar.");
        }
    }
}


