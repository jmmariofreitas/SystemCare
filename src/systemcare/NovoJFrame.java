
package systemcare;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;
import static java.lang.String.valueOf;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author mario.silva
 */
public class NovoJFrame extends javax.swing.JFrame {

    //variaveis
    
     Date hr = new Date();
    
    String numero;
     int valor ;
    
    
    Object[] opcoes = { "sim", "não" };
    Object resposta;
    
    public NovoJFrame() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        area1 = new javax.swing.JTextField();
        CHAMANDO1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretaria Municipal de Saúde - Sistema de Chamados");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        area1.setEditable(false);
        area1.setBackground(new java.awt.Color(51, 51, 255));
        area1.setFont(new java.awt.Font("Miriam", 1, 48)); // NOI18N
        area1.setForeground(new java.awt.Color(255, 255, 255));
        area1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        area1.setText("Read");
        area1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        area1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area1ActionPerformed(evt);
            }
        });

        CHAMANDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CH_ATD.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/A1.png"))); // NOI18N

        adicionar.setText("Ficha Inicial");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        Proximo.setText("Próximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jButton1.setText("Chamar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titulo.setEditable(false);
        titulo.setBackground(new java.awt.Color(51, 51, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo.setText("SECRETARIA MUNICIPAL DE SAÚDE");
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        area3.setEditable(false);
        area3.setBackground(new java.awt.Color(51, 51, 255));
        area3.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        area3.setForeground(new java.awt.Color(255, 0, 51));
        area3.setRows(5);
        area3.setToolTipText("");
        jScrollPane1.setViewportView(area3);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CALLING SYSTEM COMPUTER EASY - @ ALTERBYTE COMPUTER SYSTEM");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        hora1.setBackground(new java.awt.Color(255, 255, 255));
        hora1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hora1.setForeground(new java.awt.Color(0, 51, 255));
        hora1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cabo de Santo Agostinho - PE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addComponent(area1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 490, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CHAMANDO1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionar)
                        .addGap(18, 18, 18)
                        .addComponent(Proximo)
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHAMANDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(area1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void area1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area1ActionPerformed
        // TODO add your handling code here:
        
           Font font2 = new Font("Courier", Font.BOLD,120);
         area1.setFont(font2);
         
    }//GEN-LAST:event_area1ActionPerformed
 int b = 0;
 int i;
 
 int xy = 0;
 
    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
           
        
        if(valor >= 2000){
            
           valor= 0;
           
        }
        
        area1.setBackground(Color.BLUE);
        area1.setForeground(Color.WHITE);
        titulo.setText(" SECRETARIA MUNICIPAL DE SAUDE ");
        area3.setBackground(Color.BLUE);
        area3.setForeground(Color.YELLOW);
        
       audio();
       //audioz(1); aqui iria falar a senha que esta sendo chamadaa!
        
        Font font = new Font("Courier", Font.BOLD,120);
            setValor(getValor() + 1);
              mudar = 1;
            area1.setFont(font);
            area1.setText("SENHA "+valor);
             Font font2 = new Font("Courier", Font.BOLD,60);
             
                area3.setFont(font2);
            
            if(xy == 0){
                xy =1;
               // area2.setText(area1.getText());
                area3.setText("                                                 "+area1.getText());
                 //area2.setText(area1.getText());
                
            }else{
               // area2.setText("\n"+area2.getText()+"\n"+area1.getText());
               
                area3.setText(area3.getText()+"\n                                                 "+area1.getText());
               // area2.setText("\n"+area2.getText()+"\n      "+area1.getText());
            }
       
       //valor++; 
       escrever();
        
    }//GEN-LAST:event_ProximoActionPerformed

    void audioz(int v){
        
        URL url  = getClass().getResource("senha"+v+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        
    } //captura o audio com base no numero que vier para popular o metodo
    public void audio(){
         URL url  = getClass().getResource("beep.wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        //192.168.92.000 
        //esse ip recebera o conteudo!
    }
     public void audio2(){
         URL url  = getClass().getResource("beep.wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
    
    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        
       //esse metodo aki pergunta ao usuario qual o valor será digitado!
       ler();
        numero = JOptionPane.showInputDialog("Qual será o proximo valor?", metodos.i);
        setValor(Integer.parseInt(numero));
        if(Integer.parseInt(numero) >= 2000 ){
           numero = "1";
           valor = 0;
           Font font = new Font("Courier", Font.BOLD,120);
                area1.setFont(font);
                area1.setText("SENHA "+getValor());
       }
        else{
                
                Font font = new Font("Courier", Font.BOLD,120);
                area1.setFont(font);
                area1.setText("SENHA "+getValor());
            
        }
        
   
    }//GEN-LAST:event_adicionarActionPerformed

    
    int mudar = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  
        if(mudar == 0){
            audio();
        }else if(mudar == 1){
            
         area1.setBackground(Color.ORANGE);
         area1.setForeground(Color.black);
         mudar++;
         audio2();
         
        }
        else if(mudar == 2){
            area1.setBackground(Color.RED);
            area1.setForeground(Color.BLACK);
            mudar++;
            audio2(); 
        }else if(mudar == 3){
            area1.setBackground(Color.YELLOW);
            area1.setForeground(Color.BLUE);
            mudar++;
            audio2();    
        }
        
        else if(mudar == 4){
            area1.setBackground(Color.RED);
            area1.setForeground(Color.YELLOW);
            mudar++;
            audio2(); 
        }else{
            mudar = 0;
             audio();
            area1.setBackground(Color.BLUE);
            area1.setForeground(Color.WHITE);
            audio();
            setValor(getValor() + 1);
            area1.setText("SENHA "+getValor());
            area3.setText(area3.getText()+"\n                                                 "+"SENHA "+getValor());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
Metodos metodos = new Metodos();
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        
        do {
                resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?","Sair",JOptionPane.PLAIN_MESSAGE,null,opcoes,"não");
                if(resposta.equals("sim")){
                    this.setVisible(false);
                    try {
                        metodos.guardarSenha(valueOf(getValor()));
                    } catch (IOException ex) {
                        Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }while (resposta == null || resposta.equals("não"));
         

    }//GEN-LAST:event_SairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
         try {
             metodos.guardarSenha(valueOf(getValor()));
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }//GEN-LAST:event_formWindowClosed

    void ler(){
        try {
             metodos();
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
 
        try {
             metodos.leitura2();
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
    }
    
    void escrever(){
        try {
             metodos.guardarSenha(valueOf(getValor()));
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         try {
             metodos();
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
 
        try {
             metodos.leitura2();
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     SimpleDateFormat formato;
     Date data = new Date();
     Calendar c = Calendar.getInstance();
     formato = new SimpleDateFormat("dd/MM/yyyy");
     
     Timer timer;
         timer = new Timer(1000, new hora());
     timer.start();
     
     hora1.setHorizontalAlignment(SwingConstants.CENTER);
     hora1.setText(formato.format(c.getTime()));
     
    //area3.setHorizontalAlignment(SwingConstants.CENTER);
      
      
         
    }//GEN-LAST:event_formWindowOpened

    public void metodos() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\numeroChamado2.txt"));
            while(br.ready()){
            String linha = br.readLine();
            //System.out.println(linha);
            if(Integer.parseInt(linha) >= 2000){
                valor = 0;
            }else{
               valor = Integer.parseInt(linha);
               valor -=1; 
            }
            
            }
            br.close();
    }
    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String hora;
            String data;
           
            Calendar now = Calendar.getInstance();
           // System.out.println(String.format("%1$tH:%1$tM:%1$ts",now));
           hora1.setHorizontalAlignment(SwingConstants.CENTER);
           
           hora1.setText(String.format("%1$tH:%1$tM:%1$tS",now));
           
           hora =  String.format("%1$tH:%1$tM:%1$tS",now);
           Calendar c = Calendar.getInstance();
           SimpleDateFormat formato;
             formato = new SimpleDateFormat("dd/MM/yyyy");
             data = formato.format(c.getTime());
            //JOptionPane.showMessageDialog(null, hora+" "+ data);
        
        }
    }
    
    
    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       Date d = new Date();
       Calendar cal = new GregorianCalendar();
       
       Date data = new Date();
       SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
           
            //titulo.setText("Cabo de Santo Agostinho - PE "+ hr.getHours()+":"+hr.getMinutes()+" HORA ATUAL \n "+formatador.format(data));
          
       
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         try {
             // TODO add your handling code here:
             
             
             metodos.guardarSenha(valueOf(getValor()));
         } catch (IOException ex) {
             Logger.getLogger(NovoJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_formWindowClosing

   
    
private void setIcon() {
 
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone001.png")));
   
 }

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
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void valueInicial(int count){
               int ip = count; 
               
                
            }
            public void run() {

                
                new NovoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CHAMANDO1;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Sair;
    private javax.swing.JButton adicionar;
    public javax.swing.JTextField area1;
    private javax.swing.JTextArea area3;
    private javax.swing.JLabel hora1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
