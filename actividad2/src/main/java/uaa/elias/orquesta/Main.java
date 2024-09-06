package uaa.elias.orquesta;

// cuerda
import uaa.elias.orquesta.instruments.cuerda.Arpa;
import uaa.elias.orquesta.instruments.cuerda.CuerdaFlotada;
import uaa.elias.orquesta.instruments.cuerda.Guitarra;
import uaa.elias.orquesta.instruments.cuerda.Violin;
import uaa.elias.orquesta.instruments.cuerda.Violonchelo;
// percusion
import uaa.elias.orquesta.instruments.percusion.Bateria;
import uaa.elias.orquesta.instruments.percusion.Maracas;
import uaa.elias.orquesta.instruments.percusion.Marimba;
import uaa.elias.orquesta.instruments.percusion.Tambor;
import uaa.elias.orquesta.instruments.percusion.Timbales;
// viento
import uaa.elias.orquesta.instruments.viento.Clarin;
import uaa.elias.orquesta.instruments.viento.Fagote;
import uaa.elias.orquesta.instruments.viento.Flauta;
import uaa.elias.orquesta.instruments.viento.Oboe;
import uaa.elias.orquesta.instruments.viento.Organo;
import uaa.elias.orquesta.instruments.viento.Piccolo;
import uaa.elias.orquesta.instruments.viento.Saxofon;
import uaa.elias.orquesta.instruments.viento.Trombon;
import uaa.elias.orquesta.instruments.viento.Trompas;
import uaa.elias.orquesta.instruments.viento.Tuba;


public class Main {
    public static void main(String args[]) {
        System.out.print("\nejecutado programa...\n\n");

        // cuerda
        Arpa arpa = new Arpa("arpa", 2);
        CuerdaFlotada flotada = new CuerdaFlotada("flotada", 3);
        Guitarra guitarra = new Guitarra("guitarrin", 12);
        Violin violin = new Violin("violincito", 13);
        Violonchelo violonchelo = new Violonchelo("tololoche", 3);
        // percusion
        Bateria bateria = new Bateria("nirvana", 3);
        Maracas maracas = new Maracas("maracas", 5);
        Marimba marimba = new Marimba("marimba", 5);
        Tambor tambor = new Tambor("tambor", 12);
        Timbales timbales = new Timbales("timbales", 8);
        // viento
        Clarin clarin = new Clarin("clarin", 12);
        Fagote fagote = new Fagote("fagote", 11);
        Oboe oboe = new Oboe("oboe", 1);
        Organo organo = new Organo("organo", 5);
        Piccolo piccolo = new Piccolo("piccolo", 4);
        Saxofon saxofon = new Saxofon("saxofon", 3);
        Trombon trombon = new Trombon("trombon", 2);
        Trompas trompas = new Trompas("trompas", 1);
        Tuba tuba = new Tuba("tuba", 10);

        // invocando metodos de cuerda
        arpa.tocar();
        flotada.tocar();
        guitarrin.tocar();
        violin.tocar();
        violonchelo.tocar();

        // invocando metodos de percusion
        bateria.percudir();
        maracas.percudir();
        marimba.percudir();
        tambor.percudir();
        timbales.percudir();

        // invocando metodos de viento
        clarin.soplar();
        fagote.soplar();
        oboe.soplar();
        organo.soplar();
        piccolo.soplar();
        saxofon.soplar();
        trombon.soplar();
        trompas.soplar();
        tuba.soplar();


    }
}
