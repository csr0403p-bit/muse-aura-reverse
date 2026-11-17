package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CNf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3434CNf<V> extends AbstractC3437CNi<V> {
    public ListenableFuture<V> A00;
    public ScheduledFuture<?> A01;

    @Override // X.CQU
    public final void afterDone() {
        maybePropagateCancellationTo(this.A00);
        ScheduledFuture<?> scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.CQU
    public final String pendingToString() {
        ListenableFuture<V> listenableFuture = this.A00;
        ScheduledFuture<?> scheduledFuture = this.A01;
        if (listenableFuture == null) {
            return null;
        }
        String strA0u = BV8.A0u(listenableFuture, C60O.A0x("inputFuture=["));
        if (scheduledFuture == null) {
            return strA0u;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strA0u;
        }
        StringBuilder sbA0g = C3cG.A0g(strA0u);
        sbA0g.append(", remaining delay=[");
        sbA0g.append(delay);
        return AnonymousClass001.A0v(" ms]", sbA0g);
    }
}
