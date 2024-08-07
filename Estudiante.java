public class Estudiante {
    private String nombre;
    private int[] calificaciones;  // Arreglo de calificaciones

    // Constructor
    public Estudiante(String nombre, int numeroDeCalificaciones) {
        if(nombre == null || nombre.equals("")) throw new IllegalArgumentException("nombre nulo");
        if(numeroDeCalificaciones <= 0) throw new IllegalArgumentException("numero negativo");
        this.nombre = nombre;
        this.calificaciones = new int[numeroDeCalificaciones];
    }
    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }
    // Métodos setter
    /**
     * Establece la calificación en una posición específica del arreglo.
     * Precondición: El índice debe estar dentro del rango del arreglo de calificaciones.
     * @param indice El índice en el cual se debe establecer la calificación.
     * @param calificacion La calificación a establecer.
     */
    public void setCalificacion(int calificacion) {
        if(calificacion < 1)throw new IllegalArgumentException("nota invalida");
        int i = 0;
        while(i < calificaciones.length){
            if(calificaciones[i] == 0){
                calificaciones[i] = calificacion;
            }else{
                i++;
            }
        }
    }

    /**
     * Calcula y retorna el promedio de las calificaciones.
     * @return El promedio de las calificaciones.
     */
    public double calcularPromedio() {
        double promedio = 0;
        int i = 0;
        while(i < calificaciones.length){
            i++;
            promedio = promedio + calificaciones[i];
        }
        return promedio;
    }
    
     /**
     * Encuentra la calificación más alta.
     * @return La calificación más alta.
     */
    public int calificacionMasAlta() {
        int mayor = calificaciones[0];
        for(int i = 0; i < calificaciones.length; i++){
            if(mayor < calificaciones[i]){
                mayor = calificaciones[i];
            }
        }
        return mayor;
    }

    /**
     * Encuentra la calificación más baja.
     * @return La calificación más baja.
     */
    public int calificacionMasBaja() {
        int menor = calificaciones[0];
        for(int i = 0; i < calificaciones.length; i++){
            if(menor > calificaciones[i]){
                menor = calificaciones[i];
            }
        }
        return menor;
    }

    /**
     * Cuenta cuántas calificaciones están por encima de una cierta calificación.
     * @param calificacion El umbral de calificación.
     * @return El número de calificaciones por encima del umbral.
     */
    public int contarCalificacionesPorEncima(int calificacion) {
        int cant = 0;
        for(int i = 0; i < calificaciones.length; i++){
            if(calificaciones[i]> calificacion){
                cant = cant + 1;
            }
        }
        return cant;
    }

    /**
     * Verifica si el estudiante ha aprobado, considerando un umbral de aprobación.
     * @param umbral El umbral de calificación para aprobar.
     * @return true si el estudiante ha aprobado, false en caso contrario.
     */
    public boolean haAprobado(int umbral) {
        int aprob = 0;
        int desaprob = 0;
        for(int i = 0; i < calificaciones.length; i++){
            if(calificaciones[i] < umbral){
                desaprob = desaprob + 1;
            }
            else{
                aprob = aprob + 1;    
            }
        }
        if(aprob > desaprob) return true;
        return false;
    }
}
