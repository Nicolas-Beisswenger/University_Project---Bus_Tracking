
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


//@author Nicolas Beisswenger


public class Tiempo extends Thread{
    

    
    boolean activo = true;                 //Mantiene activo el bucle del reloj
    public static int Hora = 5;            // Lleva el conteo hasta las 12 horas
    public static int Horas_Contador = 5;  // Lleva el conteo hasta las 24 horas
    public static int Minutos = 0;         // Lleva el conteo de los minutos
    public static int Dia_Contador = 1;    // Lleva el conteo de los días de la semana transcurridos
    public static String Dia = "Lunes";    // Indica el día de la semana
    public static String AmPm = "Am";      // Indica el meridiano del día
    
    public static String string_Hora = Integer.toString(Hora);
    public static String string_Minutos = Integer.toString(Minutos);
    
    
    @Override
    public void run(){           // Reloj del sistema
                                 
        while(activo == true){    // Bucle infinito
            
            if (Minutos < 59){
                try {
                    TimeUnit.SECONDS.sleep(1);  // Un segundo de espera entre cada ciclo
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                }
                Minutos++;                      // Sumador de minutos
            }
            else{
                Hora++;                         // Sumador de 12 horas
                Horas_Contador++;               // Sumador de 24 horas
                Minutos = 0;                    // Reseteo de los minutos
            }
            
            if (Hora > 12){
                Hora = 1;                       // Reseteo de las 12 horas
            }
            
            if (Horas_Contador > 23){
                Horas_Contador = 0;             // Reseteo de las 24 horas
                Dia_Contador++;                 // Sumador del conteo de dias de la semana
                dias();                         // Llamado al metodo con los dias
            }
            
            if (Horas_Contador < 12){           // Identificador del meridiano del dia
                AmPm = "Am";
            }
            else if (Horas_Contador >= 12){
                AmPm = "Pm";
            }
            
            if (Dia_Contador > 7){              // Reseteo del conteo de los días de la semana
                Dia_Contador = 0;
            }
            
            System.out.println("Hora:" + Hora + ", Minutos:" + Minutos + ". " + AmPm + ", Día: " + Dia);
            System.out.println(" ");
            

            
        }
    }    
    
    public void dias(){                         // Método con los días de la semana
    
        if (Dia_Contador == 1){
            Dia = "Lunes";
        } 
        else if (Dia_Contador == 2){
            Dia = "Martes";
        }
        else if (Dia_Contador == 3){
            Dia = "Miercoles";
        }
        else if (Dia_Contador == 4){
            Dia = "Jueves";
        }
        else if (Dia_Contador == 5){
            Dia = "Viernes";
        }
        else if (Dia_Contador == 6){
            Dia = "Sabado";
        }
        else if (Dia_Contador == 7){
            Dia = "Domingo";
        }    
    }
}
