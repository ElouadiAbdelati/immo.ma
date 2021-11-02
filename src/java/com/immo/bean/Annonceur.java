/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.immo.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author yassine
 */
@Entity
public class Annonceur implements    Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
  
    private String name;

    private String telephone;
    private String email;
    private String address;
    @ManyToOne
    private City city;
    
    @OneToMany(mappedBy = "annonceur")
        private List<Annonce> annonces;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(List<Annonce> annonces) {
        this.annonces = annonces;
    }

    @Override
    public String toString() {
        return "Annonceur{" + "email=" + email + '}';
    }
    
    
    
}
