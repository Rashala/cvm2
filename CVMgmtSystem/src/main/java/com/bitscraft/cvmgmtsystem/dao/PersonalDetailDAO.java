/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmgmtsystem.dao;

import com.bitscraft.cvmgmtsystem.entity.PersonalDetails;
import java.sql.SQLException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Lenovo
 */
public interface PersonalDetailDAO {
    
       
    
    public void insert(PersonalDetails pd);
    
}
