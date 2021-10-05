/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Owner1;
import entity.Product;
import entity.Seller;
import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Melnikov
 */
public class App {

    public App() {
    }
    
    public void run(){
        //System.out.println("Hello");
        Product product1 = new Product();
        product1.setCaption("Chees");
        product1.setPrice(25);
        Seller seller1 = new Seller();
        seller1.setName("Lev");
        seller1.setLastname("Tolstoy");
        seller1.setYear(1828);
        seller1.setDay(9);
        seller1.setMonth(9);
        Seller[] seller10 = new Seller[1];
        seller10[0]=seller1;
        product1.setSeller(seller10);

        Product product2 = new Product();
        product2.setCaption("Milk");
        product2.setPrice(15022);
        Seller seller2 = new Seller();
        seller2.setName("Ivan");
        seller2.setLastname("Turgenev");
        seller2.setDay(9);
        seller2.setMonth(11);
        seller2.setYear(1818);
        Seller[] seller20 = new Seller[1];
        seller20[0]=seller2;
        product2.setSeller(seller20);

        
        Owner1 owner1 = new Owner1();
        owner1.setFirstname("Ivan");
        owner1.setLastname("Ivanov");
        owner1.setPhone("4564545345");
        
        History history1 = new History();
        history1.setBook(product1);
        history1.setOwner1(owner1);
        Calendar c = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("history1 = "+history1.toString());
        System.out.println(" --------------- ");
        history1.setReturnDate(c.getTime());
        System.out.println("history1 = "+history1.toString());
        
        
        History history2 = new History();
        history1.setBook(product2);
        history1.setOwner1(owner1);
        Calendar c2 = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("history1 = "+history1.toString());
        System.out.println(" --------------- ");
        history1.setReturnDate(c.getTime());
        System.out.println("history1 = "+history1.toString());
        
    }
    
    
    
}
