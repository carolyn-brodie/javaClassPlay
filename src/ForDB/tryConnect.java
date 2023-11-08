package ForDB;
import java.sql.*;

public class tryConnect  {

    public static void main(String[] args) {
//        String str=System.getProperty("java.version");
//        //prints Java version
//        System.out.println("Java Version is: "+str);
        final String connectString = "jdbc:sqlserver://CVR1841LAP-21//SQLEXPRESS; database=TSQLV6; integratedSecurity=true";
        try {
            final Connection connection =
                    DriverManager.getConnection(connectString);
            final Statement statement = connection.createStatement();

            final String custQuery = "SELECT custid, companyname FROM Sales.Customers;";
            final ResultSet result = statement.executeQuery(custQuery);

            while (result.next()) {
                final int id = result.getInt("custid");
                System.out.print(id + " ");
                final String companyName = result.getString("companyname");
                System.out.println(companyName);
            }

            statement.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("error " + e);
        }
    }



}
