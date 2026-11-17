package com.facebook.traffic.nts.tasos.congestionmanager;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CongestionState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CongestionState[] $VALUES;
    public static final CongestionState CONGESTED;
    public static final CongestionState NOT_CONGESTED;
    public static final CongestionState UNKNOWN;
    public final int value;

    static {
        CongestionState congestionState = new CongestionState("UNKNOWN", 0, 0);
        UNKNOWN = congestionState;
        CongestionState congestionState2 = new CongestionState("CONGESTED", 1, 1);
        CONGESTED = congestionState2;
        CongestionState congestionState3 = new CongestionState("NOT_CONGESTED", 2, 2);
        NOT_CONGESTED = congestionState3;
        CongestionState[] congestionStateArr = {congestionState, congestionState2, congestionState3};
        $VALUES = congestionStateArr;
        $ENTRIES = new F3w(congestionStateArr);
    }

    public static Ey9<CongestionState> getEntries() {
        return $ENTRIES;
    }

    public static CongestionState valueOf(String str) {
        return (CongestionState) Enum.valueOf(CongestionState.class, str);
    }

    public static CongestionState[] values() {
        return (CongestionState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public CongestionState(String str, int i, int i2) {
        this.value = i2;
    }
}
