/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author lucas_000
 */
public class Atendente extends Pessoa {

    // Definição de Váriaveis Atendente
    private String regFunc;
    private String turno;
    private ArrayList<QuartoHotel> quartoHotel;

    /*Método construtor Atendente 
    tem como parâmetro de entrada o registro funcional e o nome */
    public Atendente(String nome) {
        super(nome);
    }
    
    //Método get RegFunc e Turno
    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }

    //Método Set Turno
    public void setTurno(String turno) {
        this.turno = turno;
    }

}
