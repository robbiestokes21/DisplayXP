package com.DisplayXP;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
public class DisplayXPPluginTest
{
    public static void main(String[] args) throws Exception
    {
            ExternalPluginManager.loadBuiltin(DisplayXPPlugin.class);
            RuneLite.main(args);
    }

}
