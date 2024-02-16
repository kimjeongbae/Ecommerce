package com.example.Ecommerce.domain.product.Entity;

import com.example.Ecommerce.global.JPA.Entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    private String category;
    private String title;
    private String content;
    private int price;
    private String role;
    private Boolean is_seller;
}