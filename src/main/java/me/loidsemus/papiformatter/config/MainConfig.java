package me.loidsemus.papiformatter.config;


import de.exlll.configlib.annotation.Comment;
import de.exlll.configlib.annotation.Format;
import de.exlll.configlib.configs.yaml.YamlConfiguration;
import de.exlll.configlib.format.FieldNameFormatters;

import java.nio.file.Path;

@Format(FieldNameFormatters.LOWER_UNDERSCORE)
public class MainConfig extends YamlConfiguration {

    public MainConfig(Path path) {
        super(path);
    }

    @Comment("Chat format, https://api.extendedclip.com/all/")
    private String format = "%vault_prefix%&r %player_displayname%&r: %message%";

    public String getFormat() {
        return format;
    }
}
