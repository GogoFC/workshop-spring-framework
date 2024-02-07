package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.util.ScannerInputService;
import se.lexicon.data_access.StudentDao;
import se.lexicon.util.UserInputService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);



        UserInputService userInputService =context.getBean(UserInputService.class);
        //UserInputService userInputService = new ScannerInputService(new Scanner(System.in));
        System.out.println(userInputService.getString());

    }







}