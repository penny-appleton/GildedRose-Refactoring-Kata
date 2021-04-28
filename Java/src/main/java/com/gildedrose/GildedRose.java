package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            Poo poo = new ItemFactory(items[i]).getItem();
            if (!item.name.equals("Sulfuras, Hand of Ragnaros") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                poo.update(items[i]);
            }
            updateIndividualItem(items[i]);
        }
    }

    private void updateIndividualItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            handleBackstagePass(item);
            return;
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