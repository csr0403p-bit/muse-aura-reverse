package X;

import com.facebook.aura.iap.HatchSubscriptionPurchase;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HVs {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HVs[] A01;
    public static final HVs A02;
    public final String serverValue;

    static {
        HVs hVsA00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = hVsA00;
        HVs hVsA002 = A00("ADS_BILLING", 1);
        HVs hVsA003 = A00("AFS_SUBSCRIPTION", 2);
        HVs hVsA004 = A00("AI_SUB_4B", 3);
        HVs hVsA005 = A00("ALL_PRODUCTS", 4);
        HVs hVsA006 = A00("ASTERIA_SUBSCRIPTION", 5);
        HVs hVsA007 = A00("AVATAR_CONTENT", 6);
        HVs hVsA008 = A00("BUSINESS_AI_AGENT", 7);
        HVs hVsA009 = A00("CREATOR_STOREFRONT", 8);
        HVs hVsA0010 = A00("DCP_DEMO", 9);
        HVs hVsA0011 = A00("FAN_FUNDING", 10);
        HVs hVsA0012 = A00("FB_SHORT_FORM_VIDEO", 11);
        HVs hVsA0013 = A00("GAMES_SUBSCRIPTION", 12);
        HVs hVsA0014 = A00("GAME_TIPPING", 13);
        HVs hVsA0015 = A00("HORIZON_PURCHASES", 14);
        HVs hVsA0016 = A00("HORIZON_STORE", 15);
        HVs hVsA0017 = A00("HYPER_SUBSCRIPTION", 16);
        HVs hVsA0018 = A00("IG_SHORT_FORM_VIDEO", 17);
        HVs hVsA0019 = A00("INSTAGRAM_CONTENT_APPRECIATION", 18);
        HVs hVsA0020 = A00("INSTAGRAM_FAN_SUBS", 19);
        HVs hVsA0021 = A00("INSTAGRAM_P2A", 20);
        HVs hVsA0022 = A00("INSTAGRAM_USERPAY_BADGES", 21);
        HVs hVsA0023 = A00("INSTANT_GAMES", 22);
        HVs hVsA0024 = A00("META_AI_CREDIT", 23);
        HVs hVsA0025 = A00("META_GEM", 24);
        HVs hVsA0026 = A00("META_MANUS_SUBSCRIPTION", 25);
        HVs hVsA0027 = A00("META_ONE", 26);
        HVs[] hVsArr = new HVs[46];
        System.arraycopy(new HVs[]{A00("MV4B", 27), A00("MV_DIGIGOODS", 28), A00("MV_PAID_TOKEN", 29), A00("NFT", 30), A00("NME_AURA", 31), A00(HatchSubscriptionPurchase.SUBSCRIPTION_PRODUCT_TYPE, 32), A00("NON_CONSUMABLE_VIDEO", 33), A00("OCULUS_SUBSCRIPTION", 34), A00("PAID_ONLINE_EVENT", 35), A00("PPGF_DONATION_SUBSCRIPTION", 36), A00("SOTTO", 37), A00("SUPER_MEET_AND_GREET", 38), A00("SUPER_VIRTUAL_GIFT", 39), A00("THIRD_PARTY_APP_STORES_IAP", 40), A00("VOICES", 41), A00("WAMOSUB", 42), A00("WA_BUSINESS_SUBS", 43), A00("WA_PAID_CHANNEL", 44), A00("WA_STANDALONE_BB", 45)}, BV5.A1U(new HVs[]{hVsA00, hVsA002, hVsA003, hVsA004, hVsA005, hVsA006, hVsA007, hVsA008, hVsA009, hVsA0010, hVsA0011, hVsA0012, hVsA0013, hVsA0014, hVsA0015, hVsA0016, hVsA0017, hVsA0018, hVsA0019, hVsA0020, hVsA0021, hVsA0022, hVsA0023, hVsA0024, hVsA0025, hVsA0026, hVsA0027}, hVsArr) ? 1 : 0, hVsArr, 27, 19);
        A01 = hVsArr;
        A00 = C3cG.A0w(hVsArr);
    }

    public static HVs A00(String str, int i) {
        return new HVs(str, i, str);
    }

    public static HVs valueOf(String str) {
        return (HVs) Enum.valueOf(HVs.class, str);
    }

    public static HVs[] values() {
        return (HVs[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public HVs(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
