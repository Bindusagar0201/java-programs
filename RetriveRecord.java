import java.sql.*;
class RetriveRecord
{
public static void main(String args[])
{
try
{
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Databaseprg","root","Bindu@1234");
PreparedStatement ps=con.prepareStatement("select * from MCAStudent");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
int id=rs.getInt("sid");
String name=rs.getString("sname");
int ph= rs.getInt("phno");
System.out.println(id+ "\t" +name+"\t"+ph);
}
}
catch(SQLException e)
{
System.out.println(e);
}
}
}