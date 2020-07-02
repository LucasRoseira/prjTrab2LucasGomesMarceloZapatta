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
    private final int numQuarto;
    private final double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private String dataSaida;       //Não esta presente no diagrama apenas na GUI
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

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    /* - Método Reservar 
         Tem como parâmetros de entrada o Hospede e o Atendente.
       - Passa a situação do quarto para ocupado (true).
       - Estabelece a associação binária bidirecional entre
          QuartoHotel/Hospede, QuartoHotel/Atendente. 
     ****Utilizar o this para estabelecer
    a ligação entre Hospede/QuartoHotel e Atendente/QuartoHotel.
     */
    public void reservar(Hospede hospede, Atendente atendente) {
        this.situacao = true;
        this.hospede.setQuartoHotel(this);
        atendente.addQuaroHotel(this);
    }

    /* PUBLIC VOID LIBERAR
    Tem como parâmetro de entrada a quantidade de dias que o 
    hóspede ficou hospedado no quarto e a taxa de desconto do hóspede.
    - Passa a situação do quarto para livre (false).
    - Inicializa a data de entrada.
    - Inicializa os apontamentos entre QuartoHotel/Hospede, 
    QuartoHotel/Atendente, Hospede/QuartoHotel, Atendente/QuartoHotel.
    - Calcula o valor da hospedagem aplicando, em seguida, a taxa de
    desconto cujo valor calculado deve ser subtraído do valor da hospedagem.
    - Adiciona o valor da hospedagem no total do faturamento do quarto.
    - Retorna o valor da hospedagem que deverá ser paga pelo hóspede.
     */
    public void liberar(int quantidadeDeDias, double taxaDesconto) {
        this.situacao = false;
        this.dataEntrada = null;
        
    }
}
