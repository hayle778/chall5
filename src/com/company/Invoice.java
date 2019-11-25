package com.company;

public class Invoice {
private String customerName;
private String date;
private String address;
private long accountnumber;
    private String itemName;
    private double price;
    private int quantity;
    private boolean taxable;



public Invoice(){}

public Invoice(String customerNamename, String date, String address, long accountnumber) {
      this.customerName=customerNamename;
      this.date=date;
      this.address=address;
      this.accountnumber=accountnumber;

}

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customerName='" + customerName + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", accountnumber=" + accountnumber +
                '}';
    }
}
