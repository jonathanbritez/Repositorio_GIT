/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.ticketrestaurante;
import java.util.Scanner;
public class Restaurante {
    
    public static void main(String args[]){
    //ingresamos los datos 
        String nombre,pago = "";
        int total,descuento,cuota,interes,TCnum,modalidad_pago = 0;
    //iniciamos el Scanner
        double totalFinal;
        Scanner leer = new Scanner(System.in);
    
    //paso el mensaje al usuario para que lo complete
    
        System.out.print("Ingrese el nombre mozo: ");
        nombre = leer.nextLine();
    
        System.out.print("Total de consumo: ");
        total = leer.nextInt();
       
    
        System.out.println("Ingrese modalidad de pago: \n - Efectivo\n - Tarjeta de crédito\n - Tarjeta de débito");
        modalidad_pago = leer.nextInt();
    //inicio el condiccional Switch
        switch(modalidad_pago){
            case 1:
                pago = "Efectivo";
            break;
            case 2:
                pago = "Tarjeta de Credito";
            break;
            case 3:
                pago="Tarjeta de Debito";
            break;
            
        }
       //muestro informacion del ticket
        System.out.println("Ejemplo de ticket\n ================ \n RESTAURANTE\n CFP N°36 \n ZAVALETA 204, ,C1437EYF CABA \n ==============");
        System.out.println("Caja # 1 - Ticket # 1 \n LO ATENDIO: " + nombre + "\n 30/04/2010 11:46:47 AM \n ==============");
        System.out.println("1 gaseosa \n 1 Milanesa Napolitana con fritas \n 1 Flan con crema\n 1 Cafe \n ==============");
        System.out.println(" SUBTOTAL: " +  total + "\n" + " FORMA DE PAGO: " + pago);
        
        //comparo la modalidad de pago para relizar descuentos o aplicar intereses
        if(pago.equalsIgnoreCase("Efectivo")){
            descuento = 30; 
            System.out.println("Descuento: " + descuento);
         
            totalFinal = total * 0.30 ;  
            System.out.print("total: $" + totalFinal);
    
         }else if(pago.equalsIgnoreCase("Tarjeta de debito")){
        
            descuento = 10;
            System.out.println("Descuento: " + descuento);
         
            totalFinal = total * 0.90;  
            System.out.print("total: $" + totalFinal);
    
        }else if(pago.equalsIgnoreCase("Tarjeta de credito")){
        
            System.out.print("Numero de tarjeta: ");
            TCnum= leer.nextInt();
       
            System.out.print("Cuotas: ");
            cuota = leer.nextInt();
        
            interes = 10;
            System.out.println("Interes: " + interes);
        
        
            totalFinal = (total / cuota) * 1.10;  
            System.out.print("total: $" + totalFinal);
   
        }else{
        
            System.out.println("No existe ese medio de pago");
        
        }

    }
}
