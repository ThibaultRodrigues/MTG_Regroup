package siothibault.magic_regroupment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public abstract class HelloApplication extends Application {


    public static void main(String[] args) {

        launch();

        ArrayList<Carte>  collection = new ArrayList<>();

        //Cartes de type Eau

        ArrayList<Carte> Eau = new ArrayList<>();

        Carte Ce1 = new Carte("le Guetteur de l eau","bleu","ImagesEau1.jpg",9,9);
        Carte Ce2 = new Carte("Naida des eaux sombres","bleu","ImagesEau2.jpg",2,2);
        Carte Ce3 = new Carte("élemental de marée","bleu","ImagesEau3.jpg",0,4);
        Carte Ce4 = new Carte("sage des cascades","bleu","ImagesEau4.jpg",2,5);
        Carte Ce5 = new Carte("Djinn Scribeciel","bleu","ImagesEau5.jpg",3,4);
        Carte Ce6 = new Carte("Ondin des coraux","bleu","ImagesEau6.jpg",2,1);
        Carte Ce7 = new Carte("Oracle des fonds marins","bleu","ImagesEau7.jpg",2,3);
        Carte Ce8 = new Carte("Niblis de gel","bleu","ImagesEau8.jpg",3,3);
        Carte Ce9 = new Carte("éclaireuse aquavente","bleu","ImagesEau9.jpg",2,2);
        Carte Ce10 = new Carte("Subtilité","bleu","ImagesEau10.jpg",3,3);

        Eau.add(Ce1) ; Eau.add(Ce2) ; Eau.add(Ce3) ; Eau.add(Ce4) ; Eau.add(Ce5) ;
        Eau.add(Ce6) ; Eau.add(Ce7) ; Eau.add(Ce8) ; Eau.add(Ce9) ; Eau.add(Ce10) ;

        //Cartes de type Feu

        ArrayList<Carte> Feu = new ArrayList<>();

        Carte Cf1 = new Carte("Olifant","rouge","ImageFeu1.png",6,4);
        Carte Cf2 = new Carte("Eomer,Marshal of Rohan","rouge","ImageFeu2.png",4,4);
        Carte Cf3 = new Carte("Servant de Feu","rouge","ImageFeu3.png",4,3);
        Carte Cf4 = new Carte("Drakuseth,Gueule de Flammes","rouge","ImageFeu4.png",7,7);
        Carte Cf5 = new Carte("Zalto,duc des géants de feu","rouge","ImageFeu5.png",7,3);
        Carte Cf6 = new Carte("Rionya,danseuse du feu","rouge","ImageFeu6.png",3,4);
        Carte Cf7 = new Carte("Solphim,Dominus du chaos","rouge","ImageFeu7.png",5,4);
        Carte Cf8 = new Carte("Chandra,feu de Kaladesh","rouge","ImageFeu8.png",2,2);
        Carte Cf9 = new Carte("Choeur de feu d'obsidienne","rouge","ImageFeu9.png",4,4);
        Carte Cf10 = new Carte("dragon aux ailes-miroir","rouge","ImageFeu10.png",4,5);

        Feu.add(Cf1) ; Feu.add(Cf2) ; Feu.add(Cf3) ; Feu.add(Cf4) ; Feu.add(Cf5) ;
        Feu.add(Cf6) ; Feu.add(Cf7) ; Feu.add(Cf8) ; Feu.add(Cf9) ; Feu.add(Cf10) ;

        //Cartes de type Lumière

        ArrayList<Carte> Lumiere = new ArrayList<>();

        Carte Cl1 = new Carte("Griffon d'abbaye","blanc","ImageLu1.jpeg",2,2);
        Carte Cl2 = new Carte("Lamasu Absoluteur","blanc","ImageLu2.png",4,3);
        Carte Cl3 = new Carte("Iona, Bouclier d'Emeria","blanc","ImageLu3.jpg",7,7);
        Carte Cl4 = new Carte("paladin des accordeurs","blanc","ImageLu4.jpeg",3,1);
        Carte Cl5 = new Carte("Gandalf,cavalier blanc","blanc","ImageLu5.png",3,3);
        Carte Cl6 = new Carte("Conquérant Charismatique","blanc","ImageLu6.png",2,2);
        Carte Cl7 = new Carte("Consécratrice du courage","blanc","ImageLu7.png",3,5);
        Carte Cl8 = new Carte("Gisela la lame brisée","blanc","ImageLu8.jpeg",4,3);
        Carte Cl9 = new Carte("Avacyn, ange guardien","blanc","ImageLu9.jpeg",5,4);
        Carte Cl10 = new Carte("Bruna, la lumière palissante","blanc","ImageLu10.jpeg",5,7);

        Lumiere.add(Cl1); Lumiere.add(Cl2); Lumiere.add(Cl3); Lumiere.add(Cl4); Lumiere.add(Cl5);
        Lumiere.add(Cl6); Lumiere.add(Cl7); Lumiere.add(Cl8); Lumiere.add(Cl9); Lumiere.add(Cl10);

        //Cartes de type Rainbow

        ArrayList<Carte> Rainbow = new ArrayList<>();

        Carte Cr1 = new Carte("Aragorn, L'unificateur","rainbow","ImageMul1.png",5,5);
        Carte Cr2 = new Carte("Saruman le multicolor","rainbow","ImageMul2.png",5,4);
        Carte Cr3 = new Carte("Sauron,le seigneur ténébreux","rainbow","ImageMul3.png",7,6);
        Carte Cr4 = new Carte("Eowyn, la vierge Guerrière","rainbow","ImageMul4.png",5,4);
        Carte Cr5 = new Carte("Gandalf le gris","rainbow","ImageMul5.png",3,4);
        Carte Cr6 = new Carte("Aragorn et Arwen,époux","rainbow","ImageMul6.png",3,6);
        Carte Cr7 = new Carte("Arachne, fille d'Ungoliant","rainbow","ImageMul7.png",8,8);
        Carte Cr8 = new Carte("Arwen, reine mortelle","rainbow","ImageMul8.png",2,2);
        Carte Cr9 = new Carte("Frodon, hobbit audacieux","rainbow","ImageMul9.png",1,3);
        Carte Cr10 = new Carte("Le Balrog,Fléau de Durin","rainbow","ImageMul10.png",7,5);

        Rainbow.add(Cr1); Rainbow.add(Cr2); Rainbow.add(Cr3); Rainbow.add(Cr4); Rainbow.add(Cr5);
        Rainbow.add(Cr6); Rainbow.add(Cr7); Rainbow.add(Cr8); Rainbow.add(Cr9); Rainbow.add(Cr10);

        //Carte de type ténèbre

        ArrayList<Carte> Tenebre = new ArrayList<>();

        Carte Ct1 = new Carte("Démon de tourmental","noire","ImageTe1.png",4,5);
        Carte Ct2 = new Carte("Chirurgien des ténèbres","noire","ImageTe2.jpg",2,1);
        Carte Ct3 = new Carte("Héritière Falkenrath","noire","ImageTe3.png",2,1);
        Carte Ct4 = new Carte("Festoyeuse du Crépuscule","noire","ImageTe4.png",4,5);
        Carte Ct5 = new Carte("élite de Liliana","noire","ImageTe5.png",1,1);
        Carte Ct6 = new Carte("Grognarded'Olivia","noire","ImageTe6.png",2,2);
        Carte Ct7 = new Carte("Chevalier de l'effroi Markov","noire","ImageTe7.jpeg",3,3);
        Carte Ct8 = new Carte("Seigneur de sang arrogant","noire","ImageTe8.png",4,4);
        Carte Ct9 = new Carte("Kinzu de Mornecouvent","noire","ImageTe9.jpg",5,4);
        Carte Ct10 = new Carte("Paladine parjure","noire","ImageTe10.jpeg",1,1);

        Tenebre.add(Ct1) ; Tenebre.add(Ct2) ; Tenebre.add(Ct3) ; Tenebre.add(Ct4) ; Tenebre.add(Ct5);
        Tenebre.add(Ct6) ; Tenebre.add(Ct7) ; Tenebre.add(Ct8) ; Tenebre.add(Ct9) ; Tenebre.add(Ct10);

        //Carte de type vie

        ArrayList<Carte> Vie = new ArrayList<>();

        Carte Cv1 = new Carte("Dragon vert","vert","src/main/resources/siothibault/magic_regroupment/Projet_MTG/Cartes Magic.Vie/ImagesVie1.png",4,4);
        Carte Cv2 = new Carte("La vieille Ronge-Os","vert","ImagesVie2.png",7,7);
        Carte Cv3 = new Carte("Hydre aux écailles de mana","vert","ImagesVie3.jpg",5,4);
        Carte Cv4 = new Carte("Engloutisseur Faucheur de Ciel","vert","ImagesVie4.png",5,4);
        Carte Cv5 = new Carte("Intendant de Prédation","vert","ImagesVie5.png",2,2);
        Carte Cv6 = new Carte("Protecteur du bois","vert","ImagesVie6.jpg",4,6);
        Carte Cv7 = new Carte("vifsorbier, Ent impétueux","vert","ImagesVie7.jpg",5,6);
        Carte Cv8 = new Carte("Polukranos Renaissant","vert","ImagesVie8.jpg",4,5);
        Carte Cv9 = new Carte("Rénata, appelée à la chasse","vert","ImagesVie9.png",4,3);
        Carte Cv10 = new Carte("Cavalier verdoyant","vert","ImagesVie10.jpg",4,2);

        Vie.add(Cv1) ; Vie.add(Cv2) ; Vie.add(Cv3) ; Vie.add(Cv4) ; Vie.add(Cv5);
        Vie.add(Cv6) ; Vie.add(Cv7) ; Vie.add(Cv8) ; Vie.add(Cv9) ; Vie.add(Cv10);

    }
}