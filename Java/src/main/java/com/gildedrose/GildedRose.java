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
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                poo.update(items[i]);
            }
            updateIndividualItem(items[i]);
        }
    }

    private void updateIndividualItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
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