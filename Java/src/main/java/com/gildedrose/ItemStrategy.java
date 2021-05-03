package com.gildedrose;

public abstract class ItemStrategy {

    public abstract void update(Item item);

    public void decrementQuality(Item item){
        item.quality = item.quality - 1;
    };

    public void decrementSellin(Item item){
        item.sellIn = item.sellIn - 1;
    }

    public void incrementQuality(Item item) {
        item.quality = item.quality + 1;
    }
}
