package com.gildedrose;

public class AgedBrie extends ItemStrategy {


    @Override
    public void update(Item item) {
        incrementQuality(item);
        decrementSellin(item);
        if (item.sellIn < 0) {
            incrementQuality(item);
        }

    }
}
