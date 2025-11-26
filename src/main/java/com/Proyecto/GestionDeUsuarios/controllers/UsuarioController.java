package com.Proyecto.GestionDeUsuarios.controllers;

import com.Proyecto.GestionDeUsuarios.dao.UsuarioDaoImp;
import com.Proyecto.GestionDeUsuarios.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDaoImp usuarioDao;

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alfredo");
        usuario.setApellido("Rosales");
        usuario.setEmail("rosales@gmail.com");
        usuario.setTelefono("771589854");

        return usuario;

    }

    @RequestMapping(value="api/usuarios")
    public List<Usuario> getUsuario(){

        return usuarioDao.getUsuario();

    }
}
