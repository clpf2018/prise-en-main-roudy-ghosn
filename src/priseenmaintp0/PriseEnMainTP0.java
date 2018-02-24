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
public class PriseEnMainTP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client(new Client.ClientBuilder("000001", "GHOSN", "Rody").telephone("70461559").pays("Liban").mail("roudy.ghosn@isae.edu.lb"));

        System.out.println(client.getPrenom() + " " + client.getNom());
        System.out.println("Pays: " + client.getPays());
        System.out.println("Telephone: " + client.getTelephone());
        System.out.println("Mail: " + client.getMail());
    }

}
