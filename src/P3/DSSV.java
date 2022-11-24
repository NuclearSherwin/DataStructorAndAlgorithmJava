package P3;

import java.util.Scanner;

class SV {
    public String ID, Name, Address, Phone, Clas;

    public SV() {
    }

    public SV(String ID, String Name, String Address, String Phone, String Clas) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Clas = Clas;
    }
}

class Node {            /// data ls 1 sv
    SV data;
    Node next;
}


public class DSSV {
    Node head = null;
    Node tail = null;


    void addFirst(SV x) {
        Node p = new Node();            // create a new node
        p.data = x;
        p.next = null;
        if (head == null)               // null list
            head = tail = p;
        else                            // not null list
        {
            p.next = head;              // neu ds rong thi p la node dau va cung la node cuoi
            head = p;
        }
    }

    void addLast(SV x) {
        Node p = new Node();
        p.data = x;
        p.next = null;
        if (head == null)
            head = tail = p;
        else {
            tail.next = p;
            tail = p;
        }
    }

    void Nhap() {
        String id, name, address, phone, clas;
        int dung = 0;

        Scanner sc = new Scanner(System.in);
        while (dung == 0) {
            System.out.println("Enter Id: ");
            id = sc.nextLine();
            System.out.println("Enter Name: ");
            name = sc.nextLine();
            System.out.println("Enter Address: ");
            address = sc.nextLine();
            System.out.println("Enter Phone: ");
            phone = sc.nextLine();
            System.out.println("Enter Class: ");
            clas = sc.nextLine();
            SV x = new SV(id, name, address, phone, clas);             // tao mot sv x
            addLast(x);                                                // add sv to at the end of the LIST also you can use addFirst
            System.out.println("Stop? (1/0) | 0 to continue, 1 to stop");
            dung = sc.nextInt();
            sc.nextLine();
        }
    }

    void TimId(String id) {
        Node p = head;
        System.out.println("\tID\t\t\tName\t\t\tPhone\t\t\tClass\t\t\tAddress");
        while (p != null) {
            if (id.compareToIgnoreCase(p.data.ID) == 0) {
                System.out.printf("%6s\t%10s", p.data.ID, p.data.Name);
                System.out.printf("\t%14s\t%14s\t%14s", p.data.Phone, p.data.Clas, p.data.Address);
            }
            p = p.next;
        }
    }

    void TimTen(String inputName) {                           // search by name
        Node p = head;
        System.out.println("\tID\t\t\tName\t\t\tPhone\t\t\tClass\t\t\tAddress");
        while (p != null) {
            if (inputName.compareToIgnoreCase(p.data.Name) == 0) {
                System.out.printf("%6s\t%10s", p.data.ID, p.data.Name);
                System.out.printf("\t%14s\t%14s\t%14s", p.data.Phone, p.data.Clas, p.data.Address);
            }
            p = p.next;
        }

    }

    void InDs() {
        Node p = head;
        System.out.println("\tID\t\t\tName\t\t\tPhone\t\t\tClass\t\t\tAddress");
        while (p != null) {
            System.out.printf("%6s\t%10s", p.data.ID, p.data.Name);
            System.out.printf("\t%14s\t%14s\t%14s", p.data.Phone, p.data.Clas, p.data.Address);
            System.out.println();
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSSV DS = new DSSV();
        DS.Nhap();
        DS.InDs();
        System.out.println("Enter name of std you want to find: ");
        String name = sc.nextLine();
        DS.TimTen(name);
    }
}
