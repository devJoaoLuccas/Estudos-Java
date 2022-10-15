package poo1;

public class elevador {

    private int andarAtual, totalDeAndares;
    private int capacidadeMaxima, capacidadeAtual;
    
    public elevador() {
        
        this.andarAtual = 0; 
        this.totalDeAndares = 0;
        this.capacidadeMaxima = 0;
        this.capacidadeAtual = 0;
               
    }
    
    public void inicializar(int totalDeAndares, int capacidadeMaxima) {
        
        this.totalDeAndares = totalDeAndares;
        this.capacidadeMaxima = capacidadeMaxima;
        
        System.out.println("O total de andares do prédio é: " + this.totalDeAndares + 
                           " a capacidade maxima do prédio é: " + this.capacidadeMaxima);
        
                     
    }
    
    public void entrar(int entradaDePessoa) {
        
        int totalDePessoas, restante;
        
        totalDePessoas = this.capacidadeAtual + entradaDePessoa;
            
        if(totalDePessoas > this.capacidadeMaxima) {
            
            System.out.println("Não é possível entrar no elevador, porque vai superar a "
                              + "capacidade máxima, de " + this.capacidadeMaxima);
                                  
        } else { 
            
            restante = this.capacidadeMaxima - totalDePessoas;
            
            System.out.println("É possível entrar no elevador");
            
        }
        
        this.capacidadeAtual = totalDePessoas;
        
        
    }
    
    public void sai(int saida) {
        
        int totalDePessoas;
        
        totalDePessoas = this.capacidadeAtual - saida;
        
        if(this.capacidadeAtual <= 0) {
        
            System.out.println("Não é possível sair alguem do elevador " +
                              "porque ninguem está nele.");
        
        } else { 
            
            System.out.println("Saiu " + saida + " pessoas do elevador.");
                     
        }
        
        
    } 
    
    public void descer(int andarDesejado) {
        
        int descida; 
        
        descida = this.andarAtual - andarDesejado;
        
        if(andarAtual == 0 || andarDesejado > this.totalDeAndares) {
            
            System.out.println("Não é possível fazer tal operação.");
            
        } else {
            
            System.out.println("Você desceu " + descida + " andares"
                    + " e foi parar no " + andarDesejado + ".");
            
        }
        
        this.andarAtual = andarDesejado;
        
    }
    
    public void subir(int andarDesejado) {
        
        int subida;
        
        subida = andarDesejado - this.andarAtual;
        
        if (this.andarAtual >= this.totalDeAndares) {
            
            System.out.println("Não é possível subir.");
            
        } else {
            
            System.out.println("Você estava no " + this.andarAtual + 
                              "º, subiu " + subida + " andar(es) e"
                               + " agora estar no " + andarDesejado);
            
        }
        
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    
    
    
    
}
