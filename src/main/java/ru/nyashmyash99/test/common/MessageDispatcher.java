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
}
