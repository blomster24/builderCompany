package com.reto4;

import com.reto4.view.ReportesView;

public class App {
    public static void main(String[] args) {
         // punto 1
        ReportesView reportesView = new ReportesView();
        String banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);

        // punto 2
        //var reportesView = new ReportesView();
        double limiteInferior = 50_000d;
        reportesView.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);


        // punto 3
        reportesView.lideresQueMasGastan(); 

        
    }
}