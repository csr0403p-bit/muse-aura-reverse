package X;

import com.facebook.aura.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class HZx {
    public static final Map<String, HkU> A00;
    public static final Map<String, Integer> A01;

    static {
        List listAsList = Arrays.asList("SERVES_BREAKFAST", "SERVES_BRUNCH", "SERVES_LUNCH", "SERVES_DINNER", "SERVES_VEGETARIAN_FOOD", "SERVES_BEER", "SERVES_WINE", "SERVES_COCKTAILS", "SERVES_DESSERT", "SERVES_COFFEE", "MENU_FOR_CHILDREN");
        int iA03 = C3cG.A03(listAsList, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(iA03);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            linkedHashMapA15.put(it.next(), HkU.A03);
        }
        List listAsList2 = Arrays.asList("DINE_IN", "TAKEOUT", "DELIVERY", "CURBSIDE_PICKUP", "IN_STORE_PICKUP", "TAKES_RESERVATIONS", "PAYMENT_METHOD_CREDIT_CARDS", "PAYMENT_METHOD_DEBIT_CARDS", "PAYMENT_METHOD_CASH_ONLY", "PAYMENT_METHOD_ACCEPTS_NFC");
        LinkedHashMap linkedHashMapA152 = C60O.A15(Hr7.A1C(listAsList2));
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            linkedHashMapA152.put(it2.next(), HkU.A04);
        }
        LinkedHashMap linkedHashMapA13 = AbstractC7608F5v.A13(linkedHashMapA15, linkedHashMapA152);
        List listAsList3 = Arrays.asList("RESTROOM", "ACCESSIBILITY_OPTIONS_WHEELCHAIR_ACCESSIBLE_RESTROOM", "PARKING_TYPE_LOT", "PARKING_TYPE_STREET", "PARKING_TYPE_VALET", "OUTDOOR_SEATING", "GOOD_FOR_KIDS", "GOOD_FOR_GROUPS", "ALLOWS_DOGS", "LIVE_MUSIC", "GOOD_FOR_WATCHING_SPORTS");
        LinkedHashMap linkedHashMapA153 = C60O.A15(Hr7.A1C(listAsList3));
        Iterator it3 = listAsList3.iterator();
        while (it3.hasNext()) {
            linkedHashMapA153.put(it3.next(), HkU.A02);
        }
        A00 = AbstractC7608F5v.A13(linkedHashMapA13, linkedHashMapA153);
        HxE[] hxEArr = new HxE[64];
        System.arraycopy(new HxE[]{AnonymousClass002.A0p("ACCESSIBILITY_OPTIONS_WHEELCHAIR_ACCESSIBLE_RESTROOM", R.string._name_removed__res_0x7f120e12), C3cG.A0r("AIR_CONDITIONING", Integer.valueOf(R.string._name_removed__res_0x7f120e13)), AnonymousClass002.A0p("ALLOWS_DOGS", R.string._name_removed__res_0x7f120e14), C3cG.A0r("BILINGUAL_STAFF", Integer.valueOf(R.string._name_removed__res_0x7f120e15)), C3cG.A0r("BIRTHDAY_PARTIES", Integer.valueOf(R.string._name_removed__res_0x7f120e16)), C3cG.A0r("CORPORATE_EVENTS", Integer.valueOf(R.string._name_removed__res_0x7f120e1a)), AnonymousClass002.A0p("CURBSIDE_PICKUP", R.string._name_removed__res_0x7f120e1b), AnonymousClass002.A0p("DELIVERY", R.string._name_removed__res_0x7f120e1c), AnonymousClass002.A0p("DINE_IN", R.string._name_removed__res_0x7f120e1d), C3cG.A0r("EMERGENCY_SERVICES", Integer.valueOf(R.string._name_removed__res_0x7f120e1e)), C3cG.A0r("FREE_ADMISSION", Integer.valueOf(R.string._name_removed__res_0x7f120e1f)), C3cG.A0r("FREE_PARKING", Integer.valueOf(R.string._name_removed__res_0x7f120e20)), C3cG.A0r("FREE_WIFI", Integer.valueOf(R.string._name_removed__res_0x7f120e21)), C3cG.A0r("GIFT_CARDS_AVAILABLE", Integer.valueOf(R.string._name_removed__res_0x7f120e22)), C3cG.A0r("GIFT_SHOP", Integer.valueOf(R.string._name_removed__res_0x7f120e23)), C3cG.A0r("GOOD_FOR_CONVERSATIONS", Integer.valueOf(R.string._name_removed__res_0x7f120e24)), C3cG.A0r("GOOD_FOR_DATES", Integer.valueOf(R.string._name_removed__res_0x7f120e25)), C3cG.A0r("GOOD_FOR_DOGS", Integer.valueOf(R.string._name_removed__res_0x7f120e26)), C3cG.A0r("GOOD_FOR_FAMILIES", Integer.valueOf(R.string._name_removed__res_0x7f120e27)), AnonymousClass002.A0p("GOOD_FOR_GROUPS", R.string._name_removed__res_0x7f120e28), C3cG.A0r("GOOD_FOR_HANGOUTS", Integer.valueOf(R.string._name_removed__res_0x7f120e29)), AnonymousClass002.A0p("GOOD_FOR_KIDS", R.string._name_removed__res_0x7f120e2a), C3cG.A0r("GOOD_FOR_MEETING_SINGLES", Integer.valueOf(R.string._name_removed__res_0x7f120e2b)), C3cG.A0r("GOOD_FOR_PEOPLE_WATCHING", Integer.valueOf(R.string._name_removed__res_0x7f120e2c)), C3cG.A0r("GOOD_FOR_REMOTE_WORK", Integer.valueOf(R.string._name_removed__res_0x7f120e2d)), C3cG.A0r("GOOD_FOR_SOLO_VISITORS", Integer.valueOf(R.string._name_removed__res_0x7f120e2e)), C3cG.A0r("GOOD_FOR_SPECIAL_OCCASIONS", Integer.valueOf(R.string._name_removed__res_0x7f120e2f))}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{AnonymousClass002.A0p("GOOD_FOR_WATCHING_SPORTS", R.string._name_removed__res_0x7f120e30), C3cG.A0r("GUIDED_TOURS", Integer.valueOf(R.string._name_removed__res_0x7f120e31)), C3cG.A0r("HAS_DAY_NIGHT_VARIANCE", Integer.valueOf(R.string._name_removed__res_0x7f120e32)), C3cG.A0r("HOME_SERVICE_AVAILABLE", Integer.valueOf(R.string._name_removed__res_0x7f120e33)), AnonymousClass002.A0p("IN_STORE_PICKUP", R.string._name_removed__res_0x7f120e34), AnonymousClass002.A0p("LIVE_MUSIC", R.string._name_removed__res_0x7f120e35), C3cG.A0r("LIVE_PERFORMANCE", Integer.valueOf(R.string._name_removed__res_0x7f120e36)), AnonymousClass002.A0p("MENU_FOR_CHILDREN", R.string._name_removed__res_0x7f120e37), C3cG.A0r("MULTILINGUAL_STAFF", Integer.valueOf(R.string._name_removed__res_0x7f120e38)), C3cG.A0r("ONLINE_BOOKING", Integer.valueOf(R.string._name_removed__res_0x7f120e39)), C3cG.A0r("OUTDOOR_ACTIVITY", Integer.valueOf(R.string._name_removed__res_0x7f120e3a)), AnonymousClass002.A0p("OUTDOOR_SEATING", R.string._name_removed__res_0x7f120e3b), C3cG.A0r("PAID_PARKING", Integer.valueOf(R.string._name_removed__res_0x7f120e3c)), AnonymousClass002.A0p("PARKING_TYPE_LOT", R.string._name_removed__res_0x7f120e3d), AnonymousClass002.A0p("PARKING_TYPE_STREET", R.string._name_removed__res_0x7f120e3e), AnonymousClass002.A0p("PARKING_TYPE_VALET", R.string._name_removed__res_0x7f120e3f), AnonymousClass002.A0p("PAYMENT_METHOD_ACCEPTS_NFC", R.string._name_removed__res_0x7f120e40), AnonymousClass002.A0p("PAYMENT_METHOD_CASH_ONLY", R.string._name_removed__res_0x7f120e41), AnonymousClass002.A0p("PAYMENT_METHOD_CREDIT_CARDS", R.string._name_removed__res_0x7f120e42), AnonymousClass002.A0p("PAYMENT_METHOD_DEBIT_CARDS", R.string._name_removed__res_0x7f120e43), C3cG.A0r("RESERVATION_RECOMMENDED", Integer.valueOf(R.string._name_removed__res_0x7f120e44)), AnonymousClass002.A0p("RESTROOM", R.string._name_removed__res_0x7f120e45), AnonymousClass002.A0p("SERVES_BEER", R.string._name_removed__res_0x7f120e46), AnonymousClass002.A0p("SERVES_BREAKFAST", R.string._name_removed__res_0x7f120e47), AnonymousClass002.A0p("SERVES_BRUNCH", R.string._name_removed__res_0x7f120e48), AnonymousClass002.A0p("SERVES_COCKTAILS", R.string._name_removed__res_0x7f120e49), AnonymousClass002.A0p("SERVES_COFFEE", R.string._name_removed__res_0x7f120e4a)}, 0, hxEArr, 27, 27);
        System.arraycopy(new HxE[]{AnonymousClass002.A0p("SERVES_DESSERT", R.string._name_removed__res_0x7f120e4b), AnonymousClass002.A0p("SERVES_DINNER", R.string._name_removed__res_0x7f120e4c), C3cG.A0r("SERVES_FOOD", Integer.valueOf(R.string._name_removed__res_0x7f120e4d)), AnonymousClass002.A0p("SERVES_LUNCH", R.string._name_removed__res_0x7f120e4e), AnonymousClass002.A0p("SERVES_VEGETARIAN_FOOD", R.string._name_removed__res_0x7f120e4f), AnonymousClass002.A0p("SERVES_WINE", R.string._name_removed__res_0x7f120e50), AnonymousClass002.A0p("TAKEOUT", R.string._name_removed__res_0x7f120e51), AnonymousClass002.A0p("TAKES_RESERVATIONS", R.string._name_removed__res_0x7f120e52), C3cG.A0r("WALK_INS_WELCOME", Integer.valueOf(R.string._name_removed__res_0x7f120e54)), C3cG.A0r("WHEELCHAIR_ACCESSIBLE", Integer.valueOf(R.string._name_removed__res_0x7f120e55))}, 0, hxEArr, 54, 10);
        A01 = AGH.A0D(hxEArr);
    }
}
