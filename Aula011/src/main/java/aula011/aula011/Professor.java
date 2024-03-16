package aula011.aula011;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    public void receberAumento(float aum){
        this.salario += aum;
        System.out.println(this.getNome() + " e professor especializado em " + this.getEspecialidade() + 
                " vai receber aumento do salario de para " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        
    }

    public float getSalario() {
        return salario;
        
    }

    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println("O salario e de " + this.salario);
    }
    
}
