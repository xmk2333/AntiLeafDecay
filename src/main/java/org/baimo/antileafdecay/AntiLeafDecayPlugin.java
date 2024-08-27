package org.baimo.antileafdecay;

import org.bukkit.plugin.java.JavaPlugin;

public class AntiLeafDecayPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new LeafDecayListener(this), this);
        getLogger().info("AntiLeafDecay 插件已启用！");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiLeafDecay 插件已禁用！");
    }
}