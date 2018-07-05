class Tem
{
int x =10;
void show(Tem this,int x)
{System.out.println(this);
System.out.println(this+"show");
System.out.println(this.x);
System.out.println(x);
}
public static void main(String[] args)
{Tem t1 = new Tem();

System.out.println(t1 + "main");
t1.show(16);

}


}