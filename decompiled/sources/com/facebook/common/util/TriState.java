package com.facebook.common.util;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TriState {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ TriState[] A01;
    public static final TriState A02;
    public static final TriState A03;
    public static final TriState A04;

    public final boolean A00() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    static {
        TriState triState = new TriState("YES", 0);
        A04 = triState;
        TriState triState2 = new TriState("NO", 1);
        A02 = triState2;
        TriState triState3 = new TriState("UNSET", 2);
        A03 = triState3;
        TriState[] triStateArr = {triState, triState2, triState3};
        A01 = triStateArr;
        A00 = C3cG.A0w(triStateArr);
    }

    public static TriState valueOf(String str) {
        return (TriState) Enum.valueOf(TriState.class, str);
    }

    public static TriState[] values() {
        return (TriState[]) A01.clone();
    }

    public TriState(String str, int i) {
    }
}
