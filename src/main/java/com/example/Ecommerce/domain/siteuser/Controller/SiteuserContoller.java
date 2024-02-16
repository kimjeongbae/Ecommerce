package com.example.Ecommerce.domain.siteuser.Controller;

import com.example.Ecommerce.domain.siteuser.Entity.SiteuserForm;
import com.example.Ecommerce.domain.siteuser.Service.SiteuserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class SiteuserContoller {

    private SiteuserService siteuserService;

    @GetMapping("/login")
    public String SiteuserLogin() {
        return "login_form";
    }
    @GetMapping("/signup")
    public String SiteuserSignup(Model model) {

        return "signup_form";
    }

    @PostMapping("/signup")
    public String siteuserSignup(@Valid SiteuserForm siteuserForm,
                               BindingResult bindingResult, Model model) {

        this.siteuserService.create(siteuserForm.getUserid(), siteuserForm.getPassword1(),
                siteuserForm.getNickname(), siteuserForm.getEmail());
        return "redirect:/member/login";
    }

}
