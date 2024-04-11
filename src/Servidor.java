
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//  @author Nicolas Beisswenger

public class Servidor{
    
    // Conexión con el usuario por medio del socket 8000
    private ServerSocket conexion;
    private Socket usuario;
    private ObjectOutputStream Dato_Saliente1;

    public Servidor() {
        try {
            conexion = new ServerSocket(7000);
            realizarConexion();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    // Declaración para recibir datos desde el servidor
    public void realizarConexion() {
        try {
            usuario = conexion.accept();
            System.out.println("Servidor Listo");
            Dato_Saliente1 = new ObjectOutputStream(usuario.getOutputStream());
        } catch (IOException error_conexion) {
            System.out.println(error_conexion);
        }
    }

    // Método encargado de almacenar la información entrante
    public void enviarRespuesta(final String dato) {
        try {
            Dato_Saliente1.writeUTF(dato);
            Dato_Saliente1.flush();
        } catch (IOException error_envio) {
            System.out.println(error_envio);
        }
    }


    /*public void recibirDatos() {
        try {
            String info = Dato_Entrante1.readUTF();
            System.out.println(info);
            enviarRespuesta("Hola servidor vio tu mensaje");
        } catch (IOException error) {
            System.out.println(error);
        }
    }*/

}

