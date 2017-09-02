package juego.matematicas;
import javax.swing.JOptionPane;
/**
 *
 * @author Missael Hernàndez Rosado
 */
class avanzado {
public void suma() {
int con=0,acierto=0,error=0;
int almacenr []=new int[6];
int almacenr1 []=new int[6];
while(con<6){   
int n1=(int)(Math.random()*1000+1);
int n2=(int)(Math.random()*1000+1);
int rverdadera=n1+n2;
int respuesta=Integer.parseInt(JOptionPane.showInputDialog("La suma de: "+n1+" + "+n2+"\nEs igual a: "));
almacenr[con]=rverdadera;
almacenr1[con]=respuesta;
if (respuesta==rverdadera){
    acierto++;
}else error++;
con ++;
}
System.out.println("RESPUESTAS MAQUINA     ||     TUS RESPUESTAS");
for (int c=0; c<almacenr.length; c++){
System.out.println("       "+almacenr[c]+"                             "+almacenr1[c]);
}
System.out.println("Aciertos: "+acierto);
System.out.println("Errores: "+error);
if(acierto==5){
 System.out.println("EN HORA BUENA ESTAS LISTO PARA EL PROXIMO NIVEL");   
}else System.out.println("DEBES MEJORAR");
}

public   void resta() {
int con=0,acierto=0,error=0;
int almacenr []=new int[6];
int almacenr1 []=new int[6];
while(con<6){   
int n1=(int)(Math.random()*1000+1);
int n2=(int)(Math.random()*1000+1);
int rverdadera=n1-n2;
int respuesta=Integer.parseInt(JOptionPane.showInputDialog("La resta de: "+n1+" - "+n2+"\nEs igual a: "));
almacenr[con]=rverdadera;
almacenr1[con]=respuesta;
if (respuesta==rverdadera){
    acierto++;
}else error++;
con ++;
}
System.out.println("RESPUESTAS MAQUINA     ||     TUS RESPUESTAS");
for (int c=0; c<almacenr.length; c++){
System.out.println("       "+almacenr[c]+"                             "+almacenr1[c]);
}
System.out.println("Aciertos: "+acierto);
System.out.println("Errores: "+error);
if(acierto==5){
 System.out.println("EN HORA BUENA ESTAS LISTO PARA EL PROXIMO NIVEL");   
}else System.out.println("DEBES MEJORAR");
}      

public void multiplicacion() {
int con=0,acierto=0,error=0;
int almacenr []=new int[6];
int almacenr1 []=new int[6];
while(con<6){   

int n1=(int)(Math.random()*1000+1);
int n2=(int)(Math.random()*1000+1);
int rverdadera=n1*n2;
int respuesta=Integer.parseInt(JOptionPane.showInputDialog("La multiplicacion de: "+n1+" * "+n2+"\nEs igual a: "));
almacenr[con]=rverdadera;
almacenr1[con]=respuesta;
if (respuesta==rverdadera){
    acierto++;
}else error++;
con ++;
}
System.out.println("RESPUESTAS MAQUINA     ||     TUS RESPUESTAS");
for (int c=0; c<almacenr.length; c++){
System.out.println("       "+almacenr[c]+"                             "+almacenr1[c]);
}
System.out.println("Aciertos: "+acierto);
System.out.println("Errores: "+error);
if(acierto==5){
 System.out.println("EN HORA BUENA ESTAS LISTO PARA EL PROXIMO NIVEL");   
}else System.out.println("DEBES MEJORAR");
}

public void division() {
int con=0,acierto=0,error=0;
int almacenr []=new int[6];
int almacenr1 []=new int[6];
while(con<6){   

int n1=(int)(Math.random()*1000+1);
int n2=(int)(Math.random()*1000+1);
int rverdadera=n1/n2;
int respuesta=Integer.parseInt(JOptionPane.showInputDialog("La division de: "+n1+" / "+n2+"\nEs igual a: "));
almacenr[con]=rverdadera;
almacenr1[con]=respuesta;
if (respuesta==rverdadera){
    acierto++;
}else error++;
con ++;
}
System.out.println("RESPUESTAS MAQUINA     ||     TUS RESPUESTAS");
for (int c=0; c<almacenr.length; c++){
System.out.println("       "+almacenr[c]+"                             "+almacenr1[c]);
}
System.out.println("Aciertos: "+acierto);
System.out.println("Errores: "+error);      
if(acierto==5){
 System.out.println("EN HORA BUENA ESTAS LISTO PARA EL PROXIMO NIVEL");   
}else System.out.println("DEBES MEJORAR");
}

}
