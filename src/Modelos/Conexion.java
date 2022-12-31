package Modelos;

import java.sql.Connection;

public class Conexion {
    
    private final String bd = "sistema_ventas";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306" + bd;
    private Connection con = null;
   
}
