import java.sql.*;
class UpdateRecord
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Databaseprg","root","Bindu@1234");
Statement st=con.createStatement();
st.executeUpdate("update MCAStudent set sname='sai' where sid=8");
System.out.println("data updated successfully");
}
catch(SQLException e)
{
System.out.println(e);
}
}
}