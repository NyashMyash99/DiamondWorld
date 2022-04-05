package ru.nyashmyash99.test;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import ru.nyashmyash99.test.common.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Test {
    static List<Player> players = Arrays.asList(
        new Player("NyashMyash99", 20),
        new Player("lutrya", 19),
        new Player("Nikitos7773", 16),
        new Player("Tomato_Killer", 13.2),
        new Player("Ulyanka", 13)
    );

    public static void main(String[] args) {
        Collections.shuffle(players);
        System.out.println(players.toString());
    }
}
