package ru.nyashmyash99.test;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.bukkit.plugin.java.JavaPlugin;
import ru.nyashmyash99.test.common.MessageDispatcher;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TestPlugin extends JavaPlugin {
    MessageDispatcher messageDispatcher = new MessageDispatcher(this);

    @Override
    public void onEnable() {
        messageDispatcher.sendNotification("&a > ??");
    }
}
