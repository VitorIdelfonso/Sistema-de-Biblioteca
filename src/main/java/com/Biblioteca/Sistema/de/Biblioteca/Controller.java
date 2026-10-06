package com.Biblioteca.Sistema.de.Biblioteca;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }


}
