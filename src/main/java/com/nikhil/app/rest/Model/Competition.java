package com.nikhil.app.rest.Model;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Competition {

    @Id
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "competitor_id",
            referencedColumnName = "id"
    )
    private List<Competitor> Competitors ;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "sessions_id",
            referencedColumnName = "id"
    )
    private List<Session> AllSessions ;



    @Column
    private Long duration ;

    @Column
    private boolean isActive;
}