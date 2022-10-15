package testandoImport;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class javaTime {
  public static void main(String[] args) {
      
    LocalDateTime dataHora = LocalDateTime.now();
    
      System.out.println("DEFAULT: " + dataHora);
    
    DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd - MM - yyyy | HH:mm:ss");
    
    String formatada = dataHora.format(formatoDataHora);
    
     System.out.println("Depois de formatar = " + formatada);  
    
  }
}
