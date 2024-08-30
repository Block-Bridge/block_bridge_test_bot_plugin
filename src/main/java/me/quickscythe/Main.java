package me.quickscythe;

import me.quickscythe.bot.BotPlugin;
import me.quickscythe.utils.Utils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends BotPlugin {


    public void enable() {
        Utils.getLogger().log("Enabled " + getName());
    }
}