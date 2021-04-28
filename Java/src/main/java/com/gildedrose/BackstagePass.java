package com.gildedrose;

public class BackstagePass extends Poo {
    @Override
    public void update(Item item) {
        incrementQuality(item);
        if (item.sellIn < 11) {
            incrementQuality(item);
        }
        if (item.sellIn < 6) {
            incrementQuality(item);
        }
        decrementSellin(item);
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }
}
