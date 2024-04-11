
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


// @author Nicolas Beisswenger


public class Info_Estaciones {
    
    //Coordenadas de las estaciones
    int X_CiudadDeportiva = 837;
    int Y_CiudadDeportiva = 80;
        
    int X_SuperLian = 678;
    int Y_SuperLian = 80;
        
    int X_PlasticosTosso = 525;
    int Y_PlasticosTosso = 80;
        
    int X_ParqueYamuni = 371;
    int Y_ParqueYamuni = 80;
        
    int X_ColegioMariaAuxiliadora = 218;
    int Y_ColegioMariaAuxiliadora = 80;
        
    int X_EscuelaJuanRafaelMora = 61;
    int Y_EscuelaJuanRafaelMora = 80;
        
    int X_HotelCaribbean = 61;
    int Y_HotelCaribbean = 162;
        
    int X_ParqueSanFrancisco = 61;
    int Y_ParqueSanFrancisco = 259;
        
    int X_LiceoJoseJoaquin = 61;
    int Y_LiceoJoseJoaquin = 364;
        
    int X_AyAGuadalupe = 61;
    int Y_AyAGuadalupe = 466;
        
    int X_RotondaBetania = 61;
    int Y_RotondaBetania = 554;

    int X_ColegioDonBosco = 218;
    int Y_ColegioDonBosco = 554;
        
    int X_EscuelaRepublicaDominicana = 371;
    int Y_EscuelaRepublicaDominicana = 554;
        
    int X_AbastecedorLosSauces = 525;
    int Y_AbastecedorLosSauces = 554;
        
    int X_ParqueMonteAzul = 678;
    int Y_ParqueMonteAzul = 554;
        
    int X_CevicheriaCostaAzul = 837;
    int Y_CevicheriaCostaAzul = 554;

    int X_TallerGernon = 837;
    int Y_TallerGernon = 466;
        
    int X_PlazaAmerica = 837;
    int Y_PlazaAmerica = 364;
        
    int X_RestLaFortuna = 837;
    int Y_RestLaFortuna = 259;
        
    int X_TerminalHatillo = 837;
    int Y_TerminalHatillo = 162;
    
    
    //Método random para atrasar de manera aleatorea los buses un segundo extra
    public void atraso_aleatorio(){
        
        Random rn = new Random();
        int range = 5 - 1 + 1;
        int randomNum =  rn.nextInt(range) + 1;
        
        if (randomNum == 1){
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            }
                catch (InterruptedException ex) {
                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
