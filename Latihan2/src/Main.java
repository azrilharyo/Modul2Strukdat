import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan= new ArrayList<>();
        ArrayList<String> deletedHewan = new ArrayList<>();
        ArrayList<Integer> data_sama = new ArrayList<>();
        Hewan.add("Kuda");
        Hewan.add("Sapi");
        Hewan.add("Kambing");
        Hewan.add("Gajah");
        Hewan.add("Kerbau");

        //Input Hewan
        System.out.println(Hewan);

        //Menambah Array Hewan
        deletedHewan.add("Sapi");
        deletedHewan.add("Gajah");
        int dataditemukan=0;
        int index=0;

        for (int i = 0; i < deletedHewan.size(); i++) {
            Hewan.remove(deletedHewan.get(i));
        }
        System.out.println("Delete hewan" +deletedHewan);
        System.out.println("Output Hewan" +Hewan);
    }
}

