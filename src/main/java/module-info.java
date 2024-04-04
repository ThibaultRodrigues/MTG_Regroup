module siothibault.premier_jeu_mtg {
    requires javafx.controls;
    requires javafx.fxml;


    opens siothibault.premier_jeu_mtg to javafx.fxml;
    exports siothibault.premier_jeu_mtg;
}