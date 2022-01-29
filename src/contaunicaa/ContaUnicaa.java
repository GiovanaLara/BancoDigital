/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaunicaa;

import java.util.Scanner;

/**
 *
 * @author jvcki
 */
public class ContaUnicaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor; 
        
        System.out.println("Digite o titular da conta: ");
        aux = in.nextLine();
        
        Contaa c1 = new Contaa(aux);
        
        do{
        System.out.println("-- MENU --");
        System.out.println("1) Dados bancários");
        System.out.println("1) Depósito");
        System.out.println("3) Saque");
        System.out.println("0) Sair");
        
        System.out.println("Opção: ");
        opcao = in.nextInt();
        
        if(opcao == 1){
            c1.DadosBancarios();
        }
        else if(opcao == 2){
            System.out.println("Digite o valor do depósito: ");
            valor = in.nextDouble();
            
            c1.Depositar(valor);
        }
        else if(opcao == 3){
            System.out.println("Digite o valor do saque: ");
            valor = in.nextDouble();  
            c1.Sacar(valor);
        }
        
        } while(opcao != 0);
    }
    
}
