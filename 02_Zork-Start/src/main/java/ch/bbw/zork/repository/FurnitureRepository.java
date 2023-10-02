package ch.bbw.zork.repository;

import ch.bbw.zork.models.FurnitureModel;
import ch.bbw.zork.models.ItemModel;

import java.util.ArrayList;

public class FurnitureRepository {
    private  static ArrayList<FurnitureModel> allFurniture = new ArrayList<>();
    public static ArrayList<FurnitureModel> getInitiationChamberList(){
        ArrayList<FurnitureModel> initiationChamberList = new ArrayList<>();
        FurnitureModel  drawer= FurnitureModel.builder().id(1).name("drawer").description("not locked drawer ").itemInSide(1).build();
        allFurniture.add(drawer);
        initiationChamberList.add(drawer);
        return initiationChamberList;
    }
}
