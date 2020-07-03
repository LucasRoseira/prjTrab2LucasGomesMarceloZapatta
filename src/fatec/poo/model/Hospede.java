/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author lucas && zapatta
 */
public class Hospede extends Pessoa {

    // Definição de Váriaveis Hóspede
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;
    private ArrayList<Hospede> hospede;

    //Método Construtor Hospede tem como parâmetro de entrada o CPF e nome
    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;

    }

    //Método get CPF, TxDesconto e Quarto Hotel
    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }

    //Método Set Quarto Hotel e Tx Desconto
    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public void addHospede(Hospede hos) {
        hospede.add(hos);
    }
}
