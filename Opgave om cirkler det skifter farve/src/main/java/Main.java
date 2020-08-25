import processing.core.PApplet;

public class Main extends PApplet{
    //....Denne variabel kan bruges til at
    static PApplet p;
    int i =0;
    int j;
    //Denne liste SKAL indholde alle de "Ting", der er pÃ¥ skÃ¦rmen!

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);
        //...Alle processing kommandoer er nu inde i p....
        p = this;
    }
    //Opgave 1 : Her skal du oprette listen "listeTing" med plads til 20 ting
    // gør det der står i opgaven :)
    // man kan teste det via print(listeTing) og hvis der står 20 gange "null" virker det.
    Ting[] listeTing = new Ting[20];

    @Override
    public void setup() {
        super.setup();

        //Opgave 5 : Her skal du skrive kode der laver alle "Ting"
        // her bruger jeg et while loop til at lave et nyt objekt i hver position af det array jeg lavede tidligere.
        // for at teste kan man bruge den samme funktion som før print(listeTing) og hvis der kommer 20 objekter ud i stedet for nulls virker det.

        while(i<20){
            listeTing[i] =new Ting(this,random(1,499),random(1,499));
            i++;
        }
        i=0;
    }
    @Override
    public void draw() {
        clear();
        background(0);
            for(Ting t1: listeTing){
                //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
                //ps: Du SKAL kalde "tegn metoden" pÃ¥ ALLE "Ting"
                //Opgave 7 : Her skal du skrive kode, der fÃ¥r alle "Ting" til at flytte sig
                //ps: DU SKAL kalde "
                //her kalder jeg tegn, flyt, erduforlangtude og musenerovercirkel funktioner for at gøre alt der får ellipsen til at komme frem
                //man kan teste det hved at starte programmet og se om ting gør det de skal.
                t1.flyv();
                t1.erduforlangtude();
                fill(255);
                t1.tegn();
                t1.musenerovercirkel();
                //EKSPERT 2:
                //Hvis to ting rÃ¸rer hinanden skal de blive blÃ¥!
                // her laver jeg et for loop der laver en Ting variable som vil blive set som et andet objekt og så køre den hit boolean
                // som tjekker om det ene objekt rammer det andet og hvis det gør så skifter den farve og tegner objektet.
            for(Ting t2 : listeTing){
                if(t1.hit(t2) && t1 != t2){
                    fill(0,0,255);
                    t1.tegn();
                    fill(255);
                }
            }
                //OPGAVE 8 (SVÃ†R) : Her skal du skrive kode der Ã¦ndrer farven til rÃ¸d din "Ting"  rÃ¸rer ved musen...
                // her er der en boolean som hvis er true laver den cirklen rød og tegner den.
            if(t1.ermusender == true){
                fill(255,0,0);
                t1.tegn();
            }

           // println( listeTing[i].ermusender);

        }

    }

    }














