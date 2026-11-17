package com.facebook.aura.network.transport.tigon.internal;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SegmentResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SegmentResult[] $VALUES;
    public static final SegmentResult CANCELED;
    public static final SegmentResult LENGTH_MISMATCH;
    public static final SegmentResult OK;

    static {
        SegmentResult segmentResult = new SegmentResult("OK", 0);
        OK = segmentResult;
        SegmentResult segmentResult2 = new SegmentResult("CANCELED", 1);
        CANCELED = segmentResult2;
        SegmentResult segmentResult3 = new SegmentResult("LENGTH_MISMATCH", 2);
        LENGTH_MISMATCH = segmentResult3;
        SegmentResult[] segmentResultArr = {segmentResult, segmentResult2, segmentResult3};
        $VALUES = segmentResultArr;
        $ENTRIES = C3cG.A0w(segmentResultArr);
    }

    public static Ey9<SegmentResult> getEntries() {
        return $ENTRIES;
    }

    public static SegmentResult valueOf(String str) {
        return (SegmentResult) Enum.valueOf(SegmentResult.class, str);
    }

    public static SegmentResult[] values() {
        return (SegmentResult[]) $VALUES.clone();
    }

    public SegmentResult(String str, int i) {
    }
}
