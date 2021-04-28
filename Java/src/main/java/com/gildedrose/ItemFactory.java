package com.gildedrose;

public class ItemFactory {
    private OtherItem otherItem = new OtherItem();

    public ItemFactory(Item item) {

    }

    public Poo getItem(){
        return otherItem;
    }
}
