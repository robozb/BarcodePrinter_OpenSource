/*
 * Nevjegy.java
 *
 * Created on 2005. janu�r 26., 15:02
 */

package hu.wfs.vonalkod.gui.nevjegy;

/**
 *
 * @author  B�ci
 */
public class Nevjegy_dlg extends javax.swing.JDialog {
	
	/** Creates new form Nevjegy */
	public Nevjegy_dlg(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    private void initComponents() {//GEN-BEGIN:initComponents
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("N\u00e9vjegy panel");
        setResizable(false);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hu/wfs/vonalkod/gui/nevjegy/Nevjegy.gif")));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(new java.awt.Dimension(135, 111));
        jLabel1.setMinimumSize(new java.awt.Dimension(135, 111));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(240, 298));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jButton1.setText("Bez\u00e1r\u00e1s");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton1, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-249)/2, (screenSize.height-353)/2, 249, 353);
    }//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		setVisible(false);
		dispose();
	}//GEN-LAST:event_jButton1ActionPerformed
	

	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
	
}
