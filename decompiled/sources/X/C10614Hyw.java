package X;

import java.util.concurrent.Future;

/* renamed from: X.Hyw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10614Hyw implements HpO {
    public final Future<?> A00;

    @Override // X.HpO
    public final void invoke(Throwable th) {
        this.A00.cancel(false);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CancelFutureOnCancel[");
        sbA0x.append(this.A00);
        return BV5.A0o(sbA0x);
    }

    public C10614Hyw(Future<?> future) {
        this.A00 = future;
    }
}
