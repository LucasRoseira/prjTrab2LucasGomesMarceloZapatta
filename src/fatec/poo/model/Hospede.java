/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author lucas_000
 */
public class Hospede extends Pessoa {

    // Definição de Váriaveis Hóspede
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;

    //Método Construtor Hospede tem como parâmetro de entrada o nome
    public Hospede(String nome) {
        super(nome);
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

    //Método Set Quarto Hotel
    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

}
