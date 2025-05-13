package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

    public static Connection connection;
    public static Statement statement;

    public static void connect() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:h2:mem://localhost/~/test", "sa", "");
        statement = connection.createStatement();

        String crearTablaCategorias = "CREATE TABLE IF NOT EXISTS CATEGORIAS (ID INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(30),TIPO VARCHAR(30),DESCRIPCION VARCHAR(30))";
        String crearTablaCuentas = "CREATE TABLE IF NOT EXISTS CUENTAS (ID INT PRIMARY KEY AUTO_INCREMENT,NOMBRE VARCHAR(30),SALDO DECIMAL,FECHA_APERTURA DATE, CATEGORIA_ID INT, FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIAS(ID))";

        statement.execute(crearTablaCategorias);
        System.out.println("CREADO TABLA CATEGORIA");
        statement.execute(crearTablaCuentas);
        System.out.println("CREADO TABLA CUENTAS");

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

    }

        statement.execute(sqlInserts);
        System.out.println("INSERTS CREADOS EN  TABLA CUENTAS Y TABLA CATEGORIAS");
}
