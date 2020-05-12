package me.loidsemus.papiformatter;

import me.loidsemus.papiformatter.config.MainConfig;
import me.loidsemus.papiformatter.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class PAPIFormatter extends JavaPlugin {

    private MainConfig mainConfig;

    @Override
    public void onEnable() {
        this.mainConfig = new MainConfig(new File(getDataFolder(), "config.yml").toPath());
        mainConfig.loadAndSave();

        getServer().getPluginManager().registerEvents(new ChatListener(this), this);
    }

    public MainConfig getMainConfig() {
        return mainConfig;
    }
}
