public class NLPProcessor {
    
    public static String processInput(String input) {
        
        input = input.toLowerCase();
        
    input = input.replaceAll("[^a-zA-Z0-9+\\-*/]s]","");

        input = input.trim(); 

         input = input.replace("good morning","hello");
        input = input.replace("good evening","hello");
        input = input.replace("good afternoon","hello");

        input = input.replace("thanks","thank");

        input = input.replace("who are you","your name");
    
    return input;
}
}
