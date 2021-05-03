package com.gildedrose;


public class ItemFactory {

    private ItemStrategy otherItem = new OtherItem();
   /* private ItemStrategy agedBrie;*/

    public ItemStrategy getItem(Item item){
        if(item.name.equals("Aged Brie")){
            return new AgedBrie();

        }
        return otherItem;
    }

}
