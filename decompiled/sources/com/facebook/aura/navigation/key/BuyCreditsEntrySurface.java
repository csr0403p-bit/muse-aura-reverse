package com.facebook.aura.navigation.key;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BuyCreditsEntrySurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BuyCreditsEntrySurface[] $VALUES;
    public static final BuyCreditsEntrySurface BUY_USAGE;
    public static final BuyCreditsEntrySurface CHAT_OUT_OF_CREDITS;
    public static final BuyCreditsEntrySurface STATUS_OUT_OF_CREDITS;
    public static final BuyCreditsEntrySurface SUBSCRIPTION_PAYWALL;
    public static final BuyCreditsEntrySurface SUBSCRIPTION_USAGE;
    public static final BuyCreditsEntrySurface VOICE_OUT_OF_CREDITS;
    public final String value;

    static {
        BuyCreditsEntrySurface buyCreditsEntrySurface = new BuyCreditsEntrySurface("VOICE_OUT_OF_CREDITS", 0, "voice_out_of_credits");
        VOICE_OUT_OF_CREDITS = buyCreditsEntrySurface;
        BuyCreditsEntrySurface buyCreditsEntrySurface2 = new BuyCreditsEntrySurface("STATUS_OUT_OF_CREDITS", 1, "status_out_of_credits");
        STATUS_OUT_OF_CREDITS = buyCreditsEntrySurface2;
        BuyCreditsEntrySurface buyCreditsEntrySurface3 = new BuyCreditsEntrySurface("CHAT_OUT_OF_CREDITS", 2, "chat_out_of_credits");
        CHAT_OUT_OF_CREDITS = buyCreditsEntrySurface3;
        BuyCreditsEntrySurface buyCreditsEntrySurface4 = new BuyCreditsEntrySurface("SUBSCRIPTION_USAGE", 3, "subscription_usage");
        SUBSCRIPTION_USAGE = buyCreditsEntrySurface4;
        BuyCreditsEntrySurface buyCreditsEntrySurface5 = new BuyCreditsEntrySurface("SUBSCRIPTION_PAYWALL", 4, "subscription_paywall");
        SUBSCRIPTION_PAYWALL = buyCreditsEntrySurface5;
        BuyCreditsEntrySurface buyCreditsEntrySurface6 = new BuyCreditsEntrySurface("BUY_USAGE", 5, "buy_usage");
        BUY_USAGE = buyCreditsEntrySurface6;
        BuyCreditsEntrySurface[] buyCreditsEntrySurfaceArr = {buyCreditsEntrySurface, buyCreditsEntrySurface2, buyCreditsEntrySurface3, buyCreditsEntrySurface4, buyCreditsEntrySurface5, buyCreditsEntrySurface6};
        $VALUES = buyCreditsEntrySurfaceArr;
        $ENTRIES = new F3w(buyCreditsEntrySurfaceArr);
    }

    public static Ey9<BuyCreditsEntrySurface> getEntries() {
        return $ENTRIES;
    }

    public static BuyCreditsEntrySurface valueOf(String str) {
        return (BuyCreditsEntrySurface) Enum.valueOf(BuyCreditsEntrySurface.class, str);
    }

    public static BuyCreditsEntrySurface[] values() {
        return (BuyCreditsEntrySurface[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public BuyCreditsEntrySurface(String str, int i, String str2) {
        this.value = str2;
    }
}
