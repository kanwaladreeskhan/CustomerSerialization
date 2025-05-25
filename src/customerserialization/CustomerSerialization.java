package customerserialization;
 import java.io.*;
public class CustomerSerialization {
    public static void main(String[] args) {
//        Customer c1=new Customer("Kinza","4325",12300);
//        Customer c2=new Customer("Malaika","445",7320);
//        Customer c3=new Customer("Ume Aiman","245",21020);
//        Customer c4=new Customer("Hania","9890",90230);
//        Customer c5=new Customer("Anaya Zunain","190",78470);
//        try{
//            FileOutputStream fileout=new FileOutputStream("Customer.ser");
//            ObjectOutputStream obj=new ObjectOutputStream(fileout);
//            obj.writeObject(c1);
//            obj.writeObject(c2);
//            obj.writeObject(c3);
//            obj.writeObject(c4);
//            obj.writeObject(c5);
//            obj.close();
//            fileout.close();
//            System.out.println("Objects have been Serialized!");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        Customer c1=null;
        Customer c2=null;
        Customer c3=null;
        Customer c4=null;
        Customer c5=null;
        
        try{
            FileInputStream filein=new FileInputStream("Customer.ser");
            ObjectInputStream obj=new ObjectInputStream(filein);
            c1=(Customer)obj.readObject();
            c2=(Customer)obj.readObject();
            c3=(Customer)obj.readObject();
            c4=(Customer)obj.readObject();
            c5=(Customer)obj.readObject();
            obj.close();
            filein.close();
            System.out.println("Objects have been Deserialized!");
            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            System.out.println(c5.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
