package xyz.ufifty50sh.beyondenchants;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author UFifty50sh
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class EntryPoint extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }

}