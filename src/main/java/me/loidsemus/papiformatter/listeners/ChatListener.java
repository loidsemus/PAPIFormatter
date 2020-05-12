package me.loidsemus.papiformatter.listeners;

import me.clip.placeholderapi.PlaceholderAPI;
import me.loidsemus.papiformatter.PAPIFormatter;
import me.loidsemus.papiformatter.util.ChatUtil;
import org.apache.commons.lang.StringUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private final PAPIFormatter plugin;

    public ChatListener(PAPIFormatter plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        if (event.isCancelled()) {
            return;
        }

        Player player = event.getPlayer();
        String format = plugin.getMainConfig().getFormat();

        format = PlaceholderAPI.setPlaceholders(player, format);
        format = ChatUtil.colorize(format);

        format = StringUtils.replace(format, "%message%", event.getMessage());

        event.setFormat(format);
    }

}
