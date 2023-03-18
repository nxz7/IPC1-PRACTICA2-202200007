package circulo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circulo extends JPanel implements Runnable {
    private int currentStage = 0;
    private Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA };
    private int[] stageDurations = { 1000, 7000, 7000, 7000, 7000, 0 };
    private int[] stagePositions = { 30, 150, 260, 370, 480, 600 };
    private int circlePosition = stagePositions[0];
    private int circleSize = 20;
    private int circleSpeed = 10;
    private boolean isRunning = true;
    private boolean canMoveToNextStage = false;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentStage < stagePositions.length - 1) {
            g.setColor(colors[currentStage]);
            g.fillOval(circlePosition , 50, circleSize, circleSize);
        }
        g.setColor(Color.BLACK);
        for (int i = 0; i < stagePositions.length; i++) {
            g.drawRect(stagePositions[i],50, 100, 100);
        }
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (isRunning) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (canMoveToNextStage) {
                currentStage++;
                if (currentStage < stagePositions.length - 1) {
                    circlePosition = stagePositions[currentStage] + 25;
                    canMoveToNextStage = false;
                } else {
                    isRunning = false;
                }
            } else if (currentStage == 0) {
                if (circlePosition < stagePositions[currentStage] + 25) {
                    circlePosition += circleSpeed;
                } else {
                    canMoveToNextStage = true;
                }
            } else if (currentStage < stagePositions.length - 1) {
                if (circlePosition < stagePositions[currentStage] + 25) {
                    circlePosition += circleSpeed;
                } else if (!canMoveToNextStage) {
                    canMoveToNextStage = true;
                    try {
                        Thread.sleep(stageDurations[currentStage]);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        Circulo circlePanel = new Circulo();
        frame.add(circlePanel);
        frame.setVisible(true);
        Thread thread= new Thread(circlePanel);
        thread.start();
        
    }
}
