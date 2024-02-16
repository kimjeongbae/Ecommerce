package com.example.Ecommerce.domain.siteuser.Entity;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiteuserForm {
    @NotEmpty(message = "아이디는 필수 사항 입니다")
    private String userid;
    @NotEmpty(message = "비밀번호는 필수 사항 입니다")
    private String password1;
    @NotEmpty(message = "비밀번호 재입력 입니다")
    private String password2;
    @NotEmpty(message = "닉네임이 중복 됩니다.")
    private String nickname;
    private String role;
    @NotEmpty(message = "이메일은 필수 사항 입니다")
    private String email;


}

