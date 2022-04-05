package ru.nyashmyash99.test.common;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MessageDispatcher {
    Plugin plugin;

    /**
     * Sends a message to an entity capable of receiving messages.
     * <br/>
     * Send messages separately using the \n separator.
     * @param entity Entity, implementing {@link CommandSender} interface.
     */
    public void sendMessage(CommandSender entity, String message) {
        System.out.println("test");

        if(entity != null)
            for(String messagePart : message.split("\n"))
                entity.sendMessage(ChatColor.translateAlternateColorCodes('&', messagePart));
    }

    /**
     * Sends a message to the server console.
     * <br/>
     * Send messages separately using the \n separator.
     */
    public void sendConsole(String message) {
        sendMessage(plugin.getServer().getConsoleSender(), message);
    }

    /**
     * Sends a message on behalf of the plugin to the server console.
     * <br/>
     * Send messages separately using the \n separator.
     */
    public void sendNotification(String message) {
        for(String messagePart : message.split("\n"))
            sendConsole("&7[&c&l!&7] &e" + plugin.getName() + " &7> " + messagePart);
    }
}
