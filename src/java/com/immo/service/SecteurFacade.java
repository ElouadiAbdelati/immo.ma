/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.immo.service;

import com.immo.bean.Secteur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ok
 */
@Stateless
public class SecteurFacade extends AbstractFacade<Secteur> {

    @PersistenceContext(unitName = "immoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SecteurFacade() {
        super(Secteur.class);
    }
    
}
