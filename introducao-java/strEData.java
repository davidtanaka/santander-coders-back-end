import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class strEData {
     public static void main(String[] args) {
          // olá, {nome}. Hoje é dia {diaDaSemana}, bom dia
          String nome = "Davi";
          String portugues = "pt";
          String portuguesBrasil = "BR";
          // ISO 8601
          LocalDate hoje = LocalDate.now();
          Locale brasil = new Locale(portugues, portuguesBrasil);
          String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
          String saudacao;
          LocalDateTime agora = LocalDateTime.now();
          if (agora.getHour() >= 0 && agora.getHour() < 12){
               saudacao = "Bom dia";
          } else if (agora.getHour() >= 12 && agora.getHour() < 18){
               saudacao = "Boa tarde";
          } else if (agora.getHour() >= 18 && agora.getHour() < 24){
               saudacao = "Boa Noite";
          } else {
               saudacao = "Olá";
          }

          System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());



     }
}
