namespace GildedRose
{
    public class AgedBrie : ItemStrategy
    {
        public override void Update(Item item)
        {
            IncrementQuality(item);

            DecrementSellin(item);

            if (item.SellIn < 0)
            {
                IncrementQuality(item);
            }
        }
    }
}