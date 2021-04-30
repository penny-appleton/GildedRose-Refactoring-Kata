package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) updateItemQuality(i);
    }

    private void updateItemQuality(int i) {
        if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        if (items[i].name.equals("Aged Brie")) {
            handleAgedBrie(i);
            return;
        }
        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            handleBackstagePasses(i);
            return;
        } else {
            handleOtherItem(i);
        }


    }

    private void handleOtherItem(int i) {
        if (items[i].quality > 0) {
            decrementQuality(i);

        }
        decrementSellin(i);

        if (items[i].sellIn < 0) {
            if (items[i].quality > 0) {
                decrementQuality(i);
            }
        }
    }


    private void handleAgedBrie(int i) {
        if (items[i].quality < 50) {
            incrementQuality(i);
        }
        decrementSellin(i);
        if (items[i].sellIn < 0) {
            if (items[i].quality < 50) {
                incrementQuality(i);
            }
        }
    }


    private void handleBackstagePasses(int i) {
        if (items[i].quality < 50) {
            incrementQuality(i);
        }
        if (items[i].sellIn < 11) {
            if (items[i].quality < 50) {
                incrementQuality(i);
            }
        }

        if (items[i].sellIn < 6) {
            if (items[i].quality < 50) {
                incrementQuality(i);
            }
        }

        decrementSellin(i);

        if (items[i].sellIn < 0) {
            items[i].quality = items[i].quality - items[i].quality;
        }

    }

    private void decrementSellin(int i) {
        items[i].sellIn = items[i].sellIn - 1;
    }

    private void decrementQuality(int i) {
        items[i].quality = items[i].quality - 1;
    }

    private void incrementQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

    //for testing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append("[" + item.toString() + "]");
        }
        return sb.toString();
    }
}