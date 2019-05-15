/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.ArrayList;


public class VoucherList implements Serializable{
    
    private static final long serialVersionUID = 2190476516911661470L;
    private ArrayList<Voucher> Vouchers;

    /**
     * @return the Vouchers
     */
    public ArrayList<Voucher> getVouchers() {
        return Vouchers;
    }

    /**
     * @param Vouchers the Vouchers to set
     */
    public void setVouchers(ArrayList<Voucher> Vouchers) {
        this.Vouchers = Vouchers;
    }
    
    public void appendVouchers(ArrayList<Voucher> Vouchers) {
        this.Vouchers.addAll(Vouchers);
    }
}
