/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios;


import cine_tics.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Sauceda
 */
public class asientos4 extends javax.swing.JFrame  {
    
   boolean seleccion1,seleccion2,seleccion3,seleccion4,seleccion5 = false;
   boolean seleccion6,seleccion8,seleccion9,seleccion10,seleccion11 = false;
   boolean seleccion12,seleccion13,seleccion14,seleccion15,seleccion16 = false;
   boolean seleccion17,seleccion18,seleccion19,seleccion20,seleccion21 = false;
   public static int lugares;

   
    taquilla L = new taquilla();
   public static String D1,D2,D3,D4,D5;
   public static String C1,C2,C3,C4,C5;
   public static String B1,B2,B3,B4,B5;
   public static String A1,A2,A3,A4,A5;

    /**
     * Creates new form asientos
     */
    public asientos4() {
        initComponents();
        setDefaultCloseOperation(0);
        comprobacion();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        AD2 = new javax.swing.JLabel();
        AD4 = new javax.swing.JLabel();
        AD1 = new javax.swing.JLabel();
        AD3 = new javax.swing.JLabel();
        AC2 = new javax.swing.JLabel();
        AD5 = new javax.swing.JLabel();
        AC1 = new javax.swing.JLabel();
        AB1 = new javax.swing.JLabel();
        AC3 = new javax.swing.JLabel();
        AC4 = new javax.swing.JLabel();
        AC5 = new javax.swing.JLabel();
        AB2 = new javax.swing.JLabel();
        AB3 = new javax.swing.JLabel();
        AB4 = new javax.swing.JLabel();
        AB5 = new javax.swing.JLabel();
        AA1 = new javax.swing.JLabel();
        AA2 = new javax.swing.JLabel();
        AA3 = new javax.swing.JLabel();
        AA4 = new javax.swing.JLabel();
        AA5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/espalda.png"))); // NOI18N
        jButton1.setText("TAQUILLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AD2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AD2.setText("2");
        AD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AD2MouseClicked(evt);
            }
        });

        AD4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AD4.setText("4");
        AD4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AD4MouseClicked(evt);
            }
        });

        AD1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AD1.setText("1");
        AD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AD1MouseClicked(evt);
            }
        });

        AD3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AD3.setText("3");
        AD3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AD3MouseClicked(evt);
            }
        });

        AC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AC2.setText("2");
        AC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC2MouseClicked(evt);
            }
        });

        AD5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AD5.setText("5");
        AD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AD5MouseClicked(evt);
            }
        });

        AC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AC1.setText("1");
        AC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC1MouseClicked(evt);
            }
        });

        AB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AB1.setText("1");
        AB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AB1MouseClicked(evt);
            }
        });

        AC3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AC3.setText("3");
        AC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC3MouseClicked(evt);
            }
        });

        AC4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AC4.setText("4");
        AC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC4MouseClicked(evt);
            }
        });

        AC5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AC5.setText("5");
        AC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC5MouseClicked(evt);
            }
        });

        AB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AB2.setText("2");
        AB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AB2MouseClicked(evt);
            }
        });

        AB3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AB3.setText("3");
        AB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AB3MouseClicked(evt);
            }
        });

        AB4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AB4.setText("4");
        AB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AB4MouseClicked(evt);
            }
        });

        AB5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AB5.setText("5");
        AB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AB5MouseClicked(evt);
            }
        });

        AA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AA1.setText("1");
        AA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AA1MouseClicked(evt);
            }
        });

        AA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AA2.setText("2");
        AA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AA2MouseClicked(evt);
            }
        });

        AA3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AA3.setText("3");
        AA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AA3MouseClicked(evt);
            }
        });

        AA4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AA4.setText("4");
        AA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AA4MouseClicked(evt);
            }
        });

        AA5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sillon_libre.png"))); // NOI18N
        AA5.setText("5");
        AA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AA5MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("D");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("C");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("A");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("B");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escaleras.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AC1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AB2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AB3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AB4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AA2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AA3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AA4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AD2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AC2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AD3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AD4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AC4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AD1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AD5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AB5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AA5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AD4)
                            .addComponent(AD2)
                            .addComponent(AD1)
                            .addComponent(AD3)
                            .addComponent(AD5)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AC2)
                            .addComponent(AC1)
                            .addComponent(AC3)
                            .addComponent(AC4)
                            .addComponent(AC5)
                            .addComponent(jLabel23))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AB1)
                            .addComponent(AB2)
                            .addComponent(AB3)
                            .addComponent(AB4)
                            .addComponent(AB5)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AA1)
                            .addComponent(AA2)
                            .addComponent(AA3)
                            .addComponent(AA4)
                            .addComponent(AA5)
                            .addComponent(jLabel24)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            taquilla l = new taquilla();
            //l.setVisible(true);
            this.setVisible(false);
            System.out.println("Pelicula Seleccionada: "+L.getNamePelicula());
            System.out.println("Lugares elegidos: "+lugares);
            
                                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AD1MouseClicked
       
        // TODO add your handling code here:

       
        
      if(this.AD1.isEnabled()){  
        
        
        
        if(seleccion3 == false){
            this.AD1.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion3 = true;
            D1 = "Ocupado";
            lugares++;
            
        }else{
            this.AB2.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion3 = false;
           
        }
       
      }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    
    }//GEN-LAST:event_AD1MouseClicked

    private void AD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AD2MouseClicked
        // TODO add your handling code here:
        if(this.AD2.isEnabled()){
          if(seleccion1 == false){
            this.AD2.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion1 = true;
            D2 = "Ocupado";
            lugares++;
            
        }else{
            this.AD2.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion1 = false;
        }
        }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AD2MouseClicked

    private void AD4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AD4MouseClicked
        // TODO add your handling code here:
         if(this.AD4.isEnabled()){
        if(seleccion2 == false){
            this.AD4.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion2 = true;
             D4 = "Ocupado";
             lugares++;
            
        }else{
            this.AD4.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion2 = false;
        }
        }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AD4MouseClicked

    private void AD3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AD3MouseClicked
        // TODO add your handling code here:
        if(this.AD3.isEnabled()){
         if(seleccion4 == false){
            this.AD3.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion4 = true;
            D3 = "Ocupado";
            lugares++;
            
        }else{
            this.AD3.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion4 = false;
        }
          }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
         
    }//GEN-LAST:event_AD3MouseClicked

    private void AC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC2MouseClicked
        // TODO add your handling code here:
        if(this.AC2.isEnabled()){
          if(seleccion5 == false){
            this.AC2.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion5 = true;
            C2 = "Ocupado";
            lugares++;
            
        }else{
            this.AC2.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion5 = false;
        }
          }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AC2MouseClicked

    private void AD5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AD5MouseClicked
        // TODO add your handling code here:
        if(this.AD5.isEnabled()){
        if(seleccion6 == false){
            this.AD5.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion6 = true;
            D5 = "Ocupado";
            lugares++;
        }else{
            this.AD5.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion6 = false;
        }
        }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AD5MouseClicked

    private void AC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC1MouseClicked
        // TODO add your handling code here:
        if(this.AC1.isEnabled()){
         if(seleccion8 == false){
            this.AC1.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion8 = true;
            C1 = "Ocupado";
            lugares++;
            
        }else{
            this.AC1.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion8 = false;
        }
          }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AC1MouseClicked

    private void AB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AB1MouseClicked
        // TODO add your handling code here:
        if(this.AB1.isEnabled()){
         if(seleccion9 == false){
            this.AB1.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion9 = true;
             B1 = "Ocupado";
            lugares++;
            
        }else{
            this.AB1.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion9 = false;
        }
            }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AB1MouseClicked

    private void AC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC3MouseClicked
        // TODO add your handling code here:
        if(this.AC3.isEnabled()){
         if(seleccion10 == false){
            this.AC3.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion10 = true;
             C3 = "Ocupado";
            lugares++;
            
        }else{
            this.AC3.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion10 = false;
        }
            }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AC3MouseClicked

    private void AC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC4MouseClicked
        // TODO add your handling code here:
        if(this.AC4.isEnabled()){
        if(seleccion11 == false){
            this.AC4.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion11 = true;
             C4 = "Ocupado";
            lugares++;
            
        }else{
            this.AC4.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion11 = false;
        }
           }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AC4MouseClicked

    private void AC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC5MouseClicked
        // TODO add your handling code here:
        if(this.AC5.isEnabled()){
         if(seleccion12 == false){
            this.AC5.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion12 = true;
             C5 = "Ocupado";
            lugares++;
            
        }else{
            this.AC5.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion12 = false;
        }
          }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AC5MouseClicked

    private void AB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AB2MouseClicked
        // TODO add your handling code here:
        if(this.AB2.isEnabled()){
         if(seleccion13 == false){
            this.AB2.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion13 = true;
            B2 = "Ocupado";
            lugares++;
            
        }else{
            this.AB2.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion13 = false;
        }
           }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AB2MouseClicked

    private void AB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AB3MouseClicked
        // TODO add your handling code here:
         if(this.AB3.isEnabled()){
        if(seleccion14 == false){
            this.AB3.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion14 = true;
            B3 = "Ocupado";
            lugares++;
            
        }else{
            this.AB3.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion14 = false;
        }
         }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AB3MouseClicked

    private void AB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AB4MouseClicked
        // TODO add your handling code here:
        if(this.AB4.isEnabled()){
         if(seleccion15 == false){
            this.AB4.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion15 = true;
            B4 = "Ocupado";
            lugares++;
            
        }else{
            this.AB4.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion15 = false;
        }
           }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AB4MouseClicked

    private void AB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AB5MouseClicked
        // TODO add your handling code here:
         if(this.AB5.isEnabled()){
         if(seleccion16 == false){
            this.AB5.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion16 = true;
            B5 = "Ocupado";
            lugares++;
            
        }else{
            this.AB5.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion16 = false;
        }
            }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AB5MouseClicked

    private void AA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AA1MouseClicked
        // TODO add your handling code here:
        if(this.AA1.isEnabled()){
         if(seleccion17 == false){
            this.AA1.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion17 = true;
            A1 = "Ocupado";
            lugares++;  
        }else{
            this.AA1.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion17 = false;
        }
            }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AA1MouseClicked

    private void AA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AA2MouseClicked
        // TODO add your handling code here:
        if(this.AA2.isEnabled()){
        if(seleccion18 == false){
            this.AA2.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion18 = true;
            A2 = "Ocupado";
            lugares++;
            
        }else{
            this.AA2.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion18 = false;
        }
          }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AA2MouseClicked

    private void AA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AA3MouseClicked
        // TODO add your handling code here:
        if(this.AA3.isEnabled()){
        if(seleccion19 == false){
            this.AA3.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion19 = true;
            A3 = "Ocupado";
            lugares++;
            
        }else{
            this.AA3.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion19 = false;
        }
        }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AA3MouseClicked

    private void AA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AA4MouseClicked
        // TODO add your handling code here:
        if(this.AA4.isEnabled()){
        if(seleccion20 == false){
            this.AA4.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion20 = true;
            A4 = "Ocupado";
            lugares++;
            
        }else{
            this.AA4.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion20 = false;
        }
         }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AA4MouseClicked

    private void AA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AA5MouseClicked
        // TODO add your handling code here:
        if(this.AA5.isEnabled()){
        if(seleccion21 == false){
            this.AA5.setIcon(new ImageIcon("src/img/sillon_disponible.png"));
            seleccion21 = true;
            A5 = "Ocupado";
            lugares++;
            
        }else{
            this.AA5.setIcon(new ImageIcon("src/img/sillon_libre.png"));
            seleccion21 = false;
        }
         }else{
          JOptionPane.showMessageDialog(null, "Ocupado");
      } 
    }//GEN-LAST:event_AA5MouseClicked
 
    
      public int getLugares(){
       return lugares;
}
       
      public void setLugares(int lugares) {
        this.lugares = lugares;
    }
  
 
       public String comprobacion(){
           
           //ASIENTOS FILA D
           if(D1=="Ocupado"){
             this.AD1.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AD1.enable(false);
         }
           
            if(D2=="Ocupado"){
             this.AD2.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AD2.enable(false);
            
         }
            
            if(D4=="Ocupado"){
             this.AD4.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AD4.enable(false);
             
         }
            
            if(D3=="Ocupado"){
             this.AD3.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AD3.enable(false);
             
         }
            
              if(D5=="Ocupado"){
             this.AD5.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AD5.enable(false);
             
         }
              
         //ASIENTOS FILA C
              
             if(C1=="Ocupado"){
             this.AC1.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AC1.enable(false);
         }
           
            if(C2=="Ocupado"){
             this.AC2.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AC2.enable(false);
            
         }
            
            if(C4=="Ocupado"){
             this.AC4.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AC4.enable(false);
             
         }
            
            if(C3=="Ocupado"){
             this.AC3.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AC3.enable(false);
             
         }
            
              if(C5=="Ocupado"){
             this.AC5.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AC5.enable(false);
             
         }
              
       //ASIENTOS FILA B
              
             if(B1=="Ocupado"){
             this.AB1.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AB1.enable(false);
         }
           
            if(B2=="Ocupado"){
             this.AB2.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AB2.enable(false);
            
         }
            
            if(B4=="Ocupado"){
             this.AB4.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AB4.enable(false);
             
         }
            
            if(B3=="Ocupado"){
             this.AB3.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AB3.enable(false);
             
         }
            
              if(B5=="Ocupado"){
             this.AB5.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AB5.enable(false);
             
         }
              
         //ASIENTOS FILA A
              if(A1=="Ocupado"){
             this.AA1.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AA1.enable(false);
         }
           
            if(A2=="Ocupado"){
             this.AA2.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AA2.enable(false);
            
         }
            
            if(A4=="Ocupado"){
             this.AA4.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AA4.enable(false);
             
         }
            
            if(A3=="Ocupado"){
             this.AA3.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AA3.enable(false);
             
         }
            
              if(A5=="Ocupado"){
             this.AA5.setIcon(new ImageIcon("src/img/sillon_ocupado.png"));
             this.AA5.enable(false);
             
         }
       
       return null;
       }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA1;
    private javax.swing.JLabel AA2;
    private javax.swing.JLabel AA3;
    private javax.swing.JLabel AA4;
    private javax.swing.JLabel AA5;
    private javax.swing.JLabel AB1;
    private javax.swing.JLabel AB2;
    private javax.swing.JLabel AB3;
    private javax.swing.JLabel AB4;
    private javax.swing.JLabel AB5;
    private javax.swing.JLabel AC1;
    private javax.swing.JLabel AC2;
    private javax.swing.JLabel AC3;
    private javax.swing.JLabel AC4;
    private javax.swing.JLabel AC5;
    private javax.swing.JLabel AD1;
    private javax.swing.JLabel AD2;
    private javax.swing.JLabel AD3;
    private javax.swing.JLabel AD4;
    private javax.swing.JLabel AD5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
