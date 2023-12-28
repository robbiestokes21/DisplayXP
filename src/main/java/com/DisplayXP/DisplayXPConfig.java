package com.DisplayXP;

import jdk.internal.jmod.JmodFile;
import net.runelite.api.annotations.Interface;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup("DisplayXP")
public interface DisplayXPConfig extends Config
{




    @ConfigItem(position = 1, keyName = "playerName",name = "Player Name", description = "Display your Username.")
    default String playerName(){return "";}
    @ConfigItem(keyName = "playerName",name = "Player Name", description = "Display your Username.", hidden = true)
    void playerName(String playerName);
    @ConfigItem(position = 2,keyName = "displaySkillOverlay",name = "Display Overlay", description = "Display of the overlay.")
    default boolean displaySkillOverlay(){return false;}

    @ConfigItem(position = 3, keyName = "showAttack",name = "Display Attack Overlay", description = "Display Attack overlay.")
    default boolean showAttack(){return false;}

    @ConfigItem(keyName = "showAttack", name = "", description = "")
    void showAttack(Boolean showAttack);

    @ConfigItem(position = 4, keyName = "showDefence",name = "Display Defence Overlay", description = "Display Defence overlay.")
    default boolean showDefence(){return false;}

    @ConfigItem(keyName = "showDefence", name = "", description = "")
    void showDefence(Boolean showDefence);

    @ConfigItem(position = 5, keyName = "showStrength",name = "Display Strength Overlay", description = "Display Strength overlay.")
    default boolean showStrength(){return false;}

    @ConfigItem(keyName = "showStrength", name = "", description = "")
    void showStrength(Boolean showStrength);

    @ConfigItem(position = 6, keyName = "showHitPoints",name = "Display HitPoints Overlay", description = "Display HitPoints overlay.")
    default boolean showHitPoints(){return false;}

    @ConfigItem(keyName = "showHitPoints", name = "", description = "")
    void showHitPoints(Boolean showHitPoints);

    @ConfigItem(position = 7, keyName = "showRanged",name = "Display Ranged Overlay", description = "Display Ranged overlay.")
    default boolean showRanged(){return false;}

    @ConfigItem(keyName = "showRanged", name = "", description = "")
    void showRanged(Boolean showRanged);

    @ConfigItem(position = 8, keyName = "showMagic",name = "Display Magic Overlay", description = "Display Magic overlay.")
    default boolean showMagic(){return false;}

    @ConfigItem(keyName = "showMagic", name = "", description = "")
    void showMagic(Boolean showMagic);

    @ConfigItem(position = 9, keyName = "showCooking",name = "Display Cooking Overlay", description = "Display Cooking overlay.")
    default boolean showCooking(){return false;}

    @ConfigItem(keyName = "showCooking", name = "", description = "")
    void showCooking(Boolean showCooking);

    @ConfigItem(position = 10, keyName = "showWoodCutting",name = "Display WoodCutting Overlay", description = "Display WoodCutting overlay.")
    default boolean showWoodCutting(){return false;}

    @ConfigItem(keyName = "showWoodCutting", name = "", description = "")
    void showWoodCutting(Boolean showWoodCutting);

    @ConfigItem(position = 11, keyName = "showFletching",name = "Display Fletching Overlay", description = "Display Fletching overlay.")
    default boolean showFletching(){return false;}

    @ConfigItem(keyName = "showFletching", name = "", description = "")
    void showFletching(Boolean showFletching);

    @ConfigItem(position = 12, keyName = "showFishing",name = "Display Fishing Overlay", description = "Display Fishing overlay.")
    default boolean showFishing(){return false;}

    @ConfigItem(keyName = "showFishing", name = "", description = "")
    void showFishing(Boolean showFishing);

    @ConfigItem(position = 13, keyName = "showFireMaking",name = "Display FireMaking Overlay", description = "Display FireMaking overlay.")
    default boolean showFireMaking(){return false;}

    @ConfigItem(keyName = "showFireMaking", name = "", description = "")
    void showFireMaking(Boolean showFireMaking);

    @ConfigItem(position = 14, keyName = "showCrafting",name = "Display Crafting Overlay", description = "Display Crafting overlay.")
    default boolean showCrafting(){return false;}

    @ConfigItem(keyName = "showFireMaking", name = "", description = "")
    void showCrafting(Boolean showCrafting);
    @ConfigItem(position = 15, keyName = "showSmithing",name = "Display Smithing Overlay", description = "Display Smithing overlay.")
    default boolean showSmithing(){return false;}

    @ConfigItem(keyName = "showSmithing", name = "", description = "")
    void showSmithing(Boolean showSmithing);
    @ConfigItem(position = 16, keyName = "showMining",name = "Display Mining Overlay", description = "Display Mining overlay.")
    default boolean showMining(){return false;}

    @ConfigItem(keyName = "showMining", name = "", description = "")
    void showMining(Boolean showMining);

    @ConfigItem(position = 17, keyName = "showHerblore",name = "Display Herblore Overlay", description = "Display Herblore overlay.")
    default boolean showHerblore(){return false;}

    @ConfigItem(keyName = "showMining", name = "", description = "")
    void showHerblore(Boolean showHerblore);

    @ConfigItem(position = 18, keyName = "showAgility",name = "Display Agility Overlay", description = "Display Agility overlay.")
    default boolean showAgility(){return false;}

    @ConfigItem(keyName = "showAgility", name = "", description = "")
    void showAgility(Boolean showAgility);

    @ConfigItem(position = 19, keyName = "showThieving",name = "Display Thieving Overlay", description = "Display Thieving overlay.")
    default boolean showThieving(){return false;}

    @ConfigItem(keyName = "showThieving", name = "", description = "")
    void showThieving(Boolean showThieving);

    @ConfigItem(position = 20, keyName = "showSlayer",name = "Display Slayer Overlay", description = "Display Slayer overlay.")
    default boolean showSlayer(){return false;}

    @ConfigItem(keyName = "showSlayer", name = "", description = "")
    void showSlayer(Boolean showSlayer);

    @ConfigItem(position = 21, keyName = "showFarming",name = "Display Farming Overlay", description = "Display Farming overlay.")
    default boolean showFarming(){return false;}

    @ConfigItem(keyName = "showFarming", name = "", description = "")
    void showFarming(Boolean showFarming);

    @ConfigItem(position = 22, keyName = "showRuneCraft",name = "Display RuneCraft Overlay", description = "Display RuneCraft overlay.")
    default boolean showRuneCraft(){return false;}

    @ConfigItem(keyName = "showRuneCraft", name = "", description = "")
    void showRuneCraft(Boolean showRuneCraft);

    @ConfigItem(position = 23, keyName = "showHunter",name = "Display Hunter Overlay", description = "Display Hunter overlay.")
    default boolean showHunter(){return false;}

    @ConfigItem(keyName = "showHunter", name = "", description = "")
    void showHunter(Boolean showHunter);

    @ConfigItem(position = 24, keyName = "showConstruction",name = "Display Construction Overlay", description = "Display Construction overlay.")
    default boolean showConstruction(){return false;}

    @ConfigItem(keyName = "showConstruction", name = "", description = "")
    void showConstruction(Boolean showConstruction);

    @ConfigItem(position = 25, keyName = "showAll",name = "Display All Skills Overlay", description = "Display All Skills overlay.")
    default boolean showAll(){return false;}

    @ConfigItem(keyName = "showAll", name = "", description = "")
    void showAll(Boolean showAll);
}
