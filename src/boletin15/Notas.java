
package boletin15;

public class Notas {
    
    float escrita;
    float practica;
    float boletins;

    public Notas(float escrita, float practica, float boletins) {
        
        this.escrita = escrita;
        this.practica = practica;
        this.boletins = boletins;
    }
    
    // Set's y Get's

    public float getEscrita() {
        return escrita;
    }

    public void setEscrita(float escrita) {
        this.escrita = escrita;
    }

    public float getPractica() {
        return practica;
    }

    public void setPractica(float practica) {
        this.practica = practica;
    }

    public float getBoletins() {
        return boletins;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }
    
    // Funcion para calcula la Nota Final
    
    public void calcularNota(){
        
        int boletinMedia;
        
        if(boletins > 9){
            
            boletinMedia = 2;
        } else if(boletins >= 7 && boletins <= 9){
        
            boletinMedia = 1;
        } else {
            
            boletinMedia = 0;
        }
        
        float total = ((escrita / 100) * 40) + ((practica / 100) * 40) + boletinMedia;
        
        System.out.println("PROBAS TEÓRICAS: " + escrita + "\n" +
                            "PROBAS PRÁCTICA: " + practica + "\n" +
                            "BOLETÍNS: " + boletins + " (" + boletinMedia + ")\n" +
                            "NOTA TOTAL: " + total);
    }
}
