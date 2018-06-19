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
    
    private int dia;
    private String mes;
    private double hora;
    private boolean status;
    private boolean acessoCliente;
    private boolean acessoAutonomo;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
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
    
    public void marcarDia(int dia){
        if (dia<=31){
            this.dia = dia;
        }
    }
    public void desmarcarDia(){
        this.dia = 0;
        
    }
    public void marcarHora(double hora){
        this.hora = hora;
        System.out.println("Desmarcado com sucesso");              
    }
    public void desmarcarHora(){
        
    }
    public void exibeAgenda(){
        
    }

    public Agenda(int dia, String mes, boolean status, boolean acessoCliente, boolean acessoAutonomo) {
        this.dia = dia;
        this.mes = mes;
        this.status = status;
        this.acessoCliente = acessoCliente;
        this.acessoAutonomo = acessoAutonomo;
    }
    
    
}
