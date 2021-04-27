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
    void agedBrieSellnDecreasesBy1(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
    }

    //sellin  10,11,12,5,6,7

    //quality -1, 0, 1, 49, 50, 51

    @Test
    public void testEverything() throws Exception {
        String[] names = { "Aged Brie", "Sulfuras, Hand of Ragnaros", "Backstage passes to a TAFKAL80ETC concert", "foo" };
        Integer[] sellins = Range.get(-1, 12);
        Integer[] qualities = Range.get(-1, 51);
        CombinationApprovals.verifyAllCombinations(this::checkMyObject, names, sellins, qualities);
    }

    @Test
    public void testAgedBrie() throws Exception {
        String[] names = { "Aged Brie"};
        Integer[] sellins = Range.get(-1, 12);
        Integer[] qualities = Range.get(-1, 51);
        CombinationApprovals.verifyAllCombinations(this::checkMyObject, names, sellins, qualities);
    }

    @Test
    public void testBackstagePasses() throws Exception {
        String[] names = { "Backstage passes to a TAFKAL80ETC concert" };
        Integer[] sellins = Range.get(-1, 12);
        Integer[] qualities = Range.get(-1, 51);
        CombinationApprovals.verifyAllCombinations(this::checkMyObject, names, sellins, qualities);
    }

    @Test
    public void testSulfuras() throws Exception {
        String[] names = { "Sulfuras, Hand of Ragnaros" };
        Integer[] sellins = Range.get(-1, 12);
        Integer[] qualities = Range.get(-1, 51);
        CombinationApprovals.verifyAllCombinations(this::checkMyObject, names, sellins, qualities);
    }



    public GildedRose checkMyObject(String name, Integer sellin, Integer quality) {
        Item[]  items = new  Item[] { new Item(name, sellin, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }


}
