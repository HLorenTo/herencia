package mision_tic_2022_herencia_ejercicio;
public class Mision_tic_2022_Herencia_ejercicio {
    public static void main(String[] args) {
        Taxi t1 = new Taxi("VFE345", "2000", 120, 34562);
        Autobus a1 = new Autobus ("JDB386", "2022",134,50);
        System.out.println("________TAXI___________________");
        System.out.println("Matricula taxi: "+t1.getMatricula()+" Potencia de "+t1.getPotencia());
        System.out.println("y el modelo es del año: "+ t1.getModelo()+" el numero de licencia es "+t1.getNumlicencia());
        System.out.println("________AUTOBUS___________________");
        System.out.println("Matricula Autobus: "+a1.getMatricula()+" Potencia de "+a1.getPotencia());
        System.out.println("y el modelo es del año: "+ a1.getModelo()+" el numero de plazas "+a1.getNumplazas());
        
        
    }
    
}
