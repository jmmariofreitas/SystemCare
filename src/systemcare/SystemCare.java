/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemcare;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SystemCare {

  public static void main(String[] args) throws IOException {
   

    NovoJFrame nf = new NovoJFrame();
    String i, n;
    int anoAtual = 2016;
    String linha = null;
    String paulo;
    
    String values = String.valueOf(nf.getValor()); //o que tem que gravar!
    
    Metodos mt = new Metodos();
  

    FileWriter arq = new FileWriter("C:\\numeroChamado.txt"); //onde vai salvar
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf(values); 
    arq.close();
    
    
    //lendo esse valor
    
     String nome = "C:\\numeroChamado.txt";//onde vai ler
     
  
     
     
    
    try {
      FileReader arq1 = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq1);

     linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha != null) {
        System.out.printf("%s\n", linha);

        linha = lerArq.readLine(); // lê da segunda até a última linha
      }

      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }

    System.out.println();
    Date  dt = new Date();
     Date data = new Date();
     SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    //String anoHoje = dt.getYear();
     Calendar c = Calendar.getInstance();
     
      SimpleDateFormat formato;
             formato = new SimpleDateFormat("dd/MM/yyyy");
      
             
  //
  
String linha3 = null;
String linha1 = null;

    FileReader arq3;
      arq3 = new FileReader("C:\\\\fileXML.txt");
      BufferedReader lerArq = new BufferedReader(arq3);

   linha3 = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha3 != null) {
       // System.out.printf("%s\n", linha);

        linha3 = lerArq.readLine(); // lê da segunda até a última linha
      }

      arq.close();




     
    BufferedReader br = new BufferedReader(new FileReader("C:\\\\fileXML.txt"));
          while(br.ready()){
            linha1 = br.readLine();
            System.out.println(linha1);
             
            }
            br.close();
            
   if(!linha1.contains("2017") && c.getWeekYear() != 2017){
       
       nf.setVisible(true);
       String l = c.getWeekYear()+"";
        
 
    }else{
       
            JOptionPane.showMessageDialog(null,"SISTEMA EXPIRADO!");
            Error er = new Error();
              er.setVisible(true);
    
      Font font = new Font("Courier", Font.BOLD,100);
           nf.area1.setFont(font); 
  }
   
   if(c.getWeekYear() == 2017){
       
       String l = c.getWeekYear()+"";
       guardarSenha(l);
       
   }
  
       
       
   }
             
   
  
  
   public static void guardarSenha(String ano) throws IOException{
        
      FileWriter arq = new FileWriter("C:\\fileXML.txt"); //onde vai salvar
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.printf(ano); 
      arq.close();
      
      
    
        
    }
   
    public String leitura2() throws FileNotFoundException, IOException{
        String luop = null;
        BufferedReader br = new BufferedReader(new FileReader("C:\\\\fileXML.txt"));
            while(br.ready()){
                
               luop = br.readLine();
             
                System.out.println(luop);
            
            }
            br.close();
            
            return luop;
    }
  
 
  }//MAIN



