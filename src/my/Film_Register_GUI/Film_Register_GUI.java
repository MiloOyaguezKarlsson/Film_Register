
package my.Film_Register_GUI;

import film_register.Movie;
import film_register.Item;
import film_register.SQLHandler;
import film_register.TVSerie;
import static java.awt.Color.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.*;

/**
 * Det är här det mesta händer
 * @author milooyaguez karlsson
 */
public class Film_Register_GUI extends javax.swing.JFrame {

    private List<Item> itemList = new ArrayList(); //min lista av filmer/serier

    /**
     * Creates new form Film_Register_GUI
     */
    public Film_Register_GUI() { //konstuktor för min gui
        initComponents();
        loadMovieList(1); //ladda listan vid start
        if(!itemList.isEmpty()){ //ska bara hända om det finns en lista att plocka ut en film/serie ifrån
            loadSingleMovie(0); //visa detaljer för första filmen/serien i listan som default
        }
        
    }
    //metod för att hämta listan med filmer/serier
    public void loadMovieList(int sortBy) {

        SQLHandler sqlHandler = new SQLHandler(); 
        
        itemList = sqlHandler.getItems(sortBy);

        DefaultListModel listModel = new DefaultListModel();
        for (Item item : itemList) {
            listModel.addElement(item.getTitle());
        }
        movieList.setModel(listModel);
        movieList.setSelectedIndex(0); //första filmen/serien ska alltid vara vald
    }
    //metod för att visa detaljer om en film/serie
    public void loadSingleMovie(int index) {
        if(itemList.get(index).getStatus() == 1){ //ändra färgen på kanten beroende på om man har sett filmen/serien eller inte
            jPanel1.setBorder(new CompoundBorder(new EmptyBorder(3, 3, 4, 4), new LineBorder(green, 7))); 
        } else{
            jPanel1.setBorder(new CompoundBorder(new EmptyBorder(3, 3, 4, 4), new LineBorder(gray, 7)));
        }
        if (itemList.get(index) instanceof Movie) { //om det är en film ska inte säsonger och avsnitt visas
            titleLabel.setText(itemList.get(index).getTitle());
            directorLabel.setText(itemList.get(index).getDirector());
            descriptionTextArea.setText(itemList.get(index).getDescription());
            dateLabel.setText(itemList.get(index).getReleaseDate());
            personalRatingLabel.setText(String.valueOf(itemList.get(index).getRating()));
            imdbRatingLabel.setText(String.valueOf(itemList.get(index).getImdbRating()));
            imdbLinkTextField.setText(itemList.get(index).getImdbLink());
            seasonsPreLabel.hide(); //om det är en film ska inte antal avsnitt och säsonger visas
            episodePreLabel.hide();
            seasonsLabel.hide();
            episodesLabel.hide();
            lengthLabel.show();
            lengthLabel.setText(String.valueOf(itemList.get(index).getLength()) + " min");
            lengthPreLabel.show();
        } else if(itemList.get(index) instanceof TVSerie){
            titleLabel.setText(itemList.get(index).getTitle());
            directorLabel.setText(itemList.get(index).getDirector());
            descriptionTextArea.setText(itemList.get(index).getDescription());
            dateLabel.setText(itemList.get(index).getReleaseDate());
            personalRatingLabel.setText(String.valueOf(itemList.get(index).getRating()));
            imdbRatingLabel.setText(String.valueOf(itemList.get(index).getImdbRating()));
            imdbLinkTextField.setText(itemList.get(index).getImdbLink());
            seasonsPreLabel.show();
            seasonsLabel.setText(String.valueOf(itemList.get(index).getSeasons()));
            seasonsLabel.show();
            episodePreLabel.show();
            episodesLabel.setText(String.valueOf(itemList.get(index).getEpisodes()));
            episodesLabel.show();
            lengthPreLabel.hide(); //om det är en serie ska inte längden visas
            lengthLabel.hide();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        movieList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        sortByComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        directorLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        personalRatingLabel = new javax.swing.JLabel();
        seasonsPreLabel = new javax.swing.JLabel();
        seasonsLabel = new javax.swing.JLabel();
        episodePreLabel = new javax.swing.JLabel();
        episodesLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lengthPreLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        imdbRatingLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        imdbLinkTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        emptyDatabaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Database");
        setSize(new java.awt.Dimension(900, 700));

        movieList.setName("movieList"); // NOI18N
        movieList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(movieList);

        jLabel1.setText("Sort by");

        sortByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date Added", "Title", "Rating", "Director", "Release date" }));
        sortByComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortByComboBoxItemStateChanged(evt);
            }
        });

        titleLabel.setText("Title");
        titleLabel.setName("titleLabel"); // NOI18N

        jLabel4.setText("Director:");

        directorLabel.setText("Director");
        directorLabel.setName("directorLabel"); // NOI18N

        jLabel6.setText("Release Date:");

        dateLabel.setText("ReleaseDate");
        dateLabel.setName("releaseDateLabel"); // NOI18N

        jLabel8.setText("Personal rating:");

        personalRatingLabel.setText("Personal rating");
        personalRatingLabel.setToolTipText("");
        personalRatingLabel.setName("personalRatingLabel"); // NOI18N

        seasonsPreLabel.setText("Number of seasons:");

        seasonsLabel.setText("Seasons");
        seasonsLabel.setName("seasonsLabel"); // NOI18N

        episodePreLabel.setText("Number of episodes:");
        episodePreLabel.setName(""); // NOI18N

        episodesLabel.setText("Episodes");
        episodesLabel.setName("episodesLabel"); // NOI18N

        jLabel14.setText("IMDB Link:");

        lengthPreLabel.setText("Length:");

        lengthLabel.setText("Length");
        lengthLabel.setName("lengthLabel"); // NOI18N

        editButton.setText("Edit");
        editButton.setName("editButton"); // NOI18N
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        jLabel9.setText("IMDb rating:");

        imdbRatingLabel.setText("IMDb rating");
        imdbRatingLabel.setToolTipText("");
        imdbRatingLabel.setName("imdbRatingLabel"); // NOI18N

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Description");
        descriptionTextArea.setBorder(null);
        descriptionTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(descriptionTextArea);

        imdbLinkTextField.setEditable(false);
        imdbLinkTextField.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        imdbLinkTextField.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directorLabel))
                            .addComponent(editButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(personalRatingLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seasonsPreLabel)
                                        .addGap(8, 8, 8)
                                        .addComponent(seasonsLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(episodePreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(episodesLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imdbRatingLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lengthPreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imdbLinkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(jLabel4)
                    .addComponent(directorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(personalRatingLabel)
                    .addComponent(jLabel9)
                    .addComponent(imdbRatingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seasonsPreLabel)
                    .addComponent(seasonsLabel)
                    .addComponent(episodePreLabel)
                    .addComponent(episodesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthPreLabel)
                    .addComponent(lengthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(imdbLinkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.setName("addButton"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh list");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });

        emptyDatabaseButton.setText("Empty database");
        emptyDatabaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptyDatabaseButtonMouseClicked(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(emptyDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(sortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emptyDatabaseButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieListMouseClicked
        int selectedMovie = movieList.getSelectedIndex();
        loadSingleMovie(selectedMovie);
    }//GEN-LAST:event_movieListMouseClicked

    private void sortByComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sortByComboBoxItemStateChanged
        int sortByInt = sortByComboBox.getSelectedIndex() + 1;
        loadMovieList(sortByInt);
    }//GEN-LAST:event_sortByComboBoxItemStateChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddMovieJFrame addWindow = new AddMovieJFrame();
        addWindow.show();
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
       int sortByInt = sortByComboBox.getSelectedIndex() + 1;
       loadMovieList(sortByInt);
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        EditMovieJFrame editWindow = new EditMovieJFrame();
        editWindow.show();
        int id = itemList.get(movieList.getSelectedIndex()).getId(); //veta vilket id de valda filmen/serien har
        Item itemToEdit = itemList.get(0); // som default
        for(Item item: itemList){ //leta upp fimen/serien i listan som har det id-nummret
            if(item.getId() == id){
                itemToEdit = item;
            }
        }
        editWindow.getMovie(itemToEdit);
    }//GEN-LAST:event_editButtonMouseClicked

    private void emptyDatabaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptyDatabaseButtonMouseClicked
        int confirmEmptyDatabase = JOptionPane.showConfirmDialog(null, "Are you sure you would like to empty the database?");
        if(confirmEmptyDatabase == JOptionPane.YES_OPTION){ //JOptionPane.YES_OPTION = 0 och betyder att man valt ja
           SQLHandler sqlHandler = new SQLHandler();
           sqlHandler.emptyDatabase();
            loadMovieList(sortByComboBox.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_emptyDatabaseButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Film_Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Film_Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Film_Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Film_Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Film_Register_GUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel directorLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton emptyDatabaseButton;
    private javax.swing.JLabel episodePreLabel;
    private javax.swing.JLabel episodesLabel;
    private javax.swing.JTextField imdbLinkTextField;
    private javax.swing.JLabel imdbRatingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel lengthPreLabel;
    private javax.swing.JList<String> movieList;
    private javax.swing.JLabel personalRatingLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel seasonsLabel;
    private javax.swing.JLabel seasonsPreLabel;
    private javax.swing.JComboBox<String> sortByComboBox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
