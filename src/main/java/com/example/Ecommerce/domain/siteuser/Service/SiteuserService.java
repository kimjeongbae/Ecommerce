package com.example.Ecommerce.domain.siteuser.Service;

import com.example.Ecommerce.domain.siteuser.Entity.Siteuser;
import com.example.Ecommerce.domain.siteuser.Repository.SiteuserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SiteuserService {

    private SiteuserRepository siteuserRepository;


    public void create(String userid, String password1, String password2 ,String nickname, String role ,String email) {
        Siteuser siteuser = siteuser.builder()
                .userid(userid)
                .password(passwordEncoder.encode(password))
                .nickname(nickname)
                .email(email)
                .build();

        this.siteuserRepository.save(siteuser);
    }
}
