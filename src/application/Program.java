package application;

import db.DB;

public class Program {
    public static void main( String[] args ){
        
        if(DB.getConnection() != null){
            System.out.println("Conexão com o banco de dados gerada com sucesso! ");
        } else {
            throw new RuntimeException("Ops! Erro ao conectar com o banco de dados. :(");
        }

        
        CrudProgram.insertions();
        System.out.println("Operações de inserção executadas com sucesso!");
        

        
         
    }

}
