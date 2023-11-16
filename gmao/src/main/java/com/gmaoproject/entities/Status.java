package com.gmaoproject.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name= "Status")

public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order") //asi especificas el nombre del campo en base de datos
    private Order order;

}