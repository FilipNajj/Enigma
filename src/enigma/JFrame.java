package enigma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
/**
 *
 * @author danin
 */
public class JFrame extends javax.swing.JFrame {
    
        int count = 0;
        static String texteCrypter="";
        static String r1="";
        static int compte_etapesuivante=0;
        
        static int decalageb1_1;
	static String  r1_1;
	static String gd1_1;
	static int decalageb2_1;
	static String r2_1;
	static String gd2_1;
	static int decalageb3_1;
	static String r3_1;
	static String gd3_1;
        
	static int[] reflecteur= { 25,23,21,19,17,15,13,11,9,7,5,3,1,-1,-3,-5,-7,-9,-11,-13,-15,-17,-19,-21,-23,-25}; 
	static int[][] rotor3 = {{12,-1,23,10,2,14,5,-5,9,-2,-13,10,-2,-8,10,-6,6,-16,2,-1,-17,-5,-14,-9,-20,-10},
	                          {1,16,5,17,20,8,-2,2,14,6,2,-5,-12,-10,9,10,5,-9,1,-14,-2,-10,-6,13,-10,-23 }};
	static int[][] rotor2 ={{25,7,17,-3,13,19,12,3,-1,11,5,-5,-7,10,-2,1,-2,4,-17,-8,-16,-18,-9,-1,-22,-16},
	                         {3,17,22,18,16,7,5,1,-7,16,-3,8,2,9,2,-5,-1,-13,-12,-17,-11,-4,1,-10,-19,-25}};
	static int[][] rotor1 = {{17,4,19,21,7,11,3,-5,7,9,-10,9,17,6,-6,-2,-4,-7,-12,-5,3,4,-21,-16,-2,-21},
	                          {10,21,5,-17,21,-4,12,16,6,-3,7,-7,4,2,5,-7,-11,-17,-9,-6,-9,-19,2,-3,-21,-4}};
	static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        
        //Fonction servant à faire des décalage à droite
public static void decalageDroite(int [][]rotor, int decalage_nombre) {
			int [][] rotor_nouveau= new int[rotor.length][rotor[0].length];
			for( int i=0;i<rotor[0].length;i++) {
				int nouvellePosition= (i+ decalage_nombre)%rotor[0].length;
				rotor_nouveau[0][nouvellePosition]=rotor[0][i];
			for( int k=0;k<rotor[0].length;k++) {
				int nouvellePosition_deux= (k+ decalage_nombre)%rotor[0].length;
				rotor_nouveau[1][nouvellePosition_deux]=rotor[1][k];
				}
				}
			if(Arrays.equals(rotor, rotor1)) {
				rotor1=rotor_nouveau;
			}else if(Arrays.equals(rotor, rotor2)) {
				rotor2=rotor_nouveau;
			}else if(Arrays.equals(rotor, rotor3)) {
				rotor3=rotor_nouveau;
			}
                
        txtTable.setText(String.valueOf(rotor1[0][0]) + "    " +String.valueOf(rotor1[0][1]) + "    "
        + String.valueOf(rotor1[0][2])+ "    "+ 
        String.valueOf(rotor1[0][3])+ "    " + 
        String.valueOf(rotor1[0][4])+ "    "+
        String.valueOf(rotor1[0][5])+ "    "+
        String.valueOf(rotor1[0][6])+ "    "+
        String.valueOf(rotor1[0][7])+ "    "+
        String.valueOf(rotor1[0][8])+ "    "+
        String.valueOf(rotor1[0][9])+ "    "+
        String.valueOf(rotor1[0][10])+ "    "+
        String.valueOf(rotor1[0][11])+ "    "+
        String.valueOf(rotor1[0][12])+ "    "+
        String.valueOf(rotor1[0][13])+ "    "+
        String.valueOf(rotor1[0][14])+ "    "+
        String.valueOf(rotor1[0][15])+ "    "+
        String.valueOf(rotor1[0][16])+ "    "+
        String.valueOf(rotor1[0][17])+ "    "+
        String.valueOf(rotor1[0][18])+ "    "+
        String.valueOf(rotor1[0][19])+ "    "+
        String.valueOf(rotor1[0][20])+ "    "+
        String.valueOf(rotor1[0][21])+ "    "+
        String.valueOf(rotor1[0][22])+ "    "+
        String.valueOf(rotor1[0][23])+ "    "+
        String.valueOf(rotor1[0][24])+ "    "+
        String.valueOf(rotor1[0][25]));


        jR11.setText(String.valueOf(rotor1[1][0]) + "    " +String.valueOf(rotor1[1][1]) + "    "
        + String.valueOf(rotor1[1][2])+ "    "+ 
        String.valueOf(rotor1[1][3])+ "    " + 
        String.valueOf(rotor1[1][4])+ "    "+
        String.valueOf(rotor1[1][5])+ "    "+
        String.valueOf(rotor1[1][6])+ "    "+
        String.valueOf(rotor1[1][7])+ "    "+
        String.valueOf(rotor1[1][8])+ "    "+
        String.valueOf(rotor1[1][9])+ "    "+
        String.valueOf(rotor1[1][10])+ "    "+
        String.valueOf(rotor1[1][11])+ "    "+
        String.valueOf(rotor1[1][12])+ "    "+
        String.valueOf(rotor1[1][13])+ "    "+
        String.valueOf(rotor1[1][14])+ "    "+
        String.valueOf(rotor1[1][15])+ "    "+
        String.valueOf(rotor1[1][16])+ "    "+
        String.valueOf(rotor1[1][17])+ "    "+
        String.valueOf(rotor1[1][18])+ "    "+
        String.valueOf(rotor1[1][19])+ "    "+
        String.valueOf(rotor1[1][20])+ "    "+
        String.valueOf(rotor1[1][21])+ "    "+
        String.valueOf(rotor1[1][22])+ "    "+
        String.valueOf(rotor1[1][23])+ "    "+
        String.valueOf(rotor1[1][24])+ "    "+
        String.valueOf(rotor1[1][25]));
        
        jR20.setText(String.valueOf(rotor2[0][0]) + "    " +String.valueOf(rotor2[0][1]) + "    "
        + String.valueOf(rotor2[0][2])+ "    "+ 
        String.valueOf(rotor2[0][3])+ "    " + 
        String.valueOf(rotor2[0][4])+ "    "+
        String.valueOf(rotor2[0][5])+ "    "+
        String.valueOf(rotor2[0][6])+ "    "+
        String.valueOf(rotor2[0][7])+ "    "+
        String.valueOf(rotor2[0][8])+ "    "+
        String.valueOf(rotor2[0][9])+ "    "+
        String.valueOf(rotor2[0][10])+ "    "+
        String.valueOf(rotor2[0][11])+ "    "+
        String.valueOf(rotor2[0][12])+ "    "+
        String.valueOf(rotor2[0][13])+ "    "+
        String.valueOf(rotor2[0][14])+ "    "+
        String.valueOf(rotor2[0][15])+ "    "+
        String.valueOf(rotor2[0][16])+ "    "+
        String.valueOf(rotor2[0][17])+ "    "+
        String.valueOf(rotor2[0][18])+ "    "+
        String.valueOf(rotor2[0][19])+ "    "+
        String.valueOf(rotor2[0][20])+ "    "+
        String.valueOf(rotor2[0][21])+ "    "+
        String.valueOf(rotor2[0][22])+ "    "+
        String.valueOf(rotor2[0][23])+ "    "+
        String.valueOf(rotor2[0][24])+ "    "+
        String.valueOf(rotor2[0][25]));
         
         jR21.setText(String.valueOf(rotor2[1][0]) + "    " +String.valueOf(rotor2[1][1]) + "    "
        + String.valueOf(rotor2[1][2])+ "    "+ 
        String.valueOf(rotor2[1][3])+ "    " + 
        String.valueOf(rotor2[1][4])+ "    "+
        String.valueOf(rotor2[1][5])+ "    "+
        String.valueOf(rotor2[1][6])+ "    "+
        String.valueOf(rotor2[1][7])+ "    "+
        String.valueOf(rotor2[1][8])+ "    "+
        String.valueOf(rotor2[1][9])+ "    "+
        String.valueOf(rotor2[1][10])+ "    "+
        String.valueOf(rotor2[1][11])+ "    "+
        String.valueOf(rotor2[1][12])+ "    "+
        String.valueOf(rotor2[1][13])+ "    "+
        String.valueOf(rotor2[1][14])+ "    "+
        String.valueOf(rotor2[1][15])+ "    "+
        String.valueOf(rotor2[1][16])+ "    "+
        String.valueOf(rotor2[1][17])+ "    "+
        String.valueOf(rotor2[1][18])+ "    "+
        String.valueOf(rotor2[1][19])+ "    "+
        String.valueOf(rotor2[1][20])+ "    "+
        String.valueOf(rotor2[1][21])+ "    "+
        String.valueOf(rotor2[1][22])+ "    "+
        String.valueOf(rotor2[1][23])+ "    "+
        String.valueOf(rotor2[1][24])+ "    "+
        String.valueOf(rotor2[1][25]));
         
          jR30.setText(String.valueOf(rotor3[0][0]) + "  " +String.valueOf(rotor3[0][1]) + "  "
        + String.valueOf(rotor3[0][2])+ "    "+ 
        String.valueOf(rotor3[0][3])+ "    " + 
        String.valueOf(rotor3[0][4])+ "    "+
        String.valueOf(rotor3[0][5])+ "    "+
        String.valueOf(rotor3[0][6])+ "    "+
        String.valueOf(rotor3[0][7])+ "    "+
        String.valueOf(rotor3[0][8])+ "    "+
        String.valueOf(rotor3[0][9])+ "    "+
        String.valueOf(rotor3[0][10])+ "    "+
        String.valueOf(rotor3[0][11])+ "    "+
        String.valueOf(rotor3[0][12])+ "    "+
        String.valueOf(rotor3[0][13])+ "    "+
        String.valueOf(rotor3[0][14])+ "    "+
        String.valueOf(rotor3[0][15])+ "    "+
        String.valueOf(rotor3[0][16])+ "    "+
        String.valueOf(rotor3[0][17])+ "    "+
        String.valueOf(rotor3[0][18])+ "    "+
        String.valueOf(rotor3[0][19])+ "    "+
        String.valueOf(rotor3[0][20])+ "    "+
        String.valueOf(rotor3[0][21])+ "    "+
        String.valueOf(rotor3[0][22])+ "    "+
        String.valueOf(rotor3[0][23])+ "    "+
        String.valueOf(rotor3[0][24])+ "    "+
        String.valueOf(rotor3[0][25]));
          
          jR31.setText(String.valueOf(rotor3[1][0]) + "  " +String.valueOf(rotor3[1][1]) + "  "
        + String.valueOf(rotor3[1][2])+ "    "+ 
        String.valueOf(rotor3[1][3])+ "    " + 
        String.valueOf(rotor3[1][4])+ "    "+
        String.valueOf(rotor3[1][5])+ "    "+
        String.valueOf(rotor3[1][6])+ "    "+
        String.valueOf(rotor3[1][7])+ "    "+
        String.valueOf(rotor3[1][8])+ "    "+
        String.valueOf(rotor3[1][9])+ "    "+
        String.valueOf(rotor3[1][10])+ "    "+
        String.valueOf(rotor3[1][11])+ "    "+
        String.valueOf(rotor3[1][12])+ "    "+
        String.valueOf(rotor3[1][13])+ "    "+
        String.valueOf(rotor3[1][14])+ "    "+
        String.valueOf(rotor3[1][15])+ "    "+
        String.valueOf(rotor3[1][16])+ "    "+
        String.valueOf(rotor3[1][17])+ "    "+
        String.valueOf(rotor3[1][18])+ "    "+
        String.valueOf(rotor3[1][19])+ "    "+
        String.valueOf(rotor3[1][20])+ "    "+
        String.valueOf(rotor3[1][21])+ "    "+
        String.valueOf(rotor3[1][22])+ "    "+
        String.valueOf(rotor3[1][23])+ "    "+
        String.valueOf(rotor3[1][24])+ "    "+
        String.valueOf(rotor3[1][25]));
  }
  
  //Fonction servant ï¿½ faire des dï¿½calage ï¿½ gauche
public static void decalageGauche(int [][]rotor, int decalage_nombre) {
		int [][] rotor_nouveau= new int[rotor.length][rotor[0].length];
		for( int i=rotor[0].length-1;i>=0;i--) {
			int nouvellePosition= (i+ (rotor[0].length-decalage_nombre))%rotor[0].length;
			rotor_nouveau[0][nouvellePosition]=rotor[0][i];
		for( int k=rotor[0].length-1;k>=0;k--) {
			int nouvellePosition_deux= (k + (rotor[0].length-decalage_nombre))%rotor[0].length;
			rotor_nouveau[1][nouvellePosition_deux]=rotor[1][k];}
		    }
		if(Arrays.equals(rotor, rotor1)) {
			rotor1=rotor_nouveau;
		}else if(Arrays.equals(rotor, rotor2)) {
			rotor2=rotor_nouveau;
		}else if(Arrays.equals(rotor, rotor3)) {
			rotor3=rotor_nouveau;
		}
        txtTable.setText(String.valueOf(rotor1[0][0]) + "    " +String.valueOf(rotor1[0][1]) + "    "
        + String.valueOf(rotor1[0][2])+ "    "+ 
        String.valueOf(rotor1[0][3])+ "    " + 
        String.valueOf(rotor1[0][4])+ "    "+
        String.valueOf(rotor1[0][5])+ "    "+
        String.valueOf(rotor1[0][6])+ "    "+
        String.valueOf(rotor1[0][7])+ "    "+
        String.valueOf(rotor1[0][8])+ "    "+
        String.valueOf(rotor1[0][9])+ "    "+
        String.valueOf(rotor1[0][10])+ "    "+
        String.valueOf(rotor1[0][11])+ "    "+
        String.valueOf(rotor1[0][12])+ "    "+
        String.valueOf(rotor1[0][13])+ "    "+
        String.valueOf(rotor1[0][14])+ "    "+
        String.valueOf(rotor1[0][15])+ "    "+
        String.valueOf(rotor1[0][16])+ "    "+
        String.valueOf(rotor1[0][17])+ "    "+
        String.valueOf(rotor1[0][18])+ "    "+
        String.valueOf(rotor1[0][19])+ "    "+
        String.valueOf(rotor1[0][20])+ "    "+
        String.valueOf(rotor1[0][21])+ "    "+
        String.valueOf(rotor1[0][22])+ "    "+
        String.valueOf(rotor1[0][23])+ "    "+
        String.valueOf(rotor1[0][24])+ "    "+
        String.valueOf(rotor1[0][25]));


        jR11.setText(String.valueOf(rotor1[1][0]) + "    " +String.valueOf(rotor1[1][1]) + "    "
        + String.valueOf(rotor1[1][2])+ "    "+ 
        String.valueOf(rotor1[1][3])+ "    " + 
        String.valueOf(rotor1[1][4])+ "    "+
        String.valueOf(rotor1[1][5])+ "    "+
        String.valueOf(rotor1[1][6])+ "    "+
        String.valueOf(rotor1[1][7])+ "    "+
        String.valueOf(rotor1[1][8])+ "    "+
        String.valueOf(rotor1[1][9])+ "    "+
        String.valueOf(rotor1[1][10])+ "    "+
        String.valueOf(rotor1[1][11])+ "    "+
        String.valueOf(rotor1[1][12])+ "    "+
        String.valueOf(rotor1[1][13])+ "    "+
        String.valueOf(rotor1[1][14])+ "    "+
        String.valueOf(rotor1[1][15])+ "    "+
        String.valueOf(rotor1[1][16])+ "    "+
        String.valueOf(rotor1[1][17])+ "    "+
        String.valueOf(rotor1[1][18])+ "    "+
        String.valueOf(rotor1[1][19])+ "    "+
        String.valueOf(rotor1[1][20])+ "    "+
        String.valueOf(rotor1[1][21])+ "    "+
        String.valueOf(rotor1[1][22])+ "    "+
        String.valueOf(rotor1[1][23])+ "    "+
        String.valueOf(rotor1[1][24])+ "    "+
        String.valueOf(rotor1[1][25]));
         
        jR20.setText(String.valueOf(rotor2[0][0]) + "    " +String.valueOf(rotor2[0][1]) + "    "
        + String.valueOf(rotor2[0][2])+ "    "+ 
        String.valueOf(rotor2[0][3])+ "    " + 
        String.valueOf(rotor2[0][4])+ "    "+
        String.valueOf(rotor2[0][5])+ "    "+
        String.valueOf(rotor2[0][6])+ "    "+
        String.valueOf(rotor2[0][7])+ "    "+
        String.valueOf(rotor2[0][8])+ "    "+
        String.valueOf(rotor2[0][9])+ "    "+
        String.valueOf(rotor2[0][10])+ "    "+
        String.valueOf(rotor2[0][11])+ "    "+
        String.valueOf(rotor2[0][12])+ "    "+
        String.valueOf(rotor2[0][13])+ "    "+
        String.valueOf(rotor2[0][14])+ "    "+
        String.valueOf(rotor2[0][15])+ "    "+
        String.valueOf(rotor2[0][16])+ "    "+
        String.valueOf(rotor2[0][17])+ "    "+
        String.valueOf(rotor2[0][18])+ "    "+
        String.valueOf(rotor2[0][19])+ "    "+
        String.valueOf(rotor2[0][20])+ "    "+
        String.valueOf(rotor2[0][21])+ "    "+
        String.valueOf(rotor2[0][22])+ "    "+
        String.valueOf(rotor2[0][23])+ "    "+
        String.valueOf(rotor2[0][24])+ "    "+
        String.valueOf(rotor2[0][25]));
         
         jR21.setText(String.valueOf(rotor2[1][0]) + "    " +String.valueOf(rotor2[1][1]) + "    "
        + String.valueOf(rotor2[1][2])+ "    "+ 
        String.valueOf(rotor2[1][3])+ "    " + 
        String.valueOf(rotor2[1][4])+ "    "+
        String.valueOf(rotor2[1][5])+ "    "+
        String.valueOf(rotor2[1][6])+ "    "+
        String.valueOf(rotor2[1][7])+ "    "+
        String.valueOf(rotor2[1][8])+ "    "+
        String.valueOf(rotor2[1][9])+ "    "+
        String.valueOf(rotor2[1][10])+ "    "+
        String.valueOf(rotor2[1][11])+ "    "+
        String.valueOf(rotor2[1][12])+ "    "+
        String.valueOf(rotor2[1][13])+ "    "+
        String.valueOf(rotor2[1][14])+ "    "+
        String.valueOf(rotor2[1][15])+ "    "+
        String.valueOf(rotor2[1][16])+ "    "+
        String.valueOf(rotor2[1][17])+ "    "+
        String.valueOf(rotor2[1][18])+ "    "+
        String.valueOf(rotor2[1][19])+ "    "+
        String.valueOf(rotor2[1][20])+ "    "+
        String.valueOf(rotor2[1][21])+ "    "+
        String.valueOf(rotor2[1][22])+ "    "+
        String.valueOf(rotor2[1][23])+ "    "+
        String.valueOf(rotor2[1][24])+ "    "+
        String.valueOf(rotor2[1][25]));
        
          jR30.setText(String.valueOf(rotor3[0][0]) + "  " +String.valueOf(rotor3[0][1]) + "  "
        + String.valueOf(rotor3[0][2])+ "    "+ 
        String.valueOf(rotor3[0][3])+ "    " + 
        String.valueOf(rotor3[0][4])+ "    "+
        String.valueOf(rotor3[0][5])+ "    "+
        String.valueOf(rotor3[0][6])+ "    "+
        String.valueOf(rotor3[0][7])+ "    "+
        String.valueOf(rotor3[0][8])+ "    "+
        String.valueOf(rotor3[0][9])+ "    "+
        String.valueOf(rotor3[0][10])+ "    "+
        String.valueOf(rotor3[0][11])+ "    "+
        String.valueOf(rotor3[0][12])+ "    "+
        String.valueOf(rotor3[0][13])+ "    "+
        String.valueOf(rotor3[0][14])+ "    "+
        String.valueOf(rotor3[0][15])+ "    "+
        String.valueOf(rotor3[0][16])+ "    "+
        String.valueOf(rotor3[0][17])+ "    "+
        String.valueOf(rotor3[0][18])+ "    "+
        String.valueOf(rotor3[0][19])+ "    "+
        String.valueOf(rotor3[0][20])+ "    "+
        String.valueOf(rotor3[0][21])+ "    "+
        String.valueOf(rotor3[0][22])+ "    "+
        String.valueOf(rotor3[0][23])+ "    "+
        String.valueOf(rotor3[0][24])+ "    "+
        String.valueOf(rotor3[0][25]));
          
          jR31.setText(String.valueOf(rotor3[1][0]) + "  " +String.valueOf(rotor3[1][1]) + "  "
        + String.valueOf(rotor3[1][2])+ "    "+ 
        String.valueOf(rotor3[1][3])+ "    " + 
        String.valueOf(rotor3[1][4])+ "    "+
        String.valueOf(rotor3[1][5])+ "    "+
        String.valueOf(rotor3[1][6])+ "    "+
        String.valueOf(rotor3[1][7])+ "    "+
        String.valueOf(rotor3[1][8])+ "    "+
        String.valueOf(rotor3[1][9])+ "    "+
        String.valueOf(rotor3[1][10])+ "    "+
        String.valueOf(rotor3[1][11])+ "    "+
        String.valueOf(rotor3[1][12])+ "    "+
        String.valueOf(rotor3[1][13])+ "    "+
        String.valueOf(rotor3[1][14])+ "    "+
        String.valueOf(rotor3[1][15])+ "    "+
        String.valueOf(rotor3[1][16])+ "    "+
        String.valueOf(rotor3[1][17])+ "    "+
        String.valueOf(rotor3[1][18])+ "    "+
        String.valueOf(rotor3[1][19])+ "    "+
        String.valueOf(rotor3[1][20])+ "    "+
        String.valueOf(rotor3[1][21])+ "    "+
        String.valueOf(rotor3[1][22])+ "    "+
        String.valueOf(rotor3[1][23])+ "    "+
        String.valueOf(rotor3[1][24])+ "    "+
        String.valueOf(rotor3[1][25]));
  }
        
        
        
    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configurer = new javax.swing.JButton();
        buttonE = new javax.swing.JButton();
        etapeSuivante = new javax.swing.JButton();
        buttonD = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rot1 = new javax.swing.JTextField();
        GD1 = new javax.swing.JTextField();
        dec1 = new javax.swing.JTextField();
        rot2 = new javax.swing.JTextField();
        GD2 = new javax.swing.JTextField();
        dec2 = new javax.swing.JTextField();
        rot3 = new javax.swing.JTextField();
        GD3 = new javax.swing.JTextField();
        dec3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTable = new javax.swing.JTextField();
        jR11 = new javax.swing.JTextField();
        jR21 = new javax.swing.JTextField();
        jR20 = new javax.swing.JTextField();
        jR30 = new javax.swing.JTextField();
        jR31 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        configurer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        configurer.setText("Configurer");
        configurer.setAlignmentY(1.0F);
        configurer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        configurer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurerActionPerformed(evt);
            }
        });

        buttonE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonE.setText("Encrypter");
        buttonE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        buttonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEActionPerformed(evt);
            }
        });

        etapeSuivante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etapeSuivante.setText("Étape suivante");
        etapeSuivante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        etapeSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etapeSuivanteActionPerformed(evt);
            }
        });

        buttonD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonD.setText("Décrypter");
        buttonD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        buttonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(232, 229, 229));
        txt1.setFont(new java.awt.Font("Urdu Typesetting", 0, 17)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("Écrire le message à encrypter");
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt1MousePressed(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt2.setBackground(new java.awt.Color(232, 229, 229));
        txt2.setFont(new java.awt.Font("Urdu Typesetting", 0, 17)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("Écrire le message à décrypter");
        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt2MouseReleased(evt);
            }
        });
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Clé (sous forme de 3 triplets) :");

        rot1.setBackground(new java.awt.Color(244, 243, 243));
        rot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rot1ActionPerformed(evt);
            }
        });

        GD1.setBackground(new java.awt.Color(244, 243, 243));

        dec1.setBackground(new java.awt.Color(244, 243, 243));
        dec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec1ActionPerformed(evt);
            }
        });

        rot2.setBackground(new java.awt.Color(244, 243, 243));

        GD2.setBackground(new java.awt.Color(244, 243, 243));

        dec2.setBackground(new java.awt.Color(244, 243, 243));

        rot3.setBackground(new java.awt.Color(244, 243, 243));

        GD3.setBackground(new java.awt.Color(244, 243, 243));

        dec3.setBackground(new java.awt.Color(244, 243, 243));

        jLabel2.setText("(");

        jLabel3.setText(",");

        jLabel4.setText(",");

        jLabel5.setText(")");

        jLabel6.setText("(");

        jLabel7.setText(",");

        jLabel8.setText(",");

        jLabel9.setText(")");

        jLabel10.setText("(");

        jLabel11.setText(",");

        jLabel12.setText(",");

        jLabel13.setText(")");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Affiche le résultat de l'encryption :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Affiche le résultat de la décryption :");

        txtTable.setEditable(false);
        txtTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTable.setText("17    4    19     21    7      11    3    -5      7    9   -10    9   17    6  -6    -2    -4       -7   -12   -5      3      4   -21  -16    -2    -21");
        txtTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTableMousePressed(evt);
            }
        });
        txtTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTableActionPerformed(evt);
            }
        });

        jR11.setEditable(false);
        jR11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jR11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jR11.setText("10    21    5    -17    21    -4    12    16    6    -3    7    -7    4    2    5    -7    -11    -17    -9    -6    -9    -19    2    -3    -21    -4");
        jR11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jR11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jR11MousePressed(evt);
            }
        });

        jR21.setEditable(false);
        jR21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jR21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jR21.setText("3    17    22    18    16    7    5    1    -7    16    -3    8    2    9    2    -5    -1    -13    -12    -17    -11    -4    1    -10    -19    -25");
        jR21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jR20.setEditable(false);
        jR20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jR20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jR20.setText("25    7    17    -3    13    19    12    3    -1    11    5    -5    -7    10    -2    1    -2    4    -17    -8    -16    -18    -9    -1    -22  -16");
        jR20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jR20.setPreferredSize(new java.awt.Dimension(457, 22));

        jR30.setEditable(false);
        jR30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jR30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jR30.setText("12  -1    23    10    2    14    5    -5    9    -2    -13    10    -2    -8    10    -6    6    -16    2    -1    -17    -5    -14    -9    -20  -10");
        jR30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jR31.setEditable(false);
        jR31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jR31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jR31.setText("  1    16    5    17    20    8    -2    2    14    6    2    -5    -12    -10    9    10    5    -9    1    -14    -2    -10       -6    13  -10  -23");
        jR31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jR31.setPreferredSize(new java.awt.Dimension(457, 22));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(" A    B     C      D      E      F    G      H     I     J     K     L    M    N    O    P      Q      R      S    T      U      V    W     X     Y      Z"); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("25  23   21   19   17    15   13   11    9     7     5      3      1    -1    -3     -5   -7    -9   -11  -13   -15   -17    -19   -21   -23  -25");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Exemple :           (       R1         ,         G          ,       1          )");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Rotor 1");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Rotor 2");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Rotor 3");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel20.setText("Réflecteur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(configurer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etapeSuivante, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txt2)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rot1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3)
                                        .addGap(4, 4, 4)
                                        .addComponent(GD1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel4)
                                        .addGap(4, 4, 4)
                                        .addComponent(dec1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addComponent(rot2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(GD2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(dec2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(rot3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(GD3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12)
                                .addGap(4, 4, 4)
                                .addComponent(dec3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jR11, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jR31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jR30, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jR20, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jR21, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jR30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jR31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jR20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(0, 0, 0)
                .addComponent(jR21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 0, 0)
                .addComponent(jR11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etapeSuivante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDActionPerformed
        // TODO add your handling code here:
        count ++;
	texte2(txt2.getText(),count); 
        
    }//GEN-LAST:event_buttonDActionPerformed
public static void texte2(String Entrer_texte, int count) {
		count--;
		char c = Entrer_texte.charAt(count);
		for(int i=0; i<alphabet.length; i++){
		      if(alphabet[i]==c){
		      int index=i;
		        ligne11(index, 1);
		    }
		      }
	}
	  // fonction pour le chemin d'allee
	  public static void ligne11(int i, int k) {
	    // trouver la valeur de la case a la colonne i
	    int v = 0;

	    if (k == 1) {
	      v = rotor1[1][i];
	      i = (i + v) % 26; // faire i = i + v, ce qui donne la colonne a acceder pour le rotor prochain
               if(i<0){
                  i+=26;
              }
	    }
	    if (k == 2) {
	      v = rotor2[1][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k == 3) {
	      v = rotor3[1][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k == 4) {
	      v = reflecteur[i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k < 4) {
	      k = k + 1;
	      ligne11(i, k);
	    } else {
	      ligne22(i, 1);
	    }
	  }

	  // chemin de retour
	  public static void ligne22(int i, int q) {
	    // trouver la valeur de la case a la colonne i
	    int v = 0;

	    if (q == 3) {
	      v = rotor1[0][i];
	      i = (i + v) % 26; // faire i = i + v, ce qui donne la colonne a acceder pour le rotor prochain
	    }
	    if (q == 2) {
	      v = rotor2[0][i];
	      i = (i + v) % 26;
	    }
	    if (q == 1) {
	      v = rotor3[0][i];
	      i = (i + v) % 26;
	    }
	    if (q < 3) {
	      q = q + 1;
	      ligne22(i, q);
	    } else {
	      encryption2(i);
	    }
	  }
	  //fonction pour encrypter
	  public static void encryption2(int i) {
	    
            char e = alphabet[i];
            String s=String.valueOf(e);
            
	    System.out.print(e);
            //call text2 and label message
            txt1.setText(texteCrypter+s);           
            texteCrypter=texteCrypter+s;
	  }
    

    private void buttonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEActionPerformed
        // TODO add your handling code here:
        count ++;
	texte(txt1.getText(),count);     
    }//GEN-LAST:event_buttonEActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_txt2ActionPerformed

    private void dec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dec1ActionPerformed

    private void rot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rot1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rot1ActionPerformed

    private void etapeSuivanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etapeSuivanteActionPerformed
        // TODO add your handling code here:
         if(compte_etapesuivante<25) {
		     decalage_apres_encryption(r1_1,gd1_1);
		    compte_etapesuivante++;
	 } else if ( compte_etapesuivante==25) {
		 decalage_apres_encryption(r1_1,gd1_1);
		 decalage_apres_encryption(r2_1,gd2_1);
		 compte_etapesuivante++;	    
		    
	 }else if ( compte_etapesuivante>25 & compte_etapesuivante<50) {
		 decalage_apres_encryption(r2_1,gd2_1);
		    compte_etapesuivante++;
	 } else if ( compte_etapesuivante==50) {
		 decalage_apres_encryption(r2_1,gd2_1);
		 decalage_apres_encryption(r3_1,gd3_1);
		 compte_etapesuivante++;
	 } else if ( compte_etapesuivante>50 & compte_etapesuivante<76) {
		 decalage_apres_encryption(r3_1,gd3_1);
		    compte_etapesuivante++;
	 }
//         compte_etapesuivante++;
    }//GEN-LAST:event_etapeSuivanteActionPerformed

    public static void decalage_apres_encryption (String r,String gd){
		if( "R3".equals(r)|| "r3".equals(r)){
		      if ("G".equals(gd) || "g".equals(gd)){ 
		          decalageGauche(rotor3,1);
		      }else if ("D".equals(gd) || "d".equals(gd)){
		        decalageDroite(rotor3,1);
		        }
		      }
		
		if( "R2".equals(r)|| "r2".equals(r)){
		      if ("G".equals(gd) || "g".equals(gd)){ 
		          decalageGauche(rotor2,1);
		      }else if("D".equals(gd) || "d".equals(gd)){
		        decalageDroite(rotor2,1);   
		      
		       }
		      }  
		
		if( "R1".equals(r)|| "r1".equals(r)) {
		    	  if ("G".equals(gd) || "g".equals(gd)) { 
		          decalageGauche(rotor1,1);
		      } else if("D".equals(gd) || "d".equals(gd)){
		        decalageDroite(rotor1,1); }
		      }
		}
    
   
    private void configurerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurerActionPerformed
        // TODO add your handling code here:
        decalageb1_1 = Integer.parseInt(dec1.getText());
        decalageb2_1= Integer.parseInt(dec2.getText());
        decalageb3_1 = Integer.parseInt(dec3.getText()); 
        r1_1=rot1.getText();
        r2_1=rot2.getText();
        r3_1=rot3.getText();
        gd1_1=GD1.getText();
        gd2_1=GD2.getText();
        gd3_1=GD3.getText();

        decalagebase (r1_1, decalageb1_1);
        decalagebase (r2_1, decalageb2_1);
        decalagebase (r3_1, decalageb3_1);
    }//GEN-LAST:event_configurerActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
        // TODO add your handling code here:
       // txt1.setText("");
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseReleased
        // TODO add your handling code here:
       // txt2.setText("");
    }//GEN-LAST:event_txt2MouseReleased

    private void txt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MousePressed
        // TODO add your handling code here:
        txt1.setText("");
    }//GEN-LAST:event_txt1MousePressed

    private void txt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MousePressed
        // TODO add your handling code here:
        txt2.setText("");
    }//GEN-LAST:event_txt2MousePressed

    private void txtTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTableActionPerformed
        // TODO add your handling code here:
        //        txtTable.setText(String.valueOf(rotor1));

    }//GEN-LAST:event_txtTableActionPerformed

    private void txtTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTableMousePressed

    private void jR11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jR11MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jR11MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt1KeyPressed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt1KeyTyped

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
         int position = txt1.getCaretPosition();
        txt1.setText(txt1.getText().toUpperCase());
        txt1.setCaretPosition(position);
    }//GEN-LAST:event_txt1KeyReleased

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
        // TODO add your handling code here:
         int position = txt2.getCaretPosition();
        txt2.setText(txt2.getText().toUpperCase());
        txt2.setCaretPosition(position);
    }//GEN-LAST:event_txt2KeyReleased
    	
    public static void decalagebase (String r,int decalage){
		 if( "R3".equals(r)|| "r3".equals(r)){
		       if (decalage>0){ 
		           decalageDroite(rotor3,decalage);
		       }else if (decalage<0){
		         decalage=decalage*-1;
		         decalageGauche(rotor3,decalage);}
		       }
		       if( "R2".equals(r)|| "r2".equals(r)){
		       if (decalage>0){ 
		           decalageDroite(rotor2,decalage);
		       }else if (decalage<0){
		         decalage=decalage*-1;
		         decalageGauche(rotor2,decalage);}
		       }
		       if( "R1".equals(r)|| "r1".equals(r)){
		       if (decalage>0){ 
		           decalageDroite(rotor1,decalage);
        
		       }else if (decalage<0){
		         decalage=decalage*-1;
		         decalageGauche(rotor1,decalage);}
		       }
      
                       
		       }

    
    public static void texte(String Entrer_texte, int count) {
		count--;
		char c = Entrer_texte.charAt(count);
		for(int i=0; i<alphabet.length; i++){
		      if(alphabet[i]==c){
		      int index=i;
		        ligne1(index, 1);
		    }
		      }
	}
	  // fonction pour le chemin d'allee
	  public static void ligne1(int i, int k) {
	    // trouver la valeur de la case a la colonne i
	    int v = 0;

	    if (k == 1) {
	      v = rotor1[1][i];
	      i = (i + v) % 26; // faire i = i + v, ce qui donne la colonne a acceder pour le rotor prochain
              if(i<0){
                  i+=26;
              }
	    }
	    if (k == 2) {
	      v = rotor2[1][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k == 3) {
	      v = rotor3[1][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k == 4) {
	      v = reflecteur[i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (k < 4) {
	      k = k + 1;
	      ligne1(i, k);
	    } else {
	      ligne2(i, 1);
	    }
	  }

	  // chemin de retour
	  public static void ligne2(int i, int q) {
	    // trouver la valeur de la case a la colonne i
	    int v = 0;

	    if (q == 3) {
	      v = rotor1[0][i];
	      i = (i + v) % 26; // faire i = i + v, ce qui donne la colonne a acceder pour le rotor prochain
               if(i<0){
                  i+=26;
              }
	    }
	    if (q == 2) {
	      v = rotor2[0][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (q == 1) {
	      v = rotor3[0][i];
	      i = (i + v) % 26;
               if(i<0){
                  i+=26;
              }
	    }
	    if (q < 3) {
	      q = q + 1;
	      ligne2(i, q);
	    } else {
	      encryption(i);
	    }
	  }
	  //fonction pour encrypter
	  public static void encryption(int i) {
	    
            char e = alphabet[i];
            String s=String.valueOf(e);
	    System.out.print(e);
            txt2.setText(texteCrypter+s);            
            texteCrypter=texteCrypter+s;
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GD1;
    private javax.swing.JTextField GD2;
    private javax.swing.JTextField GD3;
    private javax.swing.JButton buttonD;
    private javax.swing.JButton buttonE;
    private javax.swing.JButton configurer;
    private javax.swing.JTextField dec1;
    private javax.swing.JTextField dec2;
    private javax.swing.JTextField dec3;
    private javax.swing.JButton etapeSuivante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JTextField jR11;
    private static javax.swing.JTextField jR20;
    private static javax.swing.JTextField jR21;
    private static javax.swing.JTextField jR30;
    private static javax.swing.JTextField jR31;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField rot1;
    private javax.swing.JTextField rot2;
    private javax.swing.JTextField rot3;
    private static javax.swing.JTextField txt1;
    private static javax.swing.JTextField txt2;
    private static javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
