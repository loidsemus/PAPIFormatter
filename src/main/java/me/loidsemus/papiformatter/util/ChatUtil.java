package me.loidsemus.papiformatter.util;

import org.bukkit.ChatColor;

public class ChatUtil {

    public static String colorize(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

}
