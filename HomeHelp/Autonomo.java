/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeHelp;

/**
 *
 * @author rafael
 */
public class Autonomo {
    private String nome;
    private String cpf;
    private int telefone;
    private String end;
    private String senha;
    private boolean cadastro;

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Autonomo(String nome, String cpf, int telefone, String end, String senha, boolean cadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.end = end;
        
        this.senha = senha;
        this.cadastro = cadastro = true;
    }
    
    public void alterarTel(){
        
    }
    
    public void suspenderCadastro(){
        
    }
    public void alterarSenha(){
        
    }
    public void alterarServico(){
        
    }
    public void alterarEnd(){
        
    }
    public void status (){
        System.out.println(getNome());
    }

        
}
