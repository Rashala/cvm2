/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmgmtsystem.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author preea
 */
@Entity
@Table(name="academice_qualification")
public class AcademicQualification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
     @Column(name = "institution" , nullable = false)
    //@NotEMpty
    @Size(min = 1, max = 40)
    private String institution;

    @Column(name = "board")
    private String board;

    @Column(name = "major"  , nullable = false)
    //@NotEMpty
    @Size(min = 1, max = 40)
    private String major;
    
    
 
      
    @Column(name = "degree")
    public String degree;
      
      
      
      
    @Column(name = "percentage_score")
    public float percentage_score;
      
      
    
    @Column(name = "passed_year")
    public String passed_year;
      
      
     
    @Column(name = "awards")
    public String awards;

    public AcademicQualification() {
    }

    public AcademicQualification(Long id, String institution, String board, String major, String degree, float percentage_score, String passed_year, String awards) {
        this.id = id;
        this.institution = institution;
        this.board = board;
        this.major = major;
        this.degree = degree;
        this.percentage_score = percentage_score;
        this.passed_year = passed_year;
        this.awards = awards;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public float getPercentage_score() {
        return percentage_score;
    }

    public void setPercentage_score(float percentage_score) {
        this.percentage_score = percentage_score;
    }

    public String getPassed_year() {
        return passed_year;
    }

    public void setPassed_year(String passed_year) {
        this.passed_year = passed_year;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
    
    
    
    
    
    
      
} 
      
    
  
  
     
     
     
      