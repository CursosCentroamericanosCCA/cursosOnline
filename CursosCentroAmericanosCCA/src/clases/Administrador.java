/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import formularios.FormAdministrador;
/**
 *
 * @author Oscar Barahona
 */
public class Administrador {
    private int idAdmin;
    private String adNombre;
    private String adApellido;
    private String adDireccion;
    private int adEdad;
    private String adTelefono;
    private String adSexo;
    private String adFechaNac;
    private String adCorreo;
    private String adClave;
    private String adPais;
    private String adTipoEmpleado;
    private String usuario;
    private String pass;

    public Administrador() {
    }

    public Administrador(int idAdmin, String adNombre, String adApellido, String adDireccion, int adEdad, String adTelefono, String adSexo, String adFechaNac, String adCorreo, String adClave, String adPais, String adTipoEmpleado, String usuario, String pass) {
        this.idAdmin = idAdmin;
        this.adNombre = adNombre;
        this.adApellido = adApellido;
        this.adDireccion = adDireccion;
        this.adEdad = adEdad;
        this.adTelefono = adTelefono;
        this.adSexo = adSexo;
        this.adFechaNac = adFechaNac;
        this.adCorreo = adCorreo;
        this.adClave = adClave;
        this.adPais = adPais;
        this.adTipoEmpleado = adTipoEmpleado;
        this.usuario = usuario;
        this.pass = pass;
    }
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getAdNombre() {
        return adNombre;
    }

    public void setAdNombre(String adNombre) {
        this.adNombre = adNombre;
    }

    public String getAdApellido() {
        return adApellido;
    }

    public void setAdApellido(String adApellido) {
        this.adApellido = adApellido;
    }

    public String getAdDireccion() {
        return adDireccion;
    }

    public void setAdDireccion(String adDireccion) {
        this.adDireccion = adDireccion;
    }

    public int getAdEdad() {
        return adEdad;
    }

    public void setAdEdad(int adEdad) {
        this.adEdad = adEdad;
    }

    public String getAdTelefono() {
        return adTelefono;
    }

    public void setAdTelefono(String adTelefono) {
        this.adTelefono = adTelefono;
    }

    public String getAdSexo() {
        return adSexo;
    }

    public void setAdSexo(String adSexo) {
        this.adSexo = adSexo;
    }

    public String getAdFechaNac() {
        return adFechaNac;
    }

    public void setAdFechaNac(String adFechaNac) {
        this.adFechaNac = adFechaNac;
    }

    public String getAdCorreo() {
        return adCorreo;
    }

    public void setAdCorreo(String adCorreo) {
        this.adCorreo = adCorreo;
    }

    public String getAdClave() {
        return adClave;
    }

    public void setAdClave(String adClave) {
        this.adClave = adClave;
    }

    public String getAdPais() {
        return adPais;
    }

    public void setAdPais(String adPais) {
        this.adPais = adPais;
    }

    public String getAdTipoEmpleado() {
        return adTipoEmpleado = adTipoEmpleado;
    }

    public void setAdTipoEmpleado(String adTipoEmpleado) {
        this.adTipoEmpleado = adTipoEmpleado;
    }
@Override
    public String toString() {
        return "Administrador{" +
                "idAdmin=" + idAdmin +
                ", adNombre=" + adNombre +
                ", adApellido=" + adApellido +
                ", adDireccion=" + adDireccion +
                ", adEdad=" + adEdad +
                ", adTelefono=" + adTelefono +
                ", adSexo=" + adSexo +
                ", adFechaNac=" + adFechaNac +
                ", adCorreo=" + adCorreo +
                ", adClave=" + adClave +
                ", adPais=" + adPais;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
 
    
}