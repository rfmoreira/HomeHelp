/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeHelp;

/**
 *
 * @author rafael
 */
public class Agenda {
    
    private String dia;
    private String mes;
    private double hora;
    private boolean status;
    private boolean acessoCliente;
    private boolean acessoAutonomo;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAcessoCliente() {
        return acessoCliente;
    }

    public void setAcessoCliente(boolean acessoCliente) {
        this.acessoCliente = acessoCliente;
    }

    public boolean isAcessoAutonomo() {
        return acessoAutonomo;
    }

    public void setAcessoAutonomo(boolean acessoAutonomo) {
        this.acessoAutonomo = acessoAutonomo;
    }
    
    public void marcarDia(){
        
    }
    public void desmarcarDia(){
        
    }
    public void marcarHora(){
        
    }
    public void desmarcarHora(){
        
    }
    public void exibeAgenda(){
        
    }

    public Agenda(String dia, String mes, boolean status, boolean acessoCliente, boolean acessoAutonomo) {
        this.dia = dia;
        this.mes = mes;
        this.status = status;
        this.acessoCliente = acessoCliente;
        this.acessoAutonomo = acessoAutonomo;
    }
    
    
}
