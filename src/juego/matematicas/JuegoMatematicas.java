package juego.matematicas;
import javax.swing.JOptionPane;
/**
 *
 * @author Missael Hernández Rosado
 */
public class JuegoMatematicas {
public static void main(String[] args) {
basico obj1=new basico();
medio obj2=new medio();
avanzado obj3=new avanzado();
String res;

do{
int op=Integer.parseInt(JOptionPane.showInputDialog("JUEGA CON TU MENTE \n1.- Basico \n2.- Medio \n3.- Avanzado \n4.- Salir"));

    switch(op){
        case 1:
        int op1=Integer.parseInt(JOptionPane.showInputDialog("NIVEL BASICO \n1.- Suma \n2.- Resta \n3.- Multiplicacion \n4.- Division"));
        System.out.println("              =======NIVEL BASICO======");
        switch(op1){
        case 1:
        obj1.suma();
        break;
        case 2:
        obj1.resta();
        break;
        case 3:
        obj1.multiplicacion();
        break; 
        case 4:
        obj1.division();
        break;
        }
        break;      
        case 2:
        int op2=Integer.parseInt(JOptionPane.showInputDialog("NIVEL MEDIO \n1.- Suma \n2.- Resta \n3.- Multiplicacion \n4.- Division"));
        System.out.println("            =======NIVEL MEDIO======");
        switch(op2){
        case 1:
        obj2.suma();
        break;
        case 2:
        obj2.resta();
        break;
        case 3:
        obj2.multiplicacion();
        break; 
        case 4:
        obj2.division();
        break;
        }
        break;        
        case 3:
        System.out.println("              =======NIVEL AVANZADO======");
        int op3=Integer.parseInt(JOptionPane.showInputDialog("NIVEL AVANZADO \n1.- Suma \n2.- Resta \n3.- Multiplicacion \n4.- Division"));
        switch(op3){
        case 1:
        obj3.suma();
        break;
        case 2:
        obj3.resta();
        break;
        case 3:
        obj3.multiplicacion();
        break; 
        case 4:
        obj3.division();
        break;
        }
        break;
        
        case 4:
        System.out.println("BYE BYE");
        break;
    
}
res=JOptionPane.showInputDialog("¿Deseas seguir jugando? si || no");
}while(res.equals("si"));

}}



