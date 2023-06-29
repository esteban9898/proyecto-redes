package com.example.proyectoredes.dao;

import com.example.proyectoredes.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class Usuariodaoimp implements Usuariodao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        String query = "FROM usuarios";
        usuario = (Usuario) entityManager.createQuery(query).getResultList();
        return usuario;

    }
}

