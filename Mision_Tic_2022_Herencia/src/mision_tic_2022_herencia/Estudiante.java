package mision_tic_2022_herencia;
public class Estudiante extends Persona{
        private int codestu;
        private float notafinal;
        public Estudiante (String nombre, String apellido, int edad, int codestu, float notafinal){
            super (nombre, apellido,edad);
                    this.codestu = codestu;
                    this.notafinal= notafinal;
            
        }
    public void mostrarDatos(){
        System.out.println("El nombre es "+nombre +getApellido());
        System.out.println("La edad es: "+ getEdad() + "Codigo de estudiante: " +getCodestu());
        System.out.println("La note final fue de "+getNotafinal());
    }    
    public int getCodestu() {
        return codestu;
    }

    public void setCodestu(int codestu) {
        this.codestu = codestu;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }
        
}
