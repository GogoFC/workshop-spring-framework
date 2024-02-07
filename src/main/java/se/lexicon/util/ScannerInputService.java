package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import se.lexicon.util.UserInputService;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {


    private Scanner scanner;


//    @Bean
//    public Scanner scanner(){
//        return scanner;
//    }

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.println("Enter Text");
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return 0;
    }
}
