package aula014.projetoyoutube;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAsistido;
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAsistido = 0;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAsistido() {
        return totAsistido;
    }

    public void setTotAsistido(int totAsistido) {
        this.totAsistido = totAsistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAsistido=" + totAsistido + '}';
    }
    
    
}
