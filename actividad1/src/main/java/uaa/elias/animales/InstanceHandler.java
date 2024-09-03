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
    
    Armadillo armadillo = new Armadillo("arma", 1);
    Avestruz avestruz = new Avestruz("ave", 1);
    Coyote coyote = new Coyote("coyote", 1);
    Cocodrilo cocodrilo = new Cocodrilo("crocs", 1);
    Delfin delfin = new Delfin("delfin feliz", 1);
    Foca foca = new Foca("foca", 1);
    Komodo komodo = new Komodo("komodo", 1);
    Ornitorrinco ornitorrinco = new Ornitorrinco("perry", 1);
    Perico perico = new Perico("perico", 1);
    Rana rana = new Rana("ranita", 1);
    Serpiente serpiente = new Serpiente("mamba negra", 1);

    public static void instanciandoAnimales() {
        armadillo.caminar();
        avestruz.amamantar();
        coyote.caminar();
        cocodrilo.reptar();
        delfin.nadar();
        foca.nadar();
        komodo.reptar();
        ornitorrinco.nadar();
        perico.volar();
        rana.nadar();
        serpiente.reptar();
    }

}
