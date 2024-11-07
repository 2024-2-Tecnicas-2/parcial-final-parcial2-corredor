package logicaNegocio;

public class Delfin extends Animal {
    private TipoHabitat tipoHabitat= TipoHabitat.ACUATICO;

    public Delfin(TipoHabitat habitat) {
        super(habitat);
    }
    

   @Override
    public String emitirSonido() {
        return "Chillido";
    }
@Override
    public String obtenerDieta() {
        return "Pescado";
    }
}



