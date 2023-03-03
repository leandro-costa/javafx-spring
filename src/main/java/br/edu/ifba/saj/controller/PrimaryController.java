package br.edu.ifba.saj.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifba.saj.App;
import br.edu.ifba.saj.service.Message;
import javafx.fxml.FXML;
import lombok.Getter;

@Component
public class PrimaryController {
    
    @Autowired
    private Message message;

    @Getter
    private String userLogin = "Leandro";

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("Message PrimaryController: " + message.getMessage());
        App.setRoot("secondary");
    }
    
}
