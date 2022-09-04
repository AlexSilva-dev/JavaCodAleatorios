/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 *
 * @author alex
 */
public class ClientesDTO {
    
    // Atributos
    private int idClient;
    private String nome;
    private int cpf;
    private int numCell;
    
    // Métodos especiais

    public ClientesDTO(String nome, int cpf, int numCell) {
        this.nome = nome;
        this.cpf = cpf;
        this.numCell = numCell;
    }
    

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumCell() {
        return numCell;
    }

    public void setNumCell(int numCell) {
        this.numCell = numCell;
    }
      
}
