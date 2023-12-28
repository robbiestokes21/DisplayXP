package com.DisplayXP;
import com.google.inject.Provides;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import javax.inject.Inject;

@PluginDescriptor(name = "Display XP",description = "Display skills xp.",tags = {"stats","overlay","player"})
@Slf4j
public class DisplayXPPlugin extends Plugin
{
    @Inject
    private Client client;
    @Inject
    private  DisplayXPOverlay overlay;
    @Inject
    private DisplayXPConfig config;
    @Inject
    private OverlayManager overlayManager;

    private boolean stopGameTick = false;
    @Provides
    DisplayXPConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(DisplayXPConfig.class);
    }

    @Override
    protected void startUp() throws Exception
    {
        log.info("Display XP Started");
        onGameTick(new GameTick());
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception
    {

        log.info("Display XP Stopped!");
        overlayManager.remove(overlay);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick){

        if(!stopGameTick){
            Player localPlayer = client.getLocalPlayer();
            if (localPlayer != null) {
                log.info("Setting player name to {}", localPlayer.getName());
                config.playerName(localPlayer.getName());
                stopGameTick = true;

            }else
            {
                log.warn("Failed to retrieve player name. The player name is NULL");

            }
        }
        if(config.showMining()){
            config.showWoodCutting(false);
        }
    }

    private void setPlayerName()
    {
        if(client.getGameState() == GameState.LOGGING_IN)
        {

            // Get the username from the Client instance
            String playerName = client.getLocalPlayer().getName();

            // Update the playerName in the config only if the name is not null
            if(playerName != null)
            {
                log.info("Setting player name to {}", playerName);
                config.playerName(playerName);
            }else
            {
                log.warn("Failed to retrieve player name. The player name is NULL");
            }
        }else
        {
            log.warn("Player is not logged in yet. Current GameState: {}", client.getGameState());
        }
    }
}
