package com.aquarela.aquarela.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aquarela.aquarela.daoImpl.ProjetoDaoImpl;
import com.aquarela.aquarela.domain.Projeto;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController("/projeto")
public class ProjetoController {

    private ProjetoDaoImpl projetoDaoImpl;

    @PostMapping("/cadastro")
    public ResponseEntity<Projeto> cadastroArtista(@RequestBody Projeto projeto){
        log.info("Entrando no controller de cadastro do artista");
        Projeto cadastro = projetoDaoImpl.postProjeto();
        return null;
        
    }
}
