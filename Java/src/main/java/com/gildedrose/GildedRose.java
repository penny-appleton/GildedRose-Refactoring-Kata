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
        if (items[i].name.equals("Aged Brie")) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            handleBackstagePasses(i);
        } else {
            if (items[i].quality > 0) {
                if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                } else {
                    items[i].quality = items[i].quality - 1;
                }
            }
        }

        if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        } else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        } else {
                items[i].sellIn = items[i].sellIn - 1;
        }

        if (items[i].sellIn < 0) {
            if (!items[i].name.equals("Aged Brie")) {
                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    items[i].quality = items[i].quality - items[i].quality;
                } else {
                    if (items[i].quality > 0) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
        }
    }

    private void handleBackstagePasses(int i) {
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }
        if (items[i].sellIn < 11) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }

        if (items[i].sellIn < 6) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }

        items[i].sellIn = items[i].sellIn - 1;


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