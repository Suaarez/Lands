package me.angeschossen.lands.api.enums;

public enum LandsAction {
    BLOCK_BREAK("block_break", false),
    BLOCK_PLACE("block_place", false),
    ATTACK_PLAYER("attack_player", false),
    ATTACK_ANIMAL("attack_animal", false),
    BLOCK_IGNITE("block_ignite", false),
    INTERACT_GENERAL("interact_general", false),
    INTERACT_MECHANISM("interact_mechanism", false),
    INTERACT_CONTAINER("interact_container", false),
    INTERACT_DOOR("interact_door", false),
    PLAYER_TRUST("player_trust", false),
    PLAYER_UNTRUST("player_untrust", false),
    PLAYER_SETROLE("player_setrole", false),
    PLAYER_TRUST_GLOBAL("player_trust", true),
    PLAYER_UNTRUST_GLOBAL("player_untrust", true),
    PLAYER_SETROLE_GLOBAL("player_setrole", true),
    LAND_CLAIM_GLOBAL("land_claim", true);

    private String iD;
    public boolean isGlobal;

    LandsAction(String iD, boolean isGlobal) {
        this.iD = iD;
    }


    public static LandsAction getByID(String iD) {
        for (LandsAction action : values()) {
            if (action.iD.equals(iD))
                return action;
        }

        throw new IllegalArgumentException("No enum with iD '" + iD + "' found.");
    }

    @Override
    public String toString() {
        return iD;
    }
}
