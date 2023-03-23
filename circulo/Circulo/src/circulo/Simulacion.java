
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
        
        bolitas = new JLabel[]{bolita1, bolita21, bolita31, bolita41, bolita51, bolita61, bolita71, bolita81, bolita91, bolita101,bolita111,bolita121,bolita131,bolita141,bolita151,bolita161,bolita171,bolita181,bolita191,bolita201,bolita211};
        contTemp thread = new contTemp(contador1, bolitas);
        thread.start();
        
        bolitas = new JLabel[]{bolita2, bolita22, bolita32, bolita42, bolita52, bolita6dos, bolita72, bolita82, bolita92,bolita102,bolita112,bolita122,bolita132,bolita142,bolita152,bolita162,bolita172,bolita182,bolita192,bolita202,bolita212};
        contTemp thread1 = new contTemp(contador2, bolitas);
        thread1.start();
        
        bolitas = new JLabel[]{bolita3, bolita23, bolita33, bolita43, bolita53, bolita63, bolita73, bolita83, bolita93,bolita103,bolita113,bolita123,bolita133,bolita143,bolita153,bolita163,bolita173,bolita183,bolita193,bolita203,bolita213};
        contTemp thread2 = new contTemp(contador3, bolitas);
        thread2.start();
        
        bolitas = new JLabel[]{bolita4, bolita24, bolita34, bolita44, bolita54, bolita64, bolita74, bolita84, bolita94,bolita104,bolita114,bolita124,bolita134,bolita144,bolita154,bolita164,bolita174,bolita184,bolita194,bolita204,bolita214};
        contTemp thread3 = new contTemp(contador4, bolitas);
        thread3.start();
        
        bolitas = new JLabel[]{bolita5, bolita25, bolita35, bolita45, bolita55, bolita65, bolita75, bolita85, bolita95,bolita105,bolita115,bolita125,bolita135,bolita145,bolita155,bolita165,bolita175,bolita185,bolita195,bolita205,bolita215};
        contTemp thread4 = new contTemp(contador5, bolitas);
        thread4.start();
        
        bolitas = new JLabel[]{bolita6, bolita26, bolita36, bolita46, bolita56, bolita66, bolita76, bolita86, bolita96,bolita106,bolita116,bolita126,bolita136,bolita146,bolita156,bolita166,bolita176,bolita186,bolita196,bolita206,bolita216};
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
        
        bolita102.setVisible(false);
        bolita103.setVisible(false);
        bolita104.setVisible(false);
        bolita105.setVisible(false);
        bolita106.setVisible(false);
        
        bolita112.setVisible(false);
        bolita113.setVisible(false);
        bolita114.setVisible(false);
        bolita115.setVisible(false);
        bolita116.setVisible(false);
        
        bolita122.setVisible(false);
        bolita123.setVisible(false);
        bolita124.setVisible(false);
        bolita125.setVisible(false);
        bolita126.setVisible(false);
        
        bolita132.setVisible(false);
        bolita133.setVisible(false);
        bolita134.setVisible(false);
        bolita135.setVisible(false);
        bolita136.setVisible(false);
        
        bolita142.setVisible(false);
        bolita143.setVisible(false);
        bolita144.setVisible(false);
        bolita145.setVisible(false);
        bolita146.setVisible(false);
        
        bolita152.setVisible(false);
        bolita153.setVisible(false);
        bolita154.setVisible(false);
        bolita155.setVisible(false);
        bolita156.setVisible(false);
        
        bolita162.setVisible(false);
        bolita163.setVisible(false);
        bolita164.setVisible(false);
        bolita165.setVisible(false);
        bolita166.setVisible(false);
        
        bolita172.setVisible(false);
        bolita173.setVisible(false);
        bolita174.setVisible(false);
        bolita175.setVisible(false);
        bolita176.setVisible(false);
        
        bolita182.setVisible(false);
        bolita183.setVisible(false);
        bolita184.setVisible(false);
        bolita185.setVisible(false);
        bolita186.setVisible(false);
        
        bolita192.setVisible(false);
        bolita193.setVisible(false);
        bolita194.setVisible(false);
        bolita195.setVisible(false);
        bolita196.setVisible(false);
        
        bolita202.setVisible(false);
        bolita203.setVisible(false);
        bolita204.setVisible(false);
        bolita205.setVisible(false);
        bolita206.setVisible(false);
        
        bolita212.setVisible(false);
        bolita213.setVisible(false);
        bolita214.setVisible(false);
        bolita215.setVisible(false);
        bolita216.setVisible(false);
        
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
        bolita102 = new javax.swing.JLabel();
        bolita112 = new javax.swing.JLabel();
        bolita122 = new javax.swing.JLabel();
        bolita132 = new javax.swing.JLabel();
        bolita142 = new javax.swing.JLabel();
        bolita152 = new javax.swing.JLabel();
        bolita162 = new javax.swing.JLabel();
        bolita172 = new javax.swing.JLabel();
        bolita182 = new javax.swing.JLabel();
        bolita192 = new javax.swing.JLabel();
        bolita202 = new javax.swing.JLabel();
        bolita212 = new javax.swing.JLabel();
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
        bolita103 = new javax.swing.JLabel();
        bolita113 = new javax.swing.JLabel();
        bolita123 = new javax.swing.JLabel();
        bolita133 = new javax.swing.JLabel();
        bolita143 = new javax.swing.JLabel();
        bolita153 = new javax.swing.JLabel();
        bolita163 = new javax.swing.JLabel();
        bolita173 = new javax.swing.JLabel();
        bolita183 = new javax.swing.JLabel();
        bolita193 = new javax.swing.JLabel();
        bolita203 = new javax.swing.JLabel();
        bolita213 = new javax.swing.JLabel();
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
        bolita104 = new javax.swing.JLabel();
        bolita114 = new javax.swing.JLabel();
        bolita124 = new javax.swing.JLabel();
        bolita134 = new javax.swing.JLabel();
        bolita144 = new javax.swing.JLabel();
        bolita154 = new javax.swing.JLabel();
        bolita164 = new javax.swing.JLabel();
        bolita174 = new javax.swing.JLabel();
        bolita184 = new javax.swing.JLabel();
        bolita194 = new javax.swing.JLabel();
        bolita204 = new javax.swing.JLabel();
        bolita214 = new javax.swing.JLabel();
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
        bolita105 = new javax.swing.JLabel();
        bolita115 = new javax.swing.JLabel();
        bolita125 = new javax.swing.JLabel();
        bolita135 = new javax.swing.JLabel();
        bolita145 = new javax.swing.JLabel();
        bolita155 = new javax.swing.JLabel();
        bolita165 = new javax.swing.JLabel();
        bolita175 = new javax.swing.JLabel();
        bolita185 = new javax.swing.JLabel();
        bolita195 = new javax.swing.JLabel();
        bolita205 = new javax.swing.JLabel();
        bolita215 = new javax.swing.JLabel();
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
        bolita106 = new javax.swing.JLabel();
        bolita116 = new javax.swing.JLabel();
        bolita126 = new javax.swing.JLabel();
        bolita136 = new javax.swing.JLabel();
        bolita146 = new javax.swing.JLabel();
        bolita156 = new javax.swing.JLabel();
        bolita166 = new javax.swing.JLabel();
        bolita176 = new javax.swing.JLabel();
        bolita186 = new javax.swing.JLabel();
        bolita196 = new javax.swing.JLabel();
        bolita206 = new javax.swing.JLabel();
        bolita216 = new javax.swing.JLabel();
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
        bolita101 = new javax.swing.JLabel();
        bolita111 = new javax.swing.JLabel();
        bolita121 = new javax.swing.JLabel();
        bolita131 = new javax.swing.JLabel();
        bolita141 = new javax.swing.JLabel();
        bolita151 = new javax.swing.JLabel();
        bolita161 = new javax.swing.JLabel();
        bolita171 = new javax.swing.JLabel();
        bolita181 = new javax.swing.JLabel();
        bolita191 = new javax.swing.JLabel();
        bolita201 = new javax.swing.JLabel();
        bolita211 = new javax.swing.JLabel();
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

        bolita102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

        bolita212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/naranja (1).png"))); // NOI18N

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
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bolita62Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bolita22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bolita52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bolita82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bolita112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bolita142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(bolita62Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bolita182)
                                    .addComponent(bolita32)
                                    .addComponent(bolita6dos)
                                    .addComponent(bolita92)
                                    .addComponent(bolita122)
                                    .addComponent(bolita152))
                                .addGap(26, 26, 26)
                                .addComponent(bolita172))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bolita62Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bolita212)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolita202)))
                        .addGap(18, 18, 18)
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita42)
                            .addComponent(bolita2)
                            .addComponent(bolita72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolita102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolita132, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita192, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita162))))
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
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita102)
                            .addComponent(bolita112)))
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bolita122)))
                .addGap(20, 20, 20)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita132)
                    .addComponent(bolita142)
                    .addComponent(bolita152))
                .addGap(18, 18, 18)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita162)
                    .addComponent(bolita172)
                    .addComponent(bolita182))
                .addGap(36, 36, 36)
                .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addGroup(bolita62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita192)
                            .addComponent(bolita202))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bolita62Layout.createSequentialGroup()
                        .addComponent(bolita212)
                        .addGap(0, 0, Short.MAX_VALUE))))
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

        bolita103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

        bolita213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/amarilla (1).png"))); // NOI18N

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
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bolita33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bolita183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolita213, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bolita203)
                        .addGap(29, 29, 29)
                        .addComponent(bolita193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bolita173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita163))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita23)
                            .addComponent(bolita53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolita83)
                            .addComponent(bolita113)
                            .addComponent(bolita143))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bolita133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolita103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolita73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolita43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolita3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita123)
                    .addGroup(jPanel4Layout.createSequentialGroup()
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita103)
                            .addComponent(bolita113))))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bolita133)
                        .addComponent(bolita143))
                    .addComponent(bolita153))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita163)
                    .addComponent(bolita173)
                    .addComponent(bolita183))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita193)
                    .addComponent(bolita203)
                    .addComponent(bolita213))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        bolita104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

        bolita214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg.png"))); // NOI18N

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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita34)
                            .addComponent(bolita64)
                            .addComponent(bolita94)
                            .addComponent(bolita124)
                            .addComponent(bolita154))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bolita144)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolita134))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bolita114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolita104))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(bolita84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolita74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bolita54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolita44))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bolita24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bolita4))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita174)
                        .addGap(18, 18, 18)
                        .addComponent(bolita164))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bolita214)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bolita204)
                        .addGap(18, 18, 18)
                        .addComponent(bolita194)))
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
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bolita84)
                        .addComponent(bolita74))
                    .addComponent(bolita94))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita104)
                    .addComponent(bolita114)
                    .addComponent(bolita124))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita134)
                    .addComponent(bolita144)
                    .addComponent(bolita154))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita164)
                    .addComponent(bolita174)
                    .addComponent(bolita184))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita204)
                    .addComponent(bolita194)
                    .addComponent(bolita214))
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

        bolita105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N
        bolita105.setText("jLabel8");

        bolita115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

        bolita215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/pngegg (1).png"))); // NOI18N

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
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita95)
                                .addGap(18, 18, 18)
                                .addComponent(bolita85)
                                .addGap(18, 18, 18)
                                .addComponent(bolita75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita65)
                                .addGap(18, 18, 18)
                                .addComponent(bolita55)
                                .addGap(18, 18, 18)
                                .addComponent(bolita45))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita125)
                                .addGap(18, 18, 18)
                                .addComponent(bolita115)
                                .addGap(18, 18, 18)
                                .addComponent(bolita105, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita155)
                                .addGap(18, 18, 18)
                                .addComponent(bolita145)
                                .addGap(18, 18, 18)
                                .addComponent(bolita135))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita185)
                                .addGap(18, 18, 18)
                                .addComponent(bolita175)
                                .addGap(18, 18, 18)
                                .addComponent(bolita165))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bolita215)
                                .addGap(18, 18, 18)
                                .addComponent(bolita205)
                                .addGap(18, 18, 18)
                                .addComponent(bolita195)))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita105)
                    .addComponent(bolita115)
                    .addComponent(bolita125))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita145)
                    .addComponent(bolita135)
                    .addComponent(bolita155))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bolita175)
                        .addComponent(bolita165))
                    .addComponent(bolita185))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita205)
                    .addComponent(bolita195)
                    .addComponent(bolita215))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(243, 92, 147));

        bolita6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FINAL");

        bolita36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        bolita216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/rosado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(bolita66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita56, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(bolita126, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bolita116, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bolita106, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(bolita36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bolita26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bolita46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bolita6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(bolita156, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bolita136, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolita146, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bolita96, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bolita216, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bolita186, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bolita206, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bolita176, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolita76, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bolita196, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bolita86, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bolita166, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bolita26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bolita66))
                    .addComponent(bolita46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bolita106, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita126, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolita116, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bolita136, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolita146, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bolita156, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bolita186, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bolita176, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bolita96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita86, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita166, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolita76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(bolita206, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(bolita196, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bolita216, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
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

        bolita101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        bolita211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo/Blanca1 (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita111)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bolita151, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bolita141))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bolita181)
                                .addGap(18, 18, 18)
                                .addComponent(bolita171))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bolita211)
                                .addGap(18, 18, 18)
                                .addComponent(bolita201)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolita131)
                            .addComponent(bolita101)
                            .addComponent(bolita161)
                            .addComponent(bolita191)))
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
                        .addComponent(bolita21))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bolita91, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolita121))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolita81)
                        .addGap(18, 18, 18)
                        .addComponent(bolita71)))
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
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita101)
                    .addComponent(bolita111)
                    .addComponent(bolita121))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolita131)
                    .addComponent(bolita141)
                    .addComponent(bolita151))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita161)
                    .addComponent(bolita171)
                    .addComponent(bolita181))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolita191)
                    .addComponent(bolita201)
                    .addComponent(bolita211))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
int numHilo = 21;

public void HILOS(){
 Thread hilo1 = new Thread(new Bolita(bolita1, bolita2, bolita3, bolita4, bolita5, bolita6));
 hilo1.start();

        /*try {
            // EL SEGUNDO
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Thread hilo2 = new Thread(new Bolita(bolita21, bolita22, bolita23, bolita24, bolita25, bolita26));

        try {
            // EL SEGUNDO
            hilo2.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo2.start();

        Thread hilo3 = new Thread(new Bolita(bolita31, bolita32, bolita33, bolita34, bolita35, bolita36));
        //hilo3.start();
        
        try {
            // EL SEGUNDO
            hilo3.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo3.start();

        Thread hilo4 = new Thread(new Bolita(bolita41, bolita42, bolita43, bolita44, bolita45, bolita46));
        //hilo4.start();
        
        try {
            // EL SEGUNDO
            hilo4.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo4.start();

        Thread hilo5 = new Thread(new Bolita(bolita51, bolita52, bolita53, bolita54, bolita55, bolita56));
        //hilo5.start();
        
        try {
            // EL SEGUNDO
            hilo5.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo5.start();

        Thread hilo6 = new Thread(new Bolita(bolita61, bolita6dos, bolita63, bolita64, bolita65, bolita66));

        try {
            // EL SEGUNDO
            hilo6.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo6.start();

        Thread hilo7 = new Thread(new Bolita(bolita71, bolita72, bolita73, bolita74, bolita75, bolita76));
        
        
        try {
            // EL SEGUNDO
            hilo7.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo7.start();

        Thread hilo8 = new Thread(new Bolita(bolita81, bolita82, bolita83, bolita84, bolita85, bolita86));
        //hilo8.start();
        
        try {
            // EL SEGUNDO
            hilo8.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo8.start();

        Thread hilo9 = new Thread(new Bolita(bolita91, bolita92, bolita93, bolita94, bolita95, bolita96));
        
        
        try {
            // EL SEGUNDO
            hilo9.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo9.start();

        Thread hilo10 = new Thread(new Bolita(bolita101, bolita102, bolita103, bolita104, bolita105, bolita106));
        try {
            // EL SEGUNDO
            hilo10.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo10.start();
        
        Thread hilo11 = new Thread(new Bolita(bolita111, bolita112, bolita113, bolita114, bolita115, bolita116));
        //hilo8.start();
        
        try {
            // EL SEGUNDO
            hilo11.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo11.start();

        Thread hilo12 = new Thread(new Bolita(bolita121, bolita122, bolita123, bolita124, bolita125, bolita126));

        try {
            // EL SEGUNDO
            hilo12.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo12.start();

        Thread hilo13 = new Thread(new Bolita(bolita131, bolita132, bolita133, bolita134, bolita135, bolita136));
        try {
            // EL SEGUNDO
            hilo13.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo13.start();
        
        Thread hilo14 = new Thread(new Bolita(bolita141, bolita142, bolita143, bolita144, bolita145, bolita146));
        try {
            // EL SEGUNDO
            hilo14.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo14.start();
        
        Thread hilo15 = new Thread(new Bolita(bolita151, bolita152, bolita153, bolita154, bolita155, bolita156));
        try {
            // EL SEGUNDO
            hilo15.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo15.start();
        
        
        Thread hilo16 = new Thread(new Bolita(bolita161, bolita162, bolita163, bolita164, bolita165, bolita166));
        try {
            // EL SEGUNDO
            hilo16.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo16.start();
        
        Thread hilo17 = new Thread(new Bolita(bolita171, bolita172, bolita173, bolita174, bolita175, bolita176));
        try {
            // EL SEGUNDO
            hilo17.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo17.start();
        
        Thread hilo18 = new Thread(new Bolita(bolita181, bolita182, bolita183, bolita184, bolita185, bolita186));
        try {
            // EL SEGUNDO
            hilo18.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo18.start();
        
        Thread hilo19 = new Thread(new Bolita(bolita191, bolita192, bolita193, bolita194, bolita195, bolita196));
        try {
            // EL SEGUNDO
            hilo19.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo19.start();
        
        Thread hilo20 = new Thread(new Bolita(bolita201, bolita202, bolita203, bolita204, bolita205, bolita206));
        try {
            // EL SEGUNDO
            hilo20.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo20.start();
        
        Thread hilo21 = new Thread(new Bolita(bolita211, bolita212, bolita213, bolita214, bolita215, bolita216));
        try {
            // EL SEGUNDO
            hilo21.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo21.start();
        
                new Thread(() -> {
        int fThreads = 0;
        while (fThreads < numHilo) {
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            
            if (!hilo21.isAlive()) {
                int z=k-1;
                t.stop();
                JOptionPane.showMessageDialog(null, "SIMULACION TERMINADA.- tiempo transcurrido:"+ z + "s");
                break;
            }
        }
    }).start();

}


    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        k=0;
        t=new Timer(985, new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e){
                 temp.setText(String.valueOf(k));
                 k++;
            } 
        });  t.start();
        
        HILOS();
        
        /*LabelThread thread = new LabelThread(contador2, bolitas);
        thread.start();*/
   

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
    private javax.swing.JLabel bolita101;
    private javax.swing.JLabel bolita102;
    private javax.swing.JLabel bolita103;
    private javax.swing.JLabel bolita104;
    private javax.swing.JLabel bolita105;
    private javax.swing.JLabel bolita106;
    private javax.swing.JLabel bolita111;
    private javax.swing.JLabel bolita112;
    private javax.swing.JLabel bolita113;
    private javax.swing.JLabel bolita114;
    private javax.swing.JLabel bolita115;
    private javax.swing.JLabel bolita116;
    private javax.swing.JLabel bolita121;
    private javax.swing.JLabel bolita122;
    private javax.swing.JLabel bolita123;
    private javax.swing.JLabel bolita124;
    private javax.swing.JLabel bolita125;
    private javax.swing.JLabel bolita126;
    private javax.swing.JLabel bolita131;
    private javax.swing.JLabel bolita132;
    private javax.swing.JLabel bolita133;
    private javax.swing.JLabel bolita134;
    private javax.swing.JLabel bolita135;
    private javax.swing.JLabel bolita136;
    private javax.swing.JLabel bolita141;
    private javax.swing.JLabel bolita142;
    private javax.swing.JLabel bolita143;
    private javax.swing.JLabel bolita144;
    private javax.swing.JLabel bolita145;
    private javax.swing.JLabel bolita146;
    private javax.swing.JLabel bolita151;
    private javax.swing.JLabel bolita152;
    private javax.swing.JLabel bolita153;
    private javax.swing.JLabel bolita154;
    private javax.swing.JLabel bolita155;
    private javax.swing.JLabel bolita156;
    private javax.swing.JLabel bolita161;
    private javax.swing.JLabel bolita162;
    private javax.swing.JLabel bolita163;
    private javax.swing.JLabel bolita164;
    private javax.swing.JLabel bolita165;
    private javax.swing.JLabel bolita166;
    private javax.swing.JLabel bolita171;
    private javax.swing.JLabel bolita172;
    private javax.swing.JLabel bolita173;
    private javax.swing.JLabel bolita174;
    private javax.swing.JLabel bolita175;
    private javax.swing.JLabel bolita176;
    private javax.swing.JLabel bolita181;
    private javax.swing.JLabel bolita182;
    private javax.swing.JLabel bolita183;
    private javax.swing.JLabel bolita184;
    private javax.swing.JLabel bolita185;
    private javax.swing.JLabel bolita186;
    private javax.swing.JLabel bolita191;
    private javax.swing.JLabel bolita192;
    private javax.swing.JLabel bolita193;
    private javax.swing.JLabel bolita194;
    private javax.swing.JLabel bolita195;
    private javax.swing.JLabel bolita196;
    private javax.swing.JLabel bolita2;
    private javax.swing.JLabel bolita201;
    private javax.swing.JLabel bolita202;
    private javax.swing.JLabel bolita203;
    private javax.swing.JLabel bolita204;
    private javax.swing.JLabel bolita205;
    private javax.swing.JLabel bolita206;
    private javax.swing.JLabel bolita21;
    private javax.swing.JLabel bolita211;
    private javax.swing.JLabel bolita212;
    private javax.swing.JLabel bolita213;
    private javax.swing.JLabel bolita214;
    private javax.swing.JLabel bolita215;
    private javax.swing.JLabel bolita216;
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
