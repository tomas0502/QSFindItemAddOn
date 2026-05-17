/**
 * QSFindItemAddOn: An Minecraft add-on plugin for the QuickShop Hikari
 * and Reremake Shop plugins for Spigot server platform.
 * Copyright (C) 2021  myzticbean
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.myzticbean.finditemaddon.utils;

import io.myzticbean.finditemaddon.FindItemAddOn;
import lombok.experimental.UtilityClass;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

/**
 * Static facade over {@link io.myzticbean.finditemaddon.utils.platform.PlatformBridge}.
 * Call sites remain unchanged; all Bukkit logic lives in BukkitPlatformBridge.
 */
@UtilityClass
public class PlayerUtil {

    public void sendMessage(HumanEntity player, String message) {
        FindItemAddOn.getPlatformBridge().sendMessage(player, message);
    }

    public void teleport(Player player, Location locToTeleport) {
        FindItemAddOn.getPlatformBridge().teleport(player, locToTeleport);
    }

    public boolean hasPermission(Player player, String permission) {
        return FindItemAddOn.getPlatformBridge().hasPermission(player, permission);
    }
}
