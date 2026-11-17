package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class GD3 {
    public final int A00;
    public final int A01;
    public final GD2 A02;
    public final AtomicReferenceArray<GD6> A05;
    public final GD9 A06;
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A03 = new AtomicLong(0);

    public GD3(GD9 gd9, int i, boolean z) {
        this.A01 = i;
        this.A06 = gd9;
        int iHighestOneBit = i <= 1 ? 1 : Integer.highestOneBit(i - 1) << 1;
        this.A00 = iHighestOneBit - 1;
        this.A05 = new AtomicReferenceArray<>(iHighestOneBit);
        this.A02 = z ? new GD2(gd9, iHighestOneBit) : null;
    }
}
