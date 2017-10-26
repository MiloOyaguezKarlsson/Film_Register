
package my.Film_Register_GUI;

import film_register.Item;
import film_register.Movie;
import film_register.SQLHandler;
import film_register.TVSerie;
import javax.swing.JOptionPane;

/**
 * GUI för att ändra på en film i databasen
 * @author milooyaguez karlsson
 */
public class EditMovieJFrame extends javax.swing.JFrame {

    Item item;
    SQLHandler sqlHandler;

    /**
     * Creates new form EditMovieJFrame
     */
    public EditMovieJFrame() {
        initComponents();
    }

    //hämtar den filmen/serien som är markerad och fyller i all information från min main GUI
    public void getMovie(Item item) {
        this.item = item;
        titleTextBox.setText(item.getTitle());
        descriptionTextBox.setText(item.getDescription());
        directorTextBox.setText(item.getDirector());
        personalRatingTextBox.setText(String.valueOf(item.getRating()));
        imdbRatingTextBox.setText(String.valueOf(item.getImdbRating()));
        releaseDateTextBox.setText(String.valueOf(item.getReleaseDate()));

        if (item instanceof Movie) { //om det är en film ska inte avsnitt och säsonger visas
            seasonsLabel.hide();
            seasonsTextBox.hide();
            episodesLabel.hide();
            episodesTextBox.hide();
            lengthTextBox.setText(String.valueOf(item.getLength()));
            setTitle("Edit Movie");
        } else { //om det är en serie ska inte längd visas
            lengthLabel.hide();
            lengthTextBox.hide();
            seasonsTextBox.setText(String.valueOf(item.getSeasons()));
            episodesTextBox.setText(String.valueOf(item.getEpisodes()));
            setTitle("Edit TV-Serie");
        }
        if (item.getStatus() == 1) {
            statusCheckBox1.setSelected(true);
        } else {
            statusCheckBox1.setSelected(false);
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

        statusCheckBox = new javax.swing.JCheckBox();
        titleTextBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextBox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        directorTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        imdbRatingTextBox = new javax.swing.JTextField();
        personalRatingTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        releaseDateTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        seasonsLabel = new javax.swing.JLabel();
        seasonsTextBox = new javax.swing.JTextField();
        episodesTextBox = new javax.swing.JTextField();
        episodesLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        lengthTextBox = new javax.swing.JTextField();
        statusCheckBox1 = new javax.swing.JCheckBox();
        editButton = new javax.swing.JButton();

        statusCheckBox.setText("Seen/Not seen");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit movie");

        titleTextBox.setToolTipText("Title");
        titleTextBox.setName("titleTextBox"); // NOI18N

        descriptionTextBox.setColumns(20);
        descriptionTextBox.setLineWrap(true);
        descriptionTextBox.setRows(5);
        descriptionTextBox.setToolTipText("Description max. 200 words");
        descriptionTextBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextBox);

        jLabel2.setText("Description");

        jLabel3.setText("Director");

        jLabel4.setText("Personal rating");

        imdbRatingTextBox.setToolTipText("Rating 1-10 decimal");
        imdbRatingTextBox.setName("imdbRatingTextBox"); // NOI18N

        personalRatingTextBox.setToolTipText("Rating 1-10 decimal");
        personalRatingTextBox.setName("personalRatingTextBox"); // NOI18N

        jLabel7.setText("IMDb rating");

        jLabel5.setText("Release date");

        releaseDateTextBox.setToolTipText("Release date format: YY-MM-DD");

        jLabel1.setText("Title");

        seasonsLabel.setText("Seasons");

        episodesLabel.setText("Episodes");

        lengthLabel.setText("Length");

        statusCheckBox1.setText("Seen/Not seen");

        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(directorTextBox)
                            .addComponent(personalRatingTextBox)
                            .addComponent(imdbRatingTextBox)
                            .addComponent(releaseDateTextBox)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seasonsLabel)
                            .addComponent(episodesLabel)
                            .addComponent(lengthLabel))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seasonsTextBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(episodesTextBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editButton)
                                    .addComponent(statusCheckBox1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lengthTextBox, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
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
                    .addComponent(jLabel7)
                    .addComponent(imdbRatingTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(editButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMousePressed
        sqlHandler = new SQLHandler();
        int id = item.getId();
        String title = titleTextBox.getText();
        String description = descriptionTextBox.getText();
        String director = directorTextBox.getText();
        float personalRating = 0;
        float imdbRating = 0;
        try {
            personalRating = Float.parseFloat(personalRatingTextBox.getText());
            imdbRating = Float.parseFloat(imdbRatingTextBox.getText());
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Number formatting error");
        }
        int status;
        if (statusCheckBox1.isSelected()) {
            status = 1;
        } else {
            status = 2;
        }
        
        if(item instanceof Movie){ //kolla om det är en serie eller film man ska ändra på för det är olika metoder i sqlHandler
            int length = 0;
            try {
                length = Integer.parseInt(lengthTextBox.getText());
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "Number formatting error");
            }
            sqlHandler.editMovie(title, description, director, length, personalRating, imdbRating, status, director, id);
        } else if(item instanceof TVSerie){
            int seasons = 0;
            int episodes = 0;
            try {
                seasons = Integer.parseInt(seasonsTextBox.getText());
                episodes = Integer.parseInt(episodesTextBox.getText());
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "Number formatting error");
            }
            sqlHandler.editSerie(title, description, director, seasons, episodes, personalRating, imdbRating, status, director, id);
        }
    }//GEN-LAST:event_editButtonMousePressed

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
            java.util.logging.Logger.getLogger(EditMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMovieJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMovieJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionTextBox;
    private javax.swing.JTextField directorTextBox;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel episodesLabel;
    private javax.swing.JTextField episodesTextBox;
    private javax.swing.JTextField imdbRatingTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextBox;
    private javax.swing.JTextField personalRatingTextBox;
    private javax.swing.JTextField releaseDateTextBox;
    private javax.swing.JLabel seasonsLabel;
    private javax.swing.JTextField seasonsTextBox;
    private javax.swing.JCheckBox statusCheckBox;
    private javax.swing.JCheckBox statusCheckBox1;
    private javax.swing.JTextField titleTextBox;
    // End of variables declaration//GEN-END:variables
}
