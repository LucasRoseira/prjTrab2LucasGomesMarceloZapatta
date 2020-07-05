/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Roseira && Marcelo Zapatta
 */
public class Atendente extends Pessoa {

    // Definição de Váriaveis Atendente
    private String regFunc;
    private String turno;
    private ArrayList<QuartoHotel> quartoHotel;

    /*Método construtor Atendente 
    tem como parâmetro de entrada o registro funcional e o nome */
    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        this.quartoHotel = new ArrayList<QuartoHotel>();
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

    //Public void addQuartoHotel
    public void addQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel.add(quartoHotel);
    }
}
