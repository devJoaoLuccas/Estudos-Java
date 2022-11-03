package heranca5;

public class cliente {
    
        private String cpf, name, addres, mail, phone;
    
    public cliente(String CPF, String nome, String endereco, String email, String numero) {
        
        this.cpf = CPF;
        this.name = nome;
        this.addres = endereco;
        this.mail = email;
        this.phone = numero;
           
    } 
    
    public void print() {
        
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("CPF: %s\n", this.cpf);
        System.out.printf("Endereço: %s\n", this.addres);
        System.out.printf("Email: %s\n", this.mail);
        System.out.printf("Número: %s\n", this.phone);
        
        
    }
    
}
