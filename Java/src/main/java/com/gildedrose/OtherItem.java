package com.gildedrose;

public class OtherItem extends ItemStrategy {


    @Override
    public void update(Item item) {
        {
            decrementQuality(item);
            decrementSellin(item);
            if (item.sellIn < 0) {
                decrementQuality(item);
            }

        }
    }
}
