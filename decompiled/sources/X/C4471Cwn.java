package X;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cwn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4471Cwn<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    public final HtJ<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public C4471Cwn(HtJ<? super R> htJ) {
        super(false);
        this.continuation = htJ;
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContinuationOutcomeReceiver(outcomeReceived = ");
        sbA0x.append(get());
        return AnonymousClass006.A0z(sbA0x);
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(E e) {
        if (C3cI.A1W(this)) {
            HtJ<R> htJ = this.continuation;
            C7384Etj.A0Y(e, 0);
            htJ.resumeWith(C3cG.A0s(e));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(R r) {
        if (C3cI.A1W(this)) {
            this.continuation.resumeWith(r);
        }
    }
}
