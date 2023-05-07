package Analizador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.Symbol;
import javafx.geometry.Insets;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javax.swing.table.DefaultTableModel;

public class FrmAnalizador extends javax.swing.JFrame {

    private Script script;

    public FrmAnalizador() {
        initComponents();

        this.script = new Script("C:\\Program Files (x86)\\Embarcadero\\Dev-Cpp\\TDM-GCC-64\\bin\\");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        BotonSintactico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        Borrar1 = new javax.swing.JButton();
        Borrar2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ResultadoSemantico = new javax.swing.JTextArea();
        AnalizarSemantico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAnalisis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAnalisis.setText("Análisis Léxico");
        BotonAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalisisActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        BotonSintactico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonSintactico.setText("Análisis Sintático");
        BotonSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSintacticoActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        Borrar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Borrar1.setText("Borrar");
        Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar1ActionPerformed(evt);
            }
        });

        Borrar2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Borrar2.setText("Borrar");
        Borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar2ActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("COMPILADOR ASIGNACION");

        ResultadoSemantico.setColumns(20);
        ResultadoSemantico.setRows(5);
        jScrollPane5.setViewportView(ResultadoSemantico);

        AnalizarSemantico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AnalizarSemantico.setText("Análisis Semántico");
        AnalizarSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarSemanticoActionPerformed(evt);
            }
        });

        jLabel2.setText("UNIVERSIDAD AUTÓNOMA DE CHIAPAS");

        jLabel3.setText("FACULTAD DE CONTADURIA Y ADMINISTRACIÓN, CAMPUS I");

        jLabel4.setText("LIC. EN INGENIERÍA EN DESARROLLO Y TECNOLOGÍAS DE SOFTWARE");

        jLabel5.setText("ALUMNO: JOSÉ JULIÁN MOLINA OCAÑA");

        jLabel6.setText("MATRICULA: A200002");

        jLabel7.setText("SEMESTRE: 6° \"M\"");

        jLabel8.setText("COMPILADORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAnalisis)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(BotonSintactico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Borrar2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AnalizarSemantico)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSintactico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Borrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAnalisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnalizarSemantico, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private static String razonDeErrorSemantico = null;
    
        public static boolean analizarSemantica(String codigo) {
        String[] lineas = codigo.split("\n");
        int numVariables = 0;
        int contador = 0;
        boolean dentroBloque = false;
        String[] variablesDeclaradas = new String[26]; // Almacenar las variables declaradas

        for (String linea : lineas) {
            linea = linea.trim(); // Eliminar espacios en blanco al inicio y final de la línea

            if (linea.startsWith("{")) {
                if (dentroBloque) {
                    System.out.println("Error semántico: se encontró un nuevo bloque antes de finalizar el bloque anterior");
                    razonDeErrorSemantico = "Error semántico: se encontró un nuevo bloque antes de finalizar el bloque anterior";
                    return false;
                }
                dentroBloque = true;
            } else if (linea.equals("}")) {
                if (!dentroBloque) {
                    System.out.println("Error semántico: se encontró el símbolo '}' sin un bloque previo");
                    razonDeErrorSemantico = "Error semántico: se encontró el símbolo '}' sin un bloque previo";
                    return false;
                }
                dentroBloque = false;
            } else if (dentroBloque) {
                // Línea de declaración de variables
                String variables = null;
                String var = null;
                if (linea.endsWith(";")) {
                    if(linea.contains("int")){
                        var  = "int";
                        variables = linea.substring(var.length(), linea.length() - 1).trim();
                    }else if(linea.contains("char")){
                        var = "char";
                        variables = linea.substring(var.length(), linea.length() - 1).trim();
                    }else{
                        razonDeErrorSemantico = "No se han declarado las variables";
                        break;  
                    }
                    String[] variablesSeparadas = variables.split(",");

                    for (String variable : variablesSeparadas) {
                        String[] partes = variable.trim().split(" ");
                        if(variable != null){
                            System.out.println(variable.replaceAll(" ", ""));
                        }
                        if (variable.replaceAll(" ", "").length() >= 1) {
                            String nombre = partes[0];

                            // Verificar si la variable ya ha sido declarada
                            if (existeVariable(variablesDeclaradas, nombre)) {
                                System.out.println("Error semántico: la variable '" + nombre + "' ya ha sido declarada");
                                razonDeErrorSemantico = "Error semántico: la variable '" + nombre + "' ya ha sido declarada";
                                return false;
                            }

                            variablesDeclaradas[numVariables] = variable.replaceAll(" ", "");
                            numVariables++;
                            
                        } else {
                            System.out.println("Error semántico: sintaxis incorrecta en la declaración de variables");
                            razonDeErrorSemantico = "Error semántico: sintaxis incorrecta en la declaración de variables";
                            return false;
                        }
                    }
                }
            }
        }

        // Verificar si hay variables declaradas que no han sido asignadas
        for (int i = 0; i < numVariables; i++) {
            if (!existeAsignacion(lineas, variablesDeclaradas[i])) {
                System.out.println("Alerta de analisis semántico: la variable '" + variablesDeclaradas[i] + "' no ha sido inicializada");
                razonDeErrorSemantico = "Alerta de analisis semántico: la variable '" + variablesDeclaradas[i] + "' no ha sido inicializada";
                return false;
            }
        }

        return true;
    }

    public static boolean existeVariable(String[] variables, String nombre) {
        for (String variable : variables) {
            if (variable != null && variable.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeAsignacion(String[] lineas, String variable) {
        for (String linea : lineas) {
            if (linea.contains(variable + " ")) {
                return true;
            }
        }
        return false;
    }
    
    
    Object[][] filas = new Object[100][100];
    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        
        String[] columnas = {"TOKEN", "PR", "ID", "CADENA","NUMERO", "SIMBOLO", "TIPO"};
        
        // Define las filas de la tabla
       
        Lexico lexicos = new Lexico(new StringReader(expr));
        String resultado = "NO. LINEA \t\tSIMBOLO\nLINEA " + (cont++) + "\n";
        int contador = 0;
        int fila = 0;
        int columna = 0;
        while (true) {
            DefaultTableModel model = new DefaultTableModel(filas, columnas);
            Tokens token = lexicos.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                Table.setModel(model);
                return;
            }
            switch (token) {
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                    filas[fila][columna] = lexicos.lexemas;
                    filas[fila][columna + 2] = "X";
        
                    fila++;
                    break;
                case create:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";

                    fila++;
                    break;
                case database:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case table:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case use:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case varchar:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case insert:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case into:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case values:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case update:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case set:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case where:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case delete:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case inte:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case charac:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case from:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case drop:
                    resultado +=  " RESERVADA " + lexicos.yytext() + "\n";
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 1] = "X";
                    
                    fila++;
                    break;
                case P_coma:
                    resultado +=  " PUNTO Y COMA " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case P_apertura:
                    resultado +=  " Parentesis apertura " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case P_cierre:
                    resultado +=  " Parentesis cierre " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case comas:
                    resultado +=  " Comas  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case ll_apertura:
                    resultado +=  " Comas  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case ll_cierre:
                    resultado +=  " Comas  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case coma:
                    resultado +=  " Comas  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case mas:
                    resultado +=  " Comas  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case igual:
                    resultado +=  " Igual  " + lexicos.yytext() + "\n";
                    
                    filas[fila][columna] = lexicos.yytext();
                    filas[fila][columna + 5] = "X";
                    
                    fila++;
                    break;
                case espacio:
                    resultado += "  <Espacio> \n";
                    break;
                case line:
                    resultado += "================ \n";
                    resultado += "LINEA" + (cont++) + "\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }

    }

    private void BotonAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalisisActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAnalisisActionPerformed

    private void Borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar2ActionPerformed
        txtAnalizarSin.setText(null);
        Resultado.setText("");
    }//GEN-LAST:event_Borrar2ActionPerformed

    private void BotonSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_BotonSintacticoActionPerformed

    private void Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar1ActionPerformed
        txtAnalizarLex.setText(null);
        Resultado.setText("");
        filas = new Object[100][100];
        DefaultTableModel model = new DefaultTableModel();
        Table.setModel(model);
    }//GEN-LAST:event_Borrar1ActionPerformed

    private void AnalizarSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarSemanticoActionPerformed
        // TODO add your handling code here:
        
        String codigo = "";
        codigo = Resultado.getText();
         // Llamada al método para realizar el análisis semántico
        boolean esCorrecto = false;
        esCorrecto = analizarSemantica(codigo);
        if(esCorrecto == true){
            razonDeErrorSemantico = "";
            ResultadoSemantico.setText(razonDeErrorSemantico + "El código es semánticamente " + (esCorrecto ? "correcto" : "incorrecto"));
        }else{
            ResultadoSemantico.setText(razonDeErrorSemantico + "\nEl código es semánticamente " + (esCorrecto ? "correcto" : "incorrecto"));
        }
        System.out.println(codigo);
        
    }//GEN-LAST:event_AnalizarSemanticoActionPerformed

    private boolean saveFile(File file, String doc) {
        String message = null;
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte[] bytxt = doc.getBytes();
            out.write(bytxt);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String args[]) throws Exception {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                        FrmAnalizador interfaz = new FrmAnalizador();
                        interfaz.setVisible(true);
                        interfaz.setResizable(false);
                        interfaz.setBackground(Color.yellow);
                        interfaz.getContentPane().setBackground(Color.WHITE);
                        interfaz.setTitle("COMPILADOR");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizarSemantico;
    private javax.swing.JButton Borrar1;
    private javax.swing.JButton Borrar2;
    private javax.swing.JButton BotonAnalisis;
    private javax.swing.JButton BotonSintactico;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JTextArea ResultadoSemantico;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
