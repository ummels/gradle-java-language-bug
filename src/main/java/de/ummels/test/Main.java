package de.ummels.test;

import java.util.Optional;

public final class Main {

    public static void main(String[] args) {
        final Optional<String> x = Optional.of("Test");
        // Should not compile since isEmpty is only available in Java 11 and newer
        if (x.isEmpty()) {
            System.out.println("Leer");
        } else {
            System.out.println(x.get());
        }
    }
}
