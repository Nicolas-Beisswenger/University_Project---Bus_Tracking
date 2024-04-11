
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


// @author Nicolas Beisswenger


public class Interfaz_Grafica extends JFrame{
    
    //Declaración de los botones a mostrar
    JButton btn_iniciar = new JButton("Iniciar Sistema");
    JButton btn_concluir  = new JButton("Cerrar Sistema");
    
    JButton btn_bus01 = new JButton("Bus N°1");
    JButton btn_bus02 = new JButton("Bus N°2");
    JButton btn_bus03 = new JButton("Bus N°3");
    JButton btn_bus04 = new JButton("Bus N°4");
    JButton btn_bus05 = new JButton("Bus N°5");
    JButton btn_bus06 = new JButton("Bus N°6");
    JButton btn_bus07 = new JButton("Bus N°7");
    JButton btn_bus08 = new JButton("Bus N°8");
    JButton btn_bus09 = new JButton("Bus N°9");
    JButton btn_bus10 = new JButton("Bus N°10");
    JButton btn_conectar = new JButton ("Conectar");
    
    //Llamado de las imágenes utilizadas como iconos
    public static String mapa = "mapa_alfa.png", imgbus1 = "bus1.png", imgbus1G = "bus1G.png" 
            , imgbus2 = "bus2.png", imgbus2G = "bus2G.png", imgbus3 = "bus3.png", imgbus3G = "bus3G.png"
            , imgbus4 = "bus4.png", imgbus4G = "bus4G.png", imgbus5 = "bus5.png", imgbus5G = "bus5G.png"
            , imgbus6 = "bus6.png", imgbus6G = "bus6G.png", imgbus7 = "bus7.png", imgbus7G = "bus7G.png"
            , imgbus8 = "bus8.png", imgbus8G = "bus8G.png", imgbus9 = "bus9.png", imgbus9G = "bus9G.png"
            , imgbus10 = "bus10.png", imgbus10G = "bus10G.png";
    
    //Creación de los labels a utilizar
    public static JLabel label_mapa  = new JLabel();
    
    public static JLabel label_bus01   = new JLabel();
    public static JLabel label_bus01G = new JLabel();
    
    public static JLabel label_bus02   = new JLabel();
    public static JLabel label_bus02G = new JLabel();
    
    public static JLabel label_bus03   = new JLabel();
    public static JLabel label_bus03G = new JLabel();
    
    public static JLabel label_bus04   = new JLabel();
    public static JLabel label_bus04G = new JLabel();
    
    public static JLabel label_bus05   = new JLabel();
    public static JLabel label_bus05G = new JLabel();
    
    public static JLabel label_bus06   = new JLabel();
    public static JLabel label_bus06G = new JLabel();
    
    public static JLabel label_bus07   = new JLabel();
    public static JLabel label_bus07G = new JLabel();
    
    public static JLabel label_bus08   = new JLabel();
    public static JLabel label_bus08G = new JLabel();
    
    public static JLabel label_bus09  = new JLabel();
    public static JLabel label_bus09G = new JLabel();
    
    public static JLabel label_bus10  = new JLabel();
    public static JLabel label_bus10G = new JLabel();
    
    //Creación de los dos paneles en los que se divide la interfaz gráfica
    JPanel panel_mapa = new JPanel();
    JPanel panel_controles = new JPanel();
    
    //Instancia para la creación de los hilos
    Tiempo hilo_Tiempo = new Tiempo();
    Bus_01 hilo_Bus01 = new Bus_01();
    Bus_02 hilo_Bus02 = new Bus_02();
    Bus_03 hilo_Bus03 = new Bus_03();
    Bus_04 hilo_Bus04 = new Bus_04();
    Bus_05 hilo_Bus05 = new Bus_05();
    Bus_06 hilo_Bus06 = new Bus_06();
    Bus_07 hilo_Bus07 = new Bus_07();
    Bus_08 hilo_Bus08 = new Bus_08();
    Bus_09 hilo_Bus09 = new Bus_09();
    Bus_10 hilo_Bus10 = new Bus_10();
    
    // Variale para determinar si el sistema ya está corriendo o no
    boolean sistema_encendido = false;  
    
    
    public Interfaz_Grafica(){
        
        //Asignación de los iconos a sus respectivos label
        
        label_mapa.setIcon(new ImageIcon(mapa));
        
        label_bus01.setIcon(new ImageIcon(imgbus1));
        label_bus01G.setIcon(new ImageIcon(imgbus1G));
        
        label_bus02.setIcon(new ImageIcon(imgbus2));
        label_bus02G.setIcon(new ImageIcon(imgbus2G));
        
        label_bus03.setIcon(new ImageIcon(imgbus3));
        label_bus03G.setIcon(new ImageIcon(imgbus3G));
        
        label_bus04.setIcon(new ImageIcon(imgbus4));
        label_bus04G.setIcon(new ImageIcon(imgbus4G));
        
        label_bus05.setIcon(new ImageIcon(imgbus5));
        label_bus05G.setIcon(new ImageIcon(imgbus5G));
        
        label_bus05.setIcon(new ImageIcon(imgbus5));
        label_bus05G.setIcon(new ImageIcon(imgbus5G));
        
        label_bus06.setIcon(new ImageIcon(imgbus6));
        label_bus06G.setIcon(new ImageIcon(imgbus6G));
        
        label_bus07.setIcon(new ImageIcon(imgbus7));
        label_bus07G.setIcon(new ImageIcon(imgbus7G));
        
        label_bus08.setIcon(new ImageIcon(imgbus8));
        label_bus08G.setIcon(new ImageIcon(imgbus8G));
        
        label_bus09.setIcon(new ImageIcon(imgbus9));
        label_bus09G.setIcon(new ImageIcon(imgbus9G));
        
        label_bus10.setIcon(new ImageIcon(imgbus10));
        label_bus10G.setIcon(new ImageIcon(imgbus10G));
        
        //Seeción para agregar los labels a la interfaz gráfica
        panel_mapa.setLayout(new FlowLayout());
        panel_mapa.add(label_bus01);
        panel_mapa.add(label_bus02);
        panel_mapa.add(label_bus02);
        panel_mapa.add(label_bus02);
        panel_mapa.add(label_bus03);
        panel_mapa.add(label_bus04);
        panel_mapa.add(label_bus05);
        panel_mapa.add(label_bus06);
        panel_mapa.add(label_bus07);
        panel_mapa.add(label_bus08);
        panel_mapa.add(label_bus09);
        panel_mapa.add(label_bus10);
        
        //Seeción para agregar los botones a la interfaz gráfica
        panel_controles.setLayout(new GridLayout(13, 1));
        panel_controles.add(btn_conectar);
        panel_controles.add(btn_iniciar);
        panel_controles.add(btn_bus01);
        panel_controles.add(btn_bus02);
        panel_controles.add(btn_bus03);
        panel_controles.add(btn_bus04);
        panel_controles.add(btn_bus05);
        panel_controles.add(btn_bus06);
        panel_controles.add(btn_bus07);
        panel_controles.add(btn_bus08);
        panel_controles.add(btn_bus09);
        panel_controles.add(btn_bus10);
        panel_controles.add(btn_concluir);
        
        panel_mapa.add(label_mapa);
        
        add("Center", panel_mapa);
        add("East", panel_controles);
        
//Funciones de los botones
btn_conectar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = false){
            
        // Iniciar la conexion con el usuario
            Servidor iniciar_servidor = new Servidor();
            iniciar_servidor.realizarConexion();
        }
    }
});

//Botón para iniciar el sistema
btn_iniciar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido == false){
            sistema_encendido = true;
            
            hilo_Tiempo = new Tiempo();
            hilo_Bus01 = new Bus_01();
            hilo_Bus02 = new Bus_02();
            hilo_Bus03 = new Bus_03();
            hilo_Bus04 = new Bus_04();
            hilo_Bus05 = new Bus_05();
            hilo_Bus06 = new Bus_06();
            hilo_Bus07 = new Bus_07();
            hilo_Bus08 = new Bus_08();
            hilo_Bus09 = new Bus_09();
            hilo_Bus10 = new Bus_10();
            
            //Colocación de las variabes "activo" de cada clase en true
            hilo_Tiempo.activo = true;
            hilo_Bus01.activo = true;
            hilo_Bus02.activo = true;
            hilo_Bus03.activo = true;
            hilo_Bus04.activo = true;
            hilo_Bus05.activo = true;
            hilo_Bus06.activo = true;
            hilo_Bus07.activo = true;
            hilo_Bus08.activo = true;
            hilo_Bus09.activo = true;
            hilo_Bus10.activo = true;
            
            //Orden para iniciar los hilos
            hilo_Tiempo.start();
            hilo_Bus01.start();
            hilo_Bus02.start();
            hilo_Bus03.start();
            hilo_Bus04.start();
            hilo_Bus05.start();
            hilo_Bus06.start();
            hilo_Bus07.start();
            hilo_Bus08.start();
            hilo_Bus09.start();
            hilo_Bus10.start();
        }
    }
});

//Boton de reset del sistema
btn_concluir.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            sistema_encendido = false;
            
            //Frenar el funcionamiento de los hilos
            hilo_Tiempo.stop();
            hilo_Bus01.activo = false;
            hilo_Bus02.activo = false;
            hilo_Bus03.activo = false;
            hilo_Bus04.activo = false;
            hilo_Bus05.activo = false;
            hilo_Bus06.activo = false;
            hilo_Bus07.activo = false;
            hilo_Bus08.activo = false;
            hilo_Bus09.activo = false;
            hilo_Bus10.activo = false;
        }
    }
});

//Botón para destacar el bus número 1
btn_bus01.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_01.contador_boton == 0){
                Bus_01.label_bus_destacado = true;
                Bus_01.contador_boton = 1;
            }
            else if (Bus_01.contador_boton == 1){
                Bus_01.label_bus_destacado = false;
                Bus_01.contador_boton = 0;
            }
        }    
    }
});

btn_bus02.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_02.contador_boton == 0){
                Bus_02.label_bus_destacado = true;
                Bus_02.contador_boton = 1;
            }
            else if (Bus_02.contador_boton == 1){
                Bus_02.label_bus_destacado = false;
                Bus_02.contador_boton = 0;
            }
        }    
    }
});

btn_bus03.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_03.contador_boton == 0){
                Bus_03.label_bus_destacado = true;
                Bus_03.contador_boton = 1;
            }
            else if (Bus_03.contador_boton == 1){
                Bus_03.label_bus_destacado = false;
                Bus_03.contador_boton = 0;
            }
        }    
    }
});

btn_bus04.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_04.contador_boton == 0){
                Bus_04.label_bus_destacado = true;
                Bus_04.contador_boton = 1;
            }
            else if (Bus_04.contador_boton == 1){
                Bus_04.label_bus_destacado = false;
                Bus_04.contador_boton = 0;
            }
        }    
    }
});

btn_bus05.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_05.contador_boton == 0){
                Bus_05.label_bus_destacado = true;
                Bus_05.contador_boton = 1;
            }
            else if (Bus_05.contador_boton == 1){
                Bus_05.label_bus_destacado = false;
                Bus_05.contador_boton = 0;
            }
        }    
    }
});

btn_bus06.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_06.contador_boton == 0){
                Bus_06.label_bus_destacado = true;
                Bus_06.contador_boton = 1;
            }
            else if (Bus_06.contador_boton == 1){
                Bus_06.label_bus_destacado = false;
                Bus_06.contador_boton = 0;
            }
        }    
    }
});

btn_bus07.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_07.contador_boton == 0){
                Bus_07.label_bus_destacado = true;
                Bus_07.contador_boton = 1;
            }
            else if (Bus_07.contador_boton == 1){
                Bus_07.label_bus_destacado = false;
                Bus_07.contador_boton = 0;
            }
        }    
    }
});

btn_bus08.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_08.contador_boton == 0){
                Bus_08.label_bus_destacado = true;
                Bus_08.contador_boton = 1;
            }
            else if (Bus_08.contador_boton == 1){
                Bus_08.label_bus_destacado = false;
                Bus_08.contador_boton = 0;
            }
        }    
    }
});

btn_bus09.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_09.contador_boton == 0){
                Bus_09.label_bus_destacado = true;
                Bus_09.contador_boton = 1;
            }
            else if (Bus_09.contador_boton == 1){
                Bus_09.label_bus_destacado = false;
                Bus_09.contador_boton = 0;
            }
        }    
    }
});

btn_bus10.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        if (sistema_encendido = true){
            if (Bus_10.contador_boton == 0){
                Bus_10.label_bus_destacado = true;
                Bus_10.contador_boton = 1;
            }
            else if (Bus_10.contador_boton == 1){
                Bus_10.label_bus_destacado = false;
                Bus_10.contador_boton = 0;
            }
        }    
    }
});


    }    
}
