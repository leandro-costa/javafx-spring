package br.edu.ifba.saj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.model.Usuario;
import br.edu.ifba.saj.repository.UsuarioRepository;

@Service
public class Message {

   @Autowired
   UsuarioRepository repository;

   private String message = "Hello there!";

   public void setMessage(String message){

      this.message  = message;
   }

   public String getMessage(){
      Usuario usuario = new Usuario();
      usuario.setEmail("leandro.costa@ifba.edu.br");
      Example<Usuario> example = Example.of(usuario);
      Optional<Usuario> leandro =  repository.findOne(example);
      if(!(leandro.isPresent())){
         repository.save(usuario);
         leandro =  repository.findOne(example);
      }

      return Boolean.toString(leandro.isPresent());
   }
}
