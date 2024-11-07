package logicaNegocio;

public class Delfin extends Animal {

    public Delfin(TipoHabitat habitat) {
        super(habitat);
        this.habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
}



