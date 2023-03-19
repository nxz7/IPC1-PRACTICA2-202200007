/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author natalia
 */
public class Bolita implements Runnable {
    private JLabel bolita1;
    private JLabel bolita2;
    private JLabel bolita3;
    private JLabel bolita4;
    private JLabel bolita5;
    private JLabel bolita6;
     public static ArrayList <Datos> aList;


    public Bolita(JLabel bolita1, JLabel bolita2, JLabel bolita3,JLabel bolita4, JLabel bolita5, JLabel bolita6) {
        this.bolita1 = bolita1;
        this.bolita2 = bolita2;
        this.bolita3 = bolita3;
        this.bolita4 = bolita4;
        this.bolita5 = bolita5;
        this.bolita6 = bolita6;
        this.aList=Informacion.aList;
    }

    @Override
    public void run() {
        int tiempo1= this.aList.get(0).getInventarioT()*1000;
        int tiempo2= this.aList.get(0).getProduccionT()*1000;
        int tiempo3= this.aList.get(0).getEmpaquetadoT()*1000;
        int tiempo4= this.aList.get(0).getSalidaT()*1000;
                
        
        
        try {
            Thread.sleep(1000); // ESPERA EL SEGUNDO PARA EMPEZAR

            // BOLITA1
            SwingUtilities.invokeLater(() -> bolita1.setVisible(true));
            Thread.sleep(1000);
            SwingUtilities.invokeLater(() -> bolita1.setVisible(false));

            // BOLITA2
            SwingUtilities.invokeLater(() -> bolita2.setVisible(true));
            Thread.sleep(tiempo1);
            SwingUtilities.invokeLater(() -> bolita2.setVisible(false));

            // BOLITA3
            SwingUtilities.invokeLater(() -> bolita3.setVisible(true));
            Thread.sleep(tiempo2);
            SwingUtilities.invokeLater(() -> bolita3.setVisible(false));
            
            // BOLITA4
            SwingUtilities.invokeLater(() -> bolita4.setVisible(true));
            Thread.sleep(tiempo3);
            SwingUtilities.invokeLater(() -> bolita4.setVisible(false));

            // BOLITA5
            SwingUtilities.invokeLater(() -> bolita5.setVisible(true));
            Thread.sleep(tiempo4);
            SwingUtilities.invokeLater(() -> bolita5.setVisible(false));

            // BOLITA6
            SwingUtilities.invokeLater(() -> bolita6.setVisible(true));
            Thread.sleep(1000);
            SwingUtilities.invokeLater(() -> bolita6.setVisible(false));
            
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
