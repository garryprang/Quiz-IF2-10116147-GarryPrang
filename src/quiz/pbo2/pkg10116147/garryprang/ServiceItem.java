/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo2.pkg10116147.garryprang;
/**
 *
 * @author
 * NAMA      : Garry Prang
 * KELAS     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Kasir Rock n' Roll Haircut (Quiz)
 *
 */
public interface ServiceItem 
{
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
