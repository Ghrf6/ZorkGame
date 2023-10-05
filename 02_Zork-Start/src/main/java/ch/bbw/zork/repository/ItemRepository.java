package ch.bbw.zork.repository;

import ch.bbw.zork.models.ItemModel;

import java.util.ArrayList;

public class ItemRepository {

    private static final ArrayList<ItemModel> allItems = new ArrayList<>();

    public static void createItems() {
        ItemModel keyFromInitiationCamber = ItemModel.builder().visible(true).id(1).name("key").description("strange key").build();
        ItemModel puzzle = ItemModel.builder().visible(true).id(2).name("puzzle").description( "Gesucht ist eine 4 stellige zahl\n" + "\n" + "Die erste Ziffer ist das Doppelte der dritten Ziffer. \n" + "Die zweite Ziffer ist 1\n" + "Die dritte Ziffer ist die Differenz der vierten und zweiten Ziffer. \n" + "Die vierte  ist eine Primzahl \n" + "Die vierte Ziffer ist das Dreifache der zweiten Ziffer. \n" + "DIe quersumme aller Ziffern ist 10\n" + "\n"  + "Was bin ich?").build();
        ItemModel note = ItemModel.builder().visible(false).id(3).name("note").description("note with the number 7896 on it").build();
        ItemModel prisma = ItemModel.builder().visible(true).id(4).name("prisma").description("its a prisma there is nothing to inspect").build();
        ItemModel gap = ItemModel.builder().visible(false).id(5).name("gap").description("gap with a blueKey in it").build();
        ItemModel blueKey = ItemModel.builder().visible(true).id(6).name("blueKey").description("key for a door ( will come sune ) ").build();
        ItemModel book = ItemModel.builder().visible(true).id(7).name("book").description("its a book ").build();
        ItemModel feather = ItemModel.builder().visible(true).id(8).name("feather").description("its a feather ").build();
        allItems.add(keyFromInitiationCamber);
        allItems.add(puzzle);
        allItems.add(note);
        allItems.add(prisma);
        allItems.add(gap);
        allItems.add(blueKey);
        allItems.add(book);
        allItems.add(feather);
    }

    public static ArrayList<ItemModel> returnAllItems() {
        return allItems;
    }

    public static ItemModel findById(Integer id) {
        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getId() == id) {
                return allItems.get(i);
            }
        }
        return null;
    }
}
