package HomeHelp;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luan Amor
 */

public class Operacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Array
        String dados[] = new String[5]; // Entradas de String
        int dadosN[] = new int[5]; //Entradas Inteiros
        float dadosF[] = new float[5];
        //Objetos
        
        Servico serv = new Servico();
        Autonomo autonomo[] = new Autonomo[10];
        Cliente cliente[] = new Cliente[2];
        Categoria categoria[] = new Categoria[5];
        //Fim Objetos

        //Tela Login
        System.out.println("============ Bem Vindo ao HomeHelp ============ ");
        System.out.println("| Informe a operação que você deseja realizar |");
        System.out.print("| 1 - Cadastrar Usuário                       |\n"
                + "| 2 - Login                                   |\n"
                + "| 3 - Desativar cadastro                      |\n"
                + "| 4 - Sair da operação                        |\n");
        System.out.println("===============================================");
        //Fim menu login

        // Entradas do usuário 
        int menu = input.nextInt(); //Entrar no menu
        while (menu != 4) {
            switch (menu) {
                case 1: // cadastrar
                    System.out.println("Informe o seu nome:");
                    dados[1] = input.next();
                    System.out.println("Informe o seu CPF:");
                    dados[2] = input.next();
                    System.out.println("informe o seu telefone:");
                    dadosN[1] = input.nextInt();
                    System.out.println("Informe o seu endereço:");
                    dados[3] = input.next();
                    System.out.println("Defina uma senha:");
                    dados[4] = input.next();
                    autonomo[1] = new Autonomo(dados[1], dados[2], dadosN[1], dados[3], dados[4]);
                    break;
                case 2: //Login
                    System.out.println("Informe o CPF:");
                    dados[1] = input.next();
                    System.out.println("informe sua senha:");
                    dados[2] = input.next();
                    //após o login
                    if (dados[1].equals(autonomo[1].getCpf()) && dados[2].equals(autonomo[1].getSenha()) && autonomo[1].isCadastro() == true) {
                        System.out.println("Bem vindo " + autonomo[1].getNome() + " qual opção você deseja acessar?");
                        System.out.println("1 - Cadastrar Serviço");
                        System.out.println("2 - Serviço Solicitado");
                        System.out.println("3 - Agenda");
                        System.out.println("4 - Perfil");
                        int menuPrincipal = input.nextInt();
                        switch (menuPrincipal) {
                          
                        case 1: //cadastrar Categotia
                                System.out.println("Você ainda não possui serviço cadastrado");
                                System.out.println("Vamos realizar esse cadastro: ");
                                System.out.println("Informe a categoria do serviço(Doméstico, elétrico, hidráulico, civil)");
                                dados[1] = input.next();
                                System.out.println("Informe o tipo de servico: ");
                                dados[2] = input.next();
                                System.out.println("Informe o valor que será cobrado: ");
                                dadosF[1] = input.nextFloat();
                                System.out.println("Informe a descrição do serviço");
                                dados[3] = input.next();
                                categoria[1] = new Categoria(dados[1],dados[2],dadosF[1],dados[3]);
                                break;
                            
                        case 2: //Serviço
                            //Receber serviço
                            cliente[1] = new Cliente("Antonio José");
                            
                            System.out.println("Serviço solicitado "+ serv.getRegistro() );
                            if (serv.getRegistro() > 0){
                                System.out.print("[1] Confirmar \n[2] Recusar\n");
                                dadosN[1] = input.nextInt();
                                switch (dadosN[1]){
                                    case 1: //aceitar
                                        serv.confirmarServico();
                                        System.out.println("Pedido aceito! Seu cliente é "+ cliente[1].getNome());
                                        break;
                                    case 2: //recusar
                                        serv.recusarServico();
                                }
                            }
                            System.out.print("[1] Realizar check In/Check out\n[2] Realizar avaliação da recepção\n");
                            menu = input.nextInt();
                            switch(menu){
                                case 1:
                                    System.out.println("[1] Realizar Check in \n[2] Check Out");
                                    dadosN[1] = input.nextInt();
                                    switch (dadosN[1]){
                                        case 1://Check in
                                            System.out.println("Informe a hora do Check In");
                                            dadosF[1] = input.nextFloat();
                                            serv.entradaServico(dadosF[1]);
                                            break;
                                        case 2: //check out
                                            System.out.println("Informe a hora do check Out");
                                            dadosF[2] = input.nextFloat();
                                            serv.finalizacaoServico(dadosF[2]);
                                            break;
                                    }
                                    break;
                                    
                                case 2:// avaliação sua nota de
                                    System.out.println("Dé uma nota de 0 a 5 para a recepção do cliente: ");
                                    dadosN[1]= input.nextInt();
                                    
                                    serv.avaliar(dadosN[1]);
                                  
                                    break;
                            }
                            
                            
                            
                        case 3: //Agenda
                            System.out.println("Em construção ^.^\nVolta depois! Não tem ninguem e casa !");
                                break;

                            case 4: //Perfil
                                autonomo[1].perfil();

                                System.out.println("Digite a opção desejada: "
                                        + "\n1-Alterar Telefone"
                                        + "\n2-Alterar Senha"
                                        + "\n3-Alterar Endereço"
                                        + "\n4-Valtar ao menu principal");
                                menu = input.nextInt();
                                while (menu != 4) {
                                    switch (menu) {
                                        case 1: //Alterar telefone
                                            System.out.println("Digite o numero de Telefone: ");
                                            dadosN[1] = input.nextInt();
                                            autonomo[1].alterarTel(dadosN[1]);
                                            break;

                                        case 2://Alterar senha
                                            System.out.println("Digite sua senha antiga: ");
                                            dados[1] = input.next();
                                            if (dados[1].equals(autonomo[1].getSenha())) {
                                                System.out.println("Digite nova senha:");
                                                dados[1] = input.next();
                                                System.out.println("Digite novamente a senha: ");
                                                dados[2] = input.next();
                                                if (dados[1].equals(dados[2])) {
                                                    autonomo[1].alterarSenha(dados[1]);
                                                } else {
                                                    System.out.println("Senhas diferentes!");
                                                }
                                            } else {
                                                System.out.println("Senha invalida!");
                                            }

                                            break;
                                        case 3://Alterar endereço
                                            System.out.println("Digite endereço novo: ");
                                            dados[1] = input.next();
                                            autonomo[1].alterarEnd(dados[1]);
                                            break;
                                    }
                                    System.out.println("Digite a opção desejada: "
                                            + "\n1-Alterar Telefone"
                                            + "\n2-Alterar Senha"
                                            + "\n3-Alterar Endereço"
                                            + "\n4-Valtar ao menu principal");
                                    menu = input.nextInt();
                                }
                        }
                    } else {
                        System.out.println("CPF ou senha inválidos");
                    }
                    break;
                case 3: //Desativar menu
                    System.out.println("Informe o CPF:");
                    dados[1] = input.next();
                    System.out.println("informe sua senha:");
                    dados[2] = input.next();
                    //após o login
                    if (dados[1].equals(autonomo[1].getCpf()) && dados[2].equals(autonomo[1].getSenha()) && autonomo[1].isCadastro() == true) {
                        autonomo[1].suspenderCadastro();
                    }else{
                        System.out.println("CPF ou senha inválidos");
                    }
                    break;

                default: //Diferente de 1 ate 4
                    System.out.println("Opção inválida");
            }
            System.out.println("============ Bem Vindo ao HomeHelp ============ ");
            System.out.println("| Informe a operação que você deseja realizar |");
            System.out.print("| 1 - Cadastrar Usuário                       |\n"
                    + "| 2 - Login                                   |\n"
                    + "| 3 - Desativar cadastro                      |\n"
                    + "| 4 - Sair da operação                        |\n");
            System.out.println("===============================================");
            menu = input.nextInt();
        }
    }
}
