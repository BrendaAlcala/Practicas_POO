package p9;

public class Practica9 {

    public static void main(String[] args) {
        
        Alumno alumnos[] = new Alumno[3];
        Leer lea = new Leer();
        Escribir escriba = new Escribir();
        lea.leerArchivoCSV();
        int x = 0;
        int i;
        int j;
        for(i=0;i<alumnos.length;i++){
            alumnos[i] = new Alumno();
            for(j=0;j<alumnos[0].calificaciones.length;j++){
                alumnos[i].calificaciones[j] = lea.calificaciones[x];
                x++;
            }
            alumnos[i].calcularPromedio();
        }
        for (Alumno alumno : alumnos) {
            alumno.mostrarAlumno();
        }
        escriba.escribirArchivo(alumnos);
    }
}