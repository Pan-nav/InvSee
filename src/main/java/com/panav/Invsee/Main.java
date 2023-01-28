package com.panav.Invsee;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("inv").setExecutor(new InvSee());

    }


}
