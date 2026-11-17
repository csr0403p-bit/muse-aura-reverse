package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class GD2 {
    public final AtomicLong A00;
    public final AtomicLong A01;
    public final AtomicLong A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final long[] A04;
    public final AtomicInteger[] A05;
    public final int A06;
    public final GD9 A07;

    public GD2(GD9 gd9, int i) {
        this.A06 = i;
        this.A07 = gd9;
        AtomicInteger[] atomicIntegerArr = new AtomicInteger[60];
        int i2 = 0;
        do {
            atomicIntegerArr[i2] = new AtomicInteger(0);
            i2++;
        } while (i2 < 60);
        this.A05 = atomicIntegerArr;
        this.A00 = new AtomicLong(SystemClock.elapsedRealtimeNanos());
        this.A01 = new AtomicLong(0L);
        this.A02 = new AtomicLong(0L);
        this.A04 = new long[this.A06];
    }
}
