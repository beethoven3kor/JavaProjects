/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaromx.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jaromx.entities.Usuarios;
import com.jaromx.modelo.Conexion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author AROQUE
 */
public class VisualizarUsuariosServlet extends HttpServlet {
    public String Usuarios() throws Exception{
        ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
        String sql = "select IdUsuario, Usuario, Nombre, ApellidoPat, Estado,Pais, centro from cnf.usuarios";
        Statement st = Conexion.openConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        try{
        while(rs.next()){
            usuarios.add(new Usuarios(rs.getInt("IdUsuario"),
                                      rs.getString("Usuario"),
                                      rs.getString("Nombre"),
                                      rs.getString("ApellidoPat"),
                                      rs.getString("Estado"),
                                      rs.getString("Pais"),
                                      rs.getString("centro")));
        }
        } catch(Exception e){
            e.getMessage();
        } finally{
         Conexion.closeConnection();
        }
        return new Gson().toJson(usuarios);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println(Usuarios());
            
        } catch(Exception e){
            out.println("Error debido a:" + e.getMessage());
        } finally{
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
