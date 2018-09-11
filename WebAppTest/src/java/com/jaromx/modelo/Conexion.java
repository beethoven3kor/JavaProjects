/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaromx.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author AROQUE
 */
public class Conexion {

    private static Connection con;
    
    private static String  user = "sa";
    private static String  pwd = "12345678";
    private static String  host = "DESKTOP-8UQVFL0";
    private static String  port = "1433";
    private static String  dbase = "sam";
    private static String  url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + dbase;
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Conexion (){}
        public static Connection openConnection() throws ClassNotFoundException, SQLException{
            if(con == null){
                Class.forName(driver);
                con = DriverManager.getConnection(url,user,pwd);
            }
        return con;
        }
        public static void closeConnection() throws SQLException{
            if(con != null){
                con.close();
            }
            con =null;
        }
//    private String user = "";
//    private String pwd = "";
//    private String host = "";
//    private String port = "";
//    private String dbase = "";
//    private String lib = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private String url = ""; 
//    public Connection ObtenerConexion() {
//        this.user = "sa";
//        this.pwd = "12345678";
//        this.host = "DESKTOP-8UQVFL0";
//        this.port = "1433";
//        this.dbase = "sam";
//        this.url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + dbase;
//        try {
//            Class.forName(lib);
//            con = DriverManager.getConnection(url, user, pwd);
//            if (con != null) {
//                System.out.println("Conexion Exitosa");
//            } else {
//                System.out.println("Conexion fallida");
//            }
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.err.println("Error en la Conexion" + ex);
//        }
//        return con;
//    }
//    public void CerrarConexion(Connection cnx) {
//        try {
//            System.out.println(cnx);
//            if (cnx != null) {
//
//                cnx.close();
//                System.out.println("Conexion Cerrada exitosamente");
//            } else {
//                System.err.println("Conexion no fue Cerrada");
//            }
//
//        } catch (SQLException ex) {
//            System.err.println("No se pudo cerrar la conexion " + ex);
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }    
}
