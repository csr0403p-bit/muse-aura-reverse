package X;

import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class Hz0 implements HsS {
    public final Future<?> A00;

    @Override // X.HsS
    public final void dispose() {
        this.A00.cancel(false);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DisposableFutureHandle[");
        sbA0x.append(this.A00);
        return BV5.A0o(sbA0x);
    }

    public Hz0(Future<?> future) {
        this.A00 = future;
    }
}
