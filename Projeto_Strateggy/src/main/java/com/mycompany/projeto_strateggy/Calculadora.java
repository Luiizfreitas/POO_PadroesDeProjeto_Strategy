/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_strateggy;

/**
 *
 * @author luiiz
 */
public class Calculadora {
    
        // Classe Contexto que utiliza uma estratégia

    private EstrategiaOperacao estrategia;

    Calculadora(EstrategiaOperacao estrategia) {
        this.estrategia = estrategia;
    }

    void setEstrategia(EstrategiaOperacao estrategia) {
        this.estrategia = estrategia;
    }

    int realizarOperacao(int num1, int num2) {
        return estrategia.executarOperacao(num1, num2);
    }
}
