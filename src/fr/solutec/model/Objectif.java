/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author dsi
 */
public class Objectif {
    private User user;
    private double temps_de_course;
    private double temps_de_marche;
    private double poids;

    public Objectif(User user, double temps_de_course, double temps_de_marche, double poids) {
        this.user = user;
        this.temps_de_course = temps_de_course;
        this.temps_de_marche = temps_de_marche;
        this.poids = poids;
    }
    
    Objectif(){
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTemps_de_course() {
        return temps_de_course;
    }

    public void setTemps_de_course(double temps_de_course) {
        this.temps_de_course = temps_de_course;
    }

    public double getTemps_de_marche() {
        return temps_de_marche;
    }

    public void setTemps_de_marche(double temps_de_marche) {
        this.temps_de_marche = temps_de_marche;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
    
}
