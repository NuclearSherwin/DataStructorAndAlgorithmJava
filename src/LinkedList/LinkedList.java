package LinkedList;
class Node{                             // tao cac node
    int data;                           // phan chua data
    Node next;                          // phan chua du lieu cua node tiep theo
}


public class LinkedList {
    Node head = null;                   // dau danh sach
    Node tail = null;                   // cuoi

    void addFirst(int x) {              // them X vao dau danh sach
        Node p = new Node();            // tao ra 1 node moi
        p.data = x;
        p.next = null;
        if (head == null)               // ds rong
            head = tail = p;

        else                            // ds ko rong
        {
            p.next = head;
            head = p;
        }
    }

    void addLast(int x) {               // them cuoi
        Node p = new Node();
        p.data = x;   // set data
        p.next = null;
        if (head == null)
            head = tail = p;
        else
        {
            tail.next = p;
            tail = p;
        }

    }

    int getSize() {                // lay so luong phan tu
        int dem = 0;
        Node p = head;
        while(p != null) {
            dem++;
            p = p.next;
        }

        return dem;
    }

    int Search(int x)               // tra ve vi tri tim thay X neu ko tra ve -1
    {
        int vt = -1;
        Node p = head;
        while(p != null){
            vt++;
            if (p.data ==x)
                return vt;
            p = p.next;

        }
        return -1;
    }

    void delFirst() {               // xoa dau
        head = head.next;
    }

//    void delLast {                  // xoa cuoi
//
//    }
    void InDs(){
        Node p = head;
        while(p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }


    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.addFirst(1);  L.addFirst(2);  L.addFirst(3);
        L.InDs();
        L.addLast(8);
        System.out.println("DS sau khi add last: ");// 3218
        L.InDs();
        L.delFirst();  // 218
        System.out.println("DS sau khi delete first: ");
        L.InDs();

        // Count the number of elements
        System.out.println("------------------------------------------");
        System.out.println(L.getSize());
        // Search
        System.out.printf("\nCo %d?: %d", L.Search(2));
    }
}
