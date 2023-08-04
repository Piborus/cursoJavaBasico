package com.loiane.cursojava.aula56;

import java.util.Arrays;
import com.loiane.cursojava.aula56.TipoDocumento;

public class TesteDocumento {
    public static void main(String[] args) {

       /* for (TipoDocumento doc: TipoDocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());

        }

        TipoDocumento[] doc1 = TipoDocumento.values();
        for (int i = 0; i < doc1.length; i++){
            System.out.println(Arrays.toString(doc1) + " - " + doc1[i].geraNumeroTeste());
        }*/

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);





    }

}
