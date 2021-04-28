package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems() {
        for (Item item : items) {
            new ItemFactory(item).getItem().update(item);

        }
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