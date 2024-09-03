package uaa.elias.animales;
//  a
import uaa.elias.animales.animals.terrestre.Armadillo;
import uaa.elias.animales.animals.terrestre.Avestruz;
//  b
import uaa.elias.animales.animals.terrestre.Coyote;
import uaa.elias.animales.animals.acuatico.Cocodrilo;
//  d
import uaa.elias.animales.animals.acuatico.Delfin;
//  f
import uaa.elias.animales.animals.acuatico.Foca;
//  k
import uaa.elias.animales.animals.terrestre.Komodo;
//  m
import uaa.elias.animales.animals.terrestre.Marmota;
//  letras finales
import uaa.elias.animales.animals.anfibio.Ornitorrinco;
import uaa.elias.animales.animals.aereo.Perico;
import uaa.elias.animales.animals.anfibio.Rana;
import uaa.elias.animales.animals.terrestre.Serpiente;


public class InstanceHandler {
    public InstanceHandler() {}

    public static void instanciandoAnimales() {
        Armadillo armadillo = new Armadillo("arma", 1);
        armadillo.caminar();

        Avestruz avestruz = new Avestruz("ave", 1);
        avestruz.caminar();

        Coyote coyote = new Coyote("coyote", 1);
        coyote.caminar();

        Cocodrilo cocodrilo = new Cocodrilo("crocs", 1);
        cocodrilo.reptar();

        Delfin delfin = new Delfin("delfin feliz", 1);
        delfin.nadar();

        Foca foca = new Foca("foca", 1);
        foca.nadar();

        Komodo komodo = new Komodo("komodo", 1);
        komodo.reptar();

        Ornitorrinco ornitorrinco = new Ornitorrinco("perry", 1);
        ornitorrinco.nadar();

        Perico perico = new Perico("perico", 1);
        perico.volar();

        Rana rana = new Rana("ranita", 1);
        rana.nadar();

        Serpiente serpiente = new Serpiente("mamba negra", 1);
        serpiente.reptar();
    }
}
