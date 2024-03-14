package com.example.msspringsecurity.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{
    public Candidate(String username, String email, String login, String password) {
        super(username, email, login, password);
    }

    public Candidate () {

    }
}
