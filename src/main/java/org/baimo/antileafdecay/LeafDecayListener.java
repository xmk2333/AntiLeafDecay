package org.baimo.antileafdecay;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

public class LeafDecayListener implements Listener {

    private final AntiLeafDecayPlugin plugin;

    public LeafDecayListener(AntiLeafDecayPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onLeavesDecay(LeavesDecayEvent event) {
        event.setCancelled(true);
    }
}