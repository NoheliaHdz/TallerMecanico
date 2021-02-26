import sun.security.acl.AclEntryImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        // creamos al cliente
        Cliente cliente1 = new Cliente();
        cliente1.nombre ="Carolina";
        cliente1.apellido = "Jacome";
        cliente1.direccion = "Colonia Cerro Grande";
        cliente1.genero = "Femenino";
        cliente1.id = "0801198727662";
        cliente1.telefono = "35652672";

        //creamos el auto
        Auto auto1 = new Auto();
        auto1.cliente = cliente1;
        auto1.color = "Blanco";
        auto1.marca = "Nissan";
        auto1.modelo = "Turismo";
        auto1.placa = "WCL 9510";
        auto1.kilometraje = 4253656;

        //Creamos al mecanico
        Mecanico mecanico1= new Mecanico();
        mecanico1.nombre = "Lucas";
        mecanico1.apellido = "Lazo";
        mecanico1.telefono = "83276736";

        //asiganamoos el auto al dueño
        cliente1.duenio.add(auto1);

        //asignamos el cliente al mecanico
        //mecanico1.revision.add(cliente1);

        //imprimimos la informacion del cliente
        System.out.println("Nombre y Apellido: "+ cliente1.nombre + " "+ cliente1.apellido);
        System.out.println("ID: "+ cliente1.id);
        System.out.println("Genero: " + cliente1.genero);
        System.out.println("Numero y Direccion: " +cliente1.telefono + "      " + cliente1.direccion );
        System.out.println();

        //imprimimos la informacion del auto
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Marca: "+ auto1.marca);
        System.out.println("Color: "+ auto1.color);
        System.out.println("Placa: " + auto1.placa);
        System.out.println("Kilometraje: " + auto1.kilometraje);
        System.out.println("Dueño: " + auto1.cliente);
        System.out.println();
        //imprimimos la informacion del mecanico;
        System.out.println("Nombre y Apellido del Mecanico: " + mecanico1.nombre + " "+ mecanico1.apellido);
        System.out.println("Telefono: " + mecanico1.telefono);

        //Imprimimos el saludo
        System.out.println(mecanico1.bienvenida());


    }
}
class Cliente{

    String cliente;
    String nombre;
    String apellido;
    String id;
    String telefono;
    String direccion;
    String genero;
    List<Auto> duenio;

    public Cliente(){
        this.duenio = new ArrayList<Auto>();
    }
}

class Auto{

    Cliente cliente;
    String modelo;
    String marca;
    String placa;
    long kilometraje;
    String color;



}

class Mecanico{

    String nombre;
    String apellido;
    String telefono;
    List<Cliente> revision;


    public String bienvenida(){
        String mibienvenida = new String();
        mibienvenida ="Te damos la bienvenida a nuestro taller mi nombre es: " +  this.nombre + " sere quien revise su auto";
        return mibienvenida;
    }

}
