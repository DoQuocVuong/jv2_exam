package jv2_exam;
import java.util.*;

public class Main {
    Map<String, String> map = new HashMap<>();

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add new contact.");
        System.out.println("2.Find a contact by name");
        System.out.println("3.Display contact.");
        System.out.println("4.Exit");
        System.out.println("--------------------------");
        System.out.println("Please choose your action:");
        int a = sc.nextInt();
        Scanner in = new Scanner(System.in);
        switch (a) {
            case 1:
                System.out.print("Input the number of contacts: ");
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("Input the name: ");
                    String name = in.next();
                    System.out.print("Input the number: ");
                    String phone = in.next();
                    map.put(name, phone);
                }
                input();
            case 2:
                System.out.println("Search by name: ");
                String s = in.next();
                while (in.hasNext()) {
                    if (map.containsKey(s)) {
                        System.out.printf("%s=", s, map.get(s));
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                        input();
                    }
                    in.close();
                }
            case 3:
                Set set = map.entrySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()) {
                    Map.Entry mentry = (Map.Entry) iterator.next();
                    System.out.print("Name: " + mentry.getKey() + " &Phone number: ");
                    System.out.println(mentry.getValue());
                }
                input();
            case 4:
                System.out.println("Exit the program. Thank you.");
                break;
        }
    }
}


