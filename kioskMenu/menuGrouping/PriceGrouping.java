package kioskMenu.menuGrouping;

import kioskMenu.menuOption.*;

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
        DrinkKinkMap.put(MenuOpt01_Kind.GREEN_TEA.name(), price11);
        DrinkKinkMap.put(MenuOpt01_Kind.PEACH_TEA.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.CHAI_TEA.name(), price11);
        DrinkKinkMap.put(MenuOpt01_Kind.AMERICANO.name(), price11);
        DrinkKinkMap.put(MenuOpt01_Kind.ESPRESSO.name(), price11);
        DrinkKinkMap.put(MenuOpt01_Kind.MOCHA.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.VIENNA.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.CORTADO.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.CAFE_LATTE.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.CAPPUCCINO.name(), price13);
        DrinkKinkMap.put(MenuOpt01_Kind.MACCHIATO.name(), price13);
        DrinkKinkMap.put(MenuOpt01_Kind.LEMONADE.name(), price13);
        DrinkKinkMap.put(MenuOpt01_Kind.CHOCOLATE_LATTE.name(), price13);
        DrinkKinkMap.put(MenuOpt01_Kind.GREEN_TEA_LATTE.name(), price14);
        DrinkKinkMap.put(MenuOpt01_Kind.ORANGE_JUICE.name(), price12);
        DrinkKinkMap.put(MenuOpt01_Kind.STRAWBERRY_JUICE.name(), price14);
        DrinkKinkMap.put(MenuOpt01_Kind.PINEAPPLE_JUICE.name(), price15);
        DrinkKinkMap.put(MenuOpt01_Kind.WATERMELON_JUICE.name(), price15);
        DrinkKinkMap.put(MenuOpt01_Kind.MANGO_JUICE.name(), price16); //7500??
    }
    public Map<String, Integer> getDrinkKindMap() {
        return DrinkKinkMap;
    }

    public void setDrinkTempMap() {
        DrinkTempMap.put(MenuOpt03_Temp.ICE.name(), price1); //500?? ???
        DrinkTempMap.put(MenuOpt03_Temp.HOT.name(), price0); //?????? ????
    }
    public Map<String, Integer> getDrinkTempMap() {
        return DrinkTempMap;
    }

    public Map<String, Integer> getDrinkSizeMap() {
        return DrinkSizeMap;
    }
    public void setDrinkSizeMap() {
        DrinkSizeMap.put(MenuOpt04_Size.TALL.name(), price0);
        DrinkSizeMap.put(MenuOpt04_Size.GRANDE.name(), price2); //1000?? ???
        DrinkSizeMap.put(MenuOpt04_Size.VENTI.name(), price3); //1500?? ???
    }

    public Map<String, Integer> getDrinkExtraMap() {
        return DrinkExtraMap;
    }
    public void setDrinkExtraMap() {
        DrinkExtraMap.put(MenuOpt05_Extra.WHIPPED_CREAM.name(), price1); //500?? ???
        DrinkExtraMap.put(MenuOpt05_Extra.LOWFAT_MILK.name(), price2); //1000?? ???
        DrinkExtraMap.put(MenuOpt05_Extra.SOY_MILK.name(), price3); //1500?? ???
        DrinkExtraMap.put(MenuOpt05_Extra.ALMOND_MILK.name(), price4); //2000?? ???
        DrinkExtraMap.put(MenuOpt05_Extra.CARAMEL_SYRUP.name(), price1);
        DrinkExtraMap.put(MenuOpt05_Extra.HAZELNUT_SYRUP.name(), price1);
        DrinkExtraMap.put(MenuOpt05_Extra.VANILLA_SYRUP.name(), price1);
        DrinkExtraMap.put(MenuOpt05_Extra.CHOCOLATE_SYRUP.name(), price1);
        DrinkExtraMap.put(MenuOpt05_Extra.SUGAR_FREE_SYRUP.name(), price2);
        DrinkExtraMap.put(MenuOpt05_Extra.ONE_ESPRESSO_SHOT.name(), price1);
        DrinkExtraMap.put(MenuOpt05_Extra.TWO_ESPRESSO_SHOT.name(), price2);
    }

    public Map<String, Integer> getTakeoutMap() {
        return TakeoutMap;
    }
    public void setTakeoutMap() {
        TakeoutMap.put(MenuOpt06_Takeout.STORE.name(), price0);
        TakeoutMap.put(MenuOpt06_Takeout.TAKEOUT.name(), price0);
    }
}
