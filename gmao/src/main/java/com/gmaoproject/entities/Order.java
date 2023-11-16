package com.gmaoproject.entities;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;


@Entity
@Table(name= "Order")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "priority", length = 20, nullable = false)
    private String priority;


    @Column(name = "jobtodo", length = 500, nullable = false)
    private String jobtodo;


    @Column(name = "jobdone", length = 500, nullable = true)
    private String jobdone;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")// este campo debe coincidir con el nombre de la variable que tiene la otra entidad
    @JoinColumn(name = "status") //asi especificas el nombre del campo en base de datos
    private Status status;


    @OneToOne(cascade = CascadeType.ALL, optional = false, mappedBy = "order")// este campo debe coincidir con el nombre de la variable que tiene la otra entidad
    @JoinColumn(name = "user") //asi especificas el nombre del campo en base de datos
    private User user;


    @Column(name = "startdate")
    private ZonedDateTime startdate;


    @Column(name = "enddate")
    private ZonedDateTime enddate;


    @OneToOne(cascade = CascadeType.ALL, optional = false, mappedBy = "order")// este campo debe coincidir con el nombre de la variable que tiene la otra entidad
    @JoinColumn(name = "address") //asi especificas el nombre del campo en base de datos
    private Address address;

}
