package com.learn.spring6.domain.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;

    private String city;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();

}
