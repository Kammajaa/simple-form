package com.example.one_form.controller;

import com.example.one_form.service.FormService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    private final FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }

    @PostMapping("submit")
    public void submit() {

    }
}
