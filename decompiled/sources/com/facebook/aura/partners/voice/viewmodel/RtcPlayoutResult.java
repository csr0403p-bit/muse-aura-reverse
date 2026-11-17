package com.facebook.aura.partners.voice.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RtcPlayoutResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RtcPlayoutResult[] $VALUES;
    public static final RtcPlayoutResult EMPTY;
    public static final RtcPlayoutResult PLAYED;
    public static final RtcPlayoutResult REJECTED;
    public static final RtcPlayoutResult STALLED;

    static {
        RtcPlayoutResult rtcPlayoutResult = new RtcPlayoutResult("PLAYED", 0);
        PLAYED = rtcPlayoutResult;
        RtcPlayoutResult rtcPlayoutResult2 = new RtcPlayoutResult("REJECTED", 1);
        REJECTED = rtcPlayoutResult2;
        RtcPlayoutResult rtcPlayoutResult3 = new RtcPlayoutResult("STALLED", 2);
        STALLED = rtcPlayoutResult3;
        RtcPlayoutResult rtcPlayoutResult4 = new RtcPlayoutResult("EMPTY", 3);
        EMPTY = rtcPlayoutResult4;
        RtcPlayoutResult[] rtcPlayoutResultArr = {rtcPlayoutResult, rtcPlayoutResult2, rtcPlayoutResult3, rtcPlayoutResult4};
        $VALUES = rtcPlayoutResultArr;
        $ENTRIES = C3cG.A0w(rtcPlayoutResultArr);
    }

    public static Ey9<RtcPlayoutResult> getEntries() {
        return $ENTRIES;
    }

    public static RtcPlayoutResult valueOf(String str) {
        return (RtcPlayoutResult) Enum.valueOf(RtcPlayoutResult.class, str);
    }

    public static RtcPlayoutResult[] values() {
        return (RtcPlayoutResult[]) $VALUES.clone();
    }

    public RtcPlayoutResult(String str, int i) {
    }
}
