/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_strateggy;

/**
 *
 * @author luiiz
 */
public class Projeto_Strateggy {

    public static void main(String[] args) {
        // Criando instâncias das estratégias
        EstrategiaOperacao adicao = new Adicao();
        EstrategiaOperacao subtracao = new Subtracao();
        EstrategiaOperacao multiplicacao = new Multiplicacao();

        // Criando a calculadora com a estratégia de adição
        Calculadora calculadora = new Calculadora(adicao);

        // Realizando operações com a estratégia atual (adição)
        System.out.println("Adição: " + calculadora.realizarOperacao(5, 3));

        // Mudando a estratégia para subtração
        calculadora.setEstrategia(subtracao);
        System.out.println("Subtração: " + calculadora.realizarOperacao(5, 3));

        // Mudando a estratégia para multiplicação
        calculadora.setEstrategia(multiplicacao);
        System.out.println("Multiplicação: " + calculadora.realizarOperacao(5, 3));
    }
}
