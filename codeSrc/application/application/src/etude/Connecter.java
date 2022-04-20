package etude;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liamsi
 */
public class Connecter {
    Connection con;
    public Connecter(){
   
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","mouad2002");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}
    
}
