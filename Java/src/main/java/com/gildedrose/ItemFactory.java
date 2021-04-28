package com.gildedrose;

public class ItemFactory {
    private OtherItem otherItem;
    private Item item;
    private AgedBrie agedBrie;
    private BackstagePass backstagePass;
    private Sulfuras sulfuras;

    public ItemFactory(Item item) {
        this.item = item;
    }

    public ItemStrategy getItem(){
        if (item.name.equals("Aged Brie")){
           return agedBrie = new AgedBrie();
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
           return backstagePass = new BackstagePass();
        }

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return sulfuras = new Sulfuras();
        }
        return new OtherItem();
    }


}

