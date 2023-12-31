/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author souloh
 */
@Entity
public class Service {
         @Id
    @GeneratedValue
  private int id;
    private String nom;

    public Service() {
    }

    public Service(String nom) {
        this.nom = nom;
    }
   

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", nom=" + nom + '}';
    }
    
}
