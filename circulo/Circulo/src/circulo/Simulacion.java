
package circulo;

import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author natalia
 */
public class Simulacion extends javax.swing.JFrame {
    public static ArrayList <Datos> aList;

    static int contador =0;
    Timer t;
    private JLabel[] bolitas = null;
    
    
    //LabelThread thread = new LabelThread( contador2, bolitas);
    
    public Simulacion() {
        initComponents();
        setLocationRelativeTo(this);
        this.aList=Informacion.aList;
        //contador2
        
        bolitas = new JLabel[]{bolita1, bolita21, bolita31, bolita41, bolita51, bolita61, bolita71, bolita81, bolita91};
        contTemp thread = new contTemp(contador1, bolitas);
        thread.start();
        
        bolitas = new JLabel[]{bolita2, bolita22, bolita32, bolita42, bolita52, bolita6dos, bolita72, bolita82, bolita92};
        contTemp thread1 = new contTemp(contador2, bolitas);
        thread1.start();
        
        bolitas = new JLabel[]{bolita3, bolita23, bolita33, bolita43, bolita53, bolita63, bolita73, bolita83, bolita93};
        contTemp thread2 = new contTemp(contador3, bolitas);
        thread2.start();
        
        bolitas = new JLabel[]{bolita4, bolita24, bolita34, bolita44, bolita54, bolita64, bolita74, bolita84, bolita94};
        contTemp thread3 = new contTemp(contador4, bolitas);
        thread3.start();
        
        bolitas = new JLabel[]{bolita5, bolita25, bolita35, bolita45, bolita55, bolita65, bolita75, bolita85, bolita95};
        contTemp thread4 = new contTemp(contador5, bolitas);
        thread4.start();
        
        bolitas = new JLabel[]{bolita6, bolita26, bolita36, bolita46, bolita56, bolita66, bolita76, bolita86, bolita96};
        contTemp thread5 = new contTemp(contFinal, bolitas);
        thread5.start();
        
        //bolita1.setVisible(false);
        bolita2.setVisible(false);
        bolita3.setVisible(false);
        bolita4.setVisible(false);
        bolita5.setVisible(false);
        bolita6.setVisible(false);
        
        //bolita21.setVisible(false);
        bolita22.setVisible(false);
        bolita23.setVisible(false);
        bolita24.setVisible(false);
        bolita25.setVisible(false);
        bolita26.setVisible(false);

        //bolita31.setVisible(false);
        bolita32.setVisible(false);
        bolita33.setVisible(false);
        bolita34.setVisible(false);
        bolita35.setVisible(false);
        bolita36.setVisible(false);
        
        //bolita41.setVisible(false);
        bolita42.setVisible(false);
        bolita43.setVisible(false);
        bolita44.setVisible(false);
        bolita45.setVisible(false);
        bolita46.setVisible(false);
        
        this.bolitas = bolitas;
        
        bolita52.setVisible(false);
        bolita53.setVisible(false);
        bolita54.setVisible(false);
        bolita55.setVisible(false);
        bolita56.setVisible(false);
        
        bolita6dos.setVisible(false);
        bolita63.setVisible(false);
        bolita64.setVisible(false);
        bolita65.setVisible(false);
        bolita66.setVisible(false);
        
        bolita72.setVisible(false);
        bolita73.setVisible(false);
        bolita74.setVisible(false);
        bolita75.setVisible(false);
        bolita76.setVisible(false);
        
        bolita82.setVisible(false);
        bolita83.setVisible(false);
        bolita84.setVisible(false);
        bolita85.setVisible(false);
        bolita86.setVisible(false);
        
        bolita92.setVisible(false);
        bolita93.setVisible(false);
        bolita94.setVisible(false);
        bolita95.setVisible(false);
        bolita96.setVisible(false);
        
    }
    

    /**

     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menuBoton = new javax.swing.JButton();
        reporte = new javax.swing.JButton();
        bolita62 = new javax.swing.JPanel();
        bolita2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bolita22 = new javax.swing.JLabel();
        bolita32 = new javax.swing.JLabel();
        bolita42 = new javax.swing.JLabel();
        bolita52 = new javax.swing.JLabel();
        bolita6dos = new javax.swing.JLabel();
        bolita72 = new javax.swing.JLabel();
        bolita82 = new javax.swing.JLabel();
        bolita92 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bolita3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bolita23 = new javax.swing.JLabel();
        bolita33 = new javax.swing.JLabel();
        bolita43 = new javax.swing.JLabel();
        bolita53 = new javax.swing.JLabel();
        bolita63 = new javax.swing.JLabel();
        bolita73 = new javax.swing.JLabel();
        bolita83 = new javax.swing.JLabel();
        bolita93 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bolita4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bolita24 = new javax.swing.JLabel();
        bolita34 = new javax.swing.JLabel();
        bolita44 = new javax.swing.JLabel();
        bolita54 = new javax.swing.JLabel();
        bolita64 = new javax.swing.JLabel();
        bolita74 = new javax.swing.JLabel();
        bolita84 = new javax.swing.JLabel();
        bolita94 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bolita5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bolita25 = new javax.swing.JLabel();
        bolita35 = new javax.swing.JLabel();
        bolita45 = new javax.swing.JLabel();
        bolita55 = new javax.swing.JLabel();
        bolita65 = new javax.swing.JLabel();
        bolita75 = new javax.swing.JLabel();
        bolita85 = new javax.swing.JLabel();
        bolita95 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bolita6 = new javax.swing.JLabel();
        bolita26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bolita36 = new javax.swing.JLabel();
        bolita46 = new javax.swing.JLabel();
        bolita56 = new javax.swing.JLabel();
        bolita66 = new javax.swing.JLabel();
        bolita76 = new javax.swing.JLabel();
        bolita86 = new javax.swing.JLabel();
        bolita96 = new javax.swing.JLabel();
        empezar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bolita31 = new javax.swing.JLabel();
        bolita1 = new javax.swing.JLabel();
        bolita21 = new javax.swing.JLabel();
        bolita41 = new javax.swing.JLabel();
        bolita51 = new javax.swing.JLabel();
        bolita61 = new javax.swing.JLabel();
        bolita71 = new javax.swing.JLabel();
        bolita81 = new javax.swing.JLabel();
        bolita91 = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contador1 = new javax.swing.JLabel();
        contador2 = new javax.swing.JLabel();
        contador3 = new javax.swing.JLabel();
        contador4 = new javax.swing.JLabel();
        contador5 = new javax.swing.JLabel();
        contador6 = new javax.swing.JLabel();
        contFinal = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        menuBoton.setBackground(new java.awt.Color(255, 255, 255));
        menuBoton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        menuBoton.setForeground(new java.awt.Color(204, 204, 0));
        menuBoton.setText("Menu");
        menuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotonActionPerformed(evt);
            }
        });

        reporte.setBackground(new java.awt.Color(255, 255, 255));
        reporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        reporte.setForeground(new java.awt.Color(153, 153, 0));
        reporte.setText("reporte");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        bolita62.setBackground(new java.awt.Color(243, 218, 163));

        bolita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Inventario");

        bolita22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita6dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        javax.swing.GroupLayout bolita62Layout = new javax.swing.GroupLayout(bolita62);
        bolita62.setLayout(bolita62Layout);
        bolita62Layout.setHorizontalGroup(
            bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bolita62Layout.createSequentialGroup()
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita32)
                            .addComponent(bolita6dos)
                            .addComponent(bolita92))
                        .addGap(26, 26, 26)
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita22)
                            .addComponent(bolita52)
                            .addComponent(bolita82))
                        .addGap(26, 26, 26)
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita42)
                            .addComponent(bolita2)
                            .addComponent(bolita72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        bolita62Layout.setVerticalGroup(
            bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bolita62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita22)
                    .addComponent(bolita2)
                    .addComponent(bolita32))
                .addGap(18, 18, 18)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita42)
                    .addComponent(bolita6dos)
                    .addComponent(bolita52))
                .addGap(18, 18, 18)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita72)
                    .addComponent(bolita82)
                    .addComponent(bolita92))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 233));

        bolita3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Produccion");

        bolita23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N
        bolita33.setToolTipText("");

        bolita43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bolita33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita23)
                    .addComponent(bolita53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bolita73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita33)
                    .addComponent(bolita23)
                    .addComponent(bolita3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita43)
                    .addComponent(bolita53)
                    .addComponent(bolita63))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita73)
                    .addComponent(bolita83)
                    .addComponent(bolita93))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(198, 244, 213));

        bolita4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Empaquetado");

        bolita24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N
        bolita24.setText("jLabel7");

        bolita34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N
        bolita74.setText("jLabel8");

        bolita84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita34)
                    .addComponent(bolita64)
                    .addComponent(bolita94))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bolita4)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita34)
                    .addComponent(bolita24)
                    .addComponent(bolita4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita44)
                    .addComponent(bolita54)
                    .addComponent(bolita64))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bolita74)
                        .addComponent(bolita84))
                    .addComponent(bolita94))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(155, 216, 246));

        bolita5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Salida");

        bolita25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(bolita35)
                            .addGap(18, 18, 18)
                            .addComponent(bolita25)
                            .addGap(18, 18, 18)
                            .addComponent(bolita5)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita65)
                                .addGap(18, 18, 18)
                                .addComponent(bolita55)
                                .addGap(18, 18, 18)
                                .addComponent(bolita45))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita95)
                                .addGap(20, 20, 20)
                                .addComponent(bolita85)
                                .addGap(18, 18, 18)
                                .addComponent(bolita75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita65)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita35)
                            .addComponent(bolita25)
                            .addComponent(bolita5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita45)
                            .addComponent(bolita55))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bolita75)
                        .addComponent(bolita85))
                    .addComponent(bolita95))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 255));

        bolita6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FINAL");

        bolita36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bolita36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bolita26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(bolita66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bolita56)
                                .addGap(18, 18, 18)
                                .addComponent(bolita46)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(bolita96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bolita86)
                                .addGap(18, 18, 18)
                                .addComponent(bolita76)
                                .addContainerGap())))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita6)
                    .addComponent(bolita26)
                    .addComponent(bolita36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita46)
                    .addComponent(bolita56)
                    .addComponent(bolita66))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita76)
                    .addComponent(bolita86)
                    .addComponent(bolita96))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        empezar.setBackground(new java.awt.Color(214, 252, 214));
        empezar.setForeground(new java.awt.Color(51, 51, 0));
        empezar.setText("empezar");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(251, 235, 250));

        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("inicio");

        bolita31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(bolita91, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita81)
                        .addGap(18, 18, 18)
                        .addComponent(bolita71))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(bolita61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita51)
                        .addGap(18, 18, 18)
                        .addComponent(bolita41, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(bolita31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bolita21)))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita21)
                    .addComponent(bolita1)
                    .addComponent(bolita31))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bolita41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bolita61))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita71)
                    .addComponent(bolita81)
                    .addComponent(bolita91))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        temp.setBackground(new java.awt.Color(204, 255, 204));
        temp.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        temp.setForeground(new java.awt.Color(153, 0, 102));
        temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setText("0");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Tiempo transcurrido");

        contador1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador1.setForeground(new java.awt.Color(204, 0, 0));

        contador2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador2.setForeground(new java.awt.Color(0, 204, 0));

        contador3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador3.setForeground(new java.awt.Color(0, 204, 0));

        contador4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador4.setForeground(new java.awt.Color(0, 204, 51));

        contador5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador5.setForeground(new java.awt.Color(0, 204, 102));

        contador6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contador6.setForeground(new java.awt.Color(204, 153, 0));

        contFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contFinal.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)
                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bolita62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(contador4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(164, 164, 164)
                                        .addComponent(contador5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(contador1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(contador2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(contador3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(contador6)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reporte)
                            .addComponent(empezar)
                            .addComponent(menuBoton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contador6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int k=0;
int numHilo = 4;

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        k=0;
        t=new Timer(996, new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e){
                 temp.setText(String.valueOf(k));
                 k++;
            } 
        });  t.start();
        
        
        /*LabelThread thread = new LabelThread(contador2, bolitas);
        thread.start();*/
        

        Thread hilo1 = new Thread(new Bolita(bolita1, bolita2, bolita3, bolita4, bolita5, bolita6));
        hilo1.start();

        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo2 = new Thread(new Bolita(bolita21, bolita22, bolita23, bolita24, bolita25, bolita26));
        hilo2.start();

        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo3 = new Thread(new Bolita(bolita31, bolita32, bolita33, bolita34, bolita35, bolita36));
        hilo3.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo4 = new Thread(new Bolita(bolita41, bolita42, bolita43, bolita44, bolita45, bolita46));
        hilo4.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo5 = new Thread(new Bolita(bolita51, bolita52, bolita53, bolita54, bolita55, bolita56));
        hilo5.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo6 = new Thread(new Bolita(bolita61, bolita6dos, bolita63, bolita64, bolita65, bolita66));
        hilo6.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo7 = new Thread(new Bolita(bolita71, bolita72, bolita73, bolita74, bolita75, bolita76));
        hilo7.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo8 = new Thread(new Bolita(bolita81, bolita82, bolita83, bolita84, bolita85, bolita86));
        hilo8.start();
        
        try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread hilo9 = new Thread(new Bolita(bolita91, bolita92, bolita93, bolita94, bolita95, bolita96));
        hilo9.start();
        
        
        new Thread(() -> {
        int finishedThreads = 0;
        while (finishedThreads < numHilo) {
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            
            if (!hilo9.isAlive()) {
                int z=k-1;
                t.stop();
                JOptionPane.showMessageDialog(null, "SIMULACION TERMINADA.- tiempo transcurrido:"+ z + "s");
                break;
            }
        }
    }).start();

    }//GEN-LAST:event_empezarActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed

        try {
            File fileN = new File("reporte.html");
            FileWriter escribir = new FileWriter(fileN);
            escribir.write("<table class=\"body-wrap\">\n");
            escribir.write("<tbody><tr>\n");
            escribir.write("<td></td>\n");
            escribir.write("<td class=\"container\" width=\"600\">\n");
            escribir.write("<div class=\"content\">\n");
            escribir.write("<table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
            escribir.write("<tbody><tr>\n");
            escribir.write("<td class=\"content-wrap aligncenter\">\n");
            escribir.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
            escribir.write("<tbody><tr>\n");
            escribir.write("<td class=\"content-block\">\n");
            escribir.write("<h2> REPORTE </h2>\n");
            escribir.write("</td>\n");
            escribir.write("</tr>\n");
            escribir.write("<tr>\n");
            escribir.write("<td class=\"content-block\">\n");
            escribir.write("<table class=\"invoice\">\n");
            escribir.write("<tbody><tr>\n");
            escribir.write( "Costo Inventario: Q " + this.aList.get(0).getCostoInv() + ".00 <br>\n");
            escribir.write("Costo Produccion:Q " + this.aList.get(0).getCostoProd() + ".00 <br>\n");
            escribir.write("Costo Empaquetado:Q" + this.aList.get(0).getCostoEmp() + ".00 <br>\n");
            escribir.write("Costo Salida:Q" + this.aList.get(0).getCostoSalida() + ".00 <br>\n");
            escribir.write("<td> TOTAL:Q " + this.aList.get(0).getCostoTotal() + ".00 </td>\n");
            escribir.write( "Natalia Mariel Calderon Echeverria - 202200007" + "<br>\n");
            escribir.write("<br>\n");
            escribir.write("</tr>\n");
            escribir.write("<tr>\n");
            escribir.write("<td>\n");
            escribir.write("<table class=\"invoice-items\" cellpadding=\"0\" cellspacing=\"0\">\n");
            escribir.write("<tbody><tr>\n");
            escribir.write("<br>\n");
            escribir.write("</tr>\n");
            escribir.write("<img src=\"https://as1.ftcdn.net/v2/jpg/02/10/18/32/1000_F_210183252_wk6PN9jSGTFtRT2LnL27yuA9zPUyxUAk.jpg\" alt=\"codigo\" width=\"500\" height=\"150\">");

            escribir.close();
            Desktop.getDesktop().open(fileN);

            JOptionPane.showMessageDialog(null, "Reporte descargado");
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_reporteActionPerformed

    private void menuBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotonActionPerformed
        dispose();
        Menu inicio = new Menu();
        inicio.setVisible(true);

    }//GEN-LAST:event_menuBotonActionPerformed


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bolita1;
    private javax.swing.JLabel bolita2;
    private javax.swing.JLabel bolita21;
    private javax.swing.JLabel bolita22;
    private javax.swing.JLabel bolita23;
    private javax.swing.JLabel bolita24;
    private javax.swing.JLabel bolita25;
    private javax.swing.JLabel bolita26;
    private javax.swing.JLabel bolita3;
    private javax.swing.JLabel bolita31;
    private javax.swing.JLabel bolita32;
    private javax.swing.JLabel bolita33;
    private javax.swing.JLabel bolita34;
    private javax.swing.JLabel bolita35;
    private javax.swing.JLabel bolita36;
    private javax.swing.JLabel bolita4;
    private javax.swing.JLabel bolita41;
    private javax.swing.JLabel bolita42;
    private javax.swing.JLabel bolita43;
    private javax.swing.JLabel bolita44;
    private javax.swing.JLabel bolita45;
    private javax.swing.JLabel bolita46;
    private javax.swing.JLabel bolita5;
    private javax.swing.JLabel bolita51;
    private javax.swing.JLabel bolita52;
    private javax.swing.JLabel bolita53;
    private javax.swing.JLabel bolita54;
    private javax.swing.JLabel bolita55;
    private javax.swing.JLabel bolita56;
    private javax.swing.JLabel bolita6;
    private javax.swing.JLabel bolita61;
    private javax.swing.JPanel bolita62;
    private javax.swing.JLabel bolita63;
    private javax.swing.JLabel bolita64;
    private javax.swing.JLabel bolita65;
    private javax.swing.JLabel bolita66;
    private javax.swing.JLabel bolita6dos;
    private javax.swing.JLabel bolita71;
    private javax.swing.JLabel bolita72;
    private javax.swing.JLabel bolita73;
    private javax.swing.JLabel bolita74;
    private javax.swing.JLabel bolita75;
    private javax.swing.JLabel bolita76;
    private javax.swing.JLabel bolita81;
    private javax.swing.JLabel bolita82;
    private javax.swing.JLabel bolita83;
    private javax.swing.JLabel bolita84;
    private javax.swing.JLabel bolita85;
    private javax.swing.JLabel bolita86;
    private javax.swing.JLabel bolita91;
    private javax.swing.JLabel bolita92;
    private javax.swing.JLabel bolita93;
    private javax.swing.JLabel bolita94;
    private javax.swing.JLabel bolita95;
    private javax.swing.JLabel bolita96;
    private javax.swing.JLabel contFinal;
    private javax.swing.JLabel contador1;
    private javax.swing.JLabel contador2;
    private javax.swing.JLabel contador3;
    private javax.swing.JLabel contador4;
    private javax.swing.JLabel contador5;
    private javax.swing.JLabel contador6;
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton menuBoton;
    private javax.swing.JButton reporte;
    private javax.swing.JLabel temp;
    // End of variables declaration//GEN-END:variables

    //private JLabel[] bolitas = {bolita2, bolita22, bolita32, bolita42}; 
}



   /* public static void main(String[] args) {
        Sim sim = new Sim();
        sim.runLabelsThread();
    }*/
