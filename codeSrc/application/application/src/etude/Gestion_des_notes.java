package etude;


import etude.Connecter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Gestion_des_notes extends javax.swing.JFrame {

    /**
     * Creates new form Gestion_des_notes
     */
    Connecter conn=new Connecter();
    Statement stm;
    ResultSet Rs;
    DefaultTableModel model=new DefaultTableModel();
    public Gestion_des_notes() {
        initComponents();
              
model.addColumn("id");
model.addColumn("nom");
model.addColumn("prenom");
model.addColumn("branche");
model.addColumn("note");
try {
stm=conn.obtenirconnexion().createStatement();
ResultSet Rs=stm.executeQuery("Select * from etudient");
while(Rs.next()){
model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nom"),Rs.getString("Prenom"),
    Rs.getString("branche"),Rs.getString("note")});

}
}catch(Exception e){System.err.println(e);}

tble.setModel(model);

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnot = new javax.swing.JTextField();
        txtbr = new javax.swing.JComboBox();
        txtpr = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/supprimer.png"))); 
        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 340, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); 
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 340, 130, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); 
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(830, 340, 50, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier.png"))); 
        jButton4.setText("actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(470, 340, 140, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/actualiser.png"))); 
        jButton5.setText("modifier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(160, 340, 130, 40);

        txtre.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txtre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreActionPerformed(evt);
            }
        });
        txtre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreKeyPressed(evt);
            }
        });
        getContentPane().add(txtre);
        txtre.setBounds(620, 340, 200, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); 
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("gestion des notes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 10, 370, 70);

        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 100, 560, 200);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel2.setText("id :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 80, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("Nom :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 80, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel3.setText("Prenom:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 90, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel4.setText("Branche :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 90, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel5.setText("note  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 270, 70, 22);

        txtnot.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txtnot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotActionPerformed(evt);
            }
        });
        getContentPane().add(txtnot);
        txtnot.setBounds(140, 270, 170, 30);

        txtbr.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        txtbr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DSI", "SE", "CPI", "MI", "PME/PMI" }));
        txtbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrActionPerformed(evt);
            }
        });
        getContentPane().add(txtbr);
        txtbr.setBounds(140, 220, 170, 30);

        txtpr.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        getContentPane().add(txtpr);
        txtpr.setBounds(140, 180, 170, 30);

        txtno.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        getContentPane().add(txtno);
        txtno.setBounds(140, 140, 170, 30);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(140, 100, 170, 30);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("ajouter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("modifier");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem3.setText("supprimer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("actualiser");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("rechercher");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("realiser par");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }
private void deplace(int i){
try {
txtid.setText(model.getValueAt(i,0).toString());
txtno.setText(model.getValueAt(i,1).toString());
txtpr.setText(model.getValueAt(i,2).toString());
txtbr.setSelectedItem(model.getValueAt(i,3).toString());
txtnot.setText(model.getValueAt(i,4).toString());
}catch (Exception e){System.err.println(e);
JOptionPane.showMessageDialog(null,"erreur de deplacement"+e.getLocalizedMessage());}
}

private void afficher(){
try {
    model.setRowCount(0);
stm=conn.obtenirconnexion().createStatement();
ResultSet rs=stm.executeQuery("Select * from etudient");
while(rs.next()){
model.addRow(new Object[]{rs.getString("id"),rs.getString("Nom"),rs.getString("Prenom"),
    rs.getString("branche"),rs.getString("note")});

}
}catch(Exception e){System.err.println(e);}

tble.setModel(model);
}
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtreActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtnotActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void tbleMouseClicked(java.awt.event.MouseEvent evt) {
try{
int i=tble.getSelectedRow();deplace(i);
}catch(Exception e){JOptionPane.showMessageDialog(null,"erreur de deplacement "+e.getLocalizedMessage());}
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		
        try{
        	Integer id=Integer.parseInt(txtid.getText());
            String nom=txtno.getText();
            String prenom=txtpr.getText();
            String branche=txtbr.getSelectedItem().toString();
            String note=txtnot.getText();
            String requete="insert into etudient(id,Nom,Prenom,branche,note)VALUES('"+
                    id+"','"+nom+"','"+prenom+"','"+branche+"','"+note+"')";
        stm.executeUpdate(requete);
JOptionPane.showMessageDialog(null,"l'etudient est bien ajouter");
id=id+1;
txtno.setText("");
txtpr.setText("");txtbr.setSelectedItem(2);txtnot.setText("");txtid.setText(id.toString());
afficher();

        
        }catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
afficher();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE etudient SET Nom='"+txtno.getText()+"',Prenom='"+txtpr.getText()+
                        "',branche='"+txtbr.getSelectedItem().toString()+"',note='"+txtnot.getText()+
                        "' WHERE id= "+txtid.getText());
                txtno.setText("");
                txtpr.setText("");txtbr.setSelectedItem(2);txtnot.setText("");txtid.setText("");
                afficher();
           
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!"+e.getMessage());
        System.err.println(e);}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIrsT:event_jButton1ActionPerformed
try {
             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un etudient,est ce que tu et sure?"
                     ,"supprimer etudient",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtid.getText().length() != 0){
        stm.executeUpdate("Delete From etudient where id = "+txtid.getText()); afficher();
           
            }
            
            else { JOptionPane.showMessageDialog(null,"veuillez SVP remplire le champ id !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());} 
       

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
try {
           model.setRowCount(0);// pour vider la list des etudient
      {
       Rs = stm.executeQuery("Select * From etudient WHERE nom = '"+txtre.getText()+"'");
       }while (Rs.next()){
       Object [] etudient ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getInt(5)};
     model.addRow(etudient);
       } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun etudient");
       
       } else{ int i=0;
       deplace(i);
       txtre.setText("");
       }
       
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
        	Integer id=Integer.parseInt(txtid.getText());
            String nom=txtno.getText();
            String prenom=txtpr.getText();
            String branche=txtbr.getSelectedItem().toString();
            String note=txtnot.getText();
            String requete="insert into etudient(id,Nom,Prenom,branche,note)VALUES('"+
                    id+"','"+nom+"','"+prenom+"','"+branche+"','"+note+"')";
        stm.executeUpdate(requete);
JOptionPane.showMessageDialog(null,"l'etudient est bien ajouter");
id=id+1;
txtno.setText("");
txtpr.setText("");txtbr.setSelectedItem(2);txtnot.setText("");txtid.setText(id.toString());
afficher();


        
        }catch(Exception ex){JOptionPane.showMessageDialog(null,"l id est déja attribué pour un etudient déja existe a notre base de donneé SVp change l id"+ex.getMessage());}
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE etudient SET Nom='"+txtpr.getText()+"',Prenom='"+txtpr.getText()+
                        "',branche='"+txtbr.getSelectedItem().toString()+"',note='"+txtnot.getText()+
                        "' WHERE id= "+txtid.getText());
                txtno.setText("");
                txtpr.setText("");txtbr.setSelectedItem(2);txtnot.setText("");txtid.setText("");
                afficher();
           
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!"+e.getMessage());
        System.err.println(e);}
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
try {
             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un etudient,est ce que tu et sure?"
                     ,"supprimer etudient",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtid.getText().length() != 0){
        stm.executeUpdate("Delete From etudient where id = "+txtid.getText()); afficher();
             }
            else { JOptionPane.showMessageDialog(null,"veuillez SVP remplire le champ id !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());} 

    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
    	txtno.setText("");
    	txtpr.setText("");txtbr.setSelectedItem(2);txtnot.setText("");txtid.setText("");
afficher();
    }

    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
try {
           model.setRowCount(0);// pour vider la list des client
      {
       Rs = stm.executeQuery("Select * From etudient WHERE note = '"+txtre.getText()+"'");
       }while (Rs.next()){
       
       Object [] etudient ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getInt(5)};
     model.addRow(etudient);
       } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun etudient");
       
       } else{ int i=0;
       deplace(i);
       txtre.setText("");
       }
       
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }

    private void txtreKeyPressed(java.awt.event.KeyEvent evt) {
if (evt.getKeyCode()==KeyEvent.VK_ENTER)//tu click sur entré et il va commencer
{try {
           model.setRowCount(0);// pour vider la list des etudient
      {
       Rs = stm.executeQuery("Select * From etudient WHERE note = '"+txtre.getText()+"'");
       }while (Rs.next()){
       
       Object [] etudient ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getInt(5)};
     model.addRow(etudient);
       } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun etudient");
       
       } else{ int i=0;
       deplace(i);
       txtre.setText("");
       }
       
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }}
    }

    private void txtbrActionPerformed(java.awt.event.ActionEvent evt) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_des_notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tble;
    private javax.swing.JComboBox txtbr;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtnot;
    private javax.swing.JTextField txtpr;
    private javax.swing.JTextField txtre;
}
