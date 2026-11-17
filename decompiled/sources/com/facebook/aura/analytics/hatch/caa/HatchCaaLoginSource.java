package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaLoginSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaLoginSource[] $VALUES;
    public static final HatchCaaLoginSource ACCOUNTS_YOU_MAY_HAVE;
    public static final HatchCaaLoginSource LOGIN;
    public static final HatchCaaLoginSource REGISTRATION;
    public static final HatchCaaLoginSource SIGN_IN_WITH_GOOGLE_LOGIN;
    public final String value;

    static {
        HatchCaaLoginSource hatchCaaLoginSource = new HatchCaaLoginSource("LOGIN", 0, "Login");
        LOGIN = hatchCaaLoginSource;
        HatchCaaLoginSource hatchCaaLoginSource2 = new HatchCaaLoginSource("ACCOUNTS_YOU_MAY_HAVE", 1, "AccountsYouMayHave");
        ACCOUNTS_YOU_MAY_HAVE = hatchCaaLoginSource2;
        HatchCaaLoginSource hatchCaaLoginSource3 = new HatchCaaLoginSource("REGISTRATION", 2, "Registration");
        REGISTRATION = hatchCaaLoginSource3;
        HatchCaaLoginSource hatchCaaLoginSource4 = new HatchCaaLoginSource("SIGN_IN_WITH_GOOGLE_LOGIN", 3, "SignInWithGoogleLogin");
        SIGN_IN_WITH_GOOGLE_LOGIN = hatchCaaLoginSource4;
        HatchCaaLoginSource[] hatchCaaLoginSourceArr = {hatchCaaLoginSource, hatchCaaLoginSource2, hatchCaaLoginSource3, hatchCaaLoginSource4};
        $VALUES = hatchCaaLoginSourceArr;
        $ENTRIES = C3cG.A0w(hatchCaaLoginSourceArr);
    }

    public static Ey9<HatchCaaLoginSource> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaLoginSource valueOf(String str) {
        return (HatchCaaLoginSource) Enum.valueOf(HatchCaaLoginSource.class, str);
    }

    public static HatchCaaLoginSource[] values() {
        return (HatchCaaLoginSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaLoginSource(String str, int i, String str2) {
        this.value = str2;
    }
}
