namespace GildedRose
{
    public class Conjured : ItemStrategy
    {
        public override void Update(Item item)
        {
            DecrementQuality(item);
           
            DecrementSellin(item);

            if (item.SellIn < 0)
            {
                DecrementQuality(item);
            }

        }

        public override void DecrementQuality(Item item)
        {
            base.DecrementQuality(item);
            base.DecrementQuality(item);
        }
    }
}