import processing.core.PApplet;

public class Ting {


    //Tings position
    float x, y;
    float radius = 10;
    PApplet p;
    Ting(PApplet p, float inputX, float inputY){

        //Opgave 2: Her skal du skrive kode der sÃ¦tter positionen for tingen x og y
        // har sat så x og y værdien som bliver sendt in med konstruktøren bliver til den x og y værdi objektet har.
        // man kan teste det via print(objekt.x + " " + obejkt.y).
    x=inputX;
    y=inputY;
    this.p = p;
    }

    void tegn(){
        //Opgave 3: Her skal du skrive kode der tegner denne "Ting"
        // her tegner den en ellipse med x og y værdie og diameter på radius*2
        // man kan teste det ved at sarte programmet og se om ellipsen er tegnet.
        p.ellipse(x,y,radius*2,radius*2);

    }

    void flyv(){
        //Opgave 4: Her skal du skrive kode der flytter "Ting"
        // her laver den en random ændring på x og y værdierne så ellpsen flytter sig
        // man kan teste den ved at starte programmet og se om elipserne flytter sig frem og tilbage.
        x=x+p.random(-2,2);
        y=y+p.random(-2,2);
    }
    //ps: Husk de mÃ¥ ikke flytte sig uden for skÃ¦rmen...
    void erduforlangtude(){
        //her tjekker jeg om objektet er ude for skermen og hvis den er så rykker jeg den tilbage ind til kanten af skermen
        // man kan teste det ved at starte programmet og se om nogle af boldene forsvinder ud af kanterne
        // eller ved at bruge print(x + " " + y) og se om deres værdier kommer ud fra skærmen
        if(x<0){x=0;}
        if(y<0){y=0;}
        if(y>500){y=500;}
        if(x>500){x=500;}
    }
    // laver en funktion der kigger om musen er over en cirkel.
    boolean ermusender = false;
    void musenerovercirkel(){
        if(p.mouseX > x-10 && p.mouseY > y-10 && p.mouseX < x+10 && p.mouseY < y+10){
            ermusender = true;
        } else {
            ermusender = false;
        }
    }
    // bolean er true hvis cirklerne er inde tæt nok på den anden.
    boolean hit(Ting andent){
        float afstandMin = 20;
        float afstand = p.dist(x,y,andent.x,andent.y);
        if(afstand < afstandMin){
            return true;
        }
        else{
            return false;
        }
    }


}