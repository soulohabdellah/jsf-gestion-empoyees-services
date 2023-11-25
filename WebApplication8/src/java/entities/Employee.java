/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author souloh
 */
public class Employee implements Serializable{
        private int id;
     private String nom;
     private String prenom;
     private Date dateNaissance;
     private String photo;
     @ManyToOne
     private beans.Service service;
     @ManyToOne
     private beans.Employee chef;

    public Employee() {
    }

    public Employee(String nom, String prenom, Date dateNaissance, String photo, beans.Service service, beans.Employee chef) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.service = service;
        this.chef = chef;
    }



    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public beans.Service getService() {
        return service;
    }

    public beans.Employee getChef() {
        return chef;
    }

    public void setService(beans.Service service) {
        this.service = service;
    }

    public void setChef(beans.Employee chef) {
        this.chef = chef;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", photo=" + photo + ", service=" + service + ", chef=" + chef + '}';
    }
    
}
