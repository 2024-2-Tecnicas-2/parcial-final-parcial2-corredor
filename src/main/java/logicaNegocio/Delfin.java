package logicaNegocio;

public class Delfin extends Animal {
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }

   
    public String emitirSonido() {
        return "Chillido";
    }

    public String obtenerDieta() {
        return "Pescado";
    }
}



