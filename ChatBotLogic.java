import java.time.LocalDate;
import java.time.LocalTime;

public class ChatBotLogic {

    public static String getResponse(String message) {

        message = NLPProcessor.processInput(message);

        String answer = Calculator.calculate(message);

        if (answer != null)
            return answer;

        if (message.contains("history"))
            return ChatHistory.getHistory();

        // Greetings
        else if (message.contains("hello") || message.contains("hi") || message.contains("hey"))
            return "Hello! How can I help you?";

        // Name
        else if (message.contains("your name") || message.contains("who are you") || message.contains("what is your name"))
            return "My name is AI ChatBot.";

        // Creator
        else if (message.contains("who made you") || message.contains("creator"))
            return "I was created using Java.";

        // Date
        else if (message.contains("date"))
            return "Today's Date : " + LocalDate.now();

        // Time
        else if (message.contains("time"))
            return "Current Time : " + LocalTime.now().withNano(0);

        // College
        else if (message.contains("college"))
            return "I can answer general college related questions.";

        // Java
        else if (message.contains("java"))
            return "Java is an Object-Oriented Programming Language.";

        // OOP
        else if (message.contains("oops"))
            return "OOP means Object-Oriented Programming.";

        // AI
        else if (message.contains("artificial intelligence") || message.contains("ai"))
            return "Artificial Intelligence enables machines to perform intelligent tasks.";

        // NLP
        else if (message.contains("nlp"))
            return "NLP stands for Natural Language Processing.";

        // Machine Learning
        else if (message.contains("machine learning"))
            return "Machine Learning allows computers to learn from data.";

        // Python
        else if (message.contains("python"))
            return "Python is a popular programming language.";

        // C Language
        else if (message.contains("c language"))
            return "C is a procedural programming language.";

        // HTML
        else if (message.contains("html"))
            return "HTML is used to create web pages.";

        // CSS
        else if (message.contains("css"))
            return "CSS is used for styling web pages.";

        // JavaScript
        else if (message.contains("javascript"))
            return "JavaScript adds interactivity to websites.";

        // Database
        else if (message.contains("database"))
            return "A database stores data in an organized form.";

        // SQL
        else if (message.contains("sql"))
            return "SQL is used to manage databases.";

        // Compiler
        else if (message.contains("compiler"))
            return "A compiler converts source code into machine code.";

        // Operating System
        else if (message.contains("operating system"))
            return "An Operating System manages computer hardware and software.";

        // Computer
        else if (message.contains("computer"))
            return "A computer is an electronic device that processes data.";

        // Internet
        else if (message.contains("internet"))
            return "The Internet is a global network connecting millions of computers.";

        // Thanks
        else if (message.contains("thank you") || message.contains("thanks"))
            return "You're welcome!";

        // Bye
        else if (message.contains("bye"))
            return "Goodbye! Have a nice day.";

        // How are you
        else if (message.contains("how are you"))
            return "I am fine. Thank you for asking.";

        // Help
        else if (message.contains("help"))
            return "You can ask me about Java, AI, NLP, SQL, HTML, CSS, Python and more.";

        // Weather
        else if (message.contains("weather"))
            return "Sorry! Live weather API is not connected.";

        // Joke
        else if (message.contains("joke"))
            return "Why do programmers prefer Java? Because they don't like unexpected pointers!";

        // Favorite language
        else if (message.contains("favorite language"))
            return "I like Java because I am built in Java.";

        //fact
        else if(message.contains("tell me a fact"))
    return "Java follows the principle: Write Once, Run Anywhere.";
        
        //engineering
        else if(message.contains("engineering"))
    return "Engineering is the application of science and mathematics to solve problems.";
        
        //internship
        else if(message.contains("internship"))
    return "An internship provides practical work experience.";
       
        //cgpa
        else if(message.contains("cgpa"))
    return "CGPA stands for Cumulative Grade Point Average.";

        //attendance
       else if(message.contains("attendance"))
    return "Attendance is the percentage of classes attended.";

       //capital
      else if(message.contains("capital of india"))
    return "The capital of India is New Delhi.";

      //prime minister
      else if(message.contains("prime minister of india"))
    return "The Prime Minister of India is Narendra Modi.";

      //animal
      else if(message.contains("national animal"))
    return "The national animal of India is the Bengal Tiger.";

      //bird
       else if(message.contains("national bird"))
    return "The national bird of India is the Indian Peacock.";

        // Version
        else if (message.contains("version"))
            return "AI ChatBot Version 1.0";

        // Default
        else
            return "Sorry! I don't understand. Please ask another question.";
    }
}
