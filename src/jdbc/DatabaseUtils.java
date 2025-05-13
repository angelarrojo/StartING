package jdbc;


import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

    public static Connection connection;
    public static Statement statement;

    public static void connect() throws SQLException {

        // Obtenemos la conexión a la bbdd en memoria..
        Connection connection = DriverManager.getConnection("jdbc:h2:mem://localhost/~/test", "sa", "");
        // Preaparamos el objeto statement para ejecutar SQL plano
        statement = connection.createStatement();

        //Metodo que levanta un servidor web H2.
        h2ConsoleLauncher();

        // Preparamos dos variables de tipo STRING con el CREATE de SQL para crear las tablas CATEGORIAS y CUENTAS
        String crearTablaCategorias = "CREATE TABLE IF NOT EXISTS CATEGORIAS (ID INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(30),TIPO VARCHAR(30),DESCRIPCION VARCHAR(30))";
        String crearTablaCuentas = "CREATE TABLE IF NOT EXISTS CUENTAS (ID INT PRIMARY KEY AUTO_INCREMENT,NOMBRE VARCHAR(30),SALDO DECIMAL,FECHA_APERTURA DATE, CATEGORIA_ID INT, FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIAS(ID))";

        //Ejecutamos el objeto statement para la tabla categorias
        statement.execute(crearTablaCategorias);
        System.out.println("CREADO TABLA CATEGORIA");

        //Ejecutamos el objeto statement para la tabla cuentas
        statement.execute(crearTablaCuentas);
        System.out.println("CREADO TABLA CUENTAS");

        // Inicializamos una variable string con todos los INSERTS que queremos hacer en las tablas.
        String sqlInserts =
                """
                                INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES('Ahorro', 'Débito', 'Cuenta Naranja');
                                INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES('Hipoteca', 'Crédito', 'Hipoteca Fija 2%');
                                INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES('Tarjeta', 'Débito', 'Tarjeta Visa');
                                INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES('Nómina', 'Débito', 'Cuenta no cuenta');
                                
                                INSERT INTO CUENTAS (NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID) VALUES('Santi', 8, '2021-10-22', 1);
                                INSERT INTO CUENTAS (NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID) VALUES('Frank', 8000, '1980-01-01', 2);
                                INSERT INTO CUENTAS (NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID) VALUES('Javier', 50, '2018-05-02', 3);
                                INSERT INTO CUENTAS (NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID) VALUES('Gonzalo', 26, '2017-10-16',4);                 
                        """;

        //Ejecutamos el objeto statement para realizar los inserts
        statement.execute(sqlInserts);
        System.out.println("INSERTS CREADOS EN  TABLA CUENTAS Y TABLA CATEGORIAS");

    }

    private static void h2ConsoleLauncher(){
        // Iniciar el servidor web de H2
        Server webServer = null;
        try {
            webServer = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
            webServer.start();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("H2 Web Console started at: http://localhost:8082");
    }


}
