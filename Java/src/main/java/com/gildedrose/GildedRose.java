package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                ItemStrategy strategy = new ItemFactory().getItem(items[i]);
                strategy.update(items[i]);
                return;
            }
            updateItemQuality(i);
        }
    }

    private void updateItemQuality(int i) {
        if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        return;

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