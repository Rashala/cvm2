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
@Table(name="job_experiences")
public class JobExperiences implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @Column(name = "job_title")
    private String jobTitle ;
     
     @Column(name = "employment_place")
    private String employmentPlace ;
     
     
     
      
     @Column(name = "duration_from" ,  insertable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date durationFrom;
     
       
     @Column(name = "duration_To" ,  insertable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date durationTo;
     
     @Column(name = "roles")
    private String roles;

    public JobExperiences() {
    }

    public JobExperiences(Long id, String jobTitle, String employmentPlace, Date durationFrom, Date durationTo, String roles) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.employmentPlace = employmentPlace;
        this.durationFrom = durationFrom;
        this.durationTo = durationTo;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmplooymentPlace() {
        return employmentPlace;
    }

    public void setEmplooymentType(String employmentPlace) {
        this.employmentPlace = employmentPlace;
    }

    public Date getDurationFrom() {
        return durationFrom;
    }

    public void setDurationFrom(Date durationFrom) {
        this.durationFrom = durationFrom;
    }

    public Date getDurationTo() {
        return durationTo;
    }

    public void setDurationTo(Date durationTo) {
        this.durationTo = durationTo;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
     
     

    
}
