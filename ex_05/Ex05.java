import java.util.ArrayList;

public class Ex05 {

    public static ArrayList<String> myGetArgs(String... var) {

        ArrayList<String> argumentsList = new ArrayList<>();

        for (String arg : var) {
            argumentsList.add(arg);
        }

        return argumentsList;

    };


    }
