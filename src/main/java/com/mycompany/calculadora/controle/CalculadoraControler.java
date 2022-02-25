/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.controle;

import com.mycompany.calculadora.enums7.EnumOperacao;

/**
 *
 * @author João
 */
public class CalculadoraControler {
    public Double total;
    
    public CalculadoraControler(){
        total =0.0;
    }
    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        if(operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        }else if(operacao.equals(EnumOperacao.SUBTRACAO)){
            total -= valor;
        }else if(operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        }else if(operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        }else if(operacao.equals(EnumOperacao.IGUAL)){
            total = valor;
        }else if(operacao.equals(EnumOperacao.PERCENTUAL)){
            total = valor/100;
        }else if(operacao.equals(EnumOperacao.RAIZ)){
            total = Math.sqrt(valor);
        }
        return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    public void zerar(){
        total = 0.0;
    }
}
