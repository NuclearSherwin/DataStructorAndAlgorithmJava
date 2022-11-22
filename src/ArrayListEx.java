import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListEx {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<String> stringArr = new ArrayList<>();
    
    void enterElement(){
        Random rd = new Random();
        for (int i = 1; i <= 6; i++) {
            int randomNum = rd.nextInt(1, 10);
        }
    }
    void printAllElements() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayListEx ax = new ArrayListEx();
        ax.enterElement();
//        ax.printAllElements();
//        System.out.print("\nSize of A: "+ ax.arrayList.size());
//        System.out.print("\nIsEmpty of A: "+ ax.arrayList.isEmpty());
//        System.out.print("\nContains of A: "+ ax.arrayList.contains(6));
//        System.out.print("\nIndex of A: "+ ax.arrayList.indexOf(3));
//        ax.printAllElements();
//        ax.arrayList.add(10);
//        ax.arrayList.add(0, 10);
//        System.out.println("\nAdd (0, 10): \n");
//        ax.printAllElements();
//        ax.arrayList.remove(3);
//        System.out.println("\nRemove (3): \n");
//        ax.printAllElements();
//        ax.arrayList.set(2, 11);
//        System.out.println("\nset(2,10): \n");
//        ax.printAllElements();
//        System.out.println("\nGet(3): "+ ax.arrayList.get(2));
        
        ax.stringArr.add("Mai Dinh Phong"); ax.stringArr.add("Paika");
        for(String i:ax.stringArr)
        	System.out.printf("%s \n", i);
    }
}

