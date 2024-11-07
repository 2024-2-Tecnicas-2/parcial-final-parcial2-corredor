package logicaNegocio;

public class Leon extends Animal {
private TipoHabitat tipoHabitat=  TipoHabitat.TERRESTRE;

    public Leon(TipoHabitat habitat) {
        super(habitat);
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




