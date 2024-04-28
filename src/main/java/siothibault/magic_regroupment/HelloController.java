package siothibault.magic_regroupment;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class HelloController implements Initializable{


        @FXML
        private AnchorPane MenuChoix;

        @FXML
        private  AnchorPane MenuLumiere;

        @FXML
        private  AnchorPane MenuTenebre;

        @FXML
        private  AnchorPane MenuVie;

        @FXML
        private  AnchorPane MenuEau;

        @FXML
        private  AnchorPane MenuCollection;

        @FXML
        private  AnchorPane MenuFeu;

        @FXML
        private  AnchorPane MenuMulticolor;

        @FXML
        private  AnchorPane MenuMarche;

        @FXML
        public void goToDebut(Event event) {
            changeAP(MenuChoix);
        }
        @FXML
        public void goToMenuEau(Event event) {changeAP(MenuEau);}
        @FXML
        public void goToMenu(Event event) {changeAP(MenuFeu);}
        @FXML
        public void goToMenuLumiere(Event event) {changeAP(MenuLumiere);}
        @FXML
        public void goToCollection(Event event) {changeAP(MenuCollection);}
        @FXML
        public void goToMenuTenebre(Event event) {changeAP(MenuTenebre);}
        @FXML
        public void goToMenuVie(Event event) {changeAP(MenuVie);}
        @FXML
        public void goToMenuRainbow(Event event) {changeAP(MenuMulticolor);}

        // Rend visible/invisible une AnchorPane ------------------------------------------------------------------------ //
        public void invisible(AnchorPane apCourante){apCourante.setVisible(false);return;}
        public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

        // Cache toutes les AnchorPanes --------------------------------------------------------------------------------- //
        public void clearAll()
        {
            invisible(MenuChoix);
            invisible(MenuLumiere);
            invisible(MenuTenebre);
            invisible(MenuVie);
            invisible(MenuEau);
            invisible(MenuFeu);
            invisible(MenuMulticolor);
            invisible(MenuCollection);
        }

        // Change d'AnchorPane ------------------------------------------------------------------------------------------ //
        public void changeAP(AnchorPane choice){
            clearAll();
            visible(choice);
        }

        public void changeImageViewImg(ImageView imgView, String linkImage){
            imgView.setImage(
                    new Image(
                            getClass().getResource(
                                    "/images/"+linkImage
                            ).toExternalForm()
                    )
            );
        }

        // Donne un entier compris entre a et b ------------------------------------------------------------------------- //
        public int intervalleInt(int a, int b)
        {
            Random random = new Random();
            return random.nextInt((b - a) + 1) + a;
        }

        // Genere un nombre aleatoire entre 0 et 100. ------------------------------------------------------------------- //
        public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        changeAP(MenuChoix);

    }
}
