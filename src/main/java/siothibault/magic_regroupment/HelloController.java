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
    ArrayList<Carte> Machine = new ArrayList<>();
    ArrayList<Carte> Feu = new ArrayList<>();
    ArrayList<Carte> Eau = new ArrayList<>();
    ArrayList<Carte> Tenebre = new ArrayList<>();
    ArrayList<Carte> Vie = new ArrayList<>();
    ArrayList<Carte> Lumiere = new ArrayList<>();
    ArrayList<Carte> Rainbow = new ArrayList<>();

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
    public int alea_liste(){
        int Max = 9; int Min = 0;return (int) (Math.random() * ((Max - Min) + 1));
    }
    public int alea_Tirage() {
        int Max = 9; int Min = 0;return (int) (Math.random() * ((Max - Min) + 1));
    }

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

    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/Projet_MTG/"+linkImage
                        ).toExternalForm()
                )
        );
    }

    int Inigma = 100;

    ///public void CombatMachine(){

    ///}

    public void Tirage_Booster_Blanc() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Lumiere.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }

    public void Tirage_Booster_Bleu() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Eau.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }

    public void Tirage_Booster_Noir() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Tenebre.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }


    public void Tirage_Booster_Rouge() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Feu.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }

    public void Tirage_Booster_Vert() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Vie.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }

    public void Tirage_Booster_Rainbow() {
        if (Inigma >= 30) {
            Inigma -= 30;
            changeAP(Invocations);
            Carte carteTiree = Rainbow.get(alea_Tirage());
            boolean carteDejaDansCollection = false;
            for (Carte carte : collection) {
                if (carte.equals(carteTiree)) {
                    carteDejaDansCollection = true;
                    break;
                }
            }
            if (carteDejaDansCollection) {
                Inigma += carteTiree.getPrix();
            } else {
                changeImageViewImg(CarteInvoquer, carteTiree.getImage());
                collection.add(carteTiree);
            }
        } else {
            changeAP(MenuMarche);
        }
    }

    //Cartes de type Eau

    Carte Ce1 = new Carte("le Guetteur de l eau", "bleu", "Eau/ImagesEau1.jpg", 9, 9, 70);
    Carte Ce2 = new Carte("Naida des eaux sombres", "bleu", "Eau/ImagesEau2.jpg", 2, 2, 15);
    Carte Ce3 = new Carte("élemental de marée", "bleu", "Eau/ImagesEau3.jpg", 0, 4, 20);
    Carte Ce4 = new Carte("sage des cascades", "bleu", "Eau/ImagesEau4.jpg", 2, 5, 35);
    Carte Ce5 = new Carte("Djinn Scribeciel", "bleu", "Eau/ImagesEau5.jpg", 3, 4, 35);
    Carte Ce6 = new Carte("Ondin des coraux", "bleu", "Eau/ImagesEau6.jpg", 2, 1, 10);
    Carte Ce7 = new Carte("Oracle des fonds marins", "bleu", "Eau/ImagesEau7.jpg", 2, 3, 25);
    Carte Ce8 = new Carte("Niblis de gel", "bleu", "Eau/ImagesEau8.jpg", 3, 3, 30);
    Carte Ce9 = new Carte("éclaireuse aquavente", "bleu", "Eau/ImagesEau9.jpg", 2, 2, 20);
    Carte Ce10 = new Carte("Subtilité", "bleu", "Eau/ImagesEau10.jpg", 3, 3, 30);


    //Cartes de type Feu


    Carte Cf1 = new Carte("Olifant", "rouge", "Feu/ImageFeu1.png", 6, 4, 50);
    Carte Cf2 = new Carte("Eomer,Marshal of Rohan", "rouge", "Feu/ImageFeu2.png", 4, 4, 40);
    Carte Cf3 = new Carte("Servant de Feu", "rouge", "Feu/ImageFeu3.png", 4, 3, 35);
    Carte Cf4 = new Carte("Drakuseth,Gueule de Flammes", "rouge", "Feu/ImageFeu4.jpeg", 7, 7, 60);
    Carte Cf5 = new Carte("Zalto,duc des géants de feu", "rouge", "Feu/ImageFeu5.png", 7, 3, 50);
    Carte Cf6 = new Carte("Rionya,danseuse du feu", "rouge", "Feu/ImageFeu6.png", 3, 4, 35);
    Carte Cf7 = new Carte("Solphim,Dominus du chaos", "rouge", "Feu/ImageFeu7.png", 5, 4, 45);
    Carte Cf8 = new Carte("Chandra,feu de Kaladesh", "rouge", "Feu/ImageFeu8.png", 2, 2, 20);
    Carte Cf9 = new Carte("Choeur de feu d'obsidienne", "rouge", "Feu/ImageFeu9.png", 4, 4, 40);
    Carte Cf10 = new Carte("dragon aux ailes-miroir", "rouge", "Feu/ImageFeu10.png", 4, 5, 45);

    //Cartes de type Lumière

    Carte Cl1 = new Carte("Griffon d'abbaye", "blanc", "Lumiere/ImageLu1.jpeg", 2, 2, 20);
    Carte Cl2 = new Carte("Lamasu Absoluteur", "blanc", "Lumiere/ImageLu2.png", 4, 3, 35);
    Carte Cl3 = new Carte("Iona, Bouclier d'Emeria", "blanc", "Lumiere/ImageLu3.jpg", 7, 7, 60);
    Carte Cl4 = new Carte("paladin des accordeurs", "blanc", "Lumiere/ImageLu4.jpeg", 3, 1, 20);
    Carte Cl5 = new Carte("Gandalf,cavalier blanc", "blanc", "Lumiere/ImageLu5.png", 3, 3, 30);
    Carte Cl6 = new Carte("Conquérant Charismatique", "blanc", "Lumiere/ImageLu6.png", 2, 2, 20);
    Carte Cl7 = new Carte("Consécratrice du courage", "blanc", "Lumiere/ImageLu7.png", 3, 5, 40);
    Carte Cl8 = new Carte("Gisela la lame brisée", "blanc", "Lumiere/ImageLu8.jpeg", 4, 3, 35);
    Carte Cl9 = new Carte("Avacyn, ange guardien", "blanc", "Lumiere/ImageLu9.jpeg", 5, 4, 45);
    Carte Cl10 = new Carte("Bruna, la lumière palissante", "blanc", "Lumiere/ImageLu10.jpeg", 5, 7, 55);


    //Cartes de type Rainbow

    Carte Cr1 = new Carte("Aragorn, L'unificateur", "rainbow", "Multicolor/ImageMul1.png", 5, 5, 50);
    Carte Cr2 = new Carte("Saruman le multicolor", "rainbow", "Multicolor/ImageMul2.png", 5, 4, 45);
    Carte Cr3 = new Carte("Sauron,le seigneur ténébreux", "rainbow", "Multicolor/ImageMul3.png", 7, 6, 65);
    Carte Cr4 = new Carte("Eowyn, la vierge Guerrière", "rainbow", "Multicolor/ImageMul4.png", 5, 4, 45);
    Carte Cr5 = new Carte("Gandalf le gris", "rainbow", "Multicolor/ImageMul5.png", 3, 4, 35);
    Carte Cr6 = new Carte("Aragorn et Arwen,époux", "rainbow", "Multicolor/ImageMul6.png", 3, 6, 45);
    Carte Cr7 = new Carte("Arachne, fille d'Ungoliant", "rainbow", "Multicolor/ImageMul7.png", 8, 8, 70);
    Carte Cr8 = new Carte("Arwen, reine mortelle", "rainbow", "Multicolor/ImageMul8.png", 2, 2, 20);
    Carte Cr9 = new Carte("Frodon, hobbit audacieux", "rainbow", "Multicolor/ImageMul9.png", 1, 3, 20);
    Carte Cr10 = new Carte("Le Balrog,Fléau de Durin", "rainbow", "Multicolor/ImageMul10.png", 7, 5, 55);

    //Carte de type ténèbre

    Carte Ct1 = new Carte("Démon de tourmental", "noire", "Tenebre/ImageTe1.png", 4, 5, 45);
    Carte Ct2 = new Carte("Chirurgien des ténèbres", "noire", "Tenebre/ImageTe2.jpg", 2, 1, 25);
    Carte Ct3 = new Carte("Héritière Falkenrath", "noire", "Tenebre/ImageTe3.png", 2, 1, 25);
    Carte Ct4 = new Carte("Festoyeuse du Crépuscule", "noire", "Tenebre/ImageTe4.png", 4, 5, 45);
    Carte Ct5 = new Carte("élite de Liliana", "noire", "Tenebre/ImageTe5.png", 1, 1, 10);
    Carte Ct6 = new Carte("Grognarded'Olivia", "noire", "Tenebre/ImageTe6.png", 2, 2, 20);
    Carte Ct7 = new Carte("Chevalier de l'effroi Markov", "noire", "Tenebre/ImageTe7.jpeg", 3, 3, 30);
    Carte Ct8 = new Carte("Seigneur de sang arrogant", "noire", "Tenebre/ImageTe8.png", 4, 4, 40);
    Carte Ct9 = new Carte("Kinzu de Mornecouvent", "noire", "Tenebre/ImageTe9.jpg", 5, 4, 45);
    Carte Ct10 = new Carte("Paladine parjure", "noire", "Tenebre/ImageTe10.jpeg", 1, 1, 10);


    //Carte de type vie

    Carte Cv1 = new Carte("Dragon vert", "vert", "Vie/ImagesVie1.png", 4, 4, 40);
    Carte Cv2 = new Carte("La vieille Ronge-Os", "vert", "Vie/ImagesVie2.png", 7, 7, 55);
    Carte Cv3 = new Carte("Hydre aux écailles de mana", "vert", "Vie/ImagesVie3.jpg", 5, 4, 45);
    Carte Cv4 = new Carte("Engloutisseur Faucheur de Ciel", "vert", "Vie/ImagesVie4.png", 5, 4, 45);
    Carte Cv5 = new Carte("Intendant de Prédation", "vert", "Vie/ImagesVie5.png", 2, 2, 20);
    Carte Cv6 = new Carte("Protecteur du bois", "vert", "Vie/ImagesVie6.jpg", 4, 6, 50);
    Carte Cv7 = new Carte("vifsorbier, Ent impétueux", "vert", "Vie/ImagesVie7.jpg", 5, 6, 55);
    Carte Cv8 = new Carte("Polukranos Renaissant", "vert", "Vie/ImagesVie8.jpg", 4, 5, 45);
    Carte Cv9 = new Carte("Rénata, appelée à la chasse", "vert", "Vie/ImagesVie9.png", 4, 3, 35);
    Carte Cv10 = new Carte("Cavalier verdoyant", "vert", "Vie/ImagesVie10.jpg", 4, 2, 30);

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

        //Main de la machine :

        Machine.add(Cf1);
        Machine.add(Cf2);
        Machine.add(Cf3);
        Machine.add(Cf4);
        Machine.add(Cf5);
        Machine.add(Cf6);
        Machine.add(Cf7);
        Machine.add(Cf8);
        Machine.add(Cf9);
        Machine.add(Cf10);
        Machine.add(Ct1);
        Machine.add(Ct2);
        Machine.add(Ct3);
        Machine.add(Ct4);
        Machine.add(Ct5);
        Machine.add(Ct6);
        Machine.add(Ct7);
        Machine.add(Ct8);
        Machine.add(Ct9);
        Machine.add(Ct10);
        Machine.add(Cr1);
        Machine.add(Cr2);
        Machine.add(Cr3);
        Machine.add(Cr4);
        Machine.add(Cr5);
        Machine.add(Cr6);
        Machine.add(Cr7);
        Machine.add(Cr8);
        Machine.add(Cr9);
        Machine.add(Cr10);
        Machine.add(Ce1);
        Machine.add(Ce2);
        Machine.add(Ce3);
        Machine.add(Ce4);
        Machine.add(Ce5);
        Machine.add(Ce6);
        Machine.add(Ce7);
        Machine.add(Ce8);
        Machine.add(Ce9);
        Machine.add(Ce10);
        Machine.add(Cv1);
        Machine.add(Cv2);
        Machine.add(Cv3);
        Machine.add(Cv4);
        Machine.add(Cv5);
        Machine.add(Cv6);
        Machine.add(Cv7);
        Machine.add(Cv8);
        Machine.add(Cv9);
        Machine.add(Cv10);
        Machine.add(Cl1);
        Machine.add(Cl2);
        Machine.add(Cl3);
        Machine.add(Cl4);
        Machine.add(Cl5);
        Machine.add(Cl6);
        Machine.add(Cl7);
        Machine.add(Cl8);
        Machine.add(Cl9);
        Machine.add(Cl10);

        collection.add(Lumiere.get(alea_liste()));

        collection.add(Feu.get(alea_liste()));

        collection.add(Eau.get(alea_liste()));

        collection.add(Tenebre.get(alea_liste()));

        collection.add(Vie.get(alea_liste()));

        collection.add(Rainbow.get(alea_liste()));
    }
}