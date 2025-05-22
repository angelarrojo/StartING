package jdbc;

import java.sql.PreparedStatement;
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
            System.out.println("11 | INSERT | CREAR NUEVA CATEGORIA DE CUENTA WITH A PREPAREDSTATEMENT");
            System.out.println("2 | INSERT | CREAR NUEVA CUENTA");
            System.out.println("3 | SELECT | OBTENER TODOS LAS CUENTAS DE TARJETAS");
            System.out.println("4 | UPDATE | ACTUALIZAR NOMBRE DE CLIENTE");
            System.out.println("5 | DELETE | ELIMINAR UNA CUENTA POR CLIENTE Y ID DE CUENTA");
            System.out.println("6 | SELECT | OBTENER LISTA DE LOS CLIENTES");
            System.out.println("7 | SELECT | OBTENER LISTA DE LAS CATEGORIAS");
            System.out.println("8 | SELECT | OBTENER RELACION CLIENTES CON CATEGORIAS");

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

                case 11:
                    System.out.print("NOMBRE DE LA CATEGORIA: ");
                    String nombreCat = scan.next();

                    System.out.print("TIPO DE LA CATEGORIA: ");
                    String tipo = scan.next();

                    System.out.print("DESCRIPCION DE LA CATEGORIA: ");
                    String descripcion = scan.next();

                    String sqlSentence = "INSERT INTO CATEGORIAS (NOMBRE, TIPO, DESCRIPCION) VALUES (?, ?, ?)";
                    try (PreparedStatement preparedStatement = DatabaseUtils.connection.prepareStatement(sqlSentence)) {
                        preparedStatement.setString(1, nombreCat);
                        preparedStatement.setString(2, tipo);
                        preparedStatement.setString(3, descripcion);



                        preparedStatement.executeUpdate();
// System.out.println("Rows affected: " + rowsAffected);

//                        preparedStatement.execute();
//                        System.out.println("Inserted row");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
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

                case 6:
                    sqlInstruction = String.format("SELECT * FROM CUENTAS");
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    //NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID
                    result = DatabaseUtils.statement.executeQuery(sqlInstruction);
                    while (result.next()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ID: ").append(result.getString("ID")).append("\n")
                                .append("NOMBRE: ").append(result.getString("NOMBRE")).append("\n")
                                .append("SALDO: ").append(result.getString("SALDO")).append("\n")
                                .append("FECHA_APERTURA: ").append(result.getString("FECHA_APERTURA")).append("\n")
                                .append("CATEGORIA_ID: ").append(result.getString("CATEGORIA_ID")).append("\n");

                        System.out.println(sb.toString());
                    }

                    System.out.println(DELIMITER);
                    break;
    
                case 7:
                    sqlInstruction = String.format("SELECT * FROM CATEGORIAS");
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    //NOMBRE, TIPO, DESCRIPCION
                    result = DatabaseUtils.statement.executeQuery(sqlInstruction);
                    while (result.next()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ID: ").append(result.getString("ID")).append("\n")
                                .append("NOMBRE: ").append(result.getString("NOMBRE")).append("\n")
                                .append("TIPO: ").append(result.getString("TIPO")).append("\n")
                                .append("DESCRIPTION: ").append(result.getString("DESCRIPCION")).append("\n");

                        System.out.println(sb.toString());
                    }

                    System.out.println(DELIMITER);
                    break;   

                case 8:
                    sqlInstruction = String.format("SELECT CU.ID AS CUENTA_ID, CU.NOMBRE AS CUENTA_NOMBRE, CU.SALDO, CU.FECHA_APERTURA, CU.CATEGORIA_ID, CAT.ID AS CATEGORIA_ID, CAT.NOMBRE AS CATEGORIA_NOMBRE, CAT.TIPO, CAT.DESCRIPCION " +
                            "FROM CUENTAS CU " +
                            "JOIN CATEGORIAS CAT " +
                            "ON CAT.ID = CU.CATEGORIA_ID");
                    System.out.println("SQL INSTRUCTION: " + sqlInstruction);

                    //NOMBRE, SALDO, FECHA_APERTURA, CATEGORIA_ID
                    //NOMBRE, TIPO, DESCRIPCION
                    result = DatabaseUtils.statement.executeQuery(sqlInstruction);
                    while (result.next()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CUENTA ID: ").append(result.getString("CUENTA_ID")).append("\n")
                                .append("CUENTA NOMBRE: ").append(result.getString("CUENTA_NOMBRE")).append("\n")
                                .append("SALDO: ").append(result.getString("SALDO")).append("\n")
                                .append("FECHA APERTURA: ").append(result.getString("FECHA_APERTURA")).append("\n")
                                .append("CATEGORIA ID: ").append(result.getString("CATEGORIA_ID")).append("\n")
                                .append("CATEGORIA NOMBRE: ").append(result.getString("CATEGORIA_NOMBRE")).append("\n")
                                .append("TIPO: ").append(result.getString("TIPO")).append("\n")
                                .append("DESCRIPCION: ").append(result.getString("DESCRIPCION")).append("\n");

                        System.out.println(sb.toString());
                    }

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