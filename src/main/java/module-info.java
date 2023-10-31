module com.example.javagames {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.javagames to javafx.fxml;
    opens com.example.javagames.Controllers to javafx.fxml;
    exports com.example.javagames;

    exports com.example.javagames.Controllers;
}