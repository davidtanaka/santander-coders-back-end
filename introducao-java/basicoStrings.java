public class basicoStrings {
     public static void main(String[] args) {

         String nome = "Davi";
         System.out.println(nome.toUpperCase()); // Deixar tudo maiúsculo.
         System.out.println(nome.toLowerCase()); // Deixar tudo minúsculo.
         System.out.println(nome.length()); // Verificar o tamanho de uma string.

         String nomeOutro = "Davi";
         System.out.println(nome.equals(nomeOutro)); // Ver se uma string é igual a outra.
         System.out.println(nome.equalsIgnoreCase(nomeOutro)); // Ignorar se são iguais.

     }
}
