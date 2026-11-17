package com.facebook.aura.deeplink;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraDeeplinkAccessScope {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraDeeplinkAccessScope[] $VALUES;
    public static final AuraDeeplinkAccessScope ALL_FAMILY;
    public static final AuraDeeplinkAccessScope NOT_APPLICABLE;
    public static final AuraDeeplinkAccessScope PUBLIC;

    static {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = new AuraDeeplinkAccessScope("PUBLIC", 0);
        PUBLIC = auraDeeplinkAccessScope;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope2 = new AuraDeeplinkAccessScope("ALL_FAMILY", 1);
        ALL_FAMILY = auraDeeplinkAccessScope2;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope3 = new AuraDeeplinkAccessScope("NOT_APPLICABLE", 2);
        NOT_APPLICABLE = auraDeeplinkAccessScope3;
        AuraDeeplinkAccessScope[] auraDeeplinkAccessScopeArr = {auraDeeplinkAccessScope, auraDeeplinkAccessScope2, auraDeeplinkAccessScope3};
        $VALUES = auraDeeplinkAccessScopeArr;
        $ENTRIES = C3cG.A0w(auraDeeplinkAccessScopeArr);
    }

    public static Ey9<AuraDeeplinkAccessScope> getEntries() {
        return $ENTRIES;
    }

    public static AuraDeeplinkAccessScope valueOf(String str) {
        return (AuraDeeplinkAccessScope) Enum.valueOf(AuraDeeplinkAccessScope.class, str);
    }

    public static AuraDeeplinkAccessScope[] values() {
        return (AuraDeeplinkAccessScope[]) $VALUES.clone();
    }

    public AuraDeeplinkAccessScope(String str, int i) {
    }
}
