package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DAz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4880DAz {
    public final AtomicInteger A00 = BV5.A17();
    public final int A01;
    public final int A02;

    public final HxE<Boolean, Boolean> A00(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        int i4 = 1 << i;
        if (!z) {
            i4 ^= -1;
        }
        do {
            atomicInteger = this.A00;
            i2 = atomicInteger.get();
            i3 = i2 & i4;
            if (z) {
                i3 = i2 | i4;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        boolean z2 = i3 == this.A01;
        int i5 = this.A02;
        return new HxE<>(Boolean.valueOf(z2), Boolean.valueOf((i3 & i5) == i5));
    }

    public C4880DAz(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
    }
}
