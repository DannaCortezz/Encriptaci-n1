package Tarea1;

public class Vigenere {
    
 public static void main(String[] args) {
    
    String codigo = "abcABC1";
        Vigenere ascii =new Vigenere();

        String codigoT = "";
        String codigoDes = "";
        int cambiar = 2;
        int asciiValue;
        int condicion = codigo.length() / 2;

        for (int i = 0; i < codigo.length(); i++) {

            asciiValue = codigo.charAt(i);
    
            if (i > condicion) {
                cambiar = 3;
            }
            
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambiar;
            }

            codigoT = (char) asciiValue + codigoT;
        }

        cambiar = -3;

        for (int i = 0; i < codigoT.length(); i++) {

            asciiValue = codigoT.charAt(i);
        
            if (i >= condicion) {
                cambiar = -2;
            }
        
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambiar;
            }

            codigoDes = (char) asciiValue + codigoDes;
        }ascii.desCifrar(ascii.cifrar(codigo));
        

        
    
    }
    String cifrar(String información) {
        String codigoT = "";
        int cambiar = 2;
        int asciiValue;
        int condicion = información.length() / 2;
  
        for (int i = 0; i < información.length(); i++) {

            asciiValue = información.charAt(i);
         
            if (i > condicion) {
                cambiar = 3;
            }
       
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambiar;
            }

            codigoT = (char) asciiValue + codigoT;
        }return codigoT;
    }

    String desCifrar(String info) {
        String Traducido = "";
        int cambio = -3;
        int asciiValue;
        int condicion = info.length() / 2;
       for (int i = 0; i < info.length(); i++) {

            asciiValue = info.charAt(i);
           
            if (i >= condicion) {
                cambio = -2;
            }
             
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }

            Traducido = (char) asciiValue + Traducido;
        }
//       
        return Traducido;
    }
}


