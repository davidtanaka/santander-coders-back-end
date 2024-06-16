public class condicionais {
     public static void main(String[] args) {
         
     //      int nota = 70;

     //     // se nota maior ou igual a 70, então aprovado
     //     // if-else
     //      if(nota >= 70){
     //           System.out.println("Aluno aprovado!");
     //      } else {
     //           System.out.println("Aluno não aprovado!");
     //      }

     int nota = 40;
     String graduacao;
          // A = 80, B = 70, C = 60, D = 0
     if (nota >= 80) {
          graduacao = "A";
     } else if (nota < 80 && nota >= 70) {
          graduacao = "B";
     } else if (nota < 70 && nota >= 60) {
          graduacao = "C";
     } else if (nota < 60 && nota >= 0) {
          graduacao = "D";
     }else {
          graduacao = "";
     }

     switch (graduacao) {
          case "A":
          case "B":
               System.out.println("Aluno aprovado!"); break;
          case "C":
          case "D":
               System.out.println("Aluno Reprovado!");// break;
          default:
               System.out.println("Graduação inválida");
     }
}
}
