package com.nikhil.app.rest.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Session{
    @Id
    private Long id;

    @Column
    private int duration;

    @Column
    private Long userid;

    @Column
    private boolean isRunning;

}


