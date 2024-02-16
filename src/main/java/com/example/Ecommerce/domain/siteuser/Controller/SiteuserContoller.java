package com.example.Ecommerce.domain.siteuser.Controller;

import com.example.Ecommerce.domain.siteuser.Service.SiteuserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class SiteuserContoller {

    private SiteuserService siteuserService;

    @GetMapping("/login")
    public String login () {

        return "login_form";
    }

    @GetMapping("/signup")
    public String userSingup () {

        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup () {

        return "";
    }
}
