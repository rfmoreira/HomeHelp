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

    public Autonomo(String nome, String cpf, int telefone, String end, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.end = end;
        this.senha = senha;
        this.cadastro = true;
    }

   
    
    public void alterarTel(int tel){
        this.telefone = tel;
        System.out.println("Alterado com sucesso!");
    }
    
    public void suspenderCadastro(){
        cadastro = false;
        System.out.println("Cadastro desativado");
    }
    public void alterarSenha(String nvSenha){
                this.senha = nvSenha;
                System.out.println("Alterado com sucesso!");
    }
    public void alterarServico(){
        
    }
    public void alterarEnd(String nvEnd){
        this.end = nvEnd;
        System.out.println("Alterado com sucesso!");
    }
    public void perfil(){
        System.out.println("Nome: "+getNome()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEnd()+"\n");
            System.out.println("CADASTRO ATIVO");
            
    }
    public void status (){
        if (cadastro== true){
            String x = getNome();
        System.out.println("Nome: "+getNome()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEnd()+"\n");
            System.out.println("CADASTRO ATIVO");
        }else{
            System.out.println("Nome: "+getNome()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEnd()+"\n");
            System.out.println("CADASTRO INATIVO");
        
        }
        
    }

        
}