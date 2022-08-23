package com.reto4.util;

import java.sql.*;

public class JDBCUtilities {
    private static final String UBICACION_DB = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_DB;
        Connection conexion=DriverManager.getConnection(url);
       
        return conexion;

    }
  
}
