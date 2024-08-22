package com.aquarela.aquarela.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aquarela.aquarela.dao.ProjetoDao;
import com.aquarela.aquarela.domain.Projeto;

@Repository
public class ProjetoDaoImpl implements ProjetoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Projeto postProjeto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postProjeto'");
    }

    @Override
    public List<Projeto> getAllProjetos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProjetos'");
    }

    @Override
    public Projeto getProjeto(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjeto'");
    }

    @Override
    public void updateProjeto(Projeto projeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProjeto'");
    }

    @Override
    public void deleteProjeto(Projeto projeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProjeto'");
    }
    
}
