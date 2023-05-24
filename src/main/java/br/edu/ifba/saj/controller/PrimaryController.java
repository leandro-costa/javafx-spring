package br.edu.ifba.saj.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifba.saj.App;
import br.edu.ifba.saj.model.Usuario;
import br.edu.ifba.saj.repository.UsuarioRepository;
import br.edu.ifba.saj.service.Message;
import javafx.fxml.FXML;
import lombok.Getter;

@Component
public class PrimaryController {
    
    @Autowired
    private Message message;

    @Getter
    private String userLogin = "Leandro";

    @Autowired
    private  UsuarioRepository repository; 


    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("Message PrimaryController: " + message.getMessage());
        repository.save(Usuario.builder().nome(userLogin).email("userLogin").build());
        App.setRoot("secondary");
    }
    
}
