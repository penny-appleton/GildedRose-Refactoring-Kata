package com.gildedrose;

public class OtherItem extends Poo{


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
