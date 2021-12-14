package mision_tic_2022_herencia_ejercicio;
public class Vehiculo {
    public String matricula;
    public String modelo;
    public int potencia;

    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }
    
}
