/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.LTutorias;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author panamericana
 */
public class HorarioEstudiante extends javax.swing.JFrame {
LTutorias ltu = new LTutorias();
String l="",m="",mi="",j="",v="";
long scc=0;

    /**
     * Creates new form HorarioTutor
     */
    public HorarioEstudiante() {
        initComponents();
        Fondo2 f= new Fondo2();
        this.add(f, BorderLayout.CENTER);
        this.pack();
        String sFichero = "Horario Estudiante.csv";
            File fichero = new File(sFichero);
            if(fichero.exists()){

           ltu.cargararchivohest();}
    
    }

    public void setScc(long scc) {
        this.scc = scc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:00", null, null, null, null, null},
                {"8:00", null, null, null, null, null},
                {"9:00 ", null, null, null, null, null},
                {"10:00 ", null, null, null, null, null},
                {"11:00 ", null, null, null, null,  new Boolean(false)},
                {"12:00", null, null, null, null, null},
                {"13:00", null, null, null, null, null},
                {"14:00", null, null, null, null, null},
                {"15:00", null, null, null, null, null},
                {"16:00",  new Boolean(false), null, null, null, null},
                {"17:00", null, null, null, null, null},
                {"18:00", null, null, null, null, null},
                {"19:00", null, null, null, null, null},
                {"20:00", null, null, null, null, null}
            },
            new String [] {
                "Hora/Dia", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Guardar mi horario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(39, 39, 39));
        jLabel30.setText("Ingrese la disponibilidad horaria:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel30)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
TableModel modelo = jTable1.getModel();

String sFichero = "Horario Estudiante.csv";
            File fichero = new File(sFichero);
            if(fichero.exists()){
}else{
    try {
        ltu.crearcvshest();
    } catch (IOException ex) {
        Logger.getLogger(HorarioTutor.class.getName()).log(Level.SEVERE, null, ex);
    }
            }

        System.out.println("cc"+scc);

   for (int i = 0; i < 14; i++) {
               
        if(modelo.getValueAt(i,1)==null){
            l="No disponible"; 
            System.out.println(""+l);
      }
      else
       {
             l="Disponible";
             System.out.println(""+l);
         }
         if(modelo.getValueAt(i,2)==null){
             m="No disponible"; 
             System.out.println(""+m);
            
         }
         else
         {
             m="Disponible";
             System.out.println(""+m);
         }
         if(modelo.getValueAt(i,3)==null){
             mi="No disponible"; 
             System.out.println(""+mi);
            
         }
         else
         {
             mi="Disponible";
             System.out.println(""+mi);
         }
         if(modelo.getValueAt(i,4)==null){
             j="No disponible"; 
             System.out.println(""+j);
            
         }
         else
         {
             j="Disponible";
             System.out.println(""+j);
         }
         if(modelo.getValueAt(i,5)==null){
             v="No disponible"; 
             System.out.println(""+v);
            
         }
         else
         {
             v="Disponible";
             System.out.println(""+v);
         }
         
         
          ltu.crearhest(modelo.getValueAt(i,0).toString(), l, m, mi, j, v,scc );
           
             
    
  }
    try {
        ltu.crearcvshest();
    } catch (IOException ex) {
        Logger.getLogger(HorarioEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    }
           JOptionPane.showMessageDialog(null, "Horario guardado",null,JOptionPane.INFORMATION_MESSAGE);   

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.show(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
