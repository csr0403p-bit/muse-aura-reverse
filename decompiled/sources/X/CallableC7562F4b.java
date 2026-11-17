package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.F4b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7562F4b implements Callable {
    public final int $t;
    public final long A00;

    public CallableC7562F4b(long j, int i) {
        this.$t = i;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.A00;
        HashMap mapA0u = BV4.A0u();
        BV4.A1F("bytes_loaded", mapA0u, j);
        return mapA0u;
    }
}
