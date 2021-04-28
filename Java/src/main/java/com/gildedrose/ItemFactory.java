package com.gildedrose;

public class ItemFactory {
    private OtherItem otherItem = new OtherItem();
    private Item item;
    private AgedBrie agedBrie;

    public ItemFactory(Item item) {
        this.item = item;
    }

    public Poo getItem(){
        if (item.name.equals("Aged Brie")){
           return agedBrie = new AgedBrie();
        }
        return otherItem;
    }


}
