/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.util.Date;

/**
 *
 * @author dsi
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private double taille;
    private String sexe;
    private double poids;
    private Date date_de_naissance;
    private Date last_deconnexion;
    
    public User(){
    }

    public User(int id, String nom, String prenom, String mail, String mdp, double taille, String sexe, double poids, Date date_de_naissance, Date last_deconnexion) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.taille = taille;
        this.sexe = sexe;
        this.poids = poids;
        this.date_de_naissance = date_de_naissance;
        this.last_deconnexion = last_deconnexion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public Date getLast_deconnexion() {
        return last_deconnexion;
    }

    public void setLast_deconnexion(Date last_deconnexion) {
        this.last_deconnexion = last_deconnexion;
    }

    
}