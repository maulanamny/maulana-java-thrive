package com.thrive.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "items")
public class ItemEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String count;
    public String status;

}