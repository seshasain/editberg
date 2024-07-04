package com.editberg.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdat;
    private String role;

    @ManyToOne
    @JoinColumn(name = "subscriptionplanid")
    private SubscriptionPlan subscriptionplan;

    private LocalDate subscriptionstartdate;
    private LocalDate subscriptionenddate;

    @ManyToOne
    @JoinColumn(name = "imageid", nullable = true)
    private Image imageid;
    
    private String phonenumber;

    // Getters and Setters
    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userId) {
        this.userid = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdat;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdat = createdAt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SubscriptionPlan getsubscriptionplan() {
        return subscriptionplan;
    }

    public void setsubscriptionplan(SubscriptionPlan subscriptionplan) {
        this.subscriptionplan = subscriptionplan;
    }

    public LocalDate getSubscriptionstartdate() {
        return subscriptionstartdate;
    }

    public void setsubscriptionstartsate(LocalDate subscriptionstartdate) {
        this.subscriptionstartdate = subscriptionstartdate;
    }

    public LocalDate getsubscriptionenddate() {
        return subscriptionenddate;
    }

    public void setSubscriptionenddate(LocalDate subscriptionenddate) {
        this.subscriptionenddate = subscriptionenddate;
    }

    public void setImageid(Image imageid) {
		this.imageid = imageid;
	}

	public Image getImageid() {
        return imageid;
    }

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
  
