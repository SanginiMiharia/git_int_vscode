public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
import java.sql.*;  
    class OracleCon{  
    public static void main(String args[]){  
    try{  
    //step1 load the driver class  
    Class.forName("com.mysql.jdbc.Driver");  
          //step2 create  the connection object  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql:/localhost:3306/logindetails","route",);  
          //step3 create the statement object  
    Statement stmt=con.createStatement();  
          //step4 execute query  
    ResultSet rs=stmt.executeQuery("select * from emp");  
    
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
          //step5 close the connection object  
    con.close();  
          }catch(Exception e){ System.out.println(e);}  
          }  
    }
