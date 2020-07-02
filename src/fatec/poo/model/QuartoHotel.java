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
public class QuartoHotel {

    // Definição de Váriaveis Quarto Hotel
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    //Método construtor Quarto Hotel
    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }

    /*
        Métodos Get NumQuarto, Valor Diaria, Situacao
        Data entrada, Total Faturado, Atendente, Hospede
     */
    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    //Método Set Data Entrada
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    //Método Reservar Tem como parâmetros de entrada o Hospede e o Atendente.
    public void reservar(Hospede hospede,Atendente atendente){
        
    }
}
