/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author theki
 */
public class validacion {
    
 public void validarSoloLetras(JTextField campo,int cantidad){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int tam=campo.getText().length();
                if(Character.isDigit(c) || tam>=cantidad){
                    e.consume();
                }
            }
        });
    }
    
    public void validarSoloNumeros(JTextField campo,int cantidad){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int tam=campo.getText().length();
                if(!Character.isDigit(c) || tam>=cantidad){
                    e.consume();
                }
            }
        });
    }
    
   public void limitarCaracteres(JTextField campo,int cantidad){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int tam=campo.getText().length();
               // int k=(int)e.getKeyChar();
                if(tam >= cantidad /*|| k==64*/){
                    e.consume();
                }
            }
        });
   }
}

