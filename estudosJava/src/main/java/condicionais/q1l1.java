package condicionais;

import java.util.Scanner;

public class q1l1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            
            int kg, sobremesa, refrigerante, cerveja, numeroDaMesa, valorTotal, valorPessoa, pessoasNaMesa;
            int kgB, sobremesaB, refrigeranteB, cervejaB; 
            
        System.out.println("Informe o número da mesa:");
            numeroDaMesa = ler.nextInt();
        
        System.out.println("Informe quantas pessoas tem na mesa:");
            pessoasNaMesa = ler.nextInt();
                        
        System.out.println("Informe quantos KG de comida foi pedido na mesa:");
            kg = ler.nextInt();
                kgB = kg * 30;
            
        System.out.println("Informe quantas sobremesas foram pedidas:");
            sobremesa = ler.nextInt();
                sobremesaB = sobremesa * 6;
        
        System.out.println("Informe a quantidade de refrigerantes pedidos na mesa:");
           refrigerante = ler.nextInt();
               refrigeranteB = refrigerante * 5;
                
        System.out.println("Informe a quantidade de cerveja pedida na mesa:");
            cerveja = ler.nextInt();
                cervejaB = cerveja * 10;
                
            valorTotal = cervejaB + refrigeranteB + sobremesaB + kgB;
            valorPessoa = valorTotal / pessoasNaMesa;
            
        System.out.println("Nota Fiscal da mesa " + numeroDaMesa + ":");
        System.out.print("Foi perdido " + kg + " kg's de comida, resultando em " + kgB + " reais");
        System.out.print(". Foi pedido " + sobremesa + " sobremesas, resultando em " + sobremesaB + " reais");
        System.out.print(". Foi pedido " + refrigerante + " refrigerantes, resultando em " + refrigeranteB + " reais");
        System.out.print(". Foi pedido " + cerveja + " cervejas, resultando em " + cervejaB + " reais");
        System.out.print(". O valor total do pedido foi " + valorTotal + " reais");
        System.out.print(". O valor por " + pessoasNaMesa + " pessoas na mesa, ficou " + valorPessoa + " reais");
            
            
    }
}
