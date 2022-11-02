package heranca2;


public class aplicacao {
    public static void main(String[] args) {
        
        sala sala3D1 = new sala3d (14, 55, "Epson");
        sala sala3D2 = new sala3d (7, 100, "Thundreal");
        sala salaVip1 = new salaVip (1, 20, "20:30");
        sala salaVip2 = new salaVip (10, 40, "12:30");
        
        sala[] salas = {sala3D1, sala3D2, salaVip1, salaVip2};
        
        for(sala sala: salas) {
            
            sala.imprimir();
            System.out.println("");
           
        }
 
        
    }
}
