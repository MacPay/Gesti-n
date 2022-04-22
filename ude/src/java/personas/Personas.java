package personas;

import java.awt.Image;
import java.sql.Date;


public class Personas {
    private int ci;
    private String nombre, apellido, primApe, segApe, mailPpal, mailSec;
    private Date fechaNac, fechaReg;
    private Image foto;
    private char sexo;
    private String telefono;
    private int auto_increment;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
//    public Personas(int ci, String primNom,String segNom, String primApe,String segApe,String mailPpal,String mailSec, Date fechaNac,Date fechaReg, Image foto, char sexo, String telefono, int auto_increment, String estado){
//        this.ci = ci;
//        this.primNom = primNom;
//        this.segNom = segNom;
//        this.primApe = primApe;
//        this.segApe = segApe;
//        this.fechaNac = fechaNac;
//        this.mailPpal = mailPpal;
//        this.mailSec = mailSec;
//        this.sexo = sexo;
//        this.telefono = telefono;
//        this.fechaReg = fechaReg;
//        this.foto = foto;
//        this.auto_increment = auto_increment;
//        this.estado = estado;
//    }

    public Personas(int ci, String nombre, String apellido) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public int getAuto_increment() {
        return auto_increment;
    }

    public void setAuto_increment(int auto_increment) {
        this.auto_increment = auto_increment;
    }
    

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

//    public void setPrimNom(String primNom) {
//        this.primNom = primNom;
//    }
//
//    public void setSegNom(String segNom) {
//        this.segNom = segNom;
//    }

    public void setPrimApe(String primApe) {
        this.primApe = primApe;
    }

    public void setSegApe(String segApe) {
        this.segApe = segApe;
    }

    public void setMailPpal(String mailPpal) {
        this.mailPpal = mailPpal;
    }

    public void setMailSec(String mailSec) {
        this.mailSec = mailSec;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCi() {
        return ci;
    }

//    public String getPrimNom() {
//        return primNom;
//    }
//
//    public String getSegNom() {
//        return segNom;
//    }

    public String getPrimApe() {
        return primApe;
    }

    public String getSegApe() {
        return segApe;
    }

    public String getMailPpal() {
        return mailPpal;
    }

    public String getMailSec() {
        return mailSec;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public Image getFoto() {
        return foto;
    }

    public char getSexo() {
        return sexo;
    }
       
    
}
