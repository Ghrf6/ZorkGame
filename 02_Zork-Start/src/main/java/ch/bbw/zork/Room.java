package ch.bbw.zork;/** * Author:  Michael Kolling, Version: 1.1, Date: August 2000 * refactoring: Rinaldo Lanza, September 2020 */import ch.bbw.zork.models.FurnitureModel;import ch.bbw.zork.models.ItemModel;import java.util.ArrayList;import java.util.HashMap;public class Room {    private String description;    private boolean roomIsLocked= false;    private HashMap<String, Room> exits;    private ArrayList<FurnitureModel> furniture;    private ArrayList<ItemModel> items;    private String map;    public Room(String description, ArrayList<FurnitureModel> furniture, ArrayList<ItemModel> items, String map) {        this.description = description;        this.exits = new HashMap<>();        this.furniture = furniture;        this.items = items;        this.map = map;    }    public void setExits(Room north, Room east, Room south, Room west) {        exits.put("north", north);        exits.put("east", east);        exits.put("south", south);        exits.put("west", west);    }    public String getMap() {        return map;    }    public String shortDescription() {        return description;    }    public String longDescription() {        StringBuilder stringBuilder = new StringBuilder("You are in " + description + ".\n");        stringBuilder.append(exitString());        return stringBuilder.toString();    }    private String exitString() {        return "Exits:" + String.join(" ", exits.keySet());    }    public Room nextRoom(String direction) {        return exits.get(direction);    }    public String allRooms() {        String door = "there are doors in";        if (exits.get("north") != null) {            door += " north";        }        if (exits.get("east") != null) {            door += " east";        }        if (exits.get("south") != null) {            door += " south";        }        if (exits.get("west") != null) {            door += " west";        }        return door;    }    public void lockDoor(){        roomIsLocked = true;    }    public boolean isDoorLocked(){        return roomIsLocked;    }    public void unlockDoor(){        roomIsLocked= false;    }}