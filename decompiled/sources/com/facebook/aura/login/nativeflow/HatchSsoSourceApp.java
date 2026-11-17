package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchSsoSourceApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSsoSourceApp[] $VALUES;
    public static final HatchSsoSourceApp FACEBOOK;
    public static final HatchSsoSourceApp GOOGLE;
    public static final HatchSsoSourceApp INSTAGRAM;
    public static final HatchSsoSourceApp META;
    public static final HatchSsoSourceApp WHATSAPP;
    public final String wireValue;

    static {
        HatchSsoSourceApp hatchSsoSourceApp = new HatchSsoSourceApp("FACEBOOK", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        FACEBOOK = hatchSsoSourceApp;
        HatchSsoSourceApp hatchSsoSourceApp2 = new HatchSsoSourceApp("INSTAGRAM", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        INSTAGRAM = hatchSsoSourceApp2;
        HatchSsoSourceApp hatchSsoSourceApp3 = new HatchSsoSourceApp("META", 2, "frl");
        META = hatchSsoSourceApp3;
        HatchSsoSourceApp hatchSsoSourceApp4 = new HatchSsoSourceApp(AuraSubscriptionUsageViewModelKt.GOOGLE_PURCHASE_PLATFORM, 3, "google");
        GOOGLE = hatchSsoSourceApp4;
        HatchSsoSourceApp hatchSsoSourceApp5 = new HatchSsoSourceApp("WHATSAPP", 4, NativeLoginAccountResolverKt.WHATSAPP_USER_ID);
        WHATSAPP = hatchSsoSourceApp5;
        HatchSsoSourceApp[] hatchSsoSourceAppArr = {hatchSsoSourceApp, hatchSsoSourceApp2, hatchSsoSourceApp3, hatchSsoSourceApp4, hatchSsoSourceApp5};
        $VALUES = hatchSsoSourceAppArr;
        $ENTRIES = C3cG.A0w(hatchSsoSourceAppArr);
    }

    public static Ey9<HatchSsoSourceApp> getEntries() {
        return $ENTRIES;
    }

    public static HatchSsoSourceApp valueOf(String str) {
        return (HatchSsoSourceApp) Enum.valueOf(HatchSsoSourceApp.class, str);
    }

    public static HatchSsoSourceApp[] values() {
        return (HatchSsoSourceApp[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchSsoSourceApp(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
