package com.reto4.model.dao;

import java.sql.*;

public class ComprasDeLiderDao {
    public static ResultSet getLideres(Connection conn) {
        ResultSet result = null;

        try {
            String query = "SELECT l.Nombre || \" \" || l.Primer_Apellido || \" \" || l.Segundo_Apellido AS LIDER,             sum(mc.Precio_Unidad*c.Cantidad)  AS VALOR             FROM Lider l             INNER JOIN Proyecto p ON p.ID_Lider = l.ID_Lider             INNER JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto             INNER JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion             GROUP BY LIDER  ORDER BY VALOR DESC LIMIT ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setDouble(1, 10);
            result = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
