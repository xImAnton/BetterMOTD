package de.ximanton.bettermotd;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    private FileConfiguration configFile;

    public Config(FileConfiguration configFile) {
        this.configFile = configFile;
    }

    public String getWorldName() {
        return configFile.getString("worldName");
    }

}
