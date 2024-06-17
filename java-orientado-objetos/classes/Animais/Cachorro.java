package Animais;

public class Cachorro extends Animal{
     // Atributos
     static int numeroDeCachorros;
     private int tamanhoDoRabo;

     public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
          super(nome, cor, peso);
          this.nome = nome;
          this.cor = cor;
          this.altura = altura;
          this.peso = peso;
          this.tamanhoDoRabo = tamanhoDoRabo;
     }

     // Metódos
     public static int getNumeroDeCachorros() {
          return numeroDeCachorros;
     }

     public static void setNumeroDeCachorros(int numeroDeCachorros) {
          Cachorro.numeroDeCachorros = numeroDeCachorros;
     }

     public int getTamanhoDoRabo() {
          return tamanhoDoRabo;
     }

     public void setTamanhoDoRabo(int tamanhoDoRabo) {
          this.tamanhoDoRabo = tamanhoDoRabo;
     }

     public String pegar(){
          return "Bolinha";
     }

     public String interagir(String acao) {
          switch (acao){
               case "Carinho": this.estadoDeEspirito = "Feliz!"; break;
               case "Vai dormir": this.estadoDeEspirito = "Bravo!"; break;
               case "Pisar na patinha": this.estadoDeEspirito = "Triste!"; break;
               default: this.estadoDeEspirito = "Neutro";
          }
          return this.estadoDeEspirito;
     }

     @Override
     public String toString() {
          return "Cachorro{" +
               	"nome='" + nome + '\'' + 
                    '}';
     }

     @Override
     public void soar() {
          System.out.println("AU AU");
     }
}    