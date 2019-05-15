/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.Date;


public class Voucher implements Serializable{
    
    private static final long serialVersionUID = 2190476516911661470L;
    private int voucherId;
    private int clientId;
    private String item;
    private int itemCount;
    private double itemPrice;
    private Date date;
    private boolean isActive;
    private String voucherType;

    /**
     * @return the voucherId
     */
    public int getVoucherId() {
        return voucherId;
    }

    /**
     * @param voucherId the voucherId to set
     */
    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * @return the clientId
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the itemCount
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * @param itemCount the itemCount to set
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the voucherType
     */
    public String getVoucherType() {
        return voucherType;
    }

    /**
     * @param voucherType the voucherType to set
     */
    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }
    
    
}
