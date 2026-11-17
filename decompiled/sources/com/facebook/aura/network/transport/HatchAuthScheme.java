package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchAuthScheme {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAuthScheme[] $VALUES;
    public static final HatchAuthScheme META_BEARER;
    public static final HatchAuthScheme META_UNAUTH;
    public static final HatchAuthScheme VM_JWT;

    static {
        HatchAuthScheme hatchAuthScheme = new HatchAuthScheme("VM_JWT", 0);
        VM_JWT = hatchAuthScheme;
        HatchAuthScheme hatchAuthScheme2 = new HatchAuthScheme("META_BEARER", 1);
        META_BEARER = hatchAuthScheme2;
        HatchAuthScheme hatchAuthScheme3 = new HatchAuthScheme("META_UNAUTH", 2);
        META_UNAUTH = hatchAuthScheme3;
        HatchAuthScheme[] hatchAuthSchemeArr = {hatchAuthScheme, hatchAuthScheme2, hatchAuthScheme3};
        $VALUES = hatchAuthSchemeArr;
        $ENTRIES = C3cG.A0w(hatchAuthSchemeArr);
    }

    public static Ey9<HatchAuthScheme> getEntries() {
        return $ENTRIES;
    }

    public static HatchAuthScheme valueOf(String str) {
        return (HatchAuthScheme) Enum.valueOf(HatchAuthScheme.class, str);
    }

    public static HatchAuthScheme[] values() {
        return (HatchAuthScheme[]) $VALUES.clone();
    }

    public HatchAuthScheme(String str, int i) {
    }
}
