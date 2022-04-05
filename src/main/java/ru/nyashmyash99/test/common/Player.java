package ru.nyashmyash99.test.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Player {
    String name;
    double health;

    @Override
    public String toString() {
        return name + ": " + health;
    }
}
