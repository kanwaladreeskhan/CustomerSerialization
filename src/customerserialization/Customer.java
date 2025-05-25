 package customerserialization;
 import java.io.*;
public class Customer implements Serializable{
    private String name;
    private String accountNumber;
    private double balance;
    Customer(String name,String acountNumber,double balance){
        this.name=name;
        this.accountNumber=acountNumber;
        this.balance=balance;
    }
    @Override
    public String toString(){
        return "Name = " + name+ "\nAccount Number = " + accountNumber+ "\nBalance = " +balance;
    }
}
