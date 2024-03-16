package aula012.aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Animal n  = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves a = new Aves();
        Canguru can = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();
        
        can.locomover();
        ca.locomover();
        can.emitirSom();
        ca.emitirSom();
    }
}
