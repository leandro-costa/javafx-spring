package br.edu.ifba.saj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JavaFX App
 */
@ComponentScan(basePackages = "br.edu.ifba.saj")
@EnableJpaRepositories("br.edu.ifba.saj.repository")
public class App extends Application {

    private static Scene scene;
    private static ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        fxmlLoader.setControllerFactory(context::getBean);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }    
}