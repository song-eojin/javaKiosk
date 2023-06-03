package kioskMenu.menuGrouping;

import kioskMenu.menuData.FoodData.FoodKindData;
import kioskMenu.menuData.commonData.TakeoutData;
import kioskMenu.menuData.drinkData.DrinkExtraData;
import kioskMenu.menuData.drinkData.DrinkKindData;
import kioskMenu.menuData.drinkData.DrinkSizeData;
import kioskMenu.menuData.drinkData.DrinkTempData;

import java.util.HashMap;
import java.util.Map;

public class PriceGrouping {
    private final int price0 = 0;
    private final int price1 = 500;
    private final int price2 = 1000;
    private final int price3 = 1500;
    private final int price4 = 2000;
    private final int price5 = 3500;
    private final int price6 = 4700;
    private final int price11 = 4900;
    private final int price12 = 5200;
    private final int price13 = 5500;
    private final int price14 = 6000;
    private final int price15 = 6700;
    private final int price16 = 7500;

    private final Map<String, Integer> DrinkKinkMap = new HashMap<>();
    private final Map<String, Integer> DrinkTempMap = new HashMap<>();
    private final Map<String, Integer> DrinkSizeMap = new HashMap<>();
    private final Map<String, Integer> DrinkExtraMap = new HashMap<>();
    private final Map<String, Integer> FoodKindMap = new HashMap<>();
    private final Map<String, Integer> TakeoutMap = new HashMap<>();

    public PriceGrouping() {
        setDrinkKindMap();
        setDrinkTempMap();
        setDrinkSizeMap();
        setDrinkExtraMap();
        setTakeoutMap();
    }

    public void setDrinkKindMap() {
        DrinkKinkMap.put(DrinkKindData.GREEN_TEA.name(), price11);
        DrinkKinkMap.put(DrinkKindData.PEACH_TEA.name(), price12);
        DrinkKinkMap.put(DrinkKindData.CHAI_TEA.name(), price11);
        DrinkKinkMap.put(DrinkKindData.AMERICANO.name(), price6);
        DrinkKinkMap.put(DrinkKindData.ESPRESSO.name(), price11);
        DrinkKinkMap.put(DrinkKindData.MOCHA.name(), price12);
        DrinkKinkMap.put(DrinkKindData.VIENNA.name(), price12);
        DrinkKinkMap.put(DrinkKindData.CORTADO.name(), price12);
        DrinkKinkMap.put(DrinkKindData.CAFE_LATTE.name(), price12);
        DrinkKinkMap.put(DrinkKindData.CAPPUCCINO.name(), price13);
        DrinkKinkMap.put(DrinkKindData.MACCHIATO.name(), price13);
        DrinkKinkMap.put(DrinkKindData.LEMONADE.name(), price13);
        DrinkKinkMap.put(DrinkKindData.CHOCOLATE_LATTE.name(), price13);
        DrinkKinkMap.put(DrinkKindData.GREEN_TEA_LATTE.name(), price14);
        DrinkKinkMap.put(DrinkKindData.ORANGE_JUICE.name(), price12);
        DrinkKinkMap.put(DrinkKindData.STRAWBERRY_JUICE.name(), price14);
        DrinkKinkMap.put(DrinkKindData.PINEAPPLE_JUICE.name(), price15);
        DrinkKinkMap.put(DrinkKindData.WATERMELON_JUICE.name(), price15);
        DrinkKinkMap.put(DrinkKindData.MANGO_JUICE.name(), price16);
    }
    public Map<String, Integer> getDrinkKindMap() {
        return DrinkKinkMap;
    }

    public void setDrinkTempMap() {
        DrinkTempMap.put(DrinkTempData.ICE.name(), price1);
        DrinkTempMap.put(DrinkTempData.HOT.name(), price0);
    }
    public Map<String, Integer> getDrinkTempMap() {
        return DrinkTempMap;
    }

    public Map<String, Integer> getDrinkSizeMap() {
        return DrinkSizeMap;
    }
    public void setDrinkSizeMap() {
        DrinkSizeMap.put(DrinkSizeData.TALL.name(), price0);
        DrinkSizeMap.put(DrinkSizeData.GRANDE.name(), price2);
        DrinkSizeMap.put(DrinkSizeData.VENTI.name(), price3);
    }

    public Map<String, Integer> getDrinkExtraMap() {
        return DrinkExtraMap;
    }
    public void setDrinkExtraMap() {
        DrinkExtraMap.put(DrinkExtraData.WHIPPED_CREAM.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.LOWFAT_MILK.name(), price2);
        DrinkExtraMap.put(DrinkExtraData.SOY_MILK.name(), price3);
        DrinkExtraMap.put(DrinkExtraData.ALMOND_MILK.name(), price4);
        DrinkExtraMap.put(DrinkExtraData.CARAMEL_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.HAZELNUT_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.VANILLA_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.CHOCOLATE_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.SUGAR_FREE_SYRUP.name(), price2);
        DrinkExtraMap.put(DrinkExtraData.ONE_ESPRESSO_SHOT.name(), price1);
        DrinkExtraMap.put(DrinkExtraData.TWO_ESPRESSO_SHOT.name(), price2);
    }

    public void setFoodKindMap() {
        FoodKindMap.put(FoodKindData.GUM.name(), price4);
        FoodKindMap.put(FoodKindData.YOGURT.name(), price5);
        FoodKindMap.put(FoodKindData.CAKE.name(), price6);
        FoodKindMap.put(FoodKindData.COOKIES.name(), price5);
        FoodKindMap.put(FoodKindData.CHIPS.name(), price5);
        FoodKindMap.put(FoodKindData.POPCORN.name(), price5);
        FoodKindMap.put(FoodKindData.BAGEL.name(), price6);
        FoodKindMap.put(FoodKindData.CROISSANT.name(), price6);
        FoodKindMap.put(FoodKindData.SCONE.name(), price6);
        FoodKindMap.put(FoodKindData.MADELEINES.name(), price5);
    }
    public Map<String, Integer> getFoodKindMap() { return FoodKindMap; }

    public void setTakeoutMap() {
        TakeoutMap.put(TakeoutData.STORE.name(), price0);
        TakeoutMap.put(TakeoutData.TAKEOUT.name(), price0);
    }
    public Map<String, Integer> getTakeoutMap() {
        return TakeoutMap;
    }
}
