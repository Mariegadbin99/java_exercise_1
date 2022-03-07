package src;

import java.util.Scanner;

public interface Command {
    String name();
    boolean run(Scanner obj);
}