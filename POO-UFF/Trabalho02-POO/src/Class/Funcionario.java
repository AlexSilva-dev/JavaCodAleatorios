/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author alex
 */
public class Funcionario {
    // Atributos
    private int matricula;
    private String nome;
    private float salario;
    private float deducao;
    
    // Métodos

    public Funcionario(int matricula, String nome, float salario, float deducao) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.deducao = deducao;
    }
    
    
    public float SalarioLiquido(){
        return salario - deducao;
    }
    
    public String toString(){
        String status;
        status = "\n\tMatrícula: " + Integer.toString(matricula);
        status += "\n\tNome: " + nome;
        status += "\n\tSalário: " + Float.toString(salario);
        status += "\n\tDedução: " + Float.toString(deducao);
        status += "\n\tSalário líquido: " + Float.toString(SalarioLiquido());
        return status;
    }
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getDeducao() {
        return deducao;
    }

    public void setDeducao(float deducao) {
        this.deducao = deducao;
    }
    
    
    
}
