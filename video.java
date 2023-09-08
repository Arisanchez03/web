
/**

 * Autora:Estefany Harisvet Sánchez Ortiz 
 Clase video 
 en esta clase estaran definien do los atributos con los que cuenta cada pelicula 

 */
public class video
{
    // se declaran los atributos 
    private int ContadorCalificaciones;// indica el numero total de calificaciones que ha recibido una pelicula  
    private int renta = 0; // indica cuantas veces se ha rentado, se inicializa en 0
    private float calificacionPromedio = 0; // Muestra la calificacion promedio de la pelicula 
    private String clasificacion;// indica la clasificasion con la que cuenta la  pelicula
    private String titulo;
   
    // se crea el contructor de objeto video 
    public video(String clasificacion_pelicula, String titulo_pelicula)
    {
        // inicializamos los atributos 
        clasificacion =clasificacion_pelicula ; 
        titulo = titulo_pelicula ; 
    }
    
    public int getContadorCalificaciones()
    {
        // se encargara de contabilizar las calificaciones que unas pelicula ha recibido 
        return ContadorCalificaciones ; 
    }
    
    public float getCalificacionPromedio ()
    {
        // Da la calificación promedio de una pelicula en especifico
        return ContadorCalificaciones ; 
    }
    
    public void setCalificacion(float calificacion)
    {
        // si el numero de calificaciones mayor a 0 se podra realizar la operacion para calificacion promedio
        if (ContadorCalificaciones>0)
        {
            calificacionPromedio=((calificacionPromedio*ContadorCalificaciones)+calificacion)/(ContadorCalificaciones+1);
        }
        //si no la calificacion promedio se mantendra igual a la calificacion 
        else 
        {
            calificacionPromedio=calificacion;
        }
    }
    
    public int getRenta()
    {
        // da el número total de rentas de una pelicula 
        return renta;
    }
    
    public void setRenta ()
    {
        // se encargara de aumentar de 1 en 1 las calificaciones de pelicula cada que se realice una
        renta++; 
    }
    
    
    public String getTitulo() 
    {
        // Da el titulo de la pelicula
        return titulo;
    }
    
    public String getClasificacion() 
    {
        // se encarga de dar y devolver la clasificacion con la que cuenta la pelicula 
        return clasificacion;
    }
}
