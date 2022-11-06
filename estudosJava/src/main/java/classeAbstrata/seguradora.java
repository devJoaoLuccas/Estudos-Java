package classeAbstrata;

public class seguradora {
    public static void main(String[] args) {
        
        seguro seguroDeVida = new seguroVida("João Marques", 1500f, 45);
        seguro seguroResidencial = new seguroResidencial ("Marcos Marques", 5000f,
                                                                    "Alameda Bosque Imperial, bl 45 apt 302", 1997);
        seguro seguroAutomovel = new seguroAutomovel ("Marcela Marques", 10000f, 1503, 1969);
        
        seguro[] seguros = {seguroDeVida, seguroResidencial, seguroAutomovel};
        
        for (seguro seguro : seguros) {
            
            seguro.print();
            System.out.println("");
            
        }
       
        
    }
}
