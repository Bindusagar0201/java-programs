import java.sql.*;
class InsertRecord
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Databaseprg" ,"root", "Bindu@1234");
PreparedStatement ps=con.prepareStatement("insert into MCAStudent(sid, sname, phno) values(?,?,?)");
ps.setInt(1, 14);
ps.setInt(1,16);
ps.setInt(1, 17);
ps.setString(2,"lav");
ps.setString(2,"pav");
ps.setString(2,"kav");
ps.setInt(1, 1456);
ps.setInt(1,1678);
ps.setInt(1, 1788);
ps.execute();
//ps.execute("insert into MCAStudent(sid, sname, phno) values(2, 'jagan', 68769)");
//ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(3, 'Bharath', 98765)");
System.out.println("Record inserted successful");
}
catch(Exception e)
{
System.out.println("There is an exception");
}
}
}
