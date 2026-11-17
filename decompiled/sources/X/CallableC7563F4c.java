package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.F4c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7563F4c implements Callable {
    public final int $t;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public CallableC7563F4c(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.$t = i3;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = j3;
        this.A05 = j4;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.A02;
        long j2 = this.A03;
        long j3 = this.A04;
        long j4 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        HashMap mapA0u = BV4.A0u();
        BV4.A1F("old_last_segment_num", mapA0u, j);
        BV4.A1F("old_end_predictive_num", mapA0u, j2);
        BV4.A1F("old_start_predictive_num", mapA0u, j3);
        BV4.A1F("new_start_predictive_num", mapA0u, j4);
        C8j4.A1O("future_segment_count", mapA0u, i);
        mapA0u.put("track", i2 == 2 ? "video" : "audio");
        return mapA0u;
    }
}
