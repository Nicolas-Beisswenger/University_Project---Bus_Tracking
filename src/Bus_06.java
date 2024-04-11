
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


// @author Nicolas Beisswenger
 

public class Bus_06 extends Thread{
    
    Info_Estaciones acceso_infoestaciones = new Info_Estaciones();
    
    public static boolean evitar_estacion = false;
    public static boolean label_bus_destacado = false;
    boolean activo = false;
    int locacion_X = 61;
    int locacion_Y = 554;
    public static int contador_boton = 0;
    public static int num_estacion = 0;
    public static String nom_estacion = " ";
    
    
    @Override
    public void run() {
    
        while(activo == true){
        
            if (Tiempo.Horas_Contador >= 5){
                
                if (label_bus_destacado == false){
                    Interfaz_Grafica.label_bus06.setIcon(new ImageIcon(Interfaz_Grafica.imgbus6));
                    Interfaz_Grafica.label_bus06.setLocation(locacion_X , locacion_Y);
                }
                else if (label_bus_destacado == true){
                    Interfaz_Grafica.label_bus06.setIcon(new ImageIcon(Interfaz_Grafica.imgbus6G));
                    Interfaz_Grafica.label_bus06.setLocation(locacion_X , locacion_Y);
                }
                
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                }
                    catch (InterruptedException ex) {
                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                if (locacion_X <= 837 && locacion_Y == 80 && locacion_X > 61){
                    locacion_X--;
                }
                    else if (locacion_Y >= 80 && locacion_X == 61 && locacion_Y < 554){
                        locacion_Y++;
                    }
                        else if (locacion_X >= 61 && locacion_Y == 554 && locacion_X < 837){
                            locacion_X++;
                        }
                            else if (locacion_Y <= 554 && locacion_X == 837 && locacion_Y > 80){
                                locacion_Y--;
                            }
                
                //Estaciones
                
                if (locacion_X == acceso_infoestaciones.X_CiudadDeportiva && locacion_Y == acceso_infoestaciones.Y_CiudadDeportiva){
                    if (evitar_estacion == false){
                        num_estacion = 1;
                            nom_estacion = "Ciudad Deportiva Rafael Angel Perez";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_SuperLian && locacion_Y == acceso_infoestaciones.Y_SuperLian){
                    if (evitar_estacion == false){
                        num_estacion = 2;
                            nom_estacion = "Super Lian, Hatillo";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                    }
                    else{
                        evitar_estacion = false;
                    }
                }

                else if (locacion_X == acceso_infoestaciones.X_PlasticosTosso && locacion_Y == acceso_infoestaciones.Y_PlasticosTosso){
                    if (evitar_estacion == false){
                        num_estacion = 3;
                            nom_estacion = "Plasticos Tosso";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                    }
                    else{
                        evitar_estacion = false;
                    }
                }

                else if (locacion_X == acceso_infoestaciones.X_ParqueYamuni && locacion_Y == acceso_infoestaciones.Y_ParqueYamuni){        
                    if (evitar_estacion == false){
                        num_estacion = 4;
                            nom_estacion = "Parque Yamuni, San Francisco";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                  
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                else if (locacion_X == acceso_infoestaciones.X_ColegioMariaAuxiliadora && locacion_Y == acceso_infoestaciones.Y_ColegioMariaAuxiliadora){
                    if (evitar_estacion == false){
                        num_estacion = 5;
                            nom_estacion = "Colegio Maria Auxilidora";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                  
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_EscuelaJuanRafaelMora && locacion_Y == acceso_infoestaciones.Y_EscuelaJuanRafaelMora){
                    if (evitar_estacion == false){
                        num_estacion = 6;
                            nom_estacion = "Escuela Juan Rafael Mora";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                       
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                 else if (locacion_X == acceso_infoestaciones.X_HotelCaribbean && locacion_Y == acceso_infoestaciones.Y_HotelCaribbean){
                    if (evitar_estacion == false){
                        num_estacion = 7;
                            nom_estacion = "Hotel Caribbean, Amon";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                 
                else if (locacion_X == acceso_infoestaciones.X_ParqueSanFrancisco && locacion_Y == acceso_infoestaciones.Y_ParqueSanFrancisco){
                    if (evitar_estacion == false){
                        num_estacion = 8;
                            nom_estacion = "Parque San Francisco";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    num_estacion = 0;
                                    nom_estacion = "En Carretera";
                  
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_LiceoJoseJoaquin && locacion_Y == acceso_infoestaciones.Y_LiceoJoseJoaquin){
                    if (evitar_estacion == false){
                        num_estacion = 9;
                            nom_estacion = "Liceo Nocturno Jose Juaquin Jimenez Nuñes";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                            
                    }
                    else{
                        evitar_estacion = false;
                        nom_estacion = "En Carretera";
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_AyAGuadalupe && locacion_Y == acceso_infoestaciones.Y_AyAGuadalupe){
                    if (evitar_estacion == false){
                        num_estacion = 10;
                            nom_estacion = "AyA, Guadalupe";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                 
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_RotondaBetania && locacion_Y == acceso_infoestaciones.Y_RotondaBetania){
                    if (evitar_estacion == false){
                        num_estacion = 11;
                            nom_estacion = "Rotonda de Betania";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                 
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_ColegioDonBosco && locacion_Y == acceso_infoestaciones.Y_ColegioDonBosco){
                    if (evitar_estacion == false){
                        num_estacion = 12;
                            nom_estacion = "Colegio Salesiano Don Bosco";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                catch (InterruptedException ex) {
                                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                    num_estacion = 0;
                                    nom_estacion = "En Carretera";
                                  
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_EscuelaRepublicaDominicana && locacion_Y == acceso_infoestaciones.Y_EscuelaRepublicaDominicana){
                    if (evitar_estacion == false){
                        num_estacion = 13;
                            nom_estacion = "Escuela Republica Dominicana";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
            
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_AbastecedorLosSauces && locacion_Y == acceso_infoestaciones.Y_AbastecedorLosSauces){
                    if (evitar_estacion == false){
                        num_estacion = 14;
                            nom_estacion = "Abastecedor Los Sauces";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                 
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                else if (locacion_X == acceso_infoestaciones.X_ParqueMonteAzul && locacion_Y == acceso_infoestaciones.Y_ParqueMonteAzul){
                    if (evitar_estacion == false){
                        num_estacion = 15;
                            nom_estacion = "Parque de Monte Azul";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                               
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_CevicheriaCostaAzul && locacion_Y == acceso_infoestaciones.Y_CevicheriaCostaAzul){
                    if (evitar_estacion == false){
                        num_estacion = 16;
                            nom_estacion = "Cavicheria Costa Azul";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                                 
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_TallerGernon && locacion_Y == acceso_infoestaciones.Y_TallerGernon){
                    if (evitar_estacion == false){
                        num_estacion = 17;
                            nom_estacion = "Taller Gernon";
                            if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                Bus_05.evitar_estacion = true;
                                }
                            acceso_infoestaciones.atraso_aleatorio();
                            try {
                                TimeUnit.MILLISECONDS.sleep(2000);
                            }
                                catch (InterruptedException ex) {
                                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                    num_estacion = 0;
                                    nom_estacion = "En Carretera";
                  
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_PlazaAmerica && locacion_Y == acceso_infoestaciones.Y_PlazaAmerica){
                    if (evitar_estacion == false){
                        num_estacion = 18;
                            nom_estacion = "Plaza America";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                            
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_RestLaFortuna && locacion_Y == acceso_infoestaciones.Y_RestLaFortuna){
                    if (evitar_estacion == false){
                        num_estacion = 19;
                            nom_estacion = "Rest.La Fortuna, Hatillo";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                         
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
                
                else if (locacion_X == acceso_infoestaciones.X_TerminalHatillo && locacion_Y == acceso_infoestaciones.Y_TerminalHatillo){
                    if (evitar_estacion == false){
                        num_estacion = 20;
                            nom_estacion = "Terminal Hatillo";
                                if (Bus_05.num_estacion == num_estacion && Bus_05.num_estacion > 0 && num_estacion > 0){ 
                                    Bus_05.evitar_estacion = true;
                                }
                                acceso_infoestaciones.atraso_aleatorio();
                                try {
                                    TimeUnit.MILLISECONDS.sleep(2000);
                                }
                                    catch (InterruptedException ex) {
                                        Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                        num_estacion = 0;
                                        nom_estacion = "En Carretera";
                     
                    }
                    else{
                        evitar_estacion = false;
                    }
                }
            }

//Volver a la estacion --------------------------------------------------------------------------------  
        }
    }
}
