/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.lab.n2;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mark
 */
@Stateless
@Named
public class CustomerFacade extends AbstractFacade<Customer> {
    @PersistenceContext(unitName = "com.livehereandnow.lab_n2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }

    public List <com.livehereandnow.lab.n2.Customer> getCustomers() {
        
        
        return em.createNamedQuery("Customer.findAll").getResultList();
    }
    
    
}
