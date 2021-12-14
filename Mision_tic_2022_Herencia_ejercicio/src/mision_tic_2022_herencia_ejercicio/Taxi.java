package mision_tic_2022_herencia_ejercicio;
public class Taxi extends Vehiculo{
  private int numlicencia;   
  public  Taxi (String matricula, String modelo, int potencia, int numlicencia){
    super(matricula, modelo, potencia);
    this.numlicencia=numlicencia;
  }

    public int getNumlicencia() {
        return numlicencia;
    }

    public void setNumlicencia(int numlicencia) {
        this.numlicencia = numlicencia;
    }
  
}
