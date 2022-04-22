
package personas;

import java.awt.Image;
import java.sql.Date;

public class Interesados {
    //atributos interesados
    private boolean inscripto;
    //atributos heredados de entiendad persona, mailprincipal primarykey
    private int ci;
    private String primNom, segNom, primApe, segApe, mailPpal, mailSec;
    private Date fechaNac, fechaReg;
    private Image foto;
    private char sexo;
    private String telefono;
}
