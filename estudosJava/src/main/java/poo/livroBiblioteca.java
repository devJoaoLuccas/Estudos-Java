package poo;


public class livroBiblioteca {
    
    private int diaEmp, mesEmp, anoEmp;
    private int diaDev, mesDev, anoDev;
    
    public livroBiblioteca() {
        
        this.diaEmp = 0;
        this.mesEmp = 0;
        this.anoEmp = 0;
        this.diaDev = 0;
        this.mesDev = 0;
        this.anoDev = 0;
               
    }
    
    public void emprestimo(int diaEmp, int mesEmp, int anoEmp) {
        
        this.diaEmp = diaEmp;
        this.mesEmp = mesEmp;
        this.anoEmp = anoEmp;
        
        System.out.println("O livro foi emprestado no dia " + this.diaEmp + "/" + this.mesEmp + "/" + this.anoEmp);
        
    }
    
    public void devolver(int diaDev, int mesDev, int anoDev) {
        
            int diasEmprestados, diasDevolvidos;
            int totalDeDias;
            float multa;
        
        this.diaDev = diaDev;
        this.mesDev = mesDev;
        this.anoDev = anoDev;
        
        diasEmprestados = (this.diaEmp * 1) + (this.mesEmp * 30) + (this.anoEmp * 365);
        diasDevolvidos = (this.diaDev * 1) + (this.mesDev * 30) + (this.anoDev * 365);
        totalDeDias = diasDevolvidos - diasEmprestados;
        
        System.out.println(diasEmprestados);
        System.out.println(diasDevolvidos);
        System.out.println(totalDeDias);
        
        if (totalDeDias > 7) {
            
                multa = 2 * totalDeDias;
            
            System.out.println("Atraso de " + totalDeDias + " dias, logo o aluno vai "
                               + "ter que pagar uma multa de " + multa);
                                                   
        }
        
        System.out.println("Livro devolvido.");
        
    }

    public int getDiaEmp() {
        
        return diaEmp;
        
    }

    public int getMesEmp() {
        
        return mesEmp;
        
    }

    public int getAnoEmp() {
        
        return anoEmp;
        
    }

    public int getDiaDev() {
        
        return diaDev;
        
    }

    public int getMesDev() {
        
        return mesDev;
        
    }

    public int getAnoDev() {
        
        return anoDev;
        
    }

    public void setDiaEmp(int diaEmp) {
        
        this.diaEmp = diaEmp;
        
    }

    public void setMesEmp(int mesEmp) {
        
        this.mesEmp = mesEmp;
        
    }

    public void setAnoEmp(int anoEmp) {
        
        this.anoEmp = anoEmp;
        
    }

    public void setDiaDev(int diaDev) {
        
        this.diaDev = diaDev;
        
    }

    public void setMesDev(int mesDev) {
        
        this.mesDev = mesDev;
        
    }

    public void setAnoDev(int anoDev) {
        
        this.anoDev = anoDev;
        
    }
    
      
}
