public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> nilai1 = new ArrayList<Interger>();
        ArrayList<Integer> nilai2 = new ArrayList<Interger>();
        ArrayList<Integer> jumplah = new ArrayList<Interger>();
        System.out.println("Niai 1");
        for (int i = 0; i < 5; i++) {
            nilai1.add(i);
            System.out.println("Index ke " + i + " = " + nilai1.get(i));
        }
        System.out.println("Niai 2");
        for (int i = 0; i < 5; i++) {
            nilai2.add(i);
            System.out.println("Index ke " + i + " = " + nilai2.get(i));
        }
        for (int i = 0; i < 5; i++) {
            nilai2.add(nilai1.get(i) + nilai2.get(i));
        }
        System.out.println("Hasil Jumplah nilai1 + nilai2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index ke " + i + " = " + nilai1.get(i));
        }
    }
}
