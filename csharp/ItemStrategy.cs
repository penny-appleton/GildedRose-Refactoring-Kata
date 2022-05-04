using System;
namespace GildedRose
{
    public abstract class ItemStrategy
    {
        public void IncrementQuality(Item item)
        {
            if (item.Quality < 50)
            {
                item.Quality = item.Quality + 1;
            }
        }

        public virtual void DecrementQuality(Item item)
        {
            if (item.Quality > 0)
            {
                item.Quality = item.Quality - 1;

            }
        }

        public void DecrementSellin(Item item)
        {
            item.SellIn = item.SellIn - 1;
        }

        public abstract void Update(Item item);
    }
}
