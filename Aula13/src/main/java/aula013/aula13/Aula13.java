package aula013.aula13;
public class Aula13 {
    public static void main(String[] args) {
        //Programa Principal
        Cachorro x = new Cachorro();
        x.emitirSom();
        x.reagir("Ola");
        x.reagir(13, 8);
        x.reagir(false);
        x.reagir(5, 5f);
    }
}
