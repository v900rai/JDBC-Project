package in.sp.test;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args)  throws  Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.println("Driver class load Successfully");
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root" , "root");
       /// System.out.println("Enter the number ");
       // System.out.println("Successfully execute");
        PreparedStatement ps=  con.prepareStatement("insert into register  values( ' vishal rai','vishalrai@10797@gmail.com', 'vishal123', 'male','sant')");
         int num= ps.executeUpdate();
       if(num>0){
           System.out.println("successfully");
       }
       else{
           System.out.println("failed");
       }
    }
}
