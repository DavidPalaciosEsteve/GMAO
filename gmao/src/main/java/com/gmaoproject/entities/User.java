package com.gmaoproject.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;



@Entity
@Table(name = "User")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "name", length = 20, nullable = false)
    private String name;


    @Column(name = "surname", length = 50, nullable = true)
    private String surname;


    @Column(name = "nickname", length = 20, nullable = false)
    private String nickname;


    @Column(name = "password", nullable = false)
    private String password;


    @Column(name = "mail", length = 50, nullable = false)
    private String mail;


    @Column(name = "tel", length = 12, nullable = false)
    private Integer tel;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order") //asi especificas el nombre del campo en base de datos
    private Order order;

}
