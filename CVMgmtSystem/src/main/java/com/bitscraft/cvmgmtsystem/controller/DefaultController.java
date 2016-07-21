/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmgmtsystem.controller;

import com.bitscraft.cvmgmtsystem.dao.PersonalDetailDAO;
import com.bitscraft.cvmgmtsystem.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author preea
 */

@Controller
@RequestMapping(value = "/")
public class DefaultController {
    @Autowired
    private PersonalDetailDAO personalDetailDAO;
    
    
    @RequestMapping(method =  RequestMethod.GET)
    
    public String index(){
   //  personalDetailDAO.insert(new PersonalDetails(0, PersonalDetails.Prefix.MR, "test", "test", "test", PersonalDetails.Gender.MALE, null, PersonalDetails.MaritalStatus.MARRIED, "test", "test", "test", "test", "test"));
        return "index";
    }
    
//    @RequestMapping(value = "/listCandidate",method = RequestMethod.GET)
//    public String showCandidates(Model map){
//      map.addAttribute("candidates", "candidateDAO.getAll()");
//        return "listCandidate";
//    }
//     @RequestMapping(value = "/save",method = RequestMethod.POST)
//    public String save(){
//        
//        return "redirect:index";
//    }

    
    
    
    
}
