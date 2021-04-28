package com.gildedrose;

public abstract class ItemStrategy {
    public abstract void update(Item item);

    protected void decrementSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
