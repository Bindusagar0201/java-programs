class Room
{
float length,width,height;
void volume()
{
float v=length*breadth*height;
System.out.println(volume);
}
}
class MainRoom
{
public static void main(String args[])
{
Room.r1=new Room();
r1.length = 10f;
r1.breadth = 8.66f;
r1.height = 12f;
r1.volume();
}
}