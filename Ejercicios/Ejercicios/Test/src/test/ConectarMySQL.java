package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarMySQL {

    public static void main(String[] args) {

        testMySQLDriver();

        try {

            String url = "jdbc:mysql://localhost:3306/nominaempleados";
            String username = "admin";
            String password = "123456";

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM empleado");

            while (rs.next()) {

                String id_Empleado = rs.getString("id_Empleado");
                String pmr_Nombre = rs.getString("pmr_Nombre");
                String sgd_Nombre = rs.getString("sgd_Nombre");
                String pmr_Apellido = rs.getString("pmr_apellido");
                String genero = rs.getString("genero");
                Date fecha_Nacimiento = rs.getDate("fecha_nacimiento");
                Double salario = rs.getDouble("salario");
                Double numero_hijos = rs.getDouble("numero_hijos");
                Date inicioContrato = rs.getDate("inicioContrato");
                Date finContrato = rs.getDate("finContrato");
                String cod_empleado = rs.getString("cod_empleado");

                System.out.println(String.format("%d, %s %s, %s", id_Empleado, pmr_Nombre, sgd_Nombre,pmr_Apellido,genero, fecha_Nacimiento,salario,numero_hijos));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static void testMySQLDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar MySQL JDBC Driver");
        }
    }

}
