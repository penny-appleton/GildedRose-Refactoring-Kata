using System;
namespace GildedRose
{
    public class ItemFactory
    {
       

            public ItemStrategy GetItem(Item item)
            {
                if(item.Name == "Backstage passes to a TAFKAL80ETC concert")
                {
                    return new BackstagePass();
                }

                if(item.Name == "Aged Brie")
                {
                    return new AgedBrie();
                }

                if(item.Name == "Sulfuras, Hand of Ragnaros")
            {
                return new Sulfuras();
            }
            return new OtherItem();
        }
        
    }
}
