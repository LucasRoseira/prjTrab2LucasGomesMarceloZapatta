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
public abstract class Pessoa {

    // Definição de Váriaveis Pessoa
    private String nome;
    private String endereco;
    private String telefone;

    //Construtor Pessoa tem como parâmetro de entrada o nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Métodos Get Nome, Endereço e Telefone
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    //Métodos Set Endereço e Telefone
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
