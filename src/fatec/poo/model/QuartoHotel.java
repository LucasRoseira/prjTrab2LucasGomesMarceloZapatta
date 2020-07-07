/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Lucas Roseira && Marcelo Zapatta
 */
public class QuartoHotel {

    // Definição de Váriaveis Quarto Hotel 
    private final int numQuarto;
    private final double valorDiaria;
    private boolean situacao;
    private String dataEntrada;

    // Não esta presente no diagrama apenas na GUI
    private String dataSaida;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    // Método construtor Quarto Hotel
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

    public boolean getSituacao() {
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

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    /* Método Reservar
     * @params Hospede hospede, Atendente atendente
     * Define a situação do quarto para ocupado(true)
     * Associação binária bidirecional entre Hospede <-> QuartoHotel
     * Associação binária bidirecional entre Atendente <-> QuartoHotel
     */
    public void reservar(Hospede hospede, Atendente atendente) {
        this.situacao = true;

        hospede.setQuartoHotel(this);
        atendente.addQuartoHotel(this);

        this.setAtendente(atendente);
        this.setHospede(hospede);
    }

    /* Método Liberar
     * @params int quantidadeDeDias, double taxaDesconto
     * Tem como parâmetro de entrada a quantidade de dias que o 
     * hóspede ficou hospedado no quarto e a taxa de desconto do hóspede.
     * Define a situação do quarto como livre (false)
     * Inicializa data de entrada
     * Realiza as associações
     * Calcula o valor da hospedagem aplicando o desconto
     * Adiciona o valor da hospedagem no total de faturamento do quarto
     * @return double valorHospedagem
     */
    public double liberar(int quantidadeDeDias, double taxaDesconto) {
        this.situacao = false;
        this.dataEntrada = null;
        // TODO liberar
        hospede.setQuartoHotel(null);
        atendente.addQuartoHotel(null);

        this.setAtendente(null);
        this.setHospede(null);
        totalFaturado = ((quantidadeDeDias * valorDiaria * (taxaDesconto) / 100));
        return totalFaturado;
    }
}
