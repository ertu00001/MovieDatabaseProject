/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahhhhhhhhhh;

import ahhhhhhhhhh.Connectivity.ConnectionClass;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Erik
 */
public class Controller implements Initializable {
    
    @FXML
    public TextField TextFieldDirector;
    public TextField TextFieldName;
    public TextField TextFieldYear;
    public TextField TextFieldRating;
    public Label TextLabel;
    
    @FXML
    private void button(ActionEvent event) throws SQLException {
        
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConncection();
        
        String sql = "INSERT INTO `movie` "
                + "(`id`, `director`, `name`, `year`, `rating`) VALUES "
                + "(NULL, "
                + "'"+TextFieldDirector.getText()+"', "
                + "'"+TextFieldName.getText()+"', "
                + "'"+TextFieldYear.getText()+"', "
                + "'"+TextFieldRating.getText()+"')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        
        TextLabel.setText("added " + TextFieldName.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
