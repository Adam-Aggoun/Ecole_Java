package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
public Connection dbConnection() {
String url="jdbc:mysql://localhost/ecole_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password="";
try {
Connection cnx = DriverManager.getConnection(url, user, password);
return cnx;
}
catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion à la base de données");
e.printStackTrace();
}
return null;
}
public ResultSet Requete(Connection cnx, String requete) {
try {
Statement stm = cnx.createStatement();
ResultSet rs = stm.executeQuery(requete); 
return rs;
}
catch (SQLException e) {
}
return null;
}
}