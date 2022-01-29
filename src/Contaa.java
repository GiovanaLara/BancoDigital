/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvcki
 */
public class Contaa {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdcontas = 0; //toda a instancia compartilha o valor desse atributo
    
    public Contaa(String pTitular){
        this.titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;
    }
    
    public void DadosBancarios(){
        System.out.println("-- Dados Bancários --"+ this.numero);
        System.out.println("- Número: "+ this.numero);
        System.out.println("- Titular: "+ this.titular);
        System.out.println("- Saldo: "+ this.saldo);
        System.out.println("-- Fim Dados Bancarios --");
        System.out.println("");
    }
    
    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("-- Realizando Depósito --");
        System.out.println("- Saldo Anterior: "+ this.saldo);

        this.saldo += pValor; //this.saldo = this.saldo + pValor
        
        System.out.println("- Saldo Poterior:"+ this.saldo);
        System.out.println("-- Fim do Depósito --");
        System.out.println("");
    }
    
    public void Sacar(double pValor){
        System.out.println("");
        System.out.println("-- Realizando Saque --");
        System.out.println("- Saldo Anterior: "+ this.saldo);

        if(pValor < this.saldo){ //caso tenha saldo
            this.saldo -= pValor;
        System.out.println("- Saldo Posterior: "+ this.saldo);
        }        
        else{//caso n tenha saldo
            System.out.println("-- Saldo Insuficiente --");
        }
    }
}
