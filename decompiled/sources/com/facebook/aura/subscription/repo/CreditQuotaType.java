package com.facebook.aura.subscription.repo;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CreditQuotaType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CreditQuotaType[] $VALUES;
    public static final CreditQuotaType ALL;
    public static final CreditQuotaType FREE;
    public static final CreditQuotaType PAID;
    public static final CreditQuotaType TOPUP;
    public final String wireValue;

    static {
        CreditQuotaType creditQuotaType = new CreditQuotaType("ALL", 0, UnifiedArtifactsRepositoryKt.COLLECTION_ALL);
        ALL = creditQuotaType;
        CreditQuotaType creditQuotaType2 = new CreditQuotaType("PAID", 1, "paid");
        PAID = creditQuotaType2;
        CreditQuotaType creditQuotaType3 = new CreditQuotaType("FREE", 2, "free");
        FREE = creditQuotaType3;
        CreditQuotaType creditQuotaType4 = new CreditQuotaType("TOPUP", 3, "topup");
        TOPUP = creditQuotaType4;
        CreditQuotaType[] creditQuotaTypeArr = {creditQuotaType, creditQuotaType2, creditQuotaType3, creditQuotaType4};
        $VALUES = creditQuotaTypeArr;
        $ENTRIES = C3cG.A0w(creditQuotaTypeArr);
    }

    public static Ey9<CreditQuotaType> getEntries() {
        return $ENTRIES;
    }

    public static CreditQuotaType valueOf(String str) {
        return (CreditQuotaType) Enum.valueOf(CreditQuotaType.class, str);
    }

    public static CreditQuotaType[] values() {
        return (CreditQuotaType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public CreditQuotaType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
