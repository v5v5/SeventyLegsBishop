/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.viva.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//public class App {
//    public static void main(String[] args) {
//        LinkedList tokens;
//        tokens = split(getMessage());
//        String result = join(tokens);
//        System.out.println(WordUtils.capitalize(result));
//    }
//}

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
