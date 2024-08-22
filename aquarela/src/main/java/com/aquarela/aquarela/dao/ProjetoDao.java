package com.aquarela.aquarela.dao;

import java.util.List;

import com.aquarela.aquarela.domain.Projeto;

public interface ProjetoDao {
    public Projeto postProjeto();
    public List<Projeto> getAllProjetos();
    public Projeto getProjeto(int id);
    public void updateProjeto(Projeto projeto);
    public void deleteProjeto(Projeto projeto);
}
