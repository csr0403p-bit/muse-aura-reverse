package com.facebook.aura.deeplink;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraDeeplinkAccessResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraDeeplinkAccessResult[] $VALUES;
    public static final AuraDeeplinkAccessResult ALLOWED;
    public static final AuraDeeplinkAccessResult DENIED;
    public static final AuraDeeplinkAccessResult NO_ROUTE;

    static {
        AuraDeeplinkAccessResult auraDeeplinkAccessResult = new AuraDeeplinkAccessResult("ALLOWED", 0);
        ALLOWED = auraDeeplinkAccessResult;
        AuraDeeplinkAccessResult auraDeeplinkAccessResult2 = new AuraDeeplinkAccessResult("DENIED", 1);
        DENIED = auraDeeplinkAccessResult2;
        AuraDeeplinkAccessResult auraDeeplinkAccessResult3 = new AuraDeeplinkAccessResult("NO_ROUTE", 2);
        NO_ROUTE = auraDeeplinkAccessResult3;
        AuraDeeplinkAccessResult[] auraDeeplinkAccessResultArr = {auraDeeplinkAccessResult, auraDeeplinkAccessResult2, auraDeeplinkAccessResult3};
        $VALUES = auraDeeplinkAccessResultArr;
        $ENTRIES = C3cG.A0w(auraDeeplinkAccessResultArr);
    }

    public static Ey9<AuraDeeplinkAccessResult> getEntries() {
        return $ENTRIES;
    }

    public static AuraDeeplinkAccessResult valueOf(String str) {
        return (AuraDeeplinkAccessResult) Enum.valueOf(AuraDeeplinkAccessResult.class, str);
    }

    public static AuraDeeplinkAccessResult[] values() {
        return (AuraDeeplinkAccessResult[]) $VALUES.clone();
    }

    public AuraDeeplinkAccessResult(String str, int i) {
    }
}
