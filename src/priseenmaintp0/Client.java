/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priseenmaintp0;

/**
 *
 * @author roudy
 */
public class Client {

    /* attributs obligatoires */
    
    private final String _id;
    private final String _prenom;
    private final String _nom;
    
    /* attributs optinnels */
    
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;

    public Client(ClientBuilder cb) {
        _id = cb._id;
        _nom = cb._nom;
        _prenom = cb._prenom;
        _telephone = cb._telephone;
        _rue = cb._rue;
        _ville = cb._ville;
        _etat = cb._etat;
        _code = cb._code;
        _pays = cb._pays;
        _mail = cb._mail;
    }

    /* Setters pour tous les attributs */
    
    public String getId() {
        return _id;
    }
    
    public String getPrenom() {
        return _prenom;
    }
    
    public String getNom() {
        return _nom;
    }
    
    public String getTelephone() {
        return _telephone;
    }
    
    public String getRue() {
        return _rue;
    }
    
    public String getVille() {
        return _ville;
    }
    
    public String getEtat() {
        return _etat;
    }
    
    public String getCode() {
        return _code;
    }
    
    public String getPays() {
        return _pays;
    }
    
    public String getMail() {
        return _mail;
    }

    /* Setters pour les attributs optionnels */
    
    public void setTelephone(String _telephone) {
        this._telephone = _telephone;
    }
    
    public void setRue(String _rue) {
        this._rue = _rue;
    }
    
    public void setVille(String _ville) {
        this._ville = _ville;
    }
    
    public void setEtat(String _etat) {
        this._etat = _etat;
    }
    
    public void setCode(String _code) {
        this._code = _code;
    }
    
    public void setPays(String _pays) {
        this._pays = _pays;
    }
    
    public void setMail(String _mail) {
        this._mail = _mail;
    }

    public static class ClientBuilder {

        String _id;
        String _prenom;
        String _nom;
        String _telephone;
        String _rue;
        String _ville;
        String _etat;
        String _code;
        String _pays;
        String _mail;

        public ClientBuilder(String id, String nom, String prenom) {
            _id = id;
            _nom = nom;
            _prenom = prenom;
        }

        public ClientBuilder telephone(String telephone) {
            _telephone = telephone;
            return this;
        }

        public ClientBuilder rue(String rue) {
            _rue = rue;
            return this;
        }

        public ClientBuilder ville(String ville) {
            _ville = ville;
            return this;
        }

        public ClientBuilder etat(String etat) {
            _etat = etat;
            return this;
        }

        public ClientBuilder code(String code) {
            _code = code;
            return this;
        }

        public ClientBuilder pays(String pays) {
            _pays = pays;
            return this;
        }

        public ClientBuilder mail(String mail) {
            _mail = mail;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
