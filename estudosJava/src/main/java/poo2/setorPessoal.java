package poo2;

public class setorPessoal {
    
    funcionario funcionario[];
    private int total;
    
    public setorPessoal(int quantidade) {
        
        this.funcionario = new funcionario[quantidade];
        this.total = 0;
        
    }

    
    public boolean addFuncionario(funcionario obj) {
        
        if (this.total < funcionario.length) {
            
            funcionario[total] = obj;
            this.total++;
            
            return true;
        } else { 
            
            System.out.println("Não foi possível fazer o cadastro.");
            
            return false;
        }
               
    }
    
    public void imprimirFolha() {
        
        for(int i = 0; i < this.total; i++) {
            
            System.out.println("");
            System.out.println("Nome: " + funcionario[i].getNome());
            System.out.println("Salário: " + funcionario[i].getSalario());
                                 
        }
             
    }
    
    public float salarioTotal() {
        
        float salarioTotal = 0;
        
        for(int i = 0; i < this.total; i++) {
            
            salarioTotal += funcionario[i].getSalario();
            
        }
        
        
        return salarioTotal;
    }
    
    public int maiorIndice() {
        
        float maior = 0;
        int posicaoMaior = 0;
        
        for(int i = 0; i < this.total; i++) {
            
            if ( i == 0) {
                
                maior = funcionario[i].getSalario();
                posicaoMaior = i;
                
            } else if (funcionario[i].getSalario() > maior) {
                
                maior = funcionario[i].getSalario();
                posicaoMaior = i;
                
            }
            
            
        }
        
        return posicaoMaior;
    }
    
    public void mostrarDepartamento(int dep) {
        
        for(int i = 0; i < this.total; i++) {
            
            if(funcionario[i].getDepartamento() < this.total) {
                
                System.out.println("Nome do funcionario: " + funcionario[i].getNome());
                System.out.println("Função do funcionario: " + funcionario[i].getFuncao());
                
            }
            
        }
        
     
    }
    
    public void funcaoParecida(String funcao) {
        
        for(int i = 0; i < this.total; i++) {
            
            if(funcao.equals(funcionario[i].getFuncao())) {
                
                System.out.println("Nome: " + funcionario[i].getFuncao());
                
            } else if (!funcao.equals(funcionario[i].getFuncao())) { 
                
                System.out.println("Não faz a mesma função.");
                
            }
            
        }
               
    }
    
    public void imprimirMaiorFolha() {
        
        float ordenaMaior = 0;
        float[] maiorSalario = new float[this.total];
        float[] menorSalario = new float[this.total];
        
        for(int i = 0; i < this.total; i++) {
            for(int j = 0; j < this.total; j++) {
                
                if(funcionario[i].getSalario() < funcionario[j].getSalario()) {
                    
                    ordenaMaior = funcionario[i].getSalario();
                    maiorSalario[i] = funcionario[j].getSalario();
                    menorSalario[j] = ordenaMaior;    
                     
                }
                
            }
 
                System.out.println("MAIOR FOLHA:");
                System.out.println("Maior salário: " + maiorSalario[0]);
                
         
        }
        
        
        
    }
    
    
}
