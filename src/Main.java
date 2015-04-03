
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BeerSmokinGenius
 */
public class Main {
    static GridBagConstraints c;
    static JTextField entries;
    static JTextField results;
    
    
    
  static ArrayList<String> nput = new ArrayList<>(10); 
  static String termbuf = "";
  static ArrayList<String> oput = new ArrayList<>(10); 
  static boolean newstring = false;
  static boolean rad = true;
  static int parenmatch=0;
  static int textfield;
  static boolean second = false;
  static ArrayList storage[] = new ArrayList[10];
  static boolean sto = false;
  static boolean rec = false;
  
  
  //declare all buttons left to right top to bottom
  private static JButton radB;
  private static JButton clrB;
  private static JButton bakB;
  private static JButton sndB;
  private static JButton eegB;
  private static JButton nlnB;
  private static JButton logB;
  private static JButton absB;
  private static JButton lpaB;
  private static JButton sqrB;
  private static JButton expB;
  private static JButton divB;
  private static JButton sevB;
  private static JButton eigB;
  private static JButton ninB;
  private static JButton mulB;
  private static JButton fouB;
  private static JButton fivB;
  private static JButton sixB;
  private static JButton minB;
  private static JButton oneB;
  private static JButton twoB;
  private static JButton thrB;
  private static JButton pluB;
  private static JButton ansB;
  private static JButton zerB;
  private static JButton dotB;
  private static JButton eqlB; 
  
    
    
    public static void main(String[] args){
       JFrame frame = new JFrame();
       frame.setLayout(new GridBagLayout());
       c = new GridBagConstraints();
       c.insets=new Insets(3,3,3,3);
       makeTextAreas(frame);
       makeButtons(frame);
       makeActions();
       frame.setSize(380,600);
       frame.pack();
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    static void makeTextAreas(JFrame frame){
       entries = new JTextField(34);
       entries.setEditable(false);
       entries.setPreferredSize(new Dimension(380,40));
       entries.setSize(360, 40);
       c.gridx=0;
       c.gridy=0;
       c.gridheight=1;
       c.gridwidth=GridBagConstraints.REMAINDER;
       
       frame.add(entries, c);
       JLabel ansLabel = new JLabel(" answer:");
       c.gridy=1;
       c.gridwidth=1;
       frame.add(ansLabel, c);
       results = new JTextField(25);
       results.setEditable(false);
       results.setPreferredSize(new Dimension(300,40));
       results.setSize(300, 40);
       c.gridwidth=GridBagConstraints.REMAINDER;
       c.gridx=1;
       frame.add(results, c);
    }

    private static void makeButtons(JFrame frame) {

       c.gridwidth=1;
       c.gridheight=1;
       c.anchor=GridBagConstraints.LINE_START;
       
       c.gridy=2;
       
       c.gridx=0;
       radB=new JButton("rad");
       radB.setPreferredSize(new Dimension(90,40));
       frame.add(radB, c);
       
       c.gridx=1;
       clrB=new JButton("clear");
       clrB.setPreferredSize(new Dimension(90,40));
       frame.add(clrB,c);
       
       c.gridx=2;
       bakB=new JButton("back");
       bakB.setPreferredSize(new Dimension(90,40));
       frame.add(bakB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       sndB=new JButton("2nd");
       sndB.setPreferredSize(new Dimension(90,40));
       frame.add(sndB,c);
       
       c.gridy=3;

       c.gridx=0;
       eegB=new JButton("e");
       eegB.setPreferredSize(new Dimension(90,40));
       frame.add(eegB,c);
       
       c.gridx=1;
       nlnB=new JButton("ln");
       nlnB.setPreferredSize(new Dimension(90,40));
       frame.add(nlnB,c);

       c.gridx=2;
       logB=new JButton("log");
       logB.setPreferredSize(new Dimension(90,40));
       frame.add(logB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       absB=new JButton("abs");
       absB.setPreferredSize(new Dimension(90,40));
       frame.add(absB,c);
       
       c.gridy=4;

       c.gridx=0;
       lpaB=new JButton("(");
       lpaB.setPreferredSize(new Dimension(90,40));
       frame.add(lpaB,c);
       
       c.gridx=1;
       sqrB=new JButton("√");
       sqrB.setPreferredSize(new Dimension(90,40));
       frame.add(sqrB,c);

       c.gridx=2;
       expB=new JButton("^");
       expB.setPreferredSize(new Dimension(90,40));
       frame.add(expB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       divB=new JButton("/");
       divB.setPreferredSize(new Dimension(90,40));
       frame.add(divB,c);
       
       c.gridy=5;

       c.gridx=0;
       sevB=new JButton("7");
       sevB.setPreferredSize(new Dimension(90,40));
       frame.add(sevB,c);
       
       c.gridx=1;
       eigB=new JButton("8");
       eigB.setPreferredSize(new Dimension(90,40));
       frame.add(eigB,c);

       c.gridx=2;
       ninB=new JButton("9");
       ninB.setPreferredSize(new Dimension(90,40));
       frame.add(ninB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       mulB=new JButton("*");
       mulB.setPreferredSize(new Dimension(90,40));
       frame.add(mulB,c);

       c.gridy=6;

       c.gridx=0;
       fouB=new JButton("4");
       fouB.setPreferredSize(new Dimension(90,40));
       frame.add(fouB,c);
       
       c.gridx=1;
       fivB=new JButton("5");
       fivB.setPreferredSize(new Dimension(90,40));
       frame.add(fivB,c);

       c.gridx=2;
       sixB=new JButton("6");
       sixB.setPreferredSize(new Dimension(90,40));
       frame.add(sixB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       minB=new JButton("-");
       minB.setPreferredSize(new Dimension(90,40));
       frame.add(minB,c);
       
       c.gridy=7;

       c.gridx=0;
       oneB=new JButton("1");
       oneB.setPreferredSize(new Dimension(90,40));
       frame.add(oneB,c);
       
       c.gridx=1;
       twoB=new JButton("2");
       twoB.setPreferredSize(new Dimension(90,40));
       frame.add(twoB,c);

       c.gridx=2;
       thrB=new JButton("3");
       thrB.setPreferredSize(new Dimension(90,40));
       frame.add(thrB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       pluB=new JButton("+");
       pluB.setPreferredSize(new Dimension(90,40));
       frame.add(pluB,c);
       
       c.gridy=8;

       c.gridx=0;
       ansB=new JButton("ans");
       ansB.setPreferredSize(new Dimension(90,40));
       frame.add(ansB,c);
       
       c.gridx=1;
       zerB=new JButton("0");
       zerB.setPreferredSize(new Dimension(90,40));
       frame.add(zerB,c);

       c.gridx=2;
       dotB=new JButton(".");
       dotB.setPreferredSize(new Dimension(90,40));
       frame.add(dotB,c);
       
       c.gridx=3;
       c.gridwidth=GridBagConstraints.REMAINDER;
       eqlB=new JButton("=");
       eqlB.setPreferredSize(new Dimension(90,40));
       frame.add(eqlB,c);
       
    }

    private static void makeActions() {
       radB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(rad==true){
                    radB.setText("deg");
                    rad=false;
                }
                else{
                    radB.setText("rad");
                    rad=true;
       }
            }
        });
       
       clrB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    entries.setText("");
                    termbuf="";
                    parenmatch=0;
                    nput.clear();// TODO add your handling code here:
                    sto= false;
                    eqlB.setText("=");
            }
        });
       bakB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  
        if(nput.size()!=0){
        if(termbuf.equals("")){
            if(nput.get(nput.size()-1).equals("(")){
                parenmatch-=1;
                if(parenmatch==0){
                    eqlB.setText("=");
                }
            }
              if(nput.size()>=3&&nput.get(nput.size()-3).equals("(")&&nput.get(nput.size()-1).equals(")") &&(nput.get(nput.size()-2).equals(String.valueOf(Math.E))|| nput.get(nput.size()-2).equals(String.valueOf(Math.PI)))){//removing greek
                nput.subList(nput.size()-3, nput.size()).clear();
                //parenmatch-=1;
            }
              else if(nput.size()>=3&&nput.get(nput.size()-3).equals("(")&&nput.get(nput.size()-1).equals(")") &&oput.size()>0&&nput.get(nput.size()-2).equals(oput.get(0))){//removing ans
                  nput.subList(nput.size()-3, nput.size()).clear();
              }
              else if(nput.size()>-1&&nput.get(nput.size()-1).equals(")")){
                parenmatch+=1;
                eqlB.setText(")");
                nput.remove(nput.size()-1);
            }

            else{
                  nput.remove(nput.size()-1);
            }
           // System.out.print(nput);
            entries.setText("");
        for(int i=0;i<nput.size(); i++){
            entries.setText(entries.getText() + nput.get(i));
        }
        }// TODO add your handling code here:
        else{
            entries.setText("");
        for(int i=0;i<nput.size(); i++){
            entries.setText(entries.getText() + nput.get(i));
        }
       // System.out.print(nput);
        termbuf="";
        }
        newstring=false;
        }
        else{
            termbuf="";
            entries.setText("");
        }
            }
        });

       
      
       
      sndB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               second = !second;
    if(second){
    ansB.setText("Store");
    dotB.setText("Rec");
    sevB.setText("sin");
    eigB.setText("asin");
    mulB.setText("sinh");
    ninB.setText("csc");
    fouB.setText("cos");
    fivB.setText("acos");
    sixB.setText("sec");
    minB.setText("cosh");
    oneB.setText("tan");
    twoB.setText("atan");
    thrB.setText("cot");
    pluB.setText("tanh");
    eegB.setText("π");
    logB.setText("!");
    sqrB.setText("ⁿ√");
    nlnB.setText("nCr");
    absB.setText("nPr");
    
    }
    
    
    else{
        ansB.setText("ans");
        dotB.setText(".");
        sevB.setText("7");
        eigB.setText("8");
        mulB.setText("*");
        ninB.setText("9");
        fouB.setText("4");
        fivB.setText("5");
        sixB.setText("6");
        minB.setText("-");
        oneB.setText("1");
        twoB.setText("2");
        thrB.setText("3");
        pluB.setText("+");
        eegB.setText("e");
        logB.setText("log");
        sqrB.setText("√");
        nlnB.setText("ln");
        absB.setText("abs");
    }    
            }
        });
      
      
      
    eegB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 if(sto==false){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("e");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + 'e');
        }
        if(termbuf.equals("")){
            nput.add("(");
            nput.add("e");
            nput.add(")");      
        }
        else{
            nput.add(termbuf);
            nput.add("(");
            nput.add("e");
            nput.add(")");
            termbuf="";

        }
       }
           else{
            if(newstring){
            nput=new ArrayList(10);
            entries.setText("π");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + 'π');
        }
        if(termbuf.equals("")){
            nput.add("(");
            nput.add(String.valueOf(Math.PI));
            nput.add(")");      
        }
        else{
            nput.add(termbuf);
            nput.add("(");
            nput.add("π");
            nput.add(")");
            termbuf="";

        }
           }
       }
            }
        });
     
        
    nlnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("ln(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "ln(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("ln");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("ln");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
        }
        else{
            
            if(newstring){
            nput=new ArrayList(10);
            entries.setText(" nCr  ");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + " nCr ");
        }
        if(termbuf.equals("")){
            nput.add(" nCr ");     
        }
        else{
            nput.add(termbuf);
            nput.add(" nCr ");
            termbuf="";

        }
           }
        }
    
            }
        });  
      
        logB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("log(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "log(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("log");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("log");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
        }
          else{
            if(newstring){
            nput=new ArrayList(10);
            entries.setText("!");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '!');
        }
        if(termbuf.equals("")){
            nput.add("!");     
        }
        else{
            nput.add(termbuf);
            nput.add("!");
            termbuf="";

        }
           }
    }
            }
        });
        
        absB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("abs(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "abs(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("abs");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("abs");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
        }   
            
            else{
            
            if(newstring){
            nput=new ArrayList(10);
            entries.setText(" nPr  ");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + " nPr ");
        }
        if(termbuf.equals("")){
            nput.add(" nPr ");     
        }
        else{
            nput.add(termbuf);
            nput.add(" nPr ");
            termbuf="";

        }
           }
        }
            }
        });
        
        lpaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + '(');
        }
        eqlB.setText(")");
            if(termbuf.equals("")){
                nput.add("(");
            }
            else{
                nput.add(termbuf);
                nput.add("(");
                termbuf="";

            }
        }
            }
        });
        
        sqrB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("√");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + "√");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("√");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("√");
            termbuf="";

        }
        }
     else{
           if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"ⁿ√");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + "ⁿ√");
        }
        if(termbuf.equals("")){
            nput.add("ⁿ√");     
        }
        else{
            nput.add(termbuf);
            nput.add("ⁿ√");
            termbuf="";

        }
           }
    }
            }
        });
        
        expB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"^");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '^');
        }
        if(termbuf.equals("")){
            nput.add("^");
        }
        else{
            nput.add(termbuf);
            nput.add("^");
            termbuf="";

        }
        }
            }
        });
        
        divB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
        if(newstring){
            nput=new ArrayList(10);
           if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"/");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '/');
        }
        if(termbuf.equals("")){
            nput.add("/");
        }
        else{
            nput.add(termbuf);
            nput.add("/");
            termbuf="";

        }
        }
            }
        });
        
        sevB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("7");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '7');
        }
        termbuf = termbuf+'7';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("sin(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "sin(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sin");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sin");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
               else{
           if(rec&&storage[7]!=null){
               nput.add("(");
               nput.addAll(storage[7]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[7] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        eigB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("8");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '8');
        }
        termbuf = termbuf+'8';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("asin(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "asin(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("asin");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("asin");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
               else{
           if(rec&&storage[8]!=null){
               nput.add("(");
               nput.addAll(storage[8]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[8] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        ninB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("9");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '9');
        }
        termbuf = termbuf+'9';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("csc(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "csc(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("csc");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("csc");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
            else{
           if(rec&&storage[9]!=null){
               nput.add("(");
               nput.addAll(storage[9]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[9] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        mulB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"*");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '*');
        }
        if(termbuf.equals("")){
            nput.add("*");
        }
        else{
            nput.add(termbuf);
            nput.add("*");
            termbuf="";

        }
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("sinh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "sinh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sinh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sinh");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
            }
        });
        
        fouB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("4");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '4');
        }
        termbuf = termbuf+'4';// TODO add your handling code here:
        }
                        else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("cos(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "cos(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cos");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cos");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
               else{
           if(rec&&storage[4]!=null){
               nput.add("(");
               nput.addAll(storage[4]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[4] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        fivB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("5");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '5');
        }
        termbuf = termbuf+'5';// TODO add your handling code here:
       }
                       else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("acos(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "acos(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("acos");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("acos");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
       }
              else{
           if(rec&&storage[5]!=null){
               nput.add("(");
               nput.addAll(storage[5]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[5] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        sixB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("6");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '6');
        }
        termbuf = termbuf+'6';// TODO add your handling code here:
        }
                        else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("sec(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "sec(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sec");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sec");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
               else{
           if(rec&&storage[6]!=null){
               nput.add("(");
               nput.addAll(storage[6]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[6] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        minB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"-");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '-');
        }
        
if(nput.size()>0&&!isSymbola(nput.get(nput.size()-1))&&termbuf.equals("")){
                nput.add("-");
            }
        else if(termbuf.equals("")){
            termbuf="-";
        }
        
        else{
            nput.add(termbuf);
            nput.add("-");
            termbuf="";
        }
        ////System.out.println(nput);
       }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("cosh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "cosh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cosh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cosh");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
       }
            }
        });
        
        oneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("1");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '1');
        }
        termbuf = termbuf+'1';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("tan(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "tan(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tan");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tan");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
            
        }
               else{
           if(rec&&storage[1]!=null){
               nput.add("(");
               nput.addAll(storage[1]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[1] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        twoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("2");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '2');
        }       // TODO add your handling code here:
        termbuf = termbuf+'2';
       }
           else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("atan(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "atan(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("atan");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("atan");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
       }
              else{
           if(rec&&storage[2]!=null){
               nput.add("(");
               nput.addAll(storage[2]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[2] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        thrB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("3");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '3');
        }
        termbuf = termbuf+'3';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("cot(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "cot(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cot");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cot");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
               else{
           if(rec&&storage[3]!=null){
               nput.add("(");
               nput.addAll(storage[3]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[3] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        pluB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            entries.setText(oput.get(0)+"+");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '+');
        }
        if(nput.size()>0&&!isSymbola(nput.get(nput.size()-1))&&termbuf.equals("")){
                nput.add("+");
            }
        else if(termbuf.equals("")){
            termbuf="+";
        }
        
        else{
            nput.add(termbuf);
            nput.add("+");
            termbuf="";

        }
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("tanh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            entries.setText(entries.getText() + "tanh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tanh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tanh");
            nput.add("(");
            termbuf="";

        }
        eqlB.setText(")");
          
            }
        }
            }
        });
        
        ansB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(!sto){
        if(second==false){
            if(newstring){
                
                if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
                    nput=new ArrayList(10);
                entries.setText("("+results.getText()+ ")");
                }
                else{
                    results.setText("unable to use ans");
                }
                newstring=false;
                parenmatch=0;
            }
            else{
             if(!(results.getText().equals("")||(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax")))){
                    entries.setText(entries.getText() + "(" + results.getText() + ")");
             }
            }
            if(!termbuf.equals("")){
                nput.add(termbuf);
                termbuf = "";
            }
      if(!(results.getText().equals("")||(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax")))){
                nput.add("(");
                nput.addAll(oput); 
                nput.add(")");
            }
        }
        else{
            if(!termbuf.equals("")){
                nput.add(termbuf);
            }
            sto = true;
            entries.setText("Choose store location(0-9)  ");
            second = !second;
    if(second){
    ansB.setText("Store");
    dotB.setText("Rec");
    sevB.setText("sin");
    eigB.setText("asin");
    mulB.setText("sinh");
    ninB.setText("csc");
    fouB.setText("cos");
    fivB.setText("acos");
    sixB.setText("sec");
    minB.setText("cosh");
    oneB.setText("tan");
    twoB.setText("atan");
    thrB.setText("cot");
    pluB.setText("tanh");
    eegB.setText("π");
    }
    else{
        ansB.setText("ans");
        dotB.setText(".");
        sevB.setText("7");
        eigB.setText("8");
        mulB.setText("*");
        ninB.setText("9");
        fouB.setText("4");
        fivB.setText("5");
        sixB.setText("6");
        minB.setText("-");
        oneB.setText("1");
        twoB.setText("2");
        thrB.setText("3");
        pluB.setText("+");
        eegB.setText("e");
    }
        }
        }
            }
        });
        
        zerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!sto){
        //  if()
        if(newstring){
            nput=new ArrayList(10);
            entries.setText("0");
            newstring=false;
            parenmatch=0;
        }
        else{
            entries.setText(entries.getText() + '0');
        }
        termbuf = termbuf+'0';
       }
       else{
           if(rec&&storage[0]!=null){
               nput.add("(");
               nput.addAll(storage[0]);
               nput.add(")");
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
           else{
               storage[0] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               entries.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   entries.setText(entries.getText() + nput.get(i));
               }
           }
       }
            }
        });
        
        dotB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(!sto){
        if(second==false){
            if(newstring){
                nput=new ArrayList(10);
                entries.setText(".");
                newstring=false;
                parenmatch=0;
            }
            else{
                entries.setText(entries.getText() + ".");
            }
            termbuf = termbuf + ".";
         }
         else
         {
            if(!termbuf.equals("")){
                nput.add(termbuf);
            }
             sto = true;
             rec=true;
             entries.setText("Choose recall location(0-9)  ");
             second = !second;
    if(second){
    ansB.setText("Store");
    dotB.setText("Rec");
    sevB.setText("sin");
    eigB.setText("asin");
    mulB.setText("sinh");
    ninB.setText("csc");
    fouB.setText("cos");
    fivB.setText("acos");
    sixB.setText("sec");
    minB.setText("cosh");
    oneB.setText("tan");
    twoB.setText("atan");
    thrB.setText("cot");
    pluB.setText("tanh");
    eegB.setText("π");
    }
    else{
        ansB.setText("ans");
        dotB.setText(".");
        sevB.setText("7");
        eigB.setText("8");
        mulB.setText("*");
        ninB.setText("9");
        fouB.setText("4");
        fivB.setText("5");
        sixB.setText("6");
        minB.setText("-");
        oneB.setText("1");
        twoB.setText("2");
        thrB.setText("3");
        pluB.setText("+");
        eegB.setText("e");
    }
         }
        }
            }
        });
        

      
            eqlB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 if(sto==false){
        if(parenmatch==0){
        if(!(termbuf.equals(""))){
            nput.add(termbuf);
        }
        //System.out.print(nput);
        termbuf="";
        results.setText("");
        oput = evaluate((ArrayList)nput.clone());

        for(int i=0; i<oput.size();i++){
               double val = Double.parseDouble((String)oput.get(i));
               if(hasDecimal(val)){
               results.setText(results.getText()+Double.toString(val)); 
               }
               else{
                   results.setText(results.getText()+(int)val);
               }
               
            

        }
        newstring=true;
        }
        else{
        if(parenmatch>0&&newstring==false){
        parenmatch-=1;
        if(newstring){
            nput=new ArrayList(10);
            entries.setText(")");
            newstring=false;
        }
        else{
            entries.setText(entries.getText() + ')');
        }
        if(termbuf.equals("")){
            nput.add(")");
        }
        else{
            nput.add(termbuf);
            nput.add(")");
            termbuf="";

        }
       }
        if(parenmatch==0){
            eqlB.setText("=");
        }
        }
        }   
            }
        }); 
    }
    
    
    
     public static ArrayList evaluate(ArrayList input){

       makeSenseNums(input);
    if(parenmatch!=0){
        input = new ArrayList(1);
        input.add("unable to match parentheses");
        return input;
    }
    int i = 0;
    int q = 0;
    boolean hasextrap=false;
    try{
    while(i<input.size()){
        
        if((input.get(i)).equals("(")){
            int j = i+1;
            while (j<input.size()){
                if (input.get(j).equals("(")){
                    i=j;
                    hasextrap=true;
                }
                if (input.get(j).equals(")")){
                    String test = "*";//*related
                    if(i==j-1){
                        input= (new ArrayList(1));
                        input.add("() bad math operation");
                        return input;
                    }
                    if(i>0){
                 test = ((String)(input.get(i-1)));
                    }
                   
                  input.addAll(i,evaluate(new ArrayList(input.subList(i+1,j))));
                  input.subList(i+1,j+2).clear();///must fix for when result arrayList is > size 1
                  if(i>1){
                  if(isSymbola((String)input.get(i-2))&&input.get(i-1).equals("-")){
                   input.set(i, String.valueOf(-1*Double.parseDouble((String)input.get(i))));
                   input.remove(i-1);
                  }
                  }
                  if(!isSymbola(test)){
                      input.add(i,"*");
                      i=i+1;
                  }
                  if(i<input.size()-1&&!isSymbolb((String)input.get(i+1))&&!input.get(i+1).equals(")")){
                      input.add(i+1, "*");
                     // System.out.println(input.get(i));
                  }
                  
                  
                         
                  j=input.size();
                  i=0;//resets i and j to go throught the terms again for parentheses
                  
                }
                j++;
            }
            
        }//parentheses are gonna be harder than I thought
        
     i++;
        if(hasextrap){
            i=0;
            hasextrap=false;
        }
    }
    i=0;
        
    
    while(i<input.size()){
        
        if(input.get(i).equals("π")){
            input.set(i,String.valueOf(Math.PI));
        }
        if(input.get(i).equals("e")){
            input.set(i,String.valueOf(Math.E));
        }
        if(input.get(i).equals("abs")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.abs(b)));
            input.remove(i+1); 
            //System.out.println(input);
        }
        if(input.get(i).equals("ln")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.log(b)));
            input.remove(i+1); 
        }
        if(input.get(i).equals("log")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.log10(b)));
            input.remove(i+1); 
            
        }
        if(input.get(i).equals("sin")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.sin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.sin(b)));
                input.remove(i+1);
            } 
        }     
        if(input.get(i).equals("cos")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.cos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.cos(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("tan")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.tan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.tan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("csc")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.sin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.sin(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("sec")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.cos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.cos(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("cot")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.tan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.tan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("acos")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.acos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.acos(b)));
                input.remove(i+1);
            }  
        }
        if(input.get(i).equals("asin")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.asin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.asin(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("atan")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.atan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.atan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("cosh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.cosh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.cosh(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("sinh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.sinh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.sinh(b)));
                input.remove(i+1);
            }  
        }
        if(input.get(i).equals("tanh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.tanh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.tanh(b)));
                input.remove(i+1);
            }  
        }
        i++;
    }
    i=input.indexOf("!");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            input.set(i,String.valueOf(fact(b)));
            if(!((input.size()-1)==i)){
                if(!isSymbolb((String)input.get(i+1))){
                    input.add(i+1, "*");
                }
            }
            input.remove(i-1);
            
            
            i=input.indexOf("!");

        }
    i=input.indexOf(" nCr ");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            double c = fact(a)*fact(b-a);
             a = fact(b);
            input.set(i,String.valueOf(a/c));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf(" nCr ");

        }
    i=input.indexOf(" nPr ");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(fact(b)/fact(a)));
            System.out.print(input);
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf(" nPr ");

        }
       
    i=input.indexOf("√");
       while(i>-1){
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,0.5)));
            input.remove(i+1);
            i=input.indexOf("√");

        }
    i=input.indexOf("ⁿ√");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,Math.pow(b,-1))));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("ⁿ√");

        }
       
    i=input.indexOf("^");
       while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,b)));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("^");

        }
    i=input.indexOf("*");
    q=input.indexOf("/");
        while(i>-1||q>-1){
            
            if(i<q && i!=-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a*b));
            input.remove(i-1);
            input.remove(i);
            }
            
            else if(i>q && q!=-1){
            double a = Double.parseDouble((String)input.get(q-1));
            double b = Double.parseDouble((String)input.get(q+1));
            input.set(q,String.valueOf(a/b));
            input.remove(q-1);
            input.remove(q);
            }
            
            else if(i<q && i==-1){
            double a = Double.parseDouble((String)input.get(q-1));
            double b = Double.parseDouble((String)input.get(q+1));
            input.set(q,String.valueOf(a/b));
            input.remove(q-1);
            input.remove(q);
            }
            
            else if(i>q && q==-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a*b));
            input.remove(i-1);
            input.remove(i);
            }
            
            i=input.indexOf("*");
            q=input.indexOf("/");
        }
     i=input.indexOf("+");
     q=input.indexOf("-");
        while(i>-1||q>-1){
            
            if(i<q && i!=-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a+b));
            input.remove(i-1);
            input.remove(i);
            }
            
            else if(i>q && q!=-1){
            double a = Double.parseDouble((String)input.get(q-1));
            double b = Double.parseDouble((String)input.get(q+1));
            input.set(q,String.valueOf(a-b));
            input.remove(q-1);
            input.remove(q);
            }
            
            else if(i<q && i==-1){
            double a = Double.parseDouble((String)input.get(q-1));
            double b = Double.parseDouble((String)input.get(q+1));
            input.set(q,String.valueOf(a-b));
            input.remove(q-1);
            input.remove(q);
            }
            
            else if(i>q && q==-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a+b));
            input.remove(i-1);
            input.remove(i);
            }
            
            i=input.indexOf("+");
            q=input.indexOf("-");
        }
        
     i=input.indexOf("-");
        while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a-b));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("-");

        }
        
             
          return input;    
        }
    
    catch(Exception nfe){
        //System.out.println(input);
    input.clear();
    input.add("invalid syntax");
    return input;
}
    }
     

    public static void makeSenseNums(ArrayList<String> eq){
    for(int i=0; i<eq.size()-1; i++ ){
        if(!isSymbola(eq.get(i))&&!isSymbolb(eq.get(i))&&!isSymbola(eq.get(i+1))&&!isSymbolb(eq.get(i+1))){
            eq.set(i, eq.get(i)+eq.get(i+1));
            eq.remove(i+1);
        }
    }
    }
public static boolean isSymbola(String exp){
    if(exp.equals("cos")){
        return true;
    }
    if(exp.equals(" nCr ")){
        return true;
    }
    if(exp.equals(" nPr ")){
        return true;
    }
    if(exp.equals("acos")){
        return true;
    }
    if(exp.equals("asin")){
        return true;
    }
    if(exp.equals("atan")){
        return true;
    }
    if(exp.equals("√")){
        return true;
    }
    if(exp.equals("log")){
        return true;
    }
    if(exp.equals("ln")){
        return true;
    }
    if(exp.equals("sin")){
        return true;
    }
    if(exp.equals("tan")){
        return true;
    }
    if(exp.equals("cot")){
        return true;
    }
    if(exp.equals("sec")){
        return true;
    }
    if(exp.equals("csc")){
        return true;
    }
    if(exp.equals("cosh")){
        return true;
    }
    if(exp.equals("sinh")){
        return true;
    }
    if(exp.equals("tanh")){
        return true;
    }
    if(exp.equals("abs")){
        return true;
    }
    if(exp.equals("(")){
        return true;
    }
    if(exp.equals("^")){
        return true;
    }
    if(exp.equals("*")){
        return true;
    }
    if(exp.equals("/")){
        return true;
    }
    if(exp.equals("+")){
        return true;
    }
    if(exp.equals("-")){
        return true;
    }
    if(exp.equals("ⁿ√")){
        return true;
    }
            
    return false;
}
    public static boolean isSymbolb(String exp){
    if(exp.equals(")")){
        return true;
    }
    if(exp.equals(" nPr ")){
        return true;
    }
    if(exp.equals("^")){
        return true;
    }
    if(exp.equals("*")){
        return true;
    }
    if(exp.equals("ⁿ√")){
        return true;
    }
     if(exp.equals(" nCr ")){
        return true;
    }
    if(exp.equals("!")){
        return true;
    }
    if(exp.equals("/")){
        return true;
    }
    if(exp.equals("+")){
        return true;
    }
    if(exp.equals("-")){
        return true;
    }
    return false;
}
    
public static double fact (double i){
        double fact = 1;
        if((Math.round(i*1000000.0)/1000000.0<0)||(Math.round(i*1000000.0)/1000000.0)%1!=0){
            return Double.NaN;
        }
        else{
        while(i>0){
            if(i==0){
                return fact;
            }
            else{
                fact = fact*(Math.round(i*1000000.0)/1000000.0);
                i=i-1;
            }
        }
        return fact;
        }
    }

public static boolean hasDecimal (double i){
    if((Math.round(i*1000000.0)/1000000.0)%1!=0){
        return true;
    }
    else{
        return false;
    }
}
}
    

    



