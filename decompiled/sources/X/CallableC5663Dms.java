package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.Dms, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC5663Dms<V> implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5623Dm6 A01;
    public final /* synthetic */ C5617Dly A02;
    public final /* synthetic */ String A03;

    public CallableC5663Dms(C5623Dm6 c5623Dm6, C5617Dly c5617Dly, String str, long j) {
        this.A03 = str;
        this.A02 = c5617Dly;
        this.A01 = c5623Dm6;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap mapA0u = BV4.A0u();
        String str = this.A03;
        C5617Dly c5617Dly = this.A02;
        C5623Dm6 c5623Dm6 = this.A01;
        long j = this.A00;
        C5617Dly.A02(c5623Dm6, c5617Dly, str, mapA0u);
        long j2 = c5623Dm6.A0B;
        Dq8 dq8 = c5617Dly.A0K;
        mapA0u.put("current_position_from_live_start_ms", Long.valueOf(j2 + Math.max(dq8 != null ? dq8.A04 : 0L, 0L)));
        Dq8 dq82 = c5617Dly.A0K;
        mapA0u.put("manifest_first_segment_start_time_ms", Long.valueOf(dq82 != null ? dq82.A04 : -9223372036854775807L));
        C5617Dly.A04(c5623Dm6, c5617Dly, mapA0u, j);
        return mapA0u;
    }
}
