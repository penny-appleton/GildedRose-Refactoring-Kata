package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void agedBrie(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    public void testEverything() throws Exception {
        String[] name = { "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros", "Other" };
        Integer[] sellin = Range.get(-1, 12);
        Integer[] quality = Range.get(-1, 51);
        CombinationApprovals.verifyAllCombinations(this::checkMyObject, name, sellin, quality);
    }

    //helper methods
    public GildedRose checkMyObject(String name, Integer sellin, Integer quality) {
        Item[]  items = new  Item[] { new Item(name, sellin, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }


}
