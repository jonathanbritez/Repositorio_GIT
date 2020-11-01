/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacion.usuariocontra;

//importo unas de las librerias de java para trabajar con JOptionPane
import javax.swing.JOptionPane;

public class UserContra {
    
    public static void main(String arg[]){
     //Ingreso dos tipo de datos diferente de tipo arreglo
     int contra[] = new int[5];
     String Usuario[] = new String[5];
     
     
    //Abro un bucle for para cargar datos en el arreglo 
    for(int i=0; i<Usuario.length; i++){
     
        //empieso a cargar los datos dependiendo de la cantidad del arreglo que se halla puesto
          Usuario[i]=(JOptionPane.showInputDialog("Introduce su Nombre: "));
          contra[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu contraseña: "));
     }
    
    
    //imprimo primero el mensaje 
     //System.out.println("Usuarios registrado: ");
     
    // abro nuevamente otro ciclo for para recorrer los datos ingresados en el arreglo y mostrarlos
    // for(int i=0; i<Usuario.length;i++){
     
     //System.out.println(Usuario[i]+ "---" + contra[i]);
       
     //}
     
    //Nuevamente abro otro ciclo for para verificar si el usuario registrado existe o no 
     for(int i=0; i<1; i++){
       
        boolean error = false;
        int contador =0;
         
        String usuario = JOptionPane.showInputDialog("Introduce tu nombre:");
        int contraseña = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu contraseña: "));
     
        //inicio un condicional para verificar al usuario registrado
            if(usuario.equalsIgnoreCase(Usuario[i]) & contraseña == contra[i]){
                
                JOptionPane.showMessageDialog(null, "Puedes ingresar","USUARIO ENCONTRADO !!",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Puedes ingresar");
        
            }else{
        
                //abro el bucle while para volver a preguntarle al usuario que ingrese los datos asta que dee el correcto
                 while(error == false){
                     JOptionPane.showMessageDialog(null, "No puedes ingresar, Por favor vuelve a ingresar los datos ","ERROR AL INTENTAR ACCEDER",JOptionPane.ERROR_MESSAGE);
                                         
                     usuario = JOptionPane.showInputDialog("Introduce tu nombre:");
                     contraseña = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu contraseña: "));
                    
                    if(usuario.equalsIgnoreCase(Usuario[i]) & contraseña == contra[i]){
                        
                      JOptionPane.showMessageDialog(null, "Puedes ingresar","USUARIO ENCONTRADO !!",JOptionPane.INFORMATION_MESSAGE);  
                      System.out.println("Puedes ingresar");
                      break;
                    }
                    contador ++;
                }
                 
               //imprimo la cantidad de veces que intento acceder
               
               System.out.println("Has intentado acceder: " + (contador +1) + " veces.") ; 
           }
            
           
        }
     }
       
}
