import java.sql.*;
class CreateInsertRecord
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabasePrg","root","Bindu@1234");
Statement st=con.createStatement();
st.execute("create table MCAStudent(sid int, sname varchar(20), phno int)");
Statement ps=con.createStatement();
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(1, 'Sagar', 12345)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(2, 'Bharath', 23456)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(3, 'Jagan', 34567)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(4, 'Ajay', 45678)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(5, 'Rahul', 56789)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(6, 'vinay', 67890)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(7, 'venky', 78901)");
ps.executeUpdate("insert into MCAStudent(sid, sname, phno) values(8, 'chandu', 98765)");
System.out.println("Student table created successfully");
}
catch(SQLException e)
{
System.out.println("There is an exception");
}
}
}