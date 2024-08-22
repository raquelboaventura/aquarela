package com.aquarela.aquarela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Catálogo de Artistas
// Criar: Adicionar novos artistas ao catálogo, incluindo informações de perfil e portfólio.
// Ler: Visualizar perfis de artistas, consultar detalhes sobre suas obras e biografias.
// Atualizar: Editar informações do perfil dos artistas, adicionar novas obras ou atualizar biografias.
// Deletar: Remover artistas do catálogo, se necessário.
public class AquarelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquarelaApplication.class, args);
	}

}
