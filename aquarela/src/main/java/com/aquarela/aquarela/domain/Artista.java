package com.aquarela.aquarela.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artista {
    private Long id;
    private String nome;
    private String cpf;
    private Boolean status;
}
