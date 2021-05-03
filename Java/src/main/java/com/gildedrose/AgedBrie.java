package com.gildedrose;

public class AgedBrie extends ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            incrementQuality(item);
        }
        decrementSellin(item);
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                incrementQuality(item);
            }
        }
    }
}
