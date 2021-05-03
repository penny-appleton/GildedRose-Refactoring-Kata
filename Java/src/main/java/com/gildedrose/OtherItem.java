package com.gildedrose;

public class OtherItem extends ItemStrategy {

    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            decrementQuality(item);
        }
        decrementSellin(item);
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                decrementQuality(item);
            }
        }
    }
}
