/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeHelp;

/**
 *
 * @author rafael
 */
public class Servico {
    private boolean confirma = false;
    private float checkin;
    private float checkout;
    private String registro;
    private int avaliação;
    private String comentario;

    public void confirmarServico(){
        
    }
    public void recusarServico(){
        
    }
    public void etradaServico(){
        
    }
    public void finalizacaoServico(){
        
    }
    public void avaliar(){
        
    }
    public void comentar(){
        
    }
    
    
    
    public boolean isConfirma() {
        return confirma;
    }

    public void setConfirma(boolean confirma) {
        this.confirma = confirma;
    }

    public float getCheckin() {
        return checkin;
    }

    public void setCheckin(float checkin) {
        this.checkin = checkin;
    }

    public float getCheckout() {
        return checkout;
    }

    public void setCheckout(float checkout) {
        this.checkout = checkout;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(int avaliação) {
        this.avaliação = avaliação;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Servico(float checkin, float checkout, String registro, int avaliação, String comentario) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.registro = registro;
        this.avaliação = avaliação;
        this.comentario = comentario;
    }
    
    
}
