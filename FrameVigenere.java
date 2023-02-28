
package Tarea1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FrameVigenere extends JFrame{
    
    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton botonE;
    private final JButton botonD;
    private final JButton botonG;
    private final JButton botonR;
    
    
    public FrameVigenere(){
    
    super("PEncriptación");
        setLayout(new FlowLayout());
        botonE = new JButton("Encripta");
        botonD = new JButton("Decifra");
        botonG = new JButton("Guardar");
        botonR = new JButton("Resultado");
         textArea1 = new JTextArea(10, 15);
        textArea2 = new JTextArea(10, 15); 
        
        add(textArea1);
        
        add(botonE);
        add(botonD);
        add(botonG);
        add(botonR);
        
        add(textArea2);
        
        Encriptar cadena =new Encriptar();
        botonE.addActionListener(cadena);
        Encriptar cadena2 =new Encriptar();
        botonD.addActionListener(cadena2);
        Encriptar Guardar = new Encriptar();
        botonG.addActionListener(Guardar);
        Encriptar Resultado = new Encriptar();
        botonR.addActionListener(Resultado);
    
    
    }
    
    public class Encriptar implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent event){
            String cadena; 
            String str;
            cadena =  textArea1.getText();
            Vigenere vig =new Vigenere();
           textArea2.setText(vig.cifrar(cadena));
           
        }   
    }
    
    public class Area2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String cadena;
            cadena =  textArea1.getText();
            Vigenere objTopico =new Vigenere();
           textArea2.setText(objTopico.desCifrar(cadena));
       
        }
    }
    
    public class archivos implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent event){
            String Ncadena;
            Archivo archivo = new Archivo();
            Ncadena = textArea2.getText();
           archivo.Agregar(Ncadena + ".txt");
            }
     

    }
    public class cadena implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent event){
            String cadena;
            cadena =  textArea1.getText();
            
        }
    
    
    
    }
   
   public static void main(String[] args) {
        FrameVigenere Ventana = new FrameVigenere();
        
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setSize(300,300);
        Ventana.setVisible(true);
    }
}