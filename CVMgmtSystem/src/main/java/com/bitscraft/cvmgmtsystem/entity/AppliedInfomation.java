/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmgmtsystem.entity;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author preea
 */
@Entity
@Table(name = "applied_information")
public class AppliedInfomation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
     @Column(name = "applied_date" ,  insertable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appliedDate ;
 
    
     @Column(name = "applied_position")
    private String appliedPosition ;
     
      @Column(name = "applied_area")
    private String appliedArea ;
      
       @Column(name = "joined_date" ,  insertable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date joinedDate;

    public AppliedInfomation() {
    }

    public AppliedInfomation(Long id, Date appliedDate, String appliedPosition, String appliedArea, Date joinedDate) {
        this.id = id;
        this.appliedDate = appliedDate;
        this.appliedPosition = appliedPosition;
        this.appliedArea = appliedArea;
        this.joinedDate = joinedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getAppliedPosition() {
        return appliedPosition;
    }

    public void setAppliedPosition(String appliedPosition) {
        this.appliedPosition = appliedPosition;
    }

    public String getAppliedArea() {
        return appliedArea;
    }

    public void setAppliedArea(String appliedArea) {
        this.appliedArea = appliedArea;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }
 
       
       
}