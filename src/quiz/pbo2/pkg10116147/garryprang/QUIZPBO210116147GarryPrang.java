/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo2.pkg10116147.garryprang;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA      : Garry Prang
 * KELAS     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Kasir Rock n' Roll Haircut (Quiz)
 *
 */
public class QUIZPBO210116147GarryPrang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer cst    = new Customer();
        
        System.out.println("======= Program Kasir Rock n' Roll Haircut =======");
        System.out.print("Customer Name: ");
        cst.setNama(scanner.next());
        System.out.print("Customer Email: ");
        cst.setEmail(scanner.next());
        
        sp.displayService();
        serviceItem = scanner.nextInt();
        sp.setPriceService(sp.getPrice(serviceItem));
        
        System.out.print("Are you a Member (yes/no): ");
        isMember = sp.checkMemberStatus(scanner.next());
        
        discount = sp.getSale(isMember, sp.getPriceService());
        
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction: " + cst.currentTime());
        System.out.println("Service Price: " + sp.getPriceService());
        System.out.println("Discount: " + discount);
        System.out.println("Total Pay: " + sp.getTotalPay(sp.getPriceService(), discount));
    }
    
}
