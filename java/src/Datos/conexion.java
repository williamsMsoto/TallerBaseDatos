
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private static Connection conn=null;
    private static String login="system";
    private static String clave="130720";
    private static String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if(conn!=null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion es erronea");
            }
        } catch (ClassNotFoundException | SQLException  e) {
            JOptionPane.showMessageDialog(null,"Conexion Erooneas "+e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar"+e.getMessage());
        }
    }
    
    public static void main(String[] args){
        conexion c= new conexion();
        c.getConnection();
    }
}
