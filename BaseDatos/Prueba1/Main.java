package DataBase.Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        ConexionBaseDeDatos conect = new ConexionBaseDeDatos();

        //OBTENER LOS DATOS DE LA BASE DE DATOS
        //conect.obtenerEstudiantes();
        //conect.obtenerEstudiantesNombres();
        conect.obtenerEstudiantesApellidos();

        //OBTENER LOS DATOS DE ACUERDO AL DATO BUSCADO
        //conect.obtenerEstudiantesPorApellido("Garcia");
        //conect.obtenerEstudiantesPorNombre("Breiner");
    }
}