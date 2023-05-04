package com.shikha.restaurant.items;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Shikha
 */
@Entity
@Table(name = "tb_nutrition_labelling")
@Data
public class NutritionLabelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String size;
    private String weight;
    private String energykj;
    private String energykcal;
    private String protein;
    private String carbohydrate;
    private String sugars;
    private String fat;
    private String saturates;
    private String fibre;
    private String sodium;
    private String salt;
}
