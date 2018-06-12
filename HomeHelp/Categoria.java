/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeHelp;

/**
 *
 * @author rafael
 */
public class Categoria {
    private String tipo;
    private String Serviço;
    private double valor;
    private float horario;
    private int data;
    private boolean satus;
    private String descricao;

    public Categoria(String tipo, String Serviço, double valor, float horario, int data, boolean status,String descricao) {
        this.tipo = tipo;
        this.Serviço = Serviço;
        this.valor = valor;
        this.horario = horario;
        this.data = data;
        this.satus = status = true;
        this.descricao = descricao;
    }
    
    public void registrarServico(){
        
    }
    public void alterarDescrição(){
        
    }
    public void alterarHorario(){
        
    }
    public void excluirServico(){
        
    }
    public void atualizarTipo(){
        
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getServiço() {
        return Serviço;
    }

    public void setServiço(String Serviço) {
        this.Serviço = Serviço;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
