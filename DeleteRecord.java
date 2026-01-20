import java.sql.*;
class DeleteRecord
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Databaseprg","root","Bindu@1234");
Statement st=con.createStatement();
st.executeUpdate("delete from MCAStudent where sid=7");
st.executeUpdate("delete from MCAStudent where sid=8");
System.out.println("data deleted successfully");
}
catch(SQLException e)
{
System.out.println(e);
}
}
}