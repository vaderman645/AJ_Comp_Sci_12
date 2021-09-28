import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class OnePointSevenE3 {
    public static void main(String[] args) {
        int a[] = { 9, 4, 5 };
        int b[] = { 3, 1 };
        String[] StringArray = new String[a.length];
        String[] StringArrayB = new String[b.length];
        for (int i = 0; i < a.length; i++) {
            StringArray[i] = String.valueOf(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            StringArrayB[i] = String.valueOf(b[i]);
        }
        List list = new ArrayList(Arrays.asList(StringArray));
        list.addAll(Arrays.asList(StringArrayB));
        Object [] c = list.toArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
