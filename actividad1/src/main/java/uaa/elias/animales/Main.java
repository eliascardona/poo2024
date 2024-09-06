package uaa.elias.animales;

// Importaciones de las clases de animales
import uaa.elias.animales.animals.terrestre.Armadillo;
import uaa.elias.animales.animals.terrestre.Avestruz;
import uaa.elias.animales.animals.terrestre.Coyote;
import uaa.elias.animales.animals.acuatico.Cocodrilo;
import uaa.elias.animales.animals.acuatico.Delfin;
import uaa.elias.animales.animals.acuatico.Foca;
import uaa.elias.animales.animals.terrestre.Komodo;
import uaa.elias.animales.animals.terrestre.Marmota;
import uaa.elias.animales.animals.anfibio.Ornitorrinco;
import uaa.elias.animales.animals.aereo.Perico;
import uaa.elias.animales.animals.anfibio.Rana;
import uaa.elias.animales.animals.terrestre.Serpiente;

public class Main {    
    public static void main(String[] args) {
        // Armadillo armadillo;
        // Avestruz avestruz;
        // Coyote coyote;
        // Cocodrilo cocodrilo;
        // Delfin delfin;
        // Foca foca;
        // Komodo komodo;
        // Ornitorrinco ornitorrinco;
        // Perico perico;
        // Rana rana;
        // Serpiente serpiente;

        Armadillo armadillo = new Armadillo("arma", 7);
        Avestruz avestruz = new Avestruz("ave", 6);
        Coyote coyote = new Coyote("coyote", 3);
        Cocodrilo cocodrilo = new Cocodrilo("crocs", 6);
        Delfin delfin = new Delfin("delfin", 5);
        Foca foca = new Foca("foca", 8);
        Komodo komodo = new Komodo("komodo", 1);
        Ornitorrinco ornitorrinco = new Ornitorrinco("perry", 9);
        Perico perico = new Perico("perico", 1);
        Rana rana = new Rana("ranita", 4);
        Serpiente serpiente = new Serpiente("mamba", 2);

        System.out.print("cargando... \n\n");

        System.out.print("\n\nejecutado... \n\n");
        armadillo.caminar();
        avestruz.amamantar();
        coyote.caminar();
        cocodrilo.reptar();
        delfin.nadar();
        foca.nadar();
        komodo.reptar();
        ornitorrinco.nadar();
        ornitorrinco.caminar();
        perico.volar();
        rana.nadar();
        serpiente.reptar();

    }
}
