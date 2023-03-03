package br.edu.ifba.saj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.repository.UsuarioRepository;

@Service
public class Message {

   
   UsuarioRepository repository;

   private String message = "Hello there!";

   public void setMessage(String message){

      this.message  = message;
   }

   public String getMessage(){

      return message;
   }
}
