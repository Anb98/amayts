
package exaprac2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**Nombre de la clase: AbdielMartinez
 * fecha: 18-04-2018
 * version: 1.0
 * copyright:ITCA-EPADE
 * @author Abdiel Martinez
 */
public class AbdielMartinez {

    public static void main(String[] args) {
        
        DecimalFormat df=new DecimalFormat("###.##");
        int opcion=0;
        String[] nombre= new String[1000];
        Double[] nota1= new Double[1000];
        Double[] nota2= new Double[1000];
        Double[] nota3= new Double[1000];
        Double[] promedio= new Double[1000];
        int[] edad= new int[1000];
        int contadorRegistros=0;
        double notaMenor=0;
         
        while(opcion!=3){
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1 -Agregar Notas\n2 -Calcular Promedio\n3 -Salir","Seleccione una opcion",3));
            
            switch(opcion){
                case 1:
                    //AGREGAR NOTAS
                    double suma=0;
                    
                    nombre[contadorRegistros]=JOptionPane.showInputDialog(null,"Nombre del estudiante","Datos del estudiante",3);
                    edad[contadorRegistros]=Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del estudiante","Datos del estudiante",3));
                    nota1[contadorRegistros]=Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1 del estudiante: "+nombre[contadorRegistros],"Datos del estudiante",3));
                    nota2[contadorRegistros]=Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 2 del estudiante: "+nombre[contadorRegistros],"Datos del estudiante",3));
                    nota3[contadorRegistros]=Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 3 del estudiante: "+nombre[contadorRegistros],"Datos del estudiante",3));
                    JOptionPane.showConfirmDialog(null,"Estudiante: "+nombre[contadorRegistros]+" Registrado Exitosamente","Mensaje",2);
                    
                    if(contadorRegistros==0){
                        notaMenor=nota1[contadorRegistros];
                    }
                    
                    if(notaMenor>nota1[contadorRegistros]){
                        notaMenor=nota1[contadorRegistros];
                    }
                    if(notaMenor>nota2[contadorRegistros]){
                        notaMenor=nota2[contadorRegistros];
                    }
                    if(notaMenor>nota3[contadorRegistros]){
                        notaMenor=nota3[contadorRegistros];
                    }
                    
                    suma=nota1[contadorRegistros]+nota2[contadorRegistros]+nota3[contadorRegistros];
                    promedio[contadorRegistros]=suma/3;
                    
                    contadorRegistros++;
                    break;
                case 2:
                    //CALCULAR PROMEDIO
                    String titulo="Nota menor: "+notaMenor+"\nNombre  Nota 1  Nota 2  Nota 3  Promedio  Estado\n";
                    String mensaje="";
                    int cantidadRe=0,cantidadAp=0;
                    for(int i=0;i<contadorRegistros;i++){
                        mensaje+=nombre[i]+"       "+nota1[i]+"       "+nota2[i]+"         "+nota3[i]+"          "+df.format(promedio[i])+"           ";
                        mensaje+=(promedio[i]>=7)?"Aprobado":"Reprobado";
                        if(promedio[i]>=7){
                            cantidadAp++;
                        }else{
                            cantidadRe++;
                        }
                        mensaje+="\n";
                    }
                    JOptionPane.showConfirmDialog(null,titulo+mensaje+"Cantidad de aprobados: "+cantidadAp+"\nCantidad Reprobados: "+cantidadRe,"Estadistica",2);
                    break;
            }
        }
        
    }
    
}
