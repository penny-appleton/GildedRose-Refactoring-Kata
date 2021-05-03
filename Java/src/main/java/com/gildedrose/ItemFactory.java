package com.gildedrose;


public class ItemFactory {

    private ItemStrategy otherItem = new OtherItem();

    public ItemStrategy getItem(){
        return otherItem;
    }

}
