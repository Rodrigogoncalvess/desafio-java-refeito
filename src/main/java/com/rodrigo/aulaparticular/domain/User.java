package com.rodrigo.aulaparticular.domain;



import lombok.*;


import javax.persistence.*;

import javax.validation.constraints.*;
import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 80)
    private String name;

    @NotBlank
    @Email
    private String email;



    @NotBlank
    @Size(min = 5, max=20)
    private String login;


    @NotBlank
    @Size(min = 5, max=20)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Contact> contatoes;


}







