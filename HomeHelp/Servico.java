package HomeHelp;

public class Servico {
    //Atributos

    private Cliente Solicitar;
    private boolean confirma;
    private float checkin;
    private float checkout;
    private float horasTrab;
    private boolean trabalhoFeito;
    private int registro;
    private int avaliacao;
    private String comentario;

    //Metodos públicos
    public void confirmarServico() {
        this.Solicitar.solicitarServico();
        this.setConfirma(true);
    }

    public void recusarServico() {
        this.setConfirma(false);
    }

    public void entradaServico(float entrada) {
        if (this.isConfirma() == true) {
            this.checkin = entrada;
        }
    }

    public void finalizacaoServico(float checkOut) {
        if (this.isConfirma() == true) {
            this.checkout = checkOut;
            this.horasTrab = this.checkout - this.checkin;
            this.setRegistro(this.getRegistro() + 1);
            this.setTrabalhoFeito(true);
        }
    }

    public void avaliar(int avaliar) {

        if (this.trabalhoFeito == true) {
            if (avaliar > 5) {
                this.avaliacao = 5;
            } else if (avaliar < 0) {
                this.avaliacao = 1;
            }else 
                this.avaliacao = avaliar;
        }
        System.out.println("Avaliação registrada com sucesso !");
    }

    public void comentar(String comentario) {
        if (this.trabalhoFeito == true) {
            this.comentario = comentario;
        }
    }

    //Metodos Especiais
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

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    public boolean isTrabalhoFeito() {
        return trabalhoFeito;
    }

    public void setTrabalhoFeito(boolean trabalhoFeito) {
        this.trabalhoFeito = trabalhoFeito;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliação) {
        this.avaliacao = avaliação;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    //Construtor
    public Servico() {

        this.registro = 0;

    }
}
