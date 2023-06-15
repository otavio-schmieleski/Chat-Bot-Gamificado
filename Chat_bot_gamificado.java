
package com.mycompany.chat_bot_gamificado;

import java.util.Scanner;

public class Chat_bot_gamificado {

    public static void main(String[] args) {
       Scanner ms = new Scanner(System.in);
        Scanner ms2 = new Scanner(System.in);
        
        String nome;
        String bairro, rua;
        double numeroRua, saldo;
        int ponto = 0, nivel = 0;
        System.out.println(" *** BEM VINDO AO GAME DE EDUCAÇÃO FINANCEIRA ***");
        do{
           System.out.println("Informe o seu nome: "); // INFORMA O NOME COMPLETO
           nome = ms.nextLine(); 
        }while(nome.equals("")); // VEREFICA SE O USUARIO DIGITOU ALGO 
        
        System.out.println("Informe o endereço");
        
        System.out.println("Bairro: "); // INFORMAR O BAIRRO
        bairro = ms.nextLine();
        
        System.out.println("Rua: "); // INFORMAR A RUA
        rua = ms.nextLine();
        
        System.out.println("Número: "); // INFORMAR O NÚMERO DA RESIDENCIA
        numeroRua = ms2.nextDouble();
        
        do{
        System.out.println("Informe seu saldo: "); // INFORMAR O SALDO INICIAL
        saldo = ms2.nextDouble();
        ponto = ponto + 35;
        }while(saldo <= 0);
        
        int menu;
        int retirada;
        int deposito;
        int i = 0;
        
       
        do{
            System.out.println("seus pontos é de: " + ponto + "\nseu nivel é de: " + nivel);
            System.out.println("1 - Consultar saldo, 2 - Fazer retirada, 3 - Realizar depósito, 4 - Extrato, 5 - Consultar endereço, 6 - Alterar endereço, 9 - sair");
            System.out.println("Informe uma operação: "); // INFORMAR O NUMERO DA OPERAÇÃO
            menu = ms2.nextInt();
            
            if((menu >= 1) && (menu <= 9)){ 
                switch(menu){

                    case 1: // CONSULTAR O SALDO
                        System.out.println("Saldo atual: "+saldo);
                        break;

                    case 2: // FAZER A RETIRADA
                        System.out.println("Valor do saque: ");
                        retirada = ms2.nextInt();
                        if(retirada <= saldo){ // VEREFICA SE O VALOR DA RETIRADA É MENOR DO QUE O SALDO
                            System.out.println("Saldo atual: "+(saldo - retirada));
                            i++; // CONTROLA AS QUANTIDADES DE OPERAÇÕES
                            saldo = saldo - retirada;
                            ponto = ponto + 20;
                        }else{
                            System.out.println("Saldo insuficiente");
                            ponto = ponto - 20;
                        }
                        break;

                    case 3: // FAZER DEPOSITO
                        System.out.println("Valor do depósito"); 
                        deposito = ms2.nextInt();
                        if(deposito >= 0){ // VEREFICA SE O VALOR E MAOIR DO QUE 0
                            System.out.println("Saldo atual: "+(saldo+deposito));
                            saldo = saldo + deposito;
                            i++; // CONTROLA AS QUANTIDADES DE OPERAÇÕES
                            ponto = ponto + 30;
                        }else{
                            System.out.println("Operação inválida");
                            ponto = ponto - 20;
                        }
                        break;

                    case 4: // INFORMA AS QUANTIDADES DE OPERAÇÕES REALIZADAS PELO USUARIO
                        System.out.println("Quantidade de operações realizadas (Depósito/Retirada): "+i); 
                        ponto = ponto + 10;
                        break;

                    case 5: // INFORMAR O ENDEREÇO DO USUARIO
                        System.out.println("Consultar endereço: \n" + "Bairro: "+bairro+"\n" + "Rua: "+rua+"\n" + "Número: "+numeroRua);
                        ponto = ponto + 10;
                        break;

                    case 6:// ALTERA O ENDEREÇO DO USUARIO
                        System.out.println("Alterar endereço, digite seu bairro: ");
                        bairro = ms.nextLine();
                        System.out.println("Digite sua rua: ");
                        rua = ms.nextLine();
                        System.out.println("Digite o número: ");
                        numeroRua = ms2.nextDouble();
                        System.out.println("Endereço atualizado: "+bairro+", "+rua+", "+numeroRua);
                        ponto = ponto + 20;
                        break;
                    
                    case 7:
                        System.out.println("Operação Invalida");
                        ponto = ponto - 20;
                        break;
                        
                    case 8:
                        System.out.println("Operação Invalida");
                        ponto = ponto - 20;
                        break;

                    case 9: // SAIR DA OPERAÇÃO
                        System.out.println("fim");
                        break;
                    }
            }// verefica a ´pontuação e o nivel
            if((ponto >= 100)&& (ponto < 200)){
                nivel = 1;
            }else if((ponto >= 200)&&(ponto < 300)){
                nivel = 2;
            }else if((ponto >= 300)&&(ponto < 400)){
                nivel = 3;
            }else if((ponto >= 400)&&(ponto < 500)){
                nivel = 4;
            }else if((ponto >= 500)&&(ponto < 600)){
                nivel = 5;
            }else if((ponto >= 600)&&(ponto < 700)){
                nivel = 6;
            }else if((ponto >= 700)&&(ponto < 800)){
                nivel = 7;
            }else if((ponto >= 800)&&(ponto < 900)){
                nivel = 8;
            }else if((ponto >= 900)&&(ponto < 1000)){
                nivel = 9;
            }else if((ponto >= 1000)&&(ponto < 1100)){
                nivel = 10;
            }
        }while(!(menu == 9)); // VEREFICA SE A RESPOSTA FOR SIM, CONTINUAR A FAZER OUTRAS OPERAÇÕES 
    }
}
