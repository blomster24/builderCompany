package com.reto4.model.dao;

import java.sql.*;

public class ProyectoBancoDao {

    public static ResultSet getProyectoBanco(Connection conn, String nombreBanco) {
        ResultSet result = null;

        try {
            String query = "SELECT p.ID_Proyecto AS ID, p.Constructora,p.Ciudad, p.Clasificacion, t.Estrato, l.Nombre || \" \" || l.Primer_Apellido || \" \" || l.Segundo_Apellido AS LIDER FROM Proyecto p INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo WHERE p.Banco_Vinculado = \""
                    + nombreBanco + "\" ORDER BY p.Fecha_Inicio  DESC, p.Ciudad,p.Constructora";
            Statement pst = conn.createStatement();
            // pst.setString(1, nombreBanco);
            // result = pst.executeQuery();
            result = pst.executeQuery(query);
            // System.out.println("TIMMYYYYYYY");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
