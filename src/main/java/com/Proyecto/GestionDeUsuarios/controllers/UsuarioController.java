package com.Proyecto.GestionDeUsuarios.controllers;

import com.Proyecto.GestionDeUsuarios.dao.UsuarioDaoImp;
import com.Proyecto.GestionDeUsuarios.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDaoImp usuarioDao;

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
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

    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){

        usuarioDao.registrar(usuario);

    }


    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id ){

        usuarioDao.eliminar(id);

    }



}
