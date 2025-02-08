package com.example.simple_form.service;

import org.springframework.stereotype.Service;

@Service
public class FormService {

    private final FormValidationService formValidationService;

    public FormService(FormValidationService formValidationService) {
        this.formValidationService = formValidationService;
    }
}
