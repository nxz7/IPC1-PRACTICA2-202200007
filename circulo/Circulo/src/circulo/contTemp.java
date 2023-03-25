/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @author natalia
 */
import java.awt.*;
import javax.swing.*;

public class contTemp implements Runnable {
    
    private JLabel contador2;
    private JLabel[] bolitas;

    private boolean isRunning = false;
    
    public contTemp(JLabel contador2, JLabel[] bolitas) {
        this.contador2 = contador2;
        this.bolitas = bolitas;
    }
    
    public void start() {
        isRunning = true;
        new Thread(this).start();
    }
    
    public void stop() {
        isRunning = false;
    }
    
    @Override
    public void run() {
        while (isRunning) {
            int visCont = 0;
            for (JLabel label : bolitas) {
                if (label != null && label.getIcon() != null && label.isVisible()) {
        visCont++;
        
    }
            }
            final int count = visCont;
            SwingUtilities.invokeLater(() -> {
                contador2.setText("" + count);
                
            });
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

    