package com.gmaoproject.entities;
import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name="Address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "province", length = 50, nullable = false)
    private String province;


    @Column(name = "city", length = 50, nullable = false)
    private String city;


    @Column(name = "postalcode", length = 5, nullable = false)
    private Integer postalcode;


    @Column(name = "typeofroad", length = 10, nullable = false)
    private String typeofroad;


    @Column(name = "roadname", length = 50, nullable = false)
    private String roadname;


    @Column(name = "streetnumber", length = 15, nullable = false)
    private Integer streetnumber;


    @Column(name = "block", length = 5, nullable = true)
    private Integer block;


    @Column(name = "stair", length = 10, nullable = true)
    private Integer stair;


    @Column(name = "Door", length = 10, nullable = true)
    private Integer Door;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order") //asi especificas el nombre del campo en base de datos
    private Order order;

}