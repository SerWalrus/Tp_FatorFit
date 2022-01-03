
package bdd;

/**
 *
 * @author dsi
 */

import fr.solutec.model.Objectif;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fr.solutec.model.User;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;

public class UserDAO {
    public static User getByLoginAndPassword(String mail, String mdp) throws SQLException{
        User u = null;
        String sql = "SELECT * FROM users WHERE mail = ? AND mdp = ?";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, mail);
        prepare.setString(2, mdp);
        ResultSet result = prepare.executeQuery();
        if(result.next()) {
            u = new User();
            u.setId(result.getInt("id_user"));
            u.setNom(result.getString("nom"));
            u.setPrenom(result.getString("prenom"));
            u.setMail(result.getString("mail"));
            u.setMdp(result.getString("mdp"));
            u.setTaille(result.getDouble("taille"));
            u.setSexe(result.getString("sexe"));
            u.setPoids(result.getDouble("poids"));
            u.setDate_de_naissance(result.getDate("date_naissance"));
            u.setLast_deconnexion(result.getDate("date_connection"));
        }
        return u;
    }
    
    public static void insertUser(User u) throws SQLException {

        String sql = "INSERT INTO users(nom, prenom, mail, mdp) VALUES (?, ?, ?, ?)";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getMail());
        prepare.setString(4, u.getMdp());
        prepare.execute();
    }
    
    public static void changeObjectif (Objectif o, User u) throws SQLException {
        String sql = "UPDATE objectifs SET temps_marche = ?, temps_course = ?, poids = ? WHERE id_user = ?";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setDouble(1, o.getTemps_de_course());
        prepare.setDouble(2, o.getTemps_de_marche());
        prepare.setDouble(3, o.getPoids());
        prepare.setInt(4, u.getId());
        prepare.execute();
    }
    
    public static void setConnexionDateByUser (User u)throws SQLException{
        Date sqlDate = new Date(System.currentTimeMillis());
        String sql = "UPDATE users SET date_connection=? WHERE id_user = ?";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setDate(1, sqlDate);
        prepare.setInt(2, u.getId());
        prepare.execute();
    }
}
