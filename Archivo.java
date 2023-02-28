
package Tarea1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Archivo {
       FileWriter archivo = null;
    
    public static void main(String[] args) {
        Archivo archivo = new Archivo();
               
                
    }
    
   
       public void  Agregar(String str) {
      
        PrintWriter wr = null;
     
        try{
          wr = new PrintWriter(archivo);
        
          wr.print(str);
          
        }catch(Exception e){
            
            System.err.println("Error");
       
        }
       }
        public void Resultado(){
        
        FileReader archivo;
        BufferedReader lector;
        
        
        try{
            archivo = new  FileReader("C:\\Users\\Danna\\OneDrive\\Documentos\\NetBeansProjects\\TAP\\src\\Tarea1\\Archivo.txt");
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                
              while((cadena = lector.readLine()) != null){
                    System.out.println(cadena);
              }
            
            }else{
                System.out.println("Error");
            
            }
                
            
        }catch(Exception e){
            System.err.println("Error");
            
       
        }
       
        
        
        }
    }

