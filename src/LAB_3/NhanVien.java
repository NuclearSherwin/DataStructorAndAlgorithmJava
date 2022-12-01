package LAB_3;

import P3.DSSV;

import java.util.Arrays;
import java.util.Scanner;

public class NhanVien {
    String id, name;
    int age;
    float salary, commission;

    public NhanVien() {}
    public NhanVien(String id, String name, int age, float salary, float commission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.commission = commission;
    }
}

class QLNV {
    Scanner sc = new Scanner(System.in);
    NhanVien DSNV[] = new NhanVien[100];
    int so_luong = 0;


// Nhap NV
    void Nhap() {
            int ket_thuc;
            int i = -1;
            do {
                i = i + 1;
                System.out.println("Employee num : " + (i));
                System.out.println("Enter ID");
                String id = sc.nextLine();
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter age");
                int age = sc.nextInt();
                System.out.println("Enter salary");
                float salary = sc.nextFloat();
                System.out.println("Enter commission");
                float commission = sc.nextFloat();

                NhanVien nhanVien = new NhanVien(id, name, age, salary, commission);
                DSNV[i] = nhanVien;
                System.out.println("Add success");
                System.out.println("continue? (0/1) ");
                ket_thuc = sc.nextInt();
                sc.nextLine();
            } while (ket_thuc == 1);
            so_luong = i;
    }

//    In DS
    void InDS() {
        System.out.println("List Employee: ");
        for (NhanVien nv: DSNV
        ) {
            if (nv == null) {
                System.out.println("Not found");
                break;
            }
            else {
                System.out.println("ID of Employee" + nv.id);
                System.out.println("Name of Employee" + nv.name);
                System.out.println("Age of Employee" + nv.age);
                System.out.println("Salary of employee" + nv.salary);
                System.out.println("Commission of employee" + nv.commission);
            }

        }
    }

    void printAll() {
        System.out.println("List employees");
        System.out.println("ID\t\t Name\t Age \t Salary\t Commision");
        for(int i=0;i<=so_luong;i++){
            NhanVien nv=DSNV[i];
            System.out.printf("%5s %8s  %2d ",nv.id,nv.name,nv.age);
            System.out.printf("%6.2f %6.2f\n",nv.salary,nv.commission);
        }
    }

//    Tim NV theo ten
    void TimTen() {
        System.out.println("Enter name of employee: ");
        String name = sc.nextLine();
        for(int i=0;i<=so_luong;i++){
            NhanVien nv=DSNV[i];
            if (name.equalsIgnoreCase(DSNV[i].name))
            System.out.printf("%5s %8s  %2d ",nv.id,nv.name,nv.age);
            System.out.printf("%6.2f %6.2f\n",nv.salary,nv.commission);
        }
    }

    void TimID() {
        System.out.println("Enter ID of employee: ");
        String id = sc.nextLine();
        for (int i = 0; i < DSNV.length; i++) {
            if (id.equalsIgnoreCase(DSNV[i].id))
            {
                System.out.println(DSNV[i].id);
                System.out.println(DSNV[i].name);
                System.out.println(DSNV[i].age);
                System.out.println(DSNV[i].salary);
                System.out.println(DSNV[i].commission);
            }
        }
    }

    void softByName() {
        System.out.println("List employees");
        System.out.println("ID\t\t Name\t Age \t Salary\t Commision");
        String temp;
        for(int i=0;i<=so_luong;i++){
            for (int j = i + 1; j <= so_luong; j++) {
                if (DSNV[i].name.compareTo(DSNV[j].name) > 0) {
                    // swapping
                    temp = DSNV[i].name;
                    DSNV[i].name = DSNV[j].name;
                    DSNV[j].name = temp;
                }
            }



//            NhanVien nv=DSNV[i];
//            System.out.printf("%5s %8s  %2d ",nv.id,nv.name,nv.age);
//            System.out.printf("%6.2f %6.2f\n",nv.salary,nv.commission);
        }
        System.out.println(
                "The names in alphabetical order are: ");

        for (int i = 0; i <= so_luong; i++) {
            System.out.println("Sorted name : " + DSNV[i].name);
        }
    }



    public static void main(String[] args) {
        QLNV qlnv = new QLNV();
        qlnv.Nhap();
        qlnv.printAll();
//        qlnv.TimTen();
        qlnv.softByName();
        System.out.println("-----------------Quan ly nhan vien------------------");
        System.out.println();

    }
}


