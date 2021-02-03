class Flight1
{
static String[] name
={"KingFisher","Deccan","SpiceJet","AirAsia"};
static int noOfSeats[]={200,199,198,210};
public static void main(String a[])
{

for(int i=0; i<4; i++)
{
System.out.println(name[i]);
}
for(int i=0; i<4; i++)
{
System.out.println("no of seats="+noOfSeats[i]);
}
}
}