using System;
namespace GildedRose
{
    public class BackstagePass : ItemStrategy
    {
        public override void Update(Item item)
        {
            IncrementQuality(item);

            if (item.SellIn < 11)
            {

                IncrementQuality(item);

            }

            if (item.SellIn < 6)
            {

                IncrementQuality(item);
            }

            DecrementSellin(item);

            if (item.SellIn < 0)
            {
                item.Quality = item.Quality - item.Quality;

            }
        }
    }
}
