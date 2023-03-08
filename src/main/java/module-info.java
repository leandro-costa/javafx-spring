module br.edu.ifba.saj {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.core;
    requires spring.orm;
    requires spring.beans;
    requires spring.context;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires jakarta.validation;
    requires static lombok;
    requires spring.data.jpa;
    requires spring.data.commons;

    opens br.edu.ifba.saj to javafx.fxml, org.springframework, spring.core;
    opens br.edu.ifba.saj.controller to javafx.fxml, org.springframework, spring.core, spring.beans;
    opens br.edu.ifba.saj.service to spring.core, spring.beans;
    opens br.edu.ifba.saj.repository to spring.core, spring.beans, spring.data.jpa, spring.data.commons, spring.orm, spring.context;
    opens br.edu.ifba.saj.model to javafx.base, javafx.fxml, org.hibernate.orm.core;   
    exports br.edu.ifba.saj;
    exports br.edu.ifba.saj.model;
    
}
