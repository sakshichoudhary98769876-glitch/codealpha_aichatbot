import java.util.ArrayList;

public class ChatHistory {

    private static final ArrayList<String> history = new ArrayList<>();

    public static void add(String message){

        history.add(message);

    }

    public static String getHistory(){

        StringBuilder sb = new StringBuilder();

        for(String s : history){

            sb.append(s).append("\n");

        }

        return sb.toString();

    }

}
