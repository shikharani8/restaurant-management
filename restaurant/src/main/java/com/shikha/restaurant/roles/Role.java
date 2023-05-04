package com.shikha.restaurant.roles;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Shikha
 */
@Entity
@Table(name = "tb_roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
