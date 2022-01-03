/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

/**
 *
 * @author dsi
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fr.solutec.model.User;

public class UserDAO {
//        public static User getByLoginAndPassword(String login, String password) throws SQLException{
//        User u = null;
//        String sql = "Select * FROM users WHERE login = ? AND mdp = ?";
//        Connection connexion = AccessBD.getConnection();
//        PreparedStatement prepare = connexion.prepareStatement(sql);
//        prepare.setString(1, login);
//        prepare.setString(2,password);
//        ResultSet result = prepare.executeQuery();
//        if (result.next()){
//            u = new User();
//            u.setId(result.getInt("id_user"));
//            u.setNom(result.getString("nom"));
//            u.setPrenom(result.getString("prenom"));
//            u.setMail(result.getString("login"));
//        }
//        return u;
//    }
//    
//    public static void insertUser(User u) throws SQLException {
//        String sql = "INSERT INTO users (nom, prenom, login, mdp) VALUES (?, ?, ?, ?)";
//        Connection connexion = AccessBD.getConnection();
//        PreparedStatement prepare = connexion.prepareStatement(sql);
//        prepare.setString(1, u.getNom());
//        prepare.setString(2, u.getPrenom());
//        prepare.setString(3, u.getMail());
//        prepare.setString(4, u.getMdp());
//        prepare.execute();
//    }
}
