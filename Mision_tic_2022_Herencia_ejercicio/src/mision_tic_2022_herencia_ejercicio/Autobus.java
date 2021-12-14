package mision_tic_2022_herencia_ejercicio;
public class Autobus extends Vehiculo{
    private int numplazas;

    public Autobus(String matricula, String modelo, int potencia, int numplazas) {
        super(matricula, modelo, potencia);
        this.numplazas = numplazas;
    }

    

    public int getNumplazas() {
        return numplazas;
    }

    public void setNumplazas(int numplazas) {
        this.numplazas = numplazas;
    }
    
}
