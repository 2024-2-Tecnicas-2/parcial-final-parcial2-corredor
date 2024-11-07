package logicaNegocio;

public abstract class Animal {
    
    protected TipoHabitat habitat;

    public Animal(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    public abstract String emitirSonido();
    public abstract String obtenerDieta();

    public TipoHabitat getHabitat() {
        return habitat;
    }
}

