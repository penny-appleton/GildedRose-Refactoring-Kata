using NUnit.Framework;
using System.Collections.Generic;

namespace GildedRose
{
    [TestFixture]
    public class GildedRoseTest
    {
        private GildedRose app;
        private List<Item> Items = new List<Item>();

        [SetUp]
        public void BeforeEachTest()
        { 
            app = new GildedRose(Items);
        }

        [Test]
        public void SulfurasItemQualityShouldAlwaysBe80()
        {
            Items.Add(new Item { Name = "Sulfuras, Hand of Ragnaros", SellIn = 0, Quality = 80 } );
            app.UpdateQuality();
            Assert.AreEqual(80, Items[0].Quality);
        }

        [Test]
        public void AgedBrieItemQualityShouldIncreaseAsItGestOlder()
        {
            Items.Add(new Item { Name = "Aged Brie", SellIn = -5, Quality = 12 });
            app.UpdateQuality();
            Assert.AreEqual(14, Items[0].Quality);
        }

        [Test]
        public void AgedBrieItemQualityShouldNeverBeMoreThan50()
        {
            Items.Add(new Item { Name = "Aged Brie", SellIn = -24, Quality = 50 } );
            app.UpdateQuality();
            Assert.AreEqual(50, Items[0].Quality);
        }

        [Test]
        public void BackstagePassQualityIncreasesOverTimeBy1WhenSellInDateIsMoreThan10()
        {
            Items.Add(new Item { Name = "Backstage passes to a TAFKAL80ETC concert", SellIn = 11, Quality = 24 });
            app.UpdateQuality();
            Assert.AreEqual(25, Items[0].Quality);
        }

        [Test]
        public void BackstagePassQualityIncreasesOverTimeBy2WhenSellInDateIsBetween11And5()
        {
            Items.Add(new Item { Name = "Backstage passes to a TAFKAL80ETC concert", SellIn = 8, Quality = 29 } );
            app.UpdateQuality();
            Assert.AreEqual(31, Items[0].Quality);
        }

        [Test]
        public void BackstagePassQualityIncreasesOverTimeBy3WhenSellInDateIsLessThan6()
        {
            Items.Add(new Item { Name = "Backstage passes to a TAFKAL80ETC concert", SellIn = 5, Quality = 35 });
            app.UpdateQuality();
            Assert.AreEqual(38, Items[0].Quality);
        }

        [Test]
        public void BackstagePassQualityGoesTo0WhenSellInDateisLessThan0()
        {
            Items.Add(new Item { Name = "Backstage passes to a TAFKAL80ETC concert", SellIn = 0, Quality = 50 } );
            app.UpdateQuality();
            Assert.AreEqual(0, Items[0].Quality);
        }

        [Test]
        public void BackstagePassQualityShouldNeverGoOver50()
        {
            Items.Add(new Item { Name = "Backstage passes to a TAFKAL80ETC concert", SellIn = 5, Quality = 50 });
            app.UpdateQuality();
            Assert.AreEqual(50, Items[0].Quality);
        }

        [Test]
        public void OtherItemQualityShouldDecreaseBy1WhenSellInIsGreaterThan0()
        {
            Items.Add(new Item { Name = "Elixir of the Mongoose", SellIn = 10, Quality = 19 } );
            app.UpdateQuality();
            Assert.AreEqual(18, Items[0].Quality);
        }

        [Test]
        public void OtherItemQualityShouldDecreaseBy2WhenSellInIsEqualTo0()
        {
            Items.Add(new Item { Name = "Elixir of the Mongoose", SellIn = 0, Quality = 19 } );
            app.UpdateQuality();
            Assert.AreEqual(17, Items[0].Quality);
        }

        [Test]
        public void OtherItemQualityShouldDecreaseBy2WhenSellInIsLessThan0()
        {
            Items.Add(new Item { Name = "Elixir of the Mongoose", SellIn = -1, Quality = 19 } );
            app.UpdateQuality();
            Assert.AreEqual(17, Items[0].Quality);
        }

        [Test]
        public void ItemQualityCanNeverBeLessThan0()
        {
            Items.Add(new Item { Name = "Elixir of the Mongoose", SellIn = -1, Quality = 0 } );
            app.UpdateQuality();
            Assert.AreEqual(0, Items[0].Quality);
        }

        [Test]
        public void ConjuredItemDegradesBy2WhenSellInIsGreaterThan0()
        {
            Items.Add(new Item { Name = "Conjured", SellIn = 5, Quality = 10 });
            app.UpdateQuality();
            Assert.AreEqual(8, Items[0].Quality);
        }

        [Test]
        public void ConjuredItemDegradesBy4WhenSellInIsLessThan0()
        {
            Items.Add(new Item { Name = "Conjured", SellIn = -1, Quality = 10 });
            app.UpdateQuality();
            Assert.AreEqual(6, Items[0].Quality);
        }

        [Test]
        public void ConjuredItemDegradesBy4WhenSellInIsEqualTo0()
        {
            Items.Add(new Item { Name = "Conjured", SellIn = 0, Quality = 10 });
            app.UpdateQuality();
            Assert.AreEqual(6, Items[0].Quality);
        }
    }  
}
