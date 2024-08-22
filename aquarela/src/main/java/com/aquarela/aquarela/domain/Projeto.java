package com.aquarela.aquarela.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {
    private Long id;
    private String titulo;
    private String artista;
    private String categoria;
}
