/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author juan_
 */
public class FormularioCuestionario extends javax.swing.JFrame {

    //Vamos a generar un List de radioButtons
    List<JRadioButton> radios = new ArrayList<>();
    List<Pregunta> preguntas = new ArrayList<>();
    int preguntaActual=0;
    int calificacion = 0, k = 10;

    public FormularioCuestionario() {
        initComponents();
        //Aqui dentro del constructor de nuestro formulario
        //invocamos nuesto metodo generarCuestionario()
        //LLenamos lo radios
        radios.add(radiotituloOpcion0);
        radios.add(radiotituloOpcion1);
        radios.add(radiotituloOpcion2);
        radios.add(radiotituloOpcion3);

        generarCuestionario();

    }

    //Aqui vamos a pegar el metodo
    public void generarCuestionario() {
    setLayout(null);
    
    setTitle("Cuestionario de Fin de Curso"); 
        
        //Con el modelo construido debemos representar uestra pregunta
        //y mostrarala
        //Primero creamos las opciones
        
        Opcion op1 = new Opcion();
        op1.setTitulo("Londres");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("Roma");
        op2.setCorrecta(false);

        Opcion op3 = new Opcion();
        op3.setTitulo("Paris");
        op3.setCorrecta(true);

        Opcion op4 = new Opcion();
        op4.setTitulo("Oslo");
        op4.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones = {op1, op2, op3, op4};
        Pregunta p1 = new Pregunta();
        p1.setTitulo("¿Cual es la capital de Francia");
        p1.setOpciones(opciones);
        
        //Opiciones de la pregumta Numero 2
        Opcion op21 = new Opcion();
        op21.setTitulo("Atlantico");
        op21.setCorrecta(false);

        Opcion op22 = new Opcion();
        op22.setTitulo("Indico");
        op22.setCorrecta(false);

        Opcion op23 = new Opcion();
        op23.setTitulo("Artico");
        op23.setCorrecta(false);

        Opcion op24 = new Opcion();
        op24.setTitulo("Pacifico");
        op24.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones2 = {op21, op22, op23, op24};
        Pregunta p2 = new Pregunta();
        p2.setTitulo("¿Cual es el oceano más grande del mundo?");
        p2.setOpciones(opciones2);
        
        //Opiciones de la pregumta Numero 3
        Opcion op31 = new Opcion();
        op31.setTitulo("Cristobal Colon");
        op31.setCorrecta(true);

        Opcion op32 = new Opcion();
        op32.setTitulo("Cristobal Nodal");
        op32.setCorrecta(false);

        Opcion op33 = new Opcion();
        op33.setTitulo("Cuahutemoc blanco");
        op33.setCorrecta(false);

        Opcion op34 = new Opcion();
        op34.setTitulo("Cuahutemoc");
        op34.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones3 = {op31, op32, op33, op34};
        Pregunta p3 = new Pregunta();
        p3.setTitulo("¿Quien descubrio América?");
        p3.setOpciones(opciones3);
        
        //Opiciones de la pregumta Numero 4
        Opcion op41 = new Opcion();
        op41.setTitulo("Fernanflo");
        op41.setCorrecta(false);

        Opcion op42 = new Opcion();
        op42.setTitulo("Polinesios");
        op42.setCorrecta(false);

        Opcion op43 = new Opcion();
        op43.setTitulo("Eh vegeta");
        op43.setCorrecta(true);

        Opcion op44 = new Opcion();
        op44.setTitulo("Willyrex");
        op44.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones4 = {op41, op42, op43, op44};
        Pregunta p4 = new Pregunta();
        p4.setTitulo("¿Quien es el mejor youtuber?");
        p4.setOpciones(opciones4);
        
        //Opiciones de la pregumta Numero 5
        Opcion op51 = new Opcion();
        op51.setTitulo("Amarillo patito");
        op51.setCorrecta(false);

        Opcion op52 = new Opcion();
        op52.setTitulo("Verde Sherec");
        op52.setCorrecta(false);

        Opcion op53 = new Opcion();
        op53.setTitulo("Rojo me faltas tú");
        op53.setCorrecta(false);

        Opcion op54 = new Opcion();
        op54.setTitulo("Azul");
        op54.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones5 = {op51, op52, op53, op54};
        Pregunta p5 = new Pregunta();
        p5.setTitulo("¿De que color es el cielo?");
        p5.setOpciones(opciones5);
        
        //Opiciones de la pregumta Numero 6
        Opcion op61 = new Opcion();
        op61.setTitulo("200");
        op61.setCorrecta(false);

        Opcion op62 = new Opcion();
        op62.setTitulo("100");
        op62.setCorrecta(false);

        Opcion op63 = new Opcion();
        op63.setTitulo("45");
        op63.setCorrecta(true);

        Opcion op64 = new Opcion();
        op64.setTitulo("13");
        op64.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones6 = {op61, op62, op63, op64};
        Pregunta p6 = new Pregunta();
        p6.setTitulo("¿De cuantas localidades se compone una memoria de 8x5?");
        p6.setOpciones(opciones6);
        
        //Opiciones de la pregumta Numero 7
        Opcion op71 = new Opcion();
        op71.setTitulo("Try - Catch");
        op71.setCorrecta(false);

        Opcion op72 = new Opcion();
        op72.setTitulo("IF");
        op72.setCorrecta(true);

        Opcion op73 = new Opcion();
        op73.setTitulo("Switch - Case");
        op73.setCorrecta(false);

        Opcion op74 = new Opcion();
        op74.setTitulo("For anidado");
        op74.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones7 = {op71, op72, op73, op74};
        Pregunta p7 = new Pregunta();
        p7.setTitulo("¿Que estructura condicional se recomienda usar menos en una interfaz de usuario?");
        p7.setOpciones(opciones7);
        
        //Opiciones de la pregumta Numero 8
        Opcion op81 = new Opcion();
        op81.setTitulo("Access");
        op81.setCorrecta(false);

        Opcion op82 = new Opcion();
        op82.setTitulo("Oracle");
        op82.setCorrecta(false);

        Opcion op83 = new Opcion();
        op83.setTitulo("MySQL");
        op83.setCorrecta(false);

        Opcion op84 = new Opcion();
        op84.setTitulo("Mongo DB");
        op84.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones8 = {op81, op82, op83, op84};
        Pregunta p8 = new Pregunta();
        p8.setTitulo("¿Es una base de datos no relacional de uso moderno?");
        p8.setOpciones(opciones8);
        
        //Opiciones de la pregumta Numero 9
        Opcion op91 = new Opcion();
        op91.setTitulo("GitHub");
        op91.setCorrecta(true);

        Opcion op92 = new Opcion();
        op92.setTitulo("MIcrosoft teams");
        op22.setCorrecta(false);

        Opcion op93 = new Opcion();
        op93.setTitulo("Zoom");
        op93.setCorrecta(false);

        Opcion op94 = new Opcion();
        op94.setTitulo("Collaborate");
        op94.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones9 = {op91, op92, op93, op94};
        Pregunta p9 = new Pregunta();
        p9.setTitulo("¿Es una plataforma para trabajo en línea?");
        p9.setOpciones(opciones9);

        //Opiciones de la pregumta Numero 10
        Opcion op101 = new Opcion();
        op101.setTitulo("Prog. a nivel maquina");
        op101.setCorrecta(false);

        Opcion op102 = new Opcion();
        op102.setTitulo("Prog. orientada a objetos");
        op102.setCorrecta(true);

        Opcion op103 = new Opcion();
        op103.setTitulo("MySQL");
        op103.setCorrecta(false);

        Opcion op104 = new Opcion();
        op104.setTitulo("C++");
        op104.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones10 = {op101, op102, op103, op104};
        Pregunta p10 = new Pregunta();
        p10.setTitulo("¿Que aprendi en este curso?");
        p10.setOpciones(opciones10);


        //Vamos a adaptar el cuestioanario a lo que ya teniamos
        Cuestionario c = new Cuestionario();
        //Creamos el list de preguntas

        //Se agrega a este list la unica prgunta que tenemos
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        c.setPreguntas(preguntas);
//Primero ajustamos el titulo de la primer pregunta en la etiqueta de la preunta
    mostrarPregunta(preguntaActual);
    
    Salir.setVisible(false);
    siguiente.setEnabled(false);
        
    }
public void mostrarPregunta(int indicePregunta){
    //Checar si el indice de pregunta no rebaso el numero de preguntas
    //dentro del arraylist preguntas.
    etiquetaTituloPregunta.setText(preguntas.get(indicePregunta).getTitulo());

        //Llenamos con el modelo los radio buttons
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(preguntas.get(indicePregunta).getOpciones()[i].getTitulo());
        }

}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        radiotituloOpcion0 = new javax.swing.JRadioButton();
        radiotituloOpcion1 = new javax.swing.JRadioButton();
        radiotituloOpcion2 = new javax.swing.JRadioButton();
        radiotituloOpcion3 = new javax.swing.JRadioButton();
        botonRespuesta = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        etiquetaTituloPregunta = new javax.swing.JLabel();
        etiquetaRespueta = new javax.swing.JLabel();
        Calificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grupo.add(radiotituloOpcion0);
        radiotituloOpcion0.setText("jRadioButton1");

        grupo.add(radiotituloOpcion1);
        radiotituloOpcion1.setText("jRadioButton2");

        grupo.add(radiotituloOpcion2);
        radiotituloOpcion2.setText("jRadioButton3");

        grupo.add(radiotituloOpcion3);
        radiotituloOpcion3.setText("jRadioButton4");

        botonRespuesta.setBackground(new java.awt.Color(153, 255, 153));
        botonRespuesta.setText("Verificar");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Documents\\NetBeansProjects\\Figuras_1\\images\\origen-nombres-informatica-nunca-hubieras-imaginado_2.jpg")); // NOI18N

        siguiente.setBackground(new java.awt.Color(255, 102, 102));
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 204, 153));
        Salir.setText("Finalizar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        etiquetaTituloPregunta.setText(".");

        etiquetaRespueta.setText(".");

        Calificacion.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRespuesta)
                        .addGap(60, 60, 60)
                        .addComponent(siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiotituloOpcion0)
                            .addComponent(radiotituloOpcion2)
                            .addComponent(radiotituloOpcion1)
                            .addComponent(radiotituloOpcion3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRespueta, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radiotituloOpcion0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiotituloOpcion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiotituloOpcion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiotituloOpcion3))
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(Calificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(etiquetaRespueta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(Salir)
                    .addComponent(botonRespuesta))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaActionPerformed
                
        try{
        Validaciones.validarExcepcion(radios);     
        }catch(Excepcion e){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción.");
        }
       
        if(preguntaActual<=preguntas.size()){
            Opcion[] opciones = preguntas.get(preguntaActual).getOpciones();
            boolean acierto=false;
            for (int i = 0; i < radios.size(); i++) {
                if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
                    acierto=true;
                    break;
                }
            } //Aqui termina el for
            etiquetaRespueta.setText("Tu respuesta es  "+acierto);
            //Este incremento hace que la siguiente pregunta sea incrementada en 1
            siguiente.setEnabled(true);
          
            if(acierto == true){
              calificacion = k;
          }else if(acierto == false){
              calificacion = k--;
          }
        }
     
       
       radiotituloOpcion0.setEnabled(false);
       radiotituloOpcion1.setEnabled(false);
       radiotituloOpcion2.setEnabled(false);
       radiotituloOpcion3.setEnabled(false);
    }//GEN-LAST:event_botonRespuestaActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
      
        //si preguntas size es menor a pregunta actual, se desabilita
       
       preguntaActual++;
       siguiente.setEnabled(false);
       while(preguntaActual<preguntas.size()){
       grupo.clearSelection();
       etiquetaRespueta.setText("");
       radiotituloOpcion0.setEnabled(true);
       radiotituloOpcion1.setEnabled(true);
       radiotituloOpcion2.setEnabled(true);
       radiotituloOpcion3.setEnabled(true);
       mostrarPregunta(preguntaActual);
       break;
       }
       
       if(preguntaActual>=preguntas.size()){  
         Salir.setVisible(true);
         Salir.setEnabled(true);
       }
        //Para  que no se lance la expcion hacer que el metodo mostrar pregunta
        //no muestre la preguta si el tamaño de ArrayList ue se llama preguntas
        // ya no tiene mas preguntas, debes de apoyarte del metodo ---------------size()-----------     
      
      
      if(preguntaActual>=preguntas.size()){
          if(calificacion >= 6){
            Calificacion.setText("Tu calificaion es " + calificacion + "Estas aprobado");
          }else if(calificacion <= 5){
            Calificacion.setText("Tu calificaion es " + calificacion + ". Estas reprobado");
          }
      }
    }//GEN-LAST:event_siguienteActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
   
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calificacion;
    private javax.swing.JButton Salir;
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JLabel etiquetaRespueta;
    private javax.swing.JLabel etiquetaTituloPregunta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel imagen;
    private javax.swing.JRadioButton radiotituloOpcion0;
    private javax.swing.JRadioButton radiotituloOpcion1;
    private javax.swing.JRadioButton radiotituloOpcion2;
    private javax.swing.JRadioButton radiotituloOpcion3;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
 public boolean checarRespuesta(Opcion[] opciones) {
        boolean correcta = false;

        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
                System.out.println("Ya le atinaste");
                correcta = true;
                break;
            }
        }

        return correcta;
    }

    private Object setGetcontentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
