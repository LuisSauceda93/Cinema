/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine_tics;

/**
 *
 * @author nancy
 */
public class cartelera {
     private String horarios[][]={
                       {"1:15 PM","2:50 PM","3:20 PM","1:50 PM"},//horarios
                       {"2:30 PM","6:10 PM","4:30 PM","3:20 PM"},
                       {"4:40 PM","7:50 PM","5:10 PM","8:10 PM"},
                       {"10:30 PM","9:30 PM","7:10 PM","9:00 PM"}}; 
  
 private int salas []= {1,2,3,4};
 
 private String peliculas[]= {"Fragmentado", "El Aro 3", "La Bella y la Bestia", "Logan"};
 
 private int entradas[]={1,2,3,4,5,6,7,8,9,10};

    public cartelera() {
    }

    public String[][] getHorarios() {
        return horarios;
    }

    public int[] getSalas() {
        return salas;
    }

    public String[] getPeliculas() {
        return peliculas;
    }

    public void setHorarios(String[][] horarios) {
        this.horarios = horarios;
    }

    public void setSalas(int[] salas) {
        this.salas = salas;
    }

    public void setPeliculas(String[] peliculas) {
        this.peliculas = peliculas;
    }
 
 
    
}
