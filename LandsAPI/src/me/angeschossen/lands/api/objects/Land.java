package me.angeschossen.lands.api.objects;

import me.angeschossen.lands.api.enums.LandRole;
import me.angeschossen.lands.api.enums.LandsAction;
import me.angeschossen.lands.api.enums.LandsSetting;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.HashMap;

public interface Land {

    /**
     * Get name of the land
     * This value never changes
     *
     * @return Name of land
     */
    String getName();

    /**
     * Get invite by receiver UUID
     *
     * @param receiverUUID UUID string of receiver
     * @return Invite
     */
    Invite getInvite(String receiverUUID);

    /**
     * Get owner UUID of land
     *
     * @return UUID string of owner
     */
    String getOwnerUUID();

    /**
     * Get spawn
     *
     * @return Spawn
     */
    Location getSpawn();

    /**
     * Get name of world
     *
     * @return Name of world
     */
    String getWorldName();

    /**
     * Get landWorld wich the land is in
     *
     * @return LandWorld
     */
    LandWorld getLandWorld();

    /**
     * Get an collection of role members
     * of an certain role
     *
     * @param landRole Role wich you want to receive  members of
     * @return Collection with UUID strings
     */
    Collection<String> getRoleMembers(LandRole landRole);

    /**
     * Get all landRoles with UUID strings
     *
     * @return LandRoles
     */
    HashMap<String, LandRole> getLandRoles();

    /**
     * Get the landRole of an player
     *
     * @param playerUUID UUID string of player
     * @return LandRole
     */
    LandRole getLandRole(String playerUUID);

    /**
     * Get the size of an land
     *
     * @return Size of land
     */
    int getSize();

    /**
     * Get all invites sent by the land
     *
     * @return Invites
     */
    Collection<Invite> getInvites();

    /**
     * Check if setting is enabled
     *
     * @param landsSetting LandsSetting
     * @return Boolean
     */
    boolean getSetting(LandsSetting landsSetting);

    /**
     * Check if setting is enabled
     *
     * @param settingID ID of setting
     * @return Boolean
     */
    boolean getSetting(String settingID);

    /**
     * Enable an setting
     *
     * @param landsSetting LandsSetting
     */
    void enableSetting(LandsSetting landsSetting);

    /**
     * Disable an setting
     *
     * @param landsSetting LandsSetting
     */
    void disableSetting(LandsSetting landsSetting);

    /**
     * Toggle an setting
     *
     * @param landsSetting LandsSetting
     * @return Result
     */
    boolean toggleSetting(LandsSetting landsSetting);

    /**
     * Check if setting is enabled
     *
     * @param landsAction LandsAction
     * @param landRole    LandRole
     * @return Boolean
     */
    boolean getAction(LandRole landRole, LandsAction landsAction);

    /**
     * Enable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void enableAction(LandRole landRole, LandsAction landsAction);

    /**
     * Disable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void disableAction(LandRole landRole, LandsAction landsAction);

    /**
     * Toggle acces for an action for an speficied role
     *
     * @param landRole    Role
     * @param landsAction Action
     * @return true if enabled, false if disabled
     */
    boolean toggleAction(LandRole landRole, LandsAction landsAction);

    /**
     * Set landRole for an player
     *
     * @param landPlayer LandPlayer wich you want to set
     * @return 0 if in all landChunks set.
     * if higher as 0 means amount of chunks where not trusted.
     */
    int trustPlayer(LandPlayer landPlayer);

    /**
     * Set role of trusted player
     *
     * @param playerUUID UUID of player
     * @param landRole   Role
     */
    void setRole(String playerUUID, LandRole landRole);

    /**
     * Set the tax of the land
     *
     * @param tax Tax value
     */
    void setTax(double tax);

    /**
     * Add an landChunk to the land
     *
     * @param landChunk LandChunk to add
     */
    void addLandChunk(LandChunk landChunk);

    /**
     * Add an land invite
     *
     * @param invite
     */
    void addInvite(Invite invite);


    /**
     * Get all chunkCoords of an land
     *
     * @return Collection of chunkCoords
     */
    Collection<ChunkCoord> getChunkCoords();

    /**
     * Remove an landChunk
     *
     * @param chunkX X of chunk
     * @param chunkZ Z of chunk
     */
    void removeLandChunk(int chunkX, int chunkZ);

    /**
     * Set an new owner for land
     *
     * @param landPlayer LandPlayer for new owner
     */
    void setOwner(LandPlayer landPlayer);

    /**
     * Untrust an player
     *
     * @param landPlayer LandPlayer wich should be untrusted
     */
    void untrustLandPlayer(LandPlayer landPlayer);

    /**
     * Check if land has chunk
     *
     * @param worldName Name of world
     * @param x         X of chunk
     * @param z         Z of chunk
     * @return true if has
     */
    boolean hasChunk(String worldName, int x, int z);

    /**
     * Set name of land
     *
     * @param name New name
     */
    void setName(String name);

    /**
     * Check if player is trusted in whole land.
     *
     * @param playerUUID UUID string of player
     * @return true if is
     */
    boolean isGlobalTrusted(String playerUUID);

    /**
     * Get an collection of all online land members
     *
     * @return Collection of online players
     */
    Collection<Player> getOnlinePlayers();

    /**
     * Check if player can action
     *
     * @param playerUUID UUID string of player
     * @param action     Action
     * @return Result
     */
    boolean canAction(String playerUUID, LandsAction action);

    /**
     * Saves to land to the harddrive
     */
    void save();

    /**
     * Does land exist?
     *
     * @return boolean
     */
    boolean exists();

    /**
     * Add tax
     *
     * @param value Tax value
     * @return Result
     */
    int addTax(double value);


    /**
     * Set spawn location of land
     *
     * @param location Location of spawn
     */
    void setSpawn(Location location);
}
