package logicaNegocio;

public class Leon extends Animal {

    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
     
    }

    public String emitirSonido() {
        return "Rugido";
    }

    public String obtenerDieta() {
        return "Carnívoro";
    }

    
 
}




