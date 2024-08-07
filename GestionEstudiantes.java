import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para añadir un estudiante

    /**
     * Añade un estudiante a la lista de estudiantes.
     * @param estudiante El estudiante a añadir.
     */
    public void añadirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para listar todos los estudiantes

    /**
     * Lista todos los estudiantes en la gestión.
     */
    public void listarEstudiantes() {
        int i = 0;
        while(i < estudiantes.size()){
            System.out.println(i +"estudiante: " + estudiantes.get(i).getNombre());
            i++;
        }
    }

    // Método para buscar un estudiante por nombre

    /**
     * Busca un estudiante por su nombre.
     * @param nombre El nombre del estudiante a buscar.
     * @return El estudiante encontrado, o null si no se encuentra.
     */
    public Estudiante buscarEstudiante(String nombre) {
        for(int i = 0; i < estudiantes.size(); i++){
            if(estudiantes.get(i).getNombre().equals(nombre)){
                return estudiantes.get(i);
            }
        }
        return null;
    }
}
