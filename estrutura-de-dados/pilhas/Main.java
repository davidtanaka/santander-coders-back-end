package pilhas;

public class Main {
     public static void main(String[] args) {
          
          int [] numeros = {5, 4, 3, 2, 1};

          inverter(numeros);

     }

     private static void inverter(final int[] numeros) {
          Stack stack = new Stack(numeros[0]);

          for (int i =1; i < numeros.length; i++) {
               stack.push(numeros[i]);
          }

          var node = Stack.pop;
          while(node != null){
               System.out.println(node.getValue()); // Não tem erro
               node = stack.pop();
          }
          
     }

}
