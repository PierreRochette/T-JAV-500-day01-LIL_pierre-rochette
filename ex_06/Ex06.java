import java.util.ArrayList;

public class Ex06 {

    public static void sequence (int nbr) {
        ArrayList<String> conway = new ArrayList<String>();
        conway.add("1");
        for (int i = 0 ; i < nbr; i++) {
            String current = conway.get(i);
            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int j = 0 ; j < current.length() ; j++ ) {
                if (j + 1 < current.length() && current.charAt(j) == current.charAt(j + 1)) {
                    count++;
                } else {
                    next.append(count).append(current.charAt(j));
                    count = 1;
                }
            }

            conway.add(next.toString());
        }

        for (String s : conway) {
            System.out.println(s);
        }
    }

}