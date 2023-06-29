package com.example.proyectoredes.controllers;

import com.example.proyectoredes.dao.Usuariodaoimp;
import com.example.proyectoredes.dao.Usuariodao;
import com.example.proyectoredes.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {
    @Autowired
    private  Usuariodao usuariodao;

    @RequestMapping(value= "agregar/{id}")
     public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setLogin("esteban123");
        usuario.setPassword("12355kffjfjfjf");
        usuario.setCorreo("esteban@gmail,com");
        usuario.setDireccion("calle 8#7-39 ");
        usuario.setTelefono(31253463);
         return usuario;
     }

    @RequestMapping(value= "Modificar/{id}")
    public Usuario Modificar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setLogin("esteban123");
        usuario.setPassword("12355kffjfjfjf");
        usuario.setCorreo("esteban@gmail,com");
        usuario.setDireccion("calle 8#7-39 ");
        usuario.setTelefono(31253463);
        return usuario;
    }

    @RequestMapping(value= "Eliminar/{id}")
    public Usuario eliminar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setLogin("esteban123");
        usuario.setPassword("12355kffjfjfjf");
        usuario.setCorreo("esteban@gmail,com");
        usuario.setDireccion("calle 8#7-39 ");
        usuario.setTelefono(31253463);
        return usuario;
    }

    @RequestMapping(value= "Consultar/{id}")
    public Usuario Consultar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setLogin("esteban123");
        usuario.setPassword("12355kffjfjfjf");
        usuario.setCorreo("esteban@gmail,com");
        usuario.setDireccion("calle 8#7-39 ");
        usuario.setTelefono(31253463);
        return usuario;
    }




}