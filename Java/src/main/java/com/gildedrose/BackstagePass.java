package com.gildedrose;

public class BackstagePass extends ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            incrementQuality(item);
        }
        if (item.sellIn < 11) {
            if (item.quality < 50) {
                incrementQuality(item);
            }
        }
        if (item.sellIn < 6) {
            if (item.quality < 50) {
                incrementQuality(item);
            }
        }
        decrementSellin(item);
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }
}
