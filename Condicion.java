import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
String name;
int mesa=8;
int mesu;
int anoa=2024;
int anou;
int diaa=23;
int diau;
int edad1;  
int edad2;
  
System.out.println("escriba su nombre");
    name = leer.nextInt();
   

 System.out.println(name+"Ingrese su año de nacimiento");
    anou = leer.nextInt();
    System.out.println(name+"Ingrese el numero de su mes de nacimiento");
    mesu = leer.nextInt();

 if(mesu<=mesa)
    {
      System.out.println(name+ "su edad es:" );
      System.out.println(edad1=anoa-anou);
    }

    else
    {
     System.out.println(name+ "su edad es:" );
      System.out.println(edad2=edad1-1);
    }

}
}



//nombre. año y mes de nacimiento. calcular edad y luego dia de nacimiento. dar signo//