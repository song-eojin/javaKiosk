package kioskMenu.commonData;

import ch2.kioskMenu.DrinkMenu.DrinkMenu01_Kind;
import ch2.kioskMenu.DrinkMenu.DrinkMenu02_Temp;
import ch2.kioskMenu.DrinkMenu.DrinkMenu03_Size;
import ch2.kioskMenu.DrinkMenu.DrinkMenu04_Extra;
import ch2.kioskMenu.FoodMenu.FoodMenu01_Kind;

import java.util.HashMap;
import java.util.Map;

public class PriceDataMap {
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

    public PriceDataMap() {
        setDrinkKindMap();
        setDrinkTempMap();
        setDrinkSizeMap();
        setDrinkExtraMap();
        setFoodKindMap();
        setTakeoutMap();
    }

    public void setDrinkKindMap() {
        DrinkKinkMap.put(DrinkMenu01_Kind.GREEN_TEA.name(), price11);
        DrinkKinkMap.put(DrinkMenu01_Kind.PEACH_TEA.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.CHAI_TEA.name(), price11);
        DrinkKinkMap.put(DrinkMenu01_Kind.AMERICANO.name(), price11);
        DrinkKinkMap.put(DrinkMenu01_Kind.ESPRESSO.name(), price11);
        DrinkKinkMap.put(DrinkMenu01_Kind.MOCHA.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.VIENNA.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.CORTADO.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.CAFE_LATTE.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.CAPPUCCINO.name(), price13);
        DrinkKinkMap.put(DrinkMenu01_Kind.MACCHIATO.name(), price13);
        DrinkKinkMap.put(DrinkMenu01_Kind.LEMONADE.name(), price13);
        DrinkKinkMap.put(DrinkMenu01_Kind.CHOCOLATE_LATTE.name(), price13);
        DrinkKinkMap.put(DrinkMenu01_Kind.GREEN_TEA_LATTE.name(), price14);
        DrinkKinkMap.put(DrinkMenu01_Kind.ORANGE_JUICE.name(), price12);
        DrinkKinkMap.put(DrinkMenu01_Kind.STRAWBERRY_JUICE.name(), price14);
        DrinkKinkMap.put(DrinkMenu01_Kind.PINEAPPLE_JUICE.name(), price15);
        DrinkKinkMap.put(DrinkMenu01_Kind.WATERMELON_JUICE.name(), price15);
        DrinkKinkMap.put(DrinkMenu01_Kind.MANGO_JUICE.name(), price16); //7500??
    }
    public Map<String, Integer> getDrinkKindMap() {
        return DrinkKinkMap;
    }

    public void setDrinkTempMap() {
        DrinkTempMap.put(DrinkMenu02_Temp.ICE.name(), price1); //500?? ???
        DrinkTempMap.put(DrinkMenu02_Temp.HOT.name(), price0); //?????? ????
    }
    public Map<String, Integer> getDrinkTempMap() {
        return DrinkTempMap;
    }

    public Map<String, Integer> getDrinkSizeMap() {
        return DrinkSizeMap;
    }
    public void setDrinkSizeMap() {
        DrinkSizeMap.put(DrinkMenu03_Size.TALL.name(), price0);
        DrinkSizeMap.put(DrinkMenu03_Size.GRANDE.name(), price2); //1000?? ???
        DrinkSizeMap.put(DrinkMenu03_Size.VENTI.name(), price3); //1500?? ???
    }

    public Map<String, Integer> getDrinkExtraMap() {
        return DrinkExtraMap;
    }
    public void setDrinkExtraMap() {
        DrinkExtraMap.put(DrinkMenu04_Extra.WHIPPED_CREAM.name(), price1); //500?? ???
        DrinkExtraMap.put(DrinkMenu04_Extra.LOWFAT_MILK.name(), price2); //1000?? ???
        DrinkExtraMap.put(DrinkMenu04_Extra.SOY_MILK.name(), price3); //1500?? ???
        DrinkExtraMap.put(DrinkMenu04_Extra.ALMOND_MILK.name(), price4); //2000?? ???
        DrinkExtraMap.put(DrinkMenu04_Extra.CARAMEL_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkMenu04_Extra.HAZELNUT_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkMenu04_Extra.VANILLA_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkMenu04_Extra.CHOCOLATE_SYRUP.name(), price1);
        DrinkExtraMap.put(DrinkMenu04_Extra.SUGAR_FREE_SYRUP.name(), price2);
        DrinkExtraMap.put(DrinkMenu04_Extra.ONE_ESPRESSO_SHOT.name(), price1);
        DrinkExtraMap.put(DrinkMenu04_Extra.TWO_ESPRESSO_SHOT.name(), price2);
    }

    public Map<String, Integer> getFoodKindMap() {
        return FoodKindMap;
    }
    public void setFoodKindMap() {
        FoodKindMap.put(FoodMenu01_Kind.GUM.name(), price4); //2000??
        FoodKindMap.put(FoodMenu01_Kind.YOGURT.name(), price6); //4700??
        FoodKindMap.put(FoodMenu01_Kind.CAKE.name(), price13);
        FoodKindMap.put(FoodMenu01_Kind.COOKIES.name(), price5); //3500??
        FoodKindMap.put(FoodMenu01_Kind.CHIPS.name(), price5);
        FoodKindMap.put(FoodMenu01_Kind.POPCORN.name(), price5);
        FoodKindMap.put(FoodMenu01_Kind.BAGEL.name(), price15);
        FoodKindMap.put(FoodMenu01_Kind.CROISSANT.name(), price14);
        FoodKindMap.put(FoodMenu01_Kind.SCONE.name(), price14);
        FoodKindMap.put(FoodMenu01_Kind.MADELEINES.name(), price14);
    }

    public Map<String, Integer> getTakeoutMap() {
        return TakeoutMap;
    }
    public void setTakeoutMap() {
        TakeoutMap.put(TakeoutData.STORE.name(), price0);
        TakeoutMap.put(TakeoutData.TAKEOUT.name(), price0);
    }
}
