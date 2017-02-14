package Consultas;
import BD.Direccion;
import BD.Personas;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //Creamos los jugadores
                
       // Jugadores j1 = new Jugadores("Ruben","Balon Prisionero","Almeria",21, new Paises(01,"España"));
       // Jugadores j2 = new Jugadores("Manolo","Smoking","Sevilla",28, new Paises(02,"España"));
      //  Jugadores j3 = new Jugadores("Juan","Baloncesto","Granada",22, new Paises(03,"España"));
      //  Jugadores j4 = new Jugadores("Irene","Voley","Almeria",19, new Paises(04,"España"));
        
        ODB odb = ODBFactory.open("BDJugadores"); //abrir BD
        
        //Almacenamos los ojetos
        
        //odb.store(j1);
       // odb.store(j2);
       // odb.store(j3);
       // odb.store(j4);
        
        //Recuperamos los objetos
        
       // Objects<Jugadores> objects = odb.getObjects(Jugadores.class);
       // System.out.println(" Jugadores: "+objects.size());
        
        int i=1;
        
        /*while(objects.hasNext()){
            Jugadores jug = objects.next();
            System.out.println((i++)+ "\t : "+jug.getNombre()+" , "
                    +jug.getDeporte()+" , "+jug.getCiudad()+" , "+jug.getEdad());
         
        }
        odb.close();*/
    }
    
}
