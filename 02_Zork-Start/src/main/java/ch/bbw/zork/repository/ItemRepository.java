package ch.bbw.zork.repository;

import ch.bbw.zork.models.ItemModel;

import java.util.ArrayList;

public class ItemRepository {

    private static ArrayList<ItemModel> allItems = new ArrayList<>();

    public static void createItems() {
        ItemModel keyFromInitiationCamber = ItemModel.builder().id(1).name("key").description("strange key").build();
        ItemModel note = ItemModel.builder().id(2).name("note").description("note with the number 7896 on it").build();
        ItemModel prisma = ItemModel.builder().id(3).name("prisma").description("its a prisma there is nothing to inspect").build();
        ItemModel blueKey = ItemModel.builder().id(4).name("blue key").description("key for a door ( will come sune ) ").build();
        ItemModel book = ItemModel.builder().id(5).name("book").description("its a book ").build();
        ItemModel feather = ItemModel.builder().id(6).name("feather").description("its a feather ").build();
        allItems.add(keyFromInitiationCamber);
        allItems.add(note);
        allItems.add(prisma);
        allItems.add(blueKey);
        allItems.add(book);
        allItems.add(feather);
    }

    public static ArrayList<ItemModel> returnAllItems() {
        return allItems;
    }

    public static ItemModel findById(Integer id) {
        for (int i = 0; i < allItems.size(); i++) {
            if(allItems.get(i).getId() == id){
                return allItems.get(i);
            }
        }
        return null;
    }

}
