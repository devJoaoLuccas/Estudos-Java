package poo1.teste;

public class executarTempo2 {
   public static void main(String[] args) {
       
       tempo t1 = new tempo();
       tempo t2 = new tempo(17);
       tempo t3 = new tempo(17,28);
       tempo t4 = new tempo(17, 28, 30);
       
       System.out.println("FEITO:");
       System.out.println("T1.Default: " + t1.getHora() + ":" + t1.getMinuto() + ":" + t1.getSegundo());
       System.out.println("T2.Default: " + t2.getHora() + ":" + t2.getMinuto() + ":" + t2.getSegundo());
       System.out.println("T3.Default: " + t3.getHora() + ":" + t3.getMinuto() + ":" + t3.getSegundo());
       System.out.println("T4.Default: " + t4.getHora() + ":" + t4.getMinuto() + ":" + t4.getSegundo());
       
   } 
}
