package siothibault.magic_regroupment;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class HelloController implements Initializable {
    @FXML
    private AnchorPane MenuVieCol;
    @FXML
    private AnchorPane MenuMulticolorCol;
    @FXML
    private AnchorPane MenuTenebreCol;
    @FXML
    private AnchorPane MenuEauCol;
    @FXML
    private AnchorPane MenuLumiereCol;
    @FXML
    private AnchorPane MenuFeuCol;
    @FXML
    private AnchorPane Menuchoix;

    ArrayList<Carte> collection = new ArrayList<>();

    @FXML
    private ImageView CarteInvoquer;

    @FXML
    private ImageView ColVie1;
    @FXML
    private ImageView ColVie2;
    @FXML
    private ImageView ColVie3;
    @FXML
    private ImageView ColVie4;
    @FXML
    private ImageView ColVie5;
    @FXML
    private ImageView ColVie6;
    @FXML
    private ImageView ColVie7;
    @FXML
    private ImageView ColVie8;
    @FXML
    private ImageView ColVie9;
    @FXML
    private ImageView ColVie10;

    @FXML
    private ImageView ColMulticolor1;
    @FXML
    private ImageView ColMulticolor2;
    @FXML
    private ImageView ColMulticolor3;
    @FXML
    private ImageView ColMulticolor4;
    @FXML
    private ImageView ColMulticolor5;
    @FXML
    private ImageView ColMulticolor6;
    @FXML
    private ImageView ColMulticolor7;
    @FXML
    private ImageView ColMulticolor8;
    @FXML
    private ImageView ColMulticolor9;
    @FXML
    private ImageView ColMulticolor10;

    @FXML
    private ImageView ColFeu1;
    @FXML
    private ImageView ColFeu2;
    @FXML
    private ImageView ColFeu3;
    @FXML
    private ImageView ColFeu4;
    @FXML
    private ImageView ColFeu5;
    @FXML
    private ImageView ColFeu6;
    @FXML
    private ImageView ColFeu7;
    @FXML
    private ImageView ColFeu8;
    @FXML
    private ImageView ColFeu9;
    @FXML
    private ImageView ColFeu10;

    @FXML
    private ImageView ColEau1;
    @FXML
    private ImageView ColEau2;
    @FXML
    private ImageView ColEau3;
    @FXML
    private ImageView ColEau4;
    @FXML
    private ImageView ColEau5;
    @FXML
    private ImageView ColEau6;
    @FXML
    private ImageView ColEau7;
    @FXML
    private ImageView ColEau8;
    @FXML
    private ImageView ColEau9;
    @FXML
    private ImageView ColEau10;

    @FXML
    private ImageView ColTen1;
    @FXML
    private ImageView ColTen2;
    @FXML
    private ImageView ColTen3;
    @FXML
    private ImageView ColTen4;
    @FXML
    private ImageView ColTen5;
    @FXML
    private ImageView ColTen6;
    @FXML
    private ImageView ColTen7;
    @FXML
    private ImageView ColTen8;
    @FXML
    private ImageView ColTen9;
    @FXML
    private ImageView ColTen10;

    @FXML
    private ImageView ColLum1;
    @FXML
    private ImageView ColLum2;
    @FXML
    private ImageView ColLum3;
    @FXML
    private ImageView ColLum4;
    @FXML
    private ImageView ColLum5;
    @FXML
    private ImageView ColLum6;
    @FXML
    private ImageView ColLum7;
    @FXML
    private ImageView ColLum8;
    @FXML
    private ImageView ColLum9;
    @FXML
    private ImageView ColLum10;

    @FXML
    private AnchorPane MenuLumiere;

    @FXML
    private AnchorPane MenuTenebre;

    @FXML
    private AnchorPane MenuVie;

    @FXML
    private AnchorPane MenuEau;

    @FXML
    private AnchorPane MenuCollection;

    @FXML
    private AnchorPane MenuFeu;

    @FXML
    private AnchorPane MenuMulticolor;

    @FXML
    private AnchorPane MenuMarche;

    @FXML
    private AnchorPane Invocations;

    @FXML
    public void goToDebut(Event event) {
        changeAP(Menuchoix);
    }

    @FXML
    public void goToMarche(Event event) {
        changeAP(MenuMarche);
    }

    @FXML
    public void goToMenuEau(Event event) {
        changeAP(MenuEau);
    }

    @FXML
    public void goToMenuFeu(Event event) {
        changeAP(MenuFeu);
    }

    @FXML
    public void goToMenuLumiere(Event event) {
        changeAP(MenuLumiere);
    }

    public void goToMenuLumiereCol(Event event) {
        changeAP(MenuLumiereCol);
    }

    public void goToMenuEauCol(Event event) {
        changeAP(MenuEauCol);
    }

    public void goToMenuFeuCol(Event event) {
        changeAP(MenuFeuCol);
    }

    public void goToMenuTenebreCol(Event event) {
        changeAP(MenuTenebreCol);
    }

    public void goToMenuRainbowCol(Event event) {
        changeAP(MenuMulticolorCol);
    }

    public void goToMenuVieCol(Event event) {
        changeAP(MenuVieCol);
    }
    @FXML
    public void goToCollection(Event event) {
        changeAP(MenuCollection);
    }

    @FXML
    public void goToMenuTenebre(Event event) {
        changeAP(MenuTenebre);
    }

    @FXML
    public void goToMenuVie(Event event) {
        changeAP(MenuVie);
    }

    @FXML
    public void goToMenuRainbow(Event event) {
        changeAP(MenuMulticolor);
    }

    public int alea_Tirage() {
        return (int) (Math.random() * 11);
    } // 0 to 100

    // Rend visible/invisible une AnchorPane ------------------------------------------------------------------------ //
    public void invisible(AnchorPane apCourante) {
        apCourante.setVisible(false);
    }

    public void visible(AnchorPane apCourante) {
        apCourante.setVisible(true);
    }

    // Cache toutes les AnchorPanes --------------------------------------------------------------------------------- //
    public void clearAll() {
        invisible(MenuMulticolorCol);
        invisible(MenuEauCol);
        invisible(MenuFeuCol);
        invisible(MenuLumiereCol);
        invisible(MenuVieCol);
        invisible(MenuTenebreCol);
        invisible(Menuchoix);
        invisible(MenuLumiere);
        invisible(MenuTenebre);
        invisible(MenuVie);
        invisible(MenuEau);
        invisible(MenuFeu);
        invisible(MenuMulticolor);
        invisible(MenuCollection);
        invisible(MenuMarche);
        invisible(Invocations);
    }

    // Change d'AnchorPane ------------------------------------------------------------------------------------------ //
    public void changeAP(AnchorPane choice) {
        clearAll();
        visible(choice);
    }

    public void changeImageViewImg(ImageView imgView, String linkImage) {
        imgView.setImage(new Image(
                getClass().getResource(
                                "Images" + linkImage)
                        .toExternalForm()));
    }

    int Inigma = 100;

    public void Tirage_Booster_Blanc() {
        if (Inigma >= 30) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Lumiere.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Lumiere.get(i).getImage());
                    collection.add(Lumiere.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }

    public void Tirage_Booster_Bleu() {
        if (Inigma >= 30) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Eau.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Eau.get(i).getImage());
                    collection.add(Eau.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }

    public void Tirage_Booster_Noir() {
        if (Inigma >= 30) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Tenebre.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Tenebre.get(i).getImage());
                    collection.add(Tenebre.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }


    public void Tirage_Booster_Rouge() {
        if (Inigma >= 30) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Feu.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Feu.get(i).getImage());
                    collection.add(Feu.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }

    public void Tirage_Booster_Vert() {
        if (Inigma >= 30) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Vie.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Vie.get(i).getImage());
                    collection.add(Vie.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }

    public void Tirage_Booster_Rainbow() {
        if (Inigma >= 80) {
            Inigma = Inigma - 150;
            changeAP(Invocations);
            for (int i = 0 ; i < collection.size() ; i++ ){
                if (Rainbow.get(alea_Tirage()) == collection.get(i)){
                    Inigma += collection.get(i).getPrix();
                }
                else {
                    changeImageViewImg(CarteInvoquer,Rainbow.get(i).getImage());
                    collection.add(Rainbow.get(alea_Tirage()));
                }
            }
        }
        else {
            changeAP(MenuMarche);
        }

    }

    //Cartes de type Eau

    @FXML
    ArrayList<Carte> Eau = new ArrayList<>();

    Carte Ce1 = new Carte("le Guetteur de l eau", "bleu", "CarteEau/ImagesEau1.jpg", 9, 9, 70);
    Carte Ce2 = new Carte("Naida des eaux sombres", "bleu", "CarteEau/ImagesEau2.jpg", 2, 2, 15);
    Carte Ce3 = new Carte("élemental de marée", "bleu", "CarteEau/ImagesEau3.jpg", 0, 4, 20);
    Carte Ce4 = new Carte("sage des cascades", "bleu", "CarteEau/ImagesEau4.jpg", 2, 5, 35);
    Carte Ce5 = new Carte("Djinn Scribeciel", "bleu", "CarteEau/ImagesEau5.jpg", 3, 4, 35);
    Carte Ce6 = new Carte("Ondin des coraux", "bleu", "CarteEau/ImagesEau6.jpg", 2, 1, 10);
    Carte Ce7 = new Carte("Oracle des fonds marins", "bleu", "CarteEau/ImagesEau7.jpg", 2, 3, 25);
    Carte Ce8 = new Carte("Niblis de gel", "bleu", "CarteEau/ImagesEau8.jpg", 3, 3, 30);
    Carte Ce9 = new Carte("éclaireuse aquavente", "bleu", "CarteEau/ImagesEau9.jpg", 2, 2, 20);
    Carte Ce10 = new Carte("Subtilité", "bleu", "CarteEau/ImagesEau10.jpg", 3, 3, 30);

    //Cartes de type Feu

    ArrayList<Carte> Feu = new ArrayList<>();

    Carte Cf1 = new Carte("Olifant", "rouge", "Images/CarteFeu/ImageFeu1.png", 6, 4, 50);
    Carte Cf2 = new Carte("Eomer,Marshal of Rohan", "rouge", "Images/CarteFeu/ImageFeu2.png", 4, 4, 40);
    Carte Cf3 = new Carte("Servant de Feu", "rouge", "Images/CarteFeu/ImageFeu3.png", 4, 3, 35);
    Carte Cf4 = new Carte("Drakuseth,Gueule de Flammes", "rouge", "Images/CarteFeu/ImageFeu4.png", 7, 7, 60);
    Carte Cf5 = new Carte("Zalto,duc des géants de feu", "rouge", "Images/CarteFeu/ImageFeu5.png", 7, 3, 50);
    Carte Cf6 = new Carte("Rionya,danseuse du feu", "rouge", "Images/CarteFeu/ImageFeu6.png", 3, 4, 35);
    Carte Cf7 = new Carte("Solphim,Dominus du chaos", "rouge", "Images/CarteFeu/ImageFeu7.png", 5, 4, 45);
    Carte Cf8 = new Carte("Chandra,feu de Kaladesh", "rouge", "Images/CarteFeu/ImageFeu8.png", 2, 2, 20);
    Carte Cf9 = new Carte("Choeur de feu d'obsidienne", "rouge", "Images/CarteFeu/ImageFeu9.png", 4, 4, 40);
    Carte Cf10 = new Carte("dragon aux ailes-miroir", "rouge", "Images/CarteFeu/ImageFeu10.png", 4, 5, 45);

    //Cartes de type Lumière

    @FXML
    ArrayList<Carte> Lumiere = new ArrayList<>();

    Carte Cl1 = new Carte("Griffon d'abbaye", "blanc", "CarteLumiere/ImageLu1.jpeg", 2, 2, 20);
    Carte Cl2 = new Carte("Lamasu Absoluteur", "blanc", "CarteLumiere/ImageLu2.png", 4, 3, 35);
    Carte Cl3 = new Carte("Iona, Bouclier d'Emeria", "blanc", "CarteLumiere/ImageLu3.jpg", 7, 7, 60);
    Carte Cl4 = new Carte("paladin des accordeurs", "blanc", "CarteLumiere/ImageLu4.jpeg", 3, 1, 20);
    Carte Cl5 = new Carte("Gandalf,cavalier blanc", "blanc", "CarteLumiere/ImageLu5.png", 3, 3, 30);
    Carte Cl6 = new Carte("Conquérant Charismatique", "blanc", "CarteLumiere/ImageLu6.png", 2, 2, 20);
    Carte Cl7 = new Carte("Consécratrice du courage", "blanc", "CarteLumiere/ImageLu7.png", 3, 5, 40);
    Carte Cl8 = new Carte("Gisela la lame brisée", "blanc", "CarteLumiere/ImageLu8.jpeg", 4, 3, 35);
    Carte Cl9 = new Carte("Avacyn, ange guardien", "blanc", "CarteLumiere/ImageLu9.jpeg", 5, 4, 45);
    Carte Cl10 = new Carte("Bruna, la lumière palissante", "blanc", "CarteLumiere/ImageLu10.jpeg", 5, 7, 55);


    //Cartes de type Rainbow

    ArrayList<Carte> Rainbow = new ArrayList<>();

    Carte Cr1 = new Carte("Aragorn, L'unificateur", "rainbow", "Images/CarteMulticolor/ImageMul1.png", 5, 5, 50);
    Carte Cr2 = new Carte("Saruman le multicolor", "rainbow", "Images/CarteMulticolor/ImageMul2.png", 5, 4, 45);
    Carte Cr3 = new Carte("Sauron,le seigneur ténébreux", "rainbow", "Images/CarteMulticolor/ImageMul3.png", 7, 6, 65);
    Carte Cr4 = new Carte("Eowyn, la vierge Guerrière", "rainbow", "Images/CarteMulticolor/ImageMul4.png", 5, 4, 45);
    Carte Cr5 = new Carte("Gandalf le gris", "rainbow", "Images/CarteMulticolor/ImageMul5.png", 3, 4, 35);
    Carte Cr6 = new Carte("Aragorn et Arwen,époux", "rainbow", "Images/CarteMulticolor/ImageMul6.png", 3, 6, 45);
    Carte Cr7 = new Carte("Arachne, fille d'Ungoliant", "rainbow", "Images/CarteMulticolor/ImageMul7.png", 8, 8, 70);
    Carte Cr8 = new Carte("Arwen, reine mortelle", "rainbow", "Images/CarteMulticolor/ImageMul8.png", 2, 2, 20);
    Carte Cr9 = new Carte("Frodon, hobbit audacieux", "rainbow", "Images/CarteMulticolor/ImageMul9.png", 1, 3, 20);
    Carte Cr10 = new Carte("Le Balrog,Fléau de Durin", "rainbow", "Images/CarteMulticolor/ImageMul10.png", 7, 5, 55);

    //Carte de type ténèbre

    ArrayList<Carte> Tenebre = new ArrayList<>();

    Carte Ct1 = new Carte("Démon de tourmental", "noire", "CarteTenebre/ImageTe1.png", 4, 5, 45);
    Carte Ct2 = new Carte("Chirurgien des ténèbres", "noire", "CarteTenebre/ImageTe2.jpg", 2, 1, 25);
    Carte Ct3 = new Carte("Héritière Falkenrath", "noire", "CarteTenebre/ImageTe3.png", 2, 1, 25);
    Carte Ct4 = new Carte("Festoyeuse du Crépuscule", "noire", "CarteTenebre/ImageTe4.png", 4, 5, 45);
    Carte Ct5 = new Carte("élite de Liliana", "noire", "CarteTenebre/ImageTe5.png", 1, 1, 10);
    Carte Ct6 = new Carte("Grognarded'Olivia", "noire", "CarteTenebre/ImageTe6.png", 2, 2, 20);
    Carte Ct7 = new Carte("Chevalier de l'effroi Markov", "noire", "CarteTenebre/ImageTe7.jpeg", 3, 3, 30);
    Carte Ct8 = new Carte("Seigneur de sang arrogant", "noire", "CarteTenebre/ImageTe8.png", 4, 4, 40);
    Carte Ct9 = new Carte("Kinzu de Mornecouvent", "noire", "CarteTenebre/ImageTe9.jpg", 5, 4, 45);
    Carte Ct10 = new Carte("Paladine parjure", "noire", "CarteTenebre/ImageTe10.jpeg", 1, 1, 10);


    //Carte de type vie

    ArrayList<Carte> Vie = new ArrayList<>();

    Carte Cv1 = new Carte("Dragon vert", "vert", "CarteVie/ImagesVie1.png", 4, 4, 40);
    Carte Cv2 = new Carte("La vieille Ronge-Os", "vert", "CarteVie/ImagesVie2.png", 7, 7, 55);
    Carte Cv3 = new Carte("Hydre aux écailles de mana", "vert", "CarteVie/ImagesVie3.jpg", 5, 4, 45);
    Carte Cv4 = new Carte("Engloutisseur Faucheur de Ciel", "vert", "CarteVie/ImagesVie4.png", 5, 4, 45);
    Carte Cv5 = new Carte("Intendant de Prédation", "vert", "CarteVie/ImagesVie5.png", 2, 2, 20);
    Carte Cv6 = new Carte("Protecteur du bois", "vert", "CarteVie/ImagesVie6.jpg", 4, 6, 50);
    Carte Cv7 = new Carte("vifsorbier, Ent impétueux", "vert", "CarteVie/ImagesVie7.jpg", 5, 6, 55);
    Carte Cv8 = new Carte("Polukranos Renaissant", "vert", "CarteVie/ImagesVie8.jpg", 4, 5, 45);
    Carte Cv9 = new Carte("Rénata, appelée à la chasse", "vert", "CarteVie/ImagesVie9.png", 4, 3, 35);
    Carte Cv10 = new Carte("Cavalier verdoyant", "vert", "CarteVie/ImagesVie10.jpg", 4, 2, 30);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        changeAP(Menuchoix);

        Feu.add(Cf1);
        Feu.add(Cf2);
        Feu.add(Cf3);
        Feu.add(Cf4);
        Feu.add(Cf5);
        Feu.add(Cf6);
        Feu.add(Cf7);
        Feu.add(Cf8);
        Feu.add(Cf9);
        Feu.add(Cf10);

        Tenebre.add(Ct1);
        Tenebre.add(Ct2);
        Tenebre.add(Ct3);
        Tenebre.add(Ct4);
        Tenebre.add(Ct5);
        Tenebre.add(Ct6);
        Tenebre.add(Ct7);
        Tenebre.add(Ct8);
        Tenebre.add(Ct9);
        Tenebre.add(Ct10);

        Rainbow.add(Cr1);
        Rainbow.add(Cr2);
        Rainbow.add(Cr3);
        Rainbow.add(Cr4);
        Rainbow.add(Cr5);
        Rainbow.add(Cr6);
        Rainbow.add(Cr7);
        Rainbow.add(Cr8);
        Rainbow.add(Cr9);
        Rainbow.add(Cr10);

        Eau.add(Ce1);
        Eau.add(Ce2);
        Eau.add(Ce3);
        Eau.add(Ce4);
        Eau.add(Ce5);
        Eau.add(Ce6);
        Eau.add(Ce7);
        Eau.add(Ce8);
        Eau.add(Ce9);
        Eau.add(Ce10);

        Vie.add(Cv1);
        Vie.add(Cv2);
        Vie.add(Cv3);
        Vie.add(Cv4);
        Vie.add(Cv5);
        Vie.add(Cv6);
        Vie.add(Cv7);
        Vie.add(Cv8);
        Vie.add(Cv9);
        Vie.add(Cv10);

        Lumiere.add(Cl1);
        Lumiere.add(Cl2);
        Lumiere.add(Cl3);
        Lumiere.add(Cl4);
        Lumiere.add(Cl5);
        Lumiere.add(Cl6);
        Lumiere.add(Cl7);
        Lumiere.add(Cl8);
        Lumiere.add(Cl9);
        Lumiere.add(Cl10);

        collection.add(Lumiere.get(alea_Tirage()));

        collection.add(Feu.get(alea_Tirage()));

        collection.add(Eau.get(alea_Tirage()));

        collection.add(Tenebre.get(alea_Tirage()));

        collection.add(Vie.get(alea_Tirage()));

        collection.add(Rainbow.get(alea_Tirage()));
    }
}