package logicaNegocio;

public class Leon extends Animal {
   
    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }

    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }
}






