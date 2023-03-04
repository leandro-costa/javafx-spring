module br.edu.ifba.saj {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires jakarta.persistence;
    requires static lombok;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.orm;
    requires spring.jdbc;

    opens br.edu.ifba.saj to javafx.fxml, org.springframework, spring.core;
    opens br.edu.ifba.saj.controller to javafx.fxml, org.springframework, spring.core, spring.beans;
    opens br.edu.ifba.saj.service to spring.core, spring.beans;
    opens br.edu.ifba.saj.repository to spring.core, spring.beans, spring.data.jpa, spring.data.commons, spring.orm, spring.context;
    exports br.edu.ifba.saj;
    exports br.edu.ifba.saj.model;
    
}
