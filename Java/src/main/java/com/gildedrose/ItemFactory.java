package com.gildedrose;


public class ItemFactory {

    private ItemStrategy otherItem = new OtherItem();
   /* private ItemStrategy agedBrie;*/

    public ItemStrategy getItem(Item item){
        if(item.name.equals("Aged Brie")){
            return new AgedBrie();
        }
        if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
            return new BackstagePass();
        }
        return otherItem;
    }

}
