package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaEventFlow {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaEventFlow[] $VALUES;
    public static final HatchCaaEventFlow ACCOUNT_RECOVERY;
    public static final HatchCaaEventFlow AYMH;
    public static final HatchCaaEventFlow AYMH_FB;
    public static final HatchCaaEventFlow AYMH_FRL;
    public static final HatchCaaEventFlow AYMH_IG;
    public static final HatchCaaEventFlow AYMH_WA;
    public static final HatchCaaEventFlow LOGIN;
    public static final HatchCaaEventFlow LOGIN_MANUAL;
    public static final HatchCaaEventFlow LOGIN_PASSKEY;
    public static final HatchCaaEventFlow LOGIN_SIGN_IN_WITH_GOOGLE;
    public static final HatchCaaEventFlow NEW_TO_META;
    public static final HatchCaaEventFlow NEW_TO_PLATFORM;
    public static final HatchCaaEventFlow PASSKEY_CREATION;
    public final String value;

    static {
        HatchCaaEventFlow hatchCaaEventFlow = new HatchCaaEventFlow("LOGIN_MANUAL", 0, "login_manual");
        LOGIN_MANUAL = hatchCaaEventFlow;
        HatchCaaEventFlow hatchCaaEventFlow2 = new HatchCaaEventFlow("LOGIN", 1, HatchStartupPoints.SURFACE_LOGIN);
        LOGIN = hatchCaaEventFlow2;
        HatchCaaEventFlow hatchCaaEventFlow3 = new HatchCaaEventFlow("AYMH", 2, "aymh");
        AYMH = hatchCaaEventFlow3;
        HatchCaaEventFlow hatchCaaEventFlow4 = new HatchCaaEventFlow("AYMH_FB", 3, "aymh_fb");
        AYMH_FB = hatchCaaEventFlow4;
        HatchCaaEventFlow hatchCaaEventFlow5 = new HatchCaaEventFlow("AYMH_IG", 4, "aymh_ig");
        AYMH_IG = hatchCaaEventFlow5;
        HatchCaaEventFlow hatchCaaEventFlow6 = new HatchCaaEventFlow("AYMH_FRL", 5, "aymh_frl");
        AYMH_FRL = hatchCaaEventFlow6;
        HatchCaaEventFlow hatchCaaEventFlow7 = new HatchCaaEventFlow("AYMH_WA", 6, "aymh_wa");
        AYMH_WA = hatchCaaEventFlow7;
        HatchCaaEventFlow hatchCaaEventFlow8 = new HatchCaaEventFlow("LOGIN_SIGN_IN_WITH_GOOGLE", 7, "login_sign_in_with_google");
        LOGIN_SIGN_IN_WITH_GOOGLE = hatchCaaEventFlow8;
        HatchCaaEventFlow hatchCaaEventFlow9 = new HatchCaaEventFlow("NEW_TO_META", 8, "ntm");
        NEW_TO_META = hatchCaaEventFlow9;
        HatchCaaEventFlow hatchCaaEventFlow10 = new HatchCaaEventFlow("NEW_TO_PLATFORM", 9, "ntp");
        NEW_TO_PLATFORM = hatchCaaEventFlow10;
        HatchCaaEventFlow hatchCaaEventFlow11 = new HatchCaaEventFlow("ACCOUNT_RECOVERY", 10, "account_recovery");
        ACCOUNT_RECOVERY = hatchCaaEventFlow11;
        HatchCaaEventFlow hatchCaaEventFlow12 = new HatchCaaEventFlow("LOGIN_PASSKEY", 11, "login_passkey");
        LOGIN_PASSKEY = hatchCaaEventFlow12;
        HatchCaaEventFlow hatchCaaEventFlow13 = new HatchCaaEventFlow("PASSKEY_CREATION", 12, "passkey_creation");
        PASSKEY_CREATION = hatchCaaEventFlow13;
        HatchCaaEventFlow[] hatchCaaEventFlowArr = {hatchCaaEventFlow, hatchCaaEventFlow2, hatchCaaEventFlow3, hatchCaaEventFlow4, hatchCaaEventFlow5, hatchCaaEventFlow6, hatchCaaEventFlow7, hatchCaaEventFlow8, hatchCaaEventFlow9, hatchCaaEventFlow10, hatchCaaEventFlow11, hatchCaaEventFlow12, hatchCaaEventFlow13};
        $VALUES = hatchCaaEventFlowArr;
        $ENTRIES = C3cG.A0w(hatchCaaEventFlowArr);
    }

    public static Ey9<HatchCaaEventFlow> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaEventFlow valueOf(String str) {
        return (HatchCaaEventFlow) Enum.valueOf(HatchCaaEventFlow.class, str);
    }

    public static HatchCaaEventFlow[] values() {
        return (HatchCaaEventFlow[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaEventFlow(String str, int i, String str2) {
        this.value = str2;
    }
}
