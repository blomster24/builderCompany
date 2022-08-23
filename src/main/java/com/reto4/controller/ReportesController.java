package com.reto4.controller;

import java.sql.*;

import com.reto4.model.dao.ComprasDeLiderDao;
import com.reto4.model.dao.DeudasPorProyectoDao;
import com.reto4.model.dao.ProyectoBancoDao;
import com.reto4.model.vo.ComprasDeLiderVo;
import com.reto4.model.vo.DeudasPorProyectoVo;
import com.reto4.model.vo.ProyectoBancoVo;
import com.reto4.util.JDBCUtilities;

public class ReportesController {
    public String proyectoBanco(String nombreBanco) {
        String salida = "";
        try {
            ResultSet result = ProyectoBancoDao.getProyectoBanco(JDBCUtilities.getConnection(), nombreBanco);
            ProyectoBancoVo pbvo = new ProyectoBancoVo();

            while (result.next()) {
                pbvo.setIDProyecto(result.getInt("ID"));
                pbvo.setConstructora(result.getString("Constructora"));
                pbvo.setCiudad(result.getString("Ciudad"));
                pbvo.setClasificacion(result.getString("Clasificacion"));
                pbvo.setEstrato(result.getInt("Estrato"));
                pbvo.setLider(result.getString("LIDER"));

                salida += String.format("%3s %-25s %-20s %-15s %7d %-30s \n", pbvo.getIDProyecto(),
                        pbvo.getConstructora(), pbvo.getCiudad(), pbvo.getClasificacion(),
                        pbvo.getEstrato(), pbvo.getLider());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;
    }

    public String deudasProyecto(double limite) {
        String salida = "";
        try {
            ResultSet result = DeudasPorProyectoDao.getTotalDeuda(JDBCUtilities.getConnection(), limite);
            DeudasPorProyectoVo dpvo = new DeudasPorProyectoVo();

            while (result.next()) {
                dpvo.setIDProyecto(result.getInt("ID_Proyecto"));
                dpvo.setValor(result.getDouble("VALOR"));

                salida += String.format("%3d %,15.1f\n", dpvo.getIDProyecto(), dpvo.getValor());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;
    }

    public String lideres() {
        String salida = "";
        try {
            ResultSet result = ComprasDeLiderDao.getLideres(JDBCUtilities.getConnection());
            ComprasDeLiderVo clvo = new ComprasDeLiderVo();

            while (result.next()) {
                clvo.setNombreLider(result.getString("LIDER"));
                clvo.setValor(result.getDouble("VALOR"));

                salida += String.format("%-25s %,15.1f\n", clvo.getNombreLider(), clvo.getValor());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return salida;
    }

}
