package ch.bbw.zork.repository;

import ch.bbw.zork.models.FurnitureModel;
import ch.bbw.zork.models.ItemModel;

import java.util.ArrayList;

public class FurnitureRepository {
    private static ArrayList<FurnitureModel> allFurniture = new ArrayList<>();

    public static ArrayList<FurnitureModel> getInitiationChamberList() {
        ArrayList<FurnitureModel> initiationChamberList = new ArrayList<>();
        FurnitureModel drawer = FurnitureModel.builder().id(1).name("drawer").description("not locked drawer with").itemInSide(1).build();
        allFurniture.add(drawer);
        initiationChamberList.add(drawer);
        return initiationChamberList;
    }

    public static ArrayList<FurnitureModel> getFirstSteps() {
        ArrayList<FurnitureModel> firstStepsList = new ArrayList<>();
        FurnitureModel drawer = FurnitureModel.builder().id(1).name("cupboard").description("not locked cupboard with").itemToOpen(4123).itemInSide(3).build();
        allFurniture.add(drawer);
        firstStepsList.add(drawer);
        return firstStepsList;
    }
    public static ArrayList<FurnitureModel> getPathOfChoice() {
        ArrayList<FurnitureModel> firstStepsList = new ArrayList<>();
        FurnitureModel drawer = FurnitureModel.builder().id(1).name("painting").description("its a painting with a hole inside").itemToOpen(4).itemInSide(5).build();
        allFurniture.add(drawer);
        firstStepsList.add(drawer);
        return firstStepsList;
    }
}
