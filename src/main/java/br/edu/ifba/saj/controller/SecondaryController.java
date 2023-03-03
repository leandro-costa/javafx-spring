package br.edu.ifba.saj.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifba.saj.App;
import br.edu.ifba.saj.service.Message;
import javafx.fxml.FXML;

@Component
public class SecondaryController {
    
    @Autowired
    private Message message;

    @Autowired
    private PrimaryController primaryController;

    @FXML
    private void switchToPrimary() throws IOException {
        System.out.println("Message SecondaryController: " + message.getMessage());
        System.out.println("Message primaryController in SecondaryController: " + primaryController.getUserLogin());
        App.setRoot("primary");
    }
}