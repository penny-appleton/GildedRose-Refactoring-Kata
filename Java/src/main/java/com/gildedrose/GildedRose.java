package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateIndividualItem(items[i]);
        }
    }

    private void updateIndividualItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        if (item.name.equals("Aged Brie")) {
            handleAgedBrie(item);
            return;
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            handleBackstagePass(item);
            return;
        } else {
            handleUnknownItem(item);
        }
    }

    private void handleUnknownItem(Item item) {
        decrementQuality(item);
        decrementSellin(item);
        if (item.sellIn < 0) {
            decrementQuality(item);
        }

    }

    private void handleAgedBrie(Item item) {
        incrementQuality(item);
        decrementSellin(item);
        if (item.sellIn < 0) {
            incrementQuality(item);
        }
    }

    private void handleBackstagePass(Item item) {
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

    private void decrementSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append("[" + item.toString() + "]");
        }
        return sb.toString();
    }
}