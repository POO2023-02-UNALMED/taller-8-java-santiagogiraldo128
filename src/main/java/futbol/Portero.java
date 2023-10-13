package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return resumen() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    public int compareTo(Portero p) {
        return Math.abs(this.golesRecibidos - p.golesRecibidos);
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

}
