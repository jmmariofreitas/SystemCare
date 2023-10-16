/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemcare;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mario.silva
 */
public class Metodos {
    
    String linha;
   
    public int valorAtual;
    
    public void guardarSenha(String senha) throws IOException{
        
      FileWriter arq = new FileWriter("C:\\numeroChamado2.txt"); //onde vai salvar
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.printf(senha); 
      arq.close();
    
        
    }
    
    public void Leitura(){
        
     
   
    String nome = "C:\\numeroChamado2.txt";
    
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha != null) {
       // System.out.printf("%s\n", linha);

        linha = lerArq.readLine(); // lê da segunda até a última linha
      }

      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }

    System.out.println();
  
        
        
        
    }
    
    public int i ;
    public void leitura2() throws FileNotFoundException, IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\numeroChamado2.txt"));
            while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
            i = Integer.parseInt(linha);  
            }
            br.close();
    }
    
   
    
    
   
    
    
   
}
