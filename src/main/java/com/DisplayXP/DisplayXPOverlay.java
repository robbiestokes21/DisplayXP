package com.DisplayXP;


import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.Experience;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.ui.overlay.components.ProgressBarComponent;

import javax.inject.Inject;
import java.awt.*;

@Slf4j
public class DisplayXPOverlay extends Overlay
{
    private final Client client;

    private final DisplayXPConfig config;
    private final PanelComponent panelComponent = new PanelComponent();
    private int currentXP;
    private int currentLevel;
    private int nextLevelXP;

    @Inject
    private DisplayXPOverlay(Client client, DisplayXPConfig config) {
        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.client = client;
        this.config = config;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {

        panelComponent.getChildren().clear();

        if(config.displaySkillOverlay()){
            if(config.showAll()){
                String overlayTitle = "Display Skills XP";

                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                for (Skill skill : Skill.values()){
                    int currentLevel = this.client.getRealSkillLevel(skill);
                    long currentXP = getXP(skill);
                    long xpToNextLevel = getXPForNextLevel(currentLevel);
                    String rightLabel = "LV: " + currentLevel + "xp: " + currentXP;
                    ProgressBarComponent progressBar = new ProgressBarComponent();
                    progressBar.setMaximum(xpToNextLevel);

                    progressBar.setMinimum(0);
                    progressBar.setValue(currentXP);
                    progressBar.setRightLabel(rightLabel);
                    panelComponent.getChildren().add(LineComponent.builder().left(skill.getName()).build());
                    panelComponent.getChildren().add(progressBar);
                }


            }
            else if (config.showMining()) {
                Skill skill = Skill.MINING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showAttack()) {
                Skill skill = Skill.ATTACK;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showAgility()) {
                Skill skill = Skill.AGILITY;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showConstruction()) {
                Skill skill = Skill.CONSTRUCTION;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showCooking()) {
                Skill skill = Skill.COOKING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showCrafting()) {
                Skill skill = Skill.CRAFTING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showDefence()) {
                Skill skill = Skill.DEFENCE;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showFarming()) {
                Skill skill = Skill.FARMING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showFireMaking()) {
                Skill skill = Skill.FIREMAKING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showFishing()) {
                Skill skill = Skill.FISHING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showFletching()) {
                Skill skill = Skill.FLETCHING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showHerblore()) {
                Skill skill = Skill.HERBLORE;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showHitPoints()) {
                Skill skill = Skill.HITPOINTS;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showHunter()) {
                Skill skill = Skill.HUNTER;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showMagic()) {
                Skill skill = Skill.MAGIC;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showRanged()) {
                Skill skill = Skill.RANGED;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showRuneCraft()) {
                Skill skill = Skill.RUNECRAFT;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showSlayer()) {
                Skill skill = Skill.SLAYER;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showSmithing()) {
                Skill skill = Skill.SMITHING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showStrength()) {
                Skill skill = Skill.STRENGTH;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showThieving()) {
                Skill skill = Skill.THIEVING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
            else if (config.showWoodCutting()) {
                Skill skill = Skill.WOODCUTTING;
                String overlayTitle = skill.getName();
                panelComponent.getChildren().add(TitleComponent.builder().text(overlayTitle).color(Color.GREEN).build());
                ProgressBarComponent progressBar = getProgressBarComponent(skill);
                panelComponent.getChildren().add(progressBar);
            }
        }


        return panelComponent.render(graphics);
    }

    private ProgressBarComponent getProgressBarComponent(Skill skill) {

        currentXP = client.getSkillExperience(skill);
        currentLevel = getLevelForXp(currentXP);
        nextLevelXP = getXpForNextLevel(currentLevel + 1);
        int currentLevelXP =getXpForLevel(currentLevel);
        String rightLabel = getRightLabel(currentLevel, currentXP, nextLevelXP);
        ProgressBarComponent progressBar = new ProgressBarComponent();
        progressBar.setMaximum(nextLevelXP);
        progressBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.TEXT_ONLY);
        progressBar.setMinimum(0);
        progressBar.setValue(currentLevelXP);
        progressBar.setRightLabel(rightLabel);
        return progressBar;
    }

    private int getXP(Skill skill){
        return this.client.getSkillExperience(skill);
    }

    private String getRightLabel(int level, int XP, int nextLevelXP){
        return "LV:"+level +" "+XP+"/"+nextLevelXP;
    }
    private int getXPForNextLevel(int currentLevel){
        int nextLevel = currentLevel + 1;

        return Experience.getXpForLevel(nextLevel);
    }
    private int getLevelForXp(int currentXP){
        return Experience.getLevelForXp(currentXP);
    }
    private int getXpForNextLevel(int currentLevel){
        return Experience.getXpForLevel(currentLevel + 1);
    }
    private int getXpForLevel(int currentLevel){
        return Experience.getXpForLevel(currentLevel);
    }
}
