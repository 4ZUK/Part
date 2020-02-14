public class Main {
    public static void main(String[] args) {
        Cachorro doido = new Cachorro();
        Cachorro toto = new Cachorro();
        toto.correr();
        doido.comer();

        toto.cor = "azul";
        System.out.println(toto.cor);
        doido.tamanho = "Grande";
        System.out.println(doido.tamanho);
        doido.raca = "vira lata";
        System.out.println(doido.raca);



    }
}
