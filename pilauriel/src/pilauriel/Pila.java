package pilauriel;
import java.util.Scanner;
public class Pila 
{
private int A,L;
private  final String[] Pila;
public Pila(int X)

{
 X=27;
 L=X;
 Pila=new String[L];
 A=0;
}

private void Agregar(String n)

{
 if(A<L){
 String[]ab={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
 int RAN=(int)Math.round(Math.random()*27);
 String Let=(ab[RAN]);
 Pila[A]=Let;
 A++;
 System.out.println("AGREGADO");}
    else{
    System.out.println("NO HAY ESPACIO");}
}

private void Eliminar()
        
{
 if(A>0){
 A--;
 System.out.println("BORRADO");}
    else{
    System.out.println("NO BORRADO");}
}

 private void Mostrar()

{
 if(!Vacia()){
  for(int i=(A-1);i>=0;i--){
  System.out.println(Pila[i]);}
 }
 else
 System.out.println("VACIO");
 }
 
 private boolean Vacia()
         
 {
 if (Pila==null){
 System.out.println("PILA VACIA");
 return true;}
 else{
 System.out.println("AGREGE MAS DATOS");
 return false;}
 }
 
private boolean Buscar(String dato)
        
{
boolean encontrado=false;
if(!Vacia()){
for(int i=(A-1);i>=0;i--){
if(Pila[i].equals(dato))encontrado=true;}
}
else System.out.println("NO EXISTE");
return encontrado;
}

  public static void main (String[] args) 
  {
    int t,op;
    String dat;
    Scanner teclado=new Scanner(System.in);
    System.out.println("PILA ABECEDARIO");
    System.out.println("PRESIONA LA TECLA 1");
    t=teclado.nextInt();
    Pila PILA=new Pila(t);
    do{
        System.out.println("1.-AGREGAR");
        System.out.println("2.-BORRAR DATO");
        System.out.println("3.-MOSTRAR DATOS");
        System.out.println("4.-BUSCAR DATO");
        System.out.println("5.-SALIR");
        System.out.println("ESCOJA LO QUE DESEA HACER");
        op=teclado.nextInt();
        switch(op)
        {
            case 1:
                System.out.println("SE AGREGA EL DATO");
                String[]ab={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                int RAN=(int)Math.round(Math.random()*27);
                PILA.Agregar(ab[RAN]);
                break;
            case 2:
                PILA.Eliminar();
                break;
                
            case 3:
                PILA.Mostrar();
                break;
                
            case 4:
                System.out.println("INGRESE LA LETRA A BUSCAR: ");
                dat=teclado.next();
                if(PILA.Buscar(dat))
                System.out.println("DATO ENCONTRADO");
                else System.out.println("DATO NO ENCONTRADO");
                break;
        }
      }
      while(op!=5);
   }
}