package com.Biblioteca.Sistema.de.Biblioteca;

@org.springframework.stereotype.Service
public class Service {

    private final AutorRepository repository;

    public Service(AutorRepository repository) {
        this.repository = repository;
    }
}
