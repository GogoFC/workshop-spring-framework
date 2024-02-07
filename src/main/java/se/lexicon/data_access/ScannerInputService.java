package se.lexicon.data_access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Configuration
public class ScannerInputService implements UserInputService{


    private Scanner scanner;


    @Bean
    public Scanner scanner(){
        return scanner;
    }

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;
    }
}
