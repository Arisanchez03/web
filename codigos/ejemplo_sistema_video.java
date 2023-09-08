
/**
 * autora: Estefany Harisvet Sánchez Ortiz 
 * Matricula: 2213028278
 * codigo de ejemplo pafra el sistema de video 
 */
public class ejemplo_sistema_video
{
    // Crea un objeto de la clase ejemplo_sistema_video para poder ejecutar el programa 
   public static void main(String args[]) { // Funcion main 
        ejemplo_sistema_video Ejemplo = new ejemplo_sistema_video(); 
       Ejemplo.ejecutar(); // ejecuta el programa 
    } 
    
   public void ejecutar() //Es un programa de ejemplo para el sistema de registro de video (peliculas)
    {
        sistema_video sistema = new sistema_video(); 
        
        System.out.println("\n************************************************************************************************");
        System.out.println("\nInventario(nuevo y vacio): "); // imprime el texto para mostrarse en la pantalla 
        sistema.mostrarCatalogo();
        
        // Crea nuevos objetos de la clase videos dentro del Catalogo
        sistema.nuevaPelicula("Perros de reserva","18+"); // les asigna un titulo y una clasificacion a cada pelicula 
        sistema.nuevaPelicula("Star wars III: La venganza de loz sith","PG-13");
        sistema.nuevaPelicula("El señor de los anillos II: Las dos torres","PG-13");
        sistema.nuevaPelicula("Eterno resplando de una mente sin recuerdos","R");
        
        System.out.println("\n==============================================================================================");
        System.out.println("\nInventario (despues de agregar peliculas): "); // Imprime texto
        sistema.mostrarCatalogo();
        
        // Realiza el proceso de renta de peliculas una cantidad aleatoria de veces
        for (int x=0;x<sistema.getNumeroVideos();x++)
        {
            int numeroRentas = (int)(Math.random()*9); // Genera un numero aleatorio menor a 9 
            for (int y=0;y<numeroRentas;y++)
            { /* Para utilizar los metodos correpondientes, pide el titulo de la pelicula correspondiente a la posicion x dentro del catalogo */
                sistema.renta(sistema.video(x).getTitulo());
                // Realiza el proseso de calificacion una cantidad aleatoria de veces 
                float calificacion=(float)(Math.random()*5); // Genera un numero aleatorio menor que 5
                sistema.calificar(sistema.video(x).getTitulo(),calificacion);
            }
        }
        
        System.out.println("\n==============================================================================================");
        System.out.println("\nInventario (despues de rentar y calificar peliculas): "); // Imprime texto
        sistema.mostrarCatalogo();
        
        sistema.renta("El señor de los anillos II: Las dos torres"); // Proceso de renta para el señor de los anillos
        
        System.out.println("\n==============================================================================================");
        System.out.println("\nInventario(despues de rentar 'El señor de los anillos II: Las dos torres:' "); // Imprime texto
        sistema.mostrarCatalogo(); // Imprime los titulos de peliculas dentro del catalogo con su respectiva disponibilidad
    }
    
}
