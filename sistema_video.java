
/**
Autora : Estefany Harisvet Sánchez Ortiz 
matricula : 2213028278
clase interfaz_video }
 */
public class sistema_video
{
    // Inicializa un arreglo como atributo, en el cual se guardaran los objetos tipo Video registrados
    private video Catalogo [] = new video[9];

    // Indica la cantidad de videos (peliculas) que se ringresaron en el sistema  
    private int cantidadVideos=0; 
    
    //se crea el objeto tipo interfaz 
    public sistema_video()
    {
        
    }

    //solicita el titulo para que pueda iniciar con el proceso de renta de pelicula 
    public void renta(String titulo)
    {
        // revisa en el catalogo que el titulo de la pelicula se encuentra registrada en el sistema 
       for (int i=0; i < cantidadVideos; i++)
        {   // si el titulo es encontrado en el sistema, se le agrega 1 al contador de rentas
            if (Catalogo[i].getTitulo()==titulo)
            {
                Catalogo[i].setRenta(); // // Aumenta en 1 el numero de rentas de la pelicula
            }
        }
    }
    
    // Regresa la pelicula correspondiente al lugar i en el arreglo, para ello pide i
    public video video(int i) 
    {
        return Catalogo[i];
    }
     
    // aqui se va a realizar el proceso para borrar una pelicula del catalogo 
    public void borrar(int i) 
    {
        Catalogo[i] = Catalogo[cantidadVideos];
        
        // reduce el numero de peliculas 
        cantidadVideos--;
    }
    
    // Agrega una nueva pelicula al catalogo usando el constructor de la clase Video.
    public void nuevaPelicula(String titulo, String clasificacion) 
    {
        Catalogo[cantidadVideos]= new video(titulo, clasificacion);
        
        //y aumenta en uno el numero de peliculas dcon las que se cuenta en el contador 
        cantidadVideos++;
    }
    
    
    // Agrega una calificacion a una pelicula por medio del metodo getTitulo el cual se encunetra en la clase de video 
    public void calificar(String titulo, float calificacion)  
    {
        for (int i=0;i<cantidadVideos;i++)
        {
            if (Catalogo[i].getTitulo()==titulo)
            {
                Catalogo[i].setCalificacion(calificacion);
            }
        }
    }   
    
    // Muestraen pantalla la calificacion promedio de una pelicula
    public void calificacion(String titulo)
    {
        for (int i=0;i<cantidadVideos;i++)
        {
            if (Catalogo[i].getTitulo()==titulo)
            {
                System.out.println("\n" + Catalogo[i].getCalificacionPromedio());
            }
        }
    }
    
    
    //devuelve la cantidad de videos (peliculas) que se encuentran en el sistema 
    public int getNumeroVideos() 
    {
        return cantidadVideos;
    }
    
    //es el encargado de mostrar el titulo de los videos (peliculas) y si disponibilidad para ser rentada 
    
    public void mostrarCatalogo() // Muestra el titulo de todos los Videos dentro del catalogo, asi como su disponibilidad
    {
        for (int i=0;i<cantidadVideos;i++)
        {
          System.out.println("\n Rentas: " + Catalogo[i].getRenta() + "\n\n");
          System.out.println("\n Clasificacion: " + Catalogo[i].getClasificacion()); 
          System.out.printf("\n Calificacion: %.2f",(Catalogo[i].getCalificacionPromedio())); 
          System.out.println("\n Veces calificado: " + Catalogo[i].getContadorCalificaciones()); 
          System.out.println("\n" + Catalogo[i].getTitulo());  
                
        }
        
    }
}
