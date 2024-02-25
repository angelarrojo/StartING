package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMain {

    private static String DELIMITER = "#########################\n";

    public static void main(String[] args) throws SQLException {

        //Conectando la aplicación a la base de datos
        DatabaseUtils.connect();

        System.out.println(DELIMITER);
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");

        while (true) {
            System.out.println("1 | INSERT | CREAR NUEVA CATEGORIA DE CUENTA");
            System.out.println("2 | INSERT | CREAR NUEVA CUENTA");
            System.out.println("3 | SELECT | OBTENER TODOS LAS CUENTAS DE TARJETAS");
            System.out.println("4 | UPDATE | ACTUALIZAR NOMBRE DE CLIENTE");
            System.out.println("5 | DELETE | ELIMINAR UNA CUENTA POR CLIENTE Y ID DE CUENTA");
            System.out.print("\nELIGA UNA OPCIÓN: ");

            String sqlInstruction;
            switch (scan.nextInt()) {
                case 1:
                    System.out.print("NOMBRE DE LA CATEGORIA: ");
                    String nombreCategoria = scan.next();

                    System.out.print("TIPO DE LA CATEGORIA: ");
                    String tipoCategoria = scan.next();

                    System.out.print("DESCRIPCION DE LA CATEGORIA: ");
                    String descripcionCategoria = scan.next();

                    sqlInstruction = String.format("INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES('%s','%s','%s')", nombreCategoria, tipoCategoria, descripcionCategoria);
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    DatabaseUtils.statement.execute(sqlInstruction);
                    System.out.println(DELIMITER);
                    break;

                case 2:
                    System.out.print("NOMBRE DEL TITULAR DE LA CUENTA: ");
                    String titularCuenta = scan.next();

                    System.out.print("SALDO INCIIAL DE LA CUENTA: ");
                    String saldoCuenta = scan.next();

                    System.out.print("FECHA APERTURA DE LA CUENTA (YYYY-MM-DD): ");
                    String aperturaCuenta = scan.next();

                    System.out.print("ID CATEGORIA DE LA CUENTA: ");
                    String categoriaCuenta = scan.next();

                    sqlInstruction = String.format("INSERT INTO CUENTAS (NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID) VALUES('%s','%s','%s','%s')", titularCuenta, saldoCuenta, aperturaCuenta, categoriaCuenta);
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    DatabaseUtils.statement.execute(sqlInstruction);
                    System.out.println(DELIMITER);
                    break;

                case 3:
                    System.out.print("PARTE DE NOMBRE DE TITULAR PARA BUSCAR CUENTAS: ");
                    String name = scan.next();
                    sqlInstruction = "SELECT CU.ID, CU.NOMBRE, CU.SALDO, CU.FECHA_APERTURA, CU.CATEGORIA_ID, CAT.NOMBRE, CAT.TIPO, CAT.DESCRIPCION FROM CUENTAS CU LEFT JOIN CATEGORIAS CAT ON CAT.ID = CU.CATEGORIA_ID WHERE UPPER(CU.NOMBRE) LIKE '%" + name.toUpperCase() + "%'";
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);
                    var result = DatabaseUtils.statement.executeQuery(sqlInstruction);
                    while (result.next()) {
                        System.out.println(String.format("ID: %s, NOMBRE: %s, SALDO: %s, FECHA_APERTURA: %s, CATEGORIA_ID: %s, CATEGORIA: %s, TIPO: %s, DESCRIPCION: %s", result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getString(8)));
                    }
                    System.out.println(DELIMITER);
                    break;

                case 4:
                    System.out.print("NOMBRE DE TITULAR ACTUAL: ");
                    String nombre = scan.next();

                    System.out.print("NOMBRE DE TITULAR NUEVO: ");
                    String nuevoNombre = scan.next();

                    sqlInstruction = String.format("UPDATE CUENTAS SET NOMBRE='%s' WHERE UPPER(NOMBRE) = UPPER('%s')", nuevoNombre, nombre);
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    DatabaseUtils.statement.execute(sqlInstruction);
                    System.out.println(DELIMITER);
                    break;

                case 5:
                    System.out.print("NOMBRE DE TITULAR: ");
                    String nombreTitular = scan.next();

                    System.out.print("ID DE CUENTA: ");
                    String idCuenta = scan.next();

                    sqlInstruction = String.format("DELETE FROM CUENTAS WHERE NOMBRE = '%s' AND ID = %s", nombreTitular, idCuenta);
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    DatabaseUtils.statement.execute(sqlInstruction);
                    System.out.println(DELIMITER);
                    break;

                default:
                    System.out.println("INVALID OPTION");
                    System.out.println(DELIMITER);
                    break;

            }
        }
    }
}