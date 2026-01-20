import java.sql.*;
class CreateRecord
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabasePrg","root","Bindu@1234");
Statement st=con.createStatement();
st.execute("create table MCAStudent(sid int, sname varchar(20), phno int)");
System.out.println("Student table created successfully");
}
catch(SQLException e)
{
System.out.println("Their is an exception");
}
}
}