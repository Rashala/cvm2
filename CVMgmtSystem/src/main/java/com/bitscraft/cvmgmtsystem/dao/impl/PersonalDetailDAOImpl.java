/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmgmtsystem.dao.impl;

import com.bitscraft.cvmgmtsystem.dao.PersonalDetailDAO;
import com.bitscraft.cvmgmtsystem.db.DBConnection;
import com.bitscraft.cvmgmtsystem.entity.PersonalDetails;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */




@Repository
public class PersonalDetailDAOImpl implements PersonalDetailDAO {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    DBConnection db;
    
    @Override
    public void insert(PersonalDetails pd) {
        try {
            db.open();
            
            session=sessionFactory.openSession();
            trans=session.beginTransaction();
            session.save(pd);
            trans.commit();
            session.close();
            db.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PersonalDetailDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }

    
    
    }

   
    

   

    
    
