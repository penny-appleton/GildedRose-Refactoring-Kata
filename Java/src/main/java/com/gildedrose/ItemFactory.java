package com.gildedrose;

public class ItemFactory {
    private OtherItem otherItem = new OtherItem();
    private Item item;
    private AgedBrie agedBrie;
    private BackstagePass backstagePass;

    public ItemFactory(Item item) {
        this.item = item;
    }

    public Poo getItem(){
        if (item.name.equals("Aged Brie")){
           return agedBrie = new AgedBrie();
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
           return backstagePass = new BackstagePass();
        }
        return otherItem;
    }


}

