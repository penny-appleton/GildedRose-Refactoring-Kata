﻿using System.Collections.Generic;

namespace GildedRose
{
    public class GildedRose
    {
        IList<Item> Items;
        public GildedRose(IList<Item> Items)
        {
            this.Items = Items;
        }

        public void UpdateQuality()
        {
            foreach (Item item in Items)
            {
                ItemFactory factory = new ItemFactory();

                ItemStrategy ItemStrategy = factory.GetItem(item);

                ItemStrategy.Update(item);

            }
        }

    }
}