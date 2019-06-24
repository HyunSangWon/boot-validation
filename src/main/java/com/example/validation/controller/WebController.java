package com.example.validation.controller;

import com.example.validation.form.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Author Sangwon Hyun on 2019-06-24
 */
@Controller
public class WebController {

    @GetMapping("/")
    public String showForm(@ModelAttribute("personVO")PersonForm personForm){
        return "form";
    }

    @PostMapping("/sign-up")
    public String checkPersonInfo(@Valid @ModelAttribute("personVO")PersonForm personForm
    , BindingResult br){

        if (br.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }

    @GetMapping("/results")
    public String showResults(){
        return "results";
    }

}
