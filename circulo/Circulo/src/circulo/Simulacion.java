
package circulo;

import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
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
    
    public Simulacion() {
        initComponents();
        setLocationRelativeTo(this);
        this.aList=Informacion.aList;
        bolita1.setVisible(false);
        bolita2.setVisible(false);
        bolita3.setVisible(false);
        bolita4.setVisible(false);
        bolita5.setVisible(false);
        bolita6.setVisible(false);
        
        bolita21.setVisible(false);
        bolita22.setVisible(false);
        bolita23.setVisible(false);
        bolita24.setVisible(false);
        bolita25.setVisible(false);
        bolita26.setVisible(false);

        bolita31.setVisible(false);
        bolita32.setVisible(false);
        bolita33.setVisible(false);
        bolita34.setVisible(false);
        bolita35.setVisible(false);
        bolita36.setVisible(false);
        
        bolita41.setVisible(false);
        bolita42.setVisible(false);
        bolita43.setVisible(false);
        bolita44.setVisible(false);
        bolita45.setVisible(false);
        bolita46.setVisible(false);
        
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
        jPanel3 = new javax.swing.JPanel();
        bolita2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bolita22 = new javax.swing.JLabel();
        bolita32 = new javax.swing.JLabel();
        bolita42 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bolita3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bolita23 = new javax.swing.JLabel();
        bolita33 = new javax.swing.JLabel();
        bolita43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bolita4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bolita24 = new javax.swing.JLabel();
        bolita34 = new javax.swing.JLabel();
        bolita44 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bolita5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bolita25 = new javax.swing.JLabel();
        bolita35 = new javax.swing.JLabel();
        bolita45 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bolita6 = new javax.swing.JLabel();
        bolita26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bolita36 = new javax.swing.JLabel();
        bolita46 = new javax.swing.JLabel();
        empezar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bolita31 = new javax.swing.JLabel();
        bolita1 = new javax.swing.JLabel();
        bolita21 = new javax.swing.JLabel();
        bolita41 = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(243, 218, 163));

        bolita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Inventario");

        bolita22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bolita32)
                        .addGap(26, 26, 26)
                        .addComponent(bolita22)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita42)
                            .addComponent(bolita2))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita22)
                    .addComponent(bolita2)
                    .addComponent(bolita32))
                .addGap(18, 18, 18)
                .addComponent(bolita42)
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
                .addComponent(bolita33)
                .addGap(29, 29, 29)
                .addComponent(bolita23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                .addComponent(bolita43)
                .addContainerGap(328, Short.MAX_VALUE))
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita44)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita34)
                        .addGap(26, 26, 26)
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
                .addComponent(bolita44)
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita45)
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
                            .addComponent(bolita5))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita35)
                    .addComponent(bolita25)
                    .addComponent(bolita5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bolita45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 255));

        bolita6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FINAL");

        bolita36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

        bolita46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (2).png"))); // NOI18N

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
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bolita46)
                .addContainerGap())
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
                .addComponent(bolita46)
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita41, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(bolita41)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
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
        
        
        new Thread(() -> {
        int finishedThreads = 0;
        while (finishedThreads < numHilo) {
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            
            if (!hilo3.isAlive()) {
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
    private javax.swing.JLabel bolita6;
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
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

    
}



   /* public static void main(String[] args) {
        Sim sim = new Sim();
        sim.runLabelsThread();
    }*/
