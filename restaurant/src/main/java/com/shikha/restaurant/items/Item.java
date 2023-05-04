package com.shikha.restaurant.items;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Shikha
 */
@Entity
@Table(name = "tb_items")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private NutritionLabelling nutritionLabelling;
    private String name;
    private String details;
    private String vegetarian;
    private String vegan;
    private String dairyfree;
    private String glutenfree;
    private String halal;
    private String pregnant;
    private String wheat;
    private String crustaceans;
    private String eggs;
    private String fish;
    private String peanuts;
    private String soybeans;
    private String milk;
    private String nuts;
    private String celery;
    private String mustard;
    private String sesame;
    private String sulphurDioxide;
    private String lupin;
    private String molluscs;
    private String sort;
    private String active;
    private String type;
    private String image;
    private String image2;
    private String num;
    private String overrideDuration;
    private String locked;
    private String price;
}
