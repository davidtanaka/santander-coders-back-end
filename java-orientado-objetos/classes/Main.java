import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Rex", "Preto", 10, 4.5, 1);

        Gato gato1 = new Gato("Felix", "Preto", 4.5);

        Passaro passaro1 = new Passaro("Frajola", "Azul", 1);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(passaro1);
        System.out.println(passaro1.getEstadoDeEspirito());
    }
}



// public class Main{
//      public static void main(String[] args) {
//          Cachorro cachorro1 = new Cachorro();
//          Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);

//         //  cachorro1.setNome("Puppy");
//         //  cachorro1.setCor("Marron");
//         //  cachorro1.setAltura(25);
//         //  cachorro1.setPeso(5.5);
//         //  cachorro1.setTamanhoDoRabo(5);

//         // // Ações do cachorro
//         //  cachorro1.soar();
//         //  System.out.println("O cachorro pegou uma " + cachorro1.pegar());

//          System.out.println(cachorro2.getNome());
//          System.out.println(cachorro2.getPeso());
//          System.out.println("O cachorro está " + cachorro1.interagir(("Carinho")));
//          System.out.println("O cachorro está " + cachorro1.interagir(("Vai dormir!")));
//          System.out.println("O cachorro está " + cachorro1.interagir(("Pisar na patinha")));

//      }
// }