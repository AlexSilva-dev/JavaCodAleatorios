/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author alex
 */
public class Gerente extends Funcionario{
    private int categoria;
    private String departamento;
    
    // Métodos

    public Gerente(int matricula, String nome, float salario, float deducao, int categoria, String departamento){
        super(matricula, nome, salario, deducao);
        this.categoria = categoria;
        this.departamento = departamento;
    }
    
    @Override
    public float SalarioLiquido(){
        float resul;
        switch (this.categoria)
        {
            case 1:
                resul = super.SalarioLiquido() + (0.1f * super.SalarioLiquido());
                return resul;
            case 2:
                resul = super.SalarioLiquido() + ( 0.2f * super.SalarioLiquido());
                return resul;
            default:
                System.out.println("\nA categoria do funcionario é invalida!\n");
                return 0;
        }
    }
    
    @Override
    public String toString(){
        String status;
        status = "\n\tMatrícula: " + Integer.toString(getMatricula());
        status += "\n\tNome: " + getNome();
        status += "\n\tSalário: " + Float.toString(getSalario());
        status += "\n\tDedução: " + Float.toString(getDeducao());
        status += "\n\tSalário líquido: " + Float.toString(this.SalarioLiquido());
        return status;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}
