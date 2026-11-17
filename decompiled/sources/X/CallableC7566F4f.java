package X;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* renamed from: X.F4f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7566F4f implements Callable {
    public final int $t;
    public final long A00;
    public final Object A01;
    public final Object A02;

    public CallableC7566F4f(Object obj, Object obj2, int i, long j) {
        this.$t = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.$t == 0) {
            C3010Brs c3010Brs = (C3010Brs) this.A01;
            Object obj = this.A02;
            long j = this.A00;
            StringBuilder sbA0f = C3cG.A0f(obj, "Future[");
            sbA0f.append("] is not done within ");
            sbA0f.append(j);
            return Boolean.valueOf(c3010Brs.A04(new TimeoutException(AnonymousClass001.A0v(" ms.", sbA0f))));
        }
        AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) this.A01;
        long j2 = this.A00;
        Throwable th = (Throwable) this.A02;
        HashMap mapA0u = BV4.A0u();
        BV4.A1F("bytes_loaded", mapA0u, j2);
        mapA0u.put("exception", th.getLocalizedMessage());
        long j3 = abstractC5411Di6.A06.A04;
        mapA0u.put("stream_position", Long.valueOf(j3 + abstractC5411Di6.A07.A00));
        mapA0u.put("absolute_position", Long.valueOf(j3));
        return mapA0u;
    }
}
