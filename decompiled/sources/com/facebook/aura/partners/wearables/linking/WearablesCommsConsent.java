package com.facebook.aura.partners.wearables.linking;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WearablesCommsConsent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WearablesCommsConsent[] $VALUES;
    public static final WearablesCommsConsent DECLINED;
    public static final WearablesCommsConsent GRANTED;

    static {
        WearablesCommsConsent wearablesCommsConsent = new WearablesCommsConsent("GRANTED", 0);
        GRANTED = wearablesCommsConsent;
        WearablesCommsConsent wearablesCommsConsent2 = new WearablesCommsConsent("DECLINED", 1);
        DECLINED = wearablesCommsConsent2;
        WearablesCommsConsent[] wearablesCommsConsentArr = {wearablesCommsConsent, wearablesCommsConsent2};
        $VALUES = wearablesCommsConsentArr;
        $ENTRIES = C3cG.A0w(wearablesCommsConsentArr);
    }

    public static Ey9<WearablesCommsConsent> getEntries() {
        return $ENTRIES;
    }

    public static WearablesCommsConsent valueOf(String str) {
        return (WearablesCommsConsent) Enum.valueOf(WearablesCommsConsent.class, str);
    }

    public static WearablesCommsConsent[] values() {
        return (WearablesCommsConsent[]) $VALUES.clone();
    }

    public WearablesCommsConsent(String str, int i) {
    }
}
