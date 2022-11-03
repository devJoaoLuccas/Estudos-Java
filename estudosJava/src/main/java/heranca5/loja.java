package heranca5;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
 
        System.out.printf("Insira o nome do cliente: \n");
                String nome = scan.nextLine();
                        
        System.out.printf("Insira o CPF/CNPJ do cliente:\n");
                String cpf = scan.nextLine();
                        
        System.out.printf("Insira o endereço do cliente:\n");    
                String endereco = scan.nextLine();
                        
        System.out.printf("Insira o email do cliente:\n");
                String email = scan.nextLine();
                        
        System.out.printf("Insira o número do cliente:\n");
                String numero = scan.nextLine();
                    System.out.println("");
                        
        cliente cliente1 = new cliente(cpf, nome, endereco, email, numero);

        
        System.out.printf("Insira a placa:\n");
                String placa = scan.nextLine();
                    
        System.out.printf("Insira o ano:\n");
                int ano = scan.nextInt();
                        
        System.out.printf("Insira o peso máximo do carro:\n");
                int pesoMax = scan.nextInt();
                scan.nextLine();
                System.out.println("");
                        
        automovel automovelCarga1 = new automovelCarga(placa, ano, pesoMax);
        
                                                   
       System.out.printf("Insira a placa:\n");
                placa = scan.nextLine();
                        
        System.out.printf("Insira o ano:\n");
                ano = scan.nextInt();
                scan.nextLine();
                        
        System.out.printf("Insira a quantidade de assentos do carro:\n");
                int maxPass = scan.nextInt();
                scan.nextLine();
                System.out.println("");
                        
        automovel automovelPasseio1 = new automovelPasseio(placa, ano, maxPass);    
 
                   
       System.out.printf("Insira a placa:\n");
                placa = scan.nextLine();
                        
        System.out.printf("Insira o ano:\n");
                ano = scan.nextInt();
                scan.nextLine();
                        
        System.out.printf("Insira o modelo do carro\n:");
                String modelo = scan.nextLine(); 
                        
        automovel automovelPequeno = new automovelPequeno(placa, ano, modelo);
    
            cliente1.print();
            System.out.println("");
            automovelCarga1.print();
            System.out.println("");
            automovelPasseio1.print();
            System.out.println("");
            automovelPequeno.print();
            System.out.println("");
            
        }
                 
}
    

