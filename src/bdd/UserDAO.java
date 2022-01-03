
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
    public static User getByLoginAndPassword(String mail, String mdp) throws SQLException{
        User u = null;
        String sql = "SELECT * FROM users WHERE mail = ? AND mdp = ?";
        Connection connexion = AccessBd.getConnection();
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
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getMail());
        prepare.setString(4, u.getMdp());
        prepare.execute();
    }

    public static void changeObjectif (Objectif o) throws SQLException {
        String sql = "UPDATE objectifs SET temps_marche = ?, temps_course = ?, poids = ? WHERE id_user = ?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, o.getTemps_de_course());
        prepare.setString(2, o.getTemps_de_marche());
        prepare.setString(3, o.getPoids());
        // à finir
        prepare.execute();
    }
}
