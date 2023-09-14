import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<User> arrayList = new ArrayList<User>();
        for(int i = 0; i < 5; ++i){
            arrayList.add(new User(in.next(), in.nextInt()));
        }
        Collections.sort(arrayList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        for(User i : arrayList){
            System.out.println(i.toString());
        }
    }
}