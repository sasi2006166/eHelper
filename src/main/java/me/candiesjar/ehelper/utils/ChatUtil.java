package me.candiesjar.ehelper.utils;

import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@UtilityClass
public class ChatUtil {

    public String color(String s) {
        return colorHex(s);
    }

    public List<String> color(List<String> list) {
        return list.stream().map(ChatUtil::color).collect(Collectors.toList());
    }

    public String colorHex(String s) {
        Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
        for (Matcher matcher = pattern.matcher(s); matcher.find(); matcher = pattern.matcher(s)) {
            String color = s.substring(matcher.start(), matcher.end());
            s = s.replace(color, ChatColor.of(color) + "");
        }
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
