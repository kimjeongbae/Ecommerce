package com.example.Ecommerce.domain.siteuser.Entity;


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
public class Siteuser extends BaseEntity {
    @Column(unique = true)
    private String userid;
    private String password;
    @Column(unique = true)
    private String nickname;
    private String role;
    @Column(unique = true)
    private String email;
    private Boolean is_seller;
}

