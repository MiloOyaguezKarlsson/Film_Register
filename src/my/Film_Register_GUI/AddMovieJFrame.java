/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Film_Register_GUI;

import film_register.IMDbScraper;
import film_register.SQLHandler;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author milooyaguez karlsson
 */
public class AddMovieJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddMovieJFrame
     */
    public AddMovieJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        titleTextBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextBox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        directorTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        personalRatingTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        releaseDateTextBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        imdbLinkTextBox = new javax.swing.JTextField();
        imdbScrapeButton = new javax.swing.JButton();
        imdbRatingTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        seasonsLabel = new javax.swing.JLabel();
        seasonsTextBox = new javax.swing.JTextField();
        episodesTextBox = new javax.swing.JTextField();
        episodesLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        lengthTextBox = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        statusCheckBox = new javax.swing.JCheckBox();
        addButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add item");

        jLabel1.setText("Title");

        titleTextBox.setToolTipText("Title");
        titleTextBox.setName("titleTextBox"); // NOI18N

        descriptionTextBox.setColumns(20);
        descriptionTextBox.setLineWrap(true);
        descriptionTextBox.setRows(5);
        descriptionTextBox.setToolTipText("Description max. 200 words");
        descriptionTextBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextBox);

        jLabel2.setLabelFor(descriptionTextBox);
        jLabel2.setText("Description");

        jLabel3.setText("Director");

        jLabel4.setText("Personal rating");

        personalRatingTextBox.setToolTipText("Rating 1-10 decimal");
        personalRatingTextBox.setName("personalRatingTextBox"); // NOI18N

        jLabel5.setText("Release date");

        releaseDateTextBox.setToolTipText("Release date format: YY-MM-DD");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Get information from IMDb link");

        imdbLinkTextBox.setName("imdbLinkTextNox"); // NOI18N

        imdbScrapeButton.setText("Get information");
        imdbScrapeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imdbScrapeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imdbLinkTextBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(imdbScrapeButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imdbScrapeButton)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imdbLinkTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imdbRatingTextBox.setToolTipText("Rating 1-10 decimal");
        imdbRatingTextBox.setName("imdbRatingTextBox"); // NOI18N

        jLabel7.setText("IMDb rating");

        seasonsLabel.setText("Seasons");

        episodesLabel.setText("Episodes");

        lengthLabel.setText("Length");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie", "TV-Serie" }));

        jLabel8.setText("Type");

        statusCheckBox.setText("Seen/Not seen");

        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(seasonsLabel)
                            .addComponent(episodesLabel)
                            .addComponent(lengthLabel)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusCheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(episodesTextBox)
                                .addComponent(titleTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(directorTextBox)
                                .addComponent(personalRatingTextBox)
                                .addComponent(releaseDateTextBox)
                                .addComponent(imdbRatingTextBox)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(seasonsTextBox)
                                .addComponent(lengthTextBox)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(directorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalRatingTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imdbRatingTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(releaseDateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthLabel)
                    .addComponent(lengthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seasonsLabel)
                    .addComponent(seasonsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(episodesTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(episodesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imdbScrapeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imdbScrapeButtonMouseClicked
        IMDbScraper scraper = new IMDbScraper();
        String url = imdbLinkTextBox.getText();

        try {
            titleTextBox.setText(scraper.scrapeTitle(url));
            descriptionTextBox.setText(scraper.scrapeDescription(url));
            directorTextBox.setText(scraper.scrapeDirector(url));
            imdbRatingTextBox.setText(String.valueOf(scraper.scrapeScore(url)));
            lengthTextBox.setText(scraper.scrapeDuration(url));
            episodesTextBox.setText(scraper.scrapeEpisodes(url));
        } catch (IOException ex) {
            Logger.getLogger(AddMovieJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_imdbScrapeButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        SQLHandler sqlHandler = new SQLHandler();

        if (typeComboBox.getSelectedItem() == "Movie") {
            int status;
            if (statusCheckBox.isSelected()) {
                status = 1; //har sett
            } else {
                status = 2; //har inte sett
            }
            sqlHandler.addMovie(titleTextBox.getText(),
                    descriptionTextBox.getText(),
                    directorTextBox.getText(),
                    Integer.parseInt(lengthTextBox.getText()),
                    Float.parseFloat(personalRatingTextBox.getText()),
                    Float.parseFloat(imdbRatingTextBox.getText()),
                    imdbLinkTextBox.getText(),
                    status,
                    releaseDateTextBox.getText()
            );
            System.out.println("addded movie");
        } else if (typeComboBox.getSelectedItem() == "TV-Serie") {
            int status;
            if (statusCheckBox.isSelected()) {
                status = 1; //har sett
            } else {
                status = 2; //har inte sett
            }
            sqlHandler.addSerie(titleTextBox.getText(),
                    descriptionTextBox.getText(),
                    directorTextBox.getText(),
                    Integer.parseInt(seasonsTextBox.getText()),
                    Integer.parseInt(episodesTextBox.getText()),
                    Float.parseFloat(personalRatingTextBox.getText()),
                    Float.parseFloat(imdbRatingTextBox.getText()),
                    imdbLinkTextBox.getText(),
                    status,
                    releaseDateTextBox.getText()
            );
            System.out.println("added serie");
        }
    }//GEN-LAST:event_addButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovieJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextArea descriptionTextBox;
    private javax.swing.JTextField directorTextBox;
    private javax.swing.JLabel episodesLabel;
    private javax.swing.JTextField episodesTextBox;
    private javax.swing.JTextField imdbLinkTextBox;
    private javax.swing.JTextField imdbRatingTextBox;
    private javax.swing.JButton imdbScrapeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextBox;
    private javax.swing.JTextField personalRatingTextBox;
    private javax.swing.JTextField releaseDateTextBox;
    private javax.swing.JLabel seasonsLabel;
    private javax.swing.JTextField seasonsTextBox;
    private javax.swing.JCheckBox statusCheckBox;
    private javax.swing.JTextField titleTextBox;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}
