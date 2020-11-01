/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.operacionesconfunciones;
//importo la libreria 
import javax.swing.JOptionPane;
public class Operaciones {
    
    /**
     * @param args the command line arguments
     */
 //declaro una variable publica para usarlo en una o varias funciones seria como una variable global
 public static String yaElegida = "";
 
    public static void main(String args[]) {
        //declaro el tipo de dato y lo asigno a una variable 
        int num1=0,num2=0;
        boolean pregunta = true;
        int contador = 0;
      
       
     
       //llamo a la funcion de la opcion elegida si es suma o resta o etc... 
       OpcionElegida();
       
       //pido al usuario que ingrese los numeros
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
       //llamo a la funcion para que realice la operacion de la OpcionElegida 
       OpcionYaElegida(num1,num2);
       
       
       //asigno el bucle while para que me haga la repeticion para preguntar al usiario si es que quiere realizar otra operacion 
        while(pregunta == true){   
            int res = JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?","Selecciona una opcion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
                if(JOptionPane.OK_OPTION == res){
                    OpcionElegida();
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    OpcionYaElegida(num1,num2);
            
                }else{
                    
                    //si es que no quiere realizar otra operacion sale del bucle entradno a una funcion y pegando un salto para que salga del bucle
                    salida();
                    break;
                }
        
            contador ++;
        }
        
    }
    
    public static void OpcionYaElegida(int num1,int num2){
    
        //int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: 1.Suma, 2.Resta, 3.Multiplicación, 4.divición"));
        switch(yaElegida){
            case "suma":
              suma(num1, num2);
            break;
            case "resta":
              resta(num1, num2);
            break;
            case "multiplicacion":
              multiplicacion(num1, num2);
            break;
            default:
              divicion(num1, num2);
            break;
        } 
    }
    
     public static void OpcionElegida(){
    
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: 1.Suma, 2.Resta, 3.Multiplicación, 4.divición"));
        switch(opcion){
            case 1:
               yaElegida = "suma";
            break;
            case 2:
              yaElegida = "resta";
            break;
            case 3:
              yaElegida = "multiplicacion";
            break;
            default:
              yaElegida = "divicion";
            break;
        } 
    }
    
    public static void suma(int num1,int num2){
    
        int resultado = num1 + num2;
        resultado(resultado);
    }
    
    public static void resta(int num1,int num2){
    
        int resultado = num1 - num2;
        resultado(resultado);
    }
      
    public static void multiplicacion(int num1,int num2){
    
        int resultado = num1 * num2;
        resultado(resultado);
    }
    public static void divicion(int num1,int num2){
    
        int resultado = num1 / num2;
        resultado(resultado);
    }
    
    public static void resultado(int result){
    
        JOptionPane.showMessageDialog(null, result , "El resultado de la operación es: ",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("El resultado es: " + result);
        
    }
    
    public static void salida(){
    
        JOptionPane.showMessageDialog(null, "Fin de proceso","GRACIAS POR PROBAR LA CALCULADORA!!",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
