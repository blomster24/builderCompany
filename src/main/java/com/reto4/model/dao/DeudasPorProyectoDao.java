package com.reto4.model.dao;

import java.sql.*;

public class DeudasPorProyectoDao {
    public static ResultSet getTotalDeuda(Connection conn, double limite) {
        ResultSet result = null;

        try {
            String query = "SELECT c.ID_Proyecto, sum(mc.Precio_Unidad*c.Cantidad)  AS VALOR FROM Compra c             JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion             WHERE c.Pagado =\"No\"  GROUP BY c.ID_Proyecto HAVING VALOR >? ORDER BY VALOR DESC ";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setDouble(1, limite);
            result = pst.executeQuery();
            //System.out.println("TIMMYYYYYYY");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
