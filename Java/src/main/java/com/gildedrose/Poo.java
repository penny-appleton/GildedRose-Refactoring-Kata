package com.gildedrose;

public abstract class Poo {
    public abstract void update(Item item);

    protected void decrementSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
