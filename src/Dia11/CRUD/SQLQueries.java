/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia11.CRUD;

/**
 *
 * @author matheus
 */
public final class SQLQueries {
    private String SQLQuery;
    
    public static String insert(){
        return "INSERT INTO Aluno (nome, RA) VALUES (?, ?)";
    }
    
    public static String retrieve(){
        return "SELECT * FROM Aluno WHERE RA = ?";
    }
    
    public static String updateName(){
        return "UPDATE Aluno SET nome = ? WHERE RA = ?";
    }
    
    public static String delete(){
        return "DELETE FROM Aluno WHERE RA = ?";
    }
}
