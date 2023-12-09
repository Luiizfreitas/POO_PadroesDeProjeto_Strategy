/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_strateggy;

/**
 *
 * @author luiiz
 */
public class Subtracao implements EstrategiaOperacao{
    @Override
    public int executarOperacao(int num1, int num2) {
        return num1 - num2;
    }
}
