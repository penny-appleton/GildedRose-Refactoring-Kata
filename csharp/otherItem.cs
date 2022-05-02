namespace GildedRose
{
    public class OtherItem : ItemStrategy
    {
        public override void Update(Item item)
        {
            DecrementQuality(item);

            DecrementSellin(item);

            if (item.SellIn < 0 )
            {
                DecrementQuality(item);
            }
        }
    }
}