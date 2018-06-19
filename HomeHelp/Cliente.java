package HomeHelp;

public class Cliente {
    //atributos
   private boolean confirma;
    private String nome;
    private String cpf;
    private int telefone;
    private String end;
    private String senha;
    private boolean cadastro;
    private Servico pedido;
    
    //metodos especiais
    
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

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }
    //construtor
    public Cliente(String nome) {
        this.nome = nome;
        this.cadastro = true;
    }
    //metodos publicos
   public void solicitarServico(){
        
   } 
   
   
    public void status (){
        System.out.println(getNome());
    }
}
