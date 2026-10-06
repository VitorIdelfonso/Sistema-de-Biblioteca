package com.Biblioteca.Sistema.de.Biblioteca;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    private Autor autor;

    private boolean disponivel;
}
