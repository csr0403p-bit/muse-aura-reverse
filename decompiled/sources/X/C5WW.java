package X;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5WW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5WW {
    public final AtomicReference<C5WX> A00 = new AtomicReference<>(null);
    public final InterfaceC2261BLa A01 = new C9258GBl();

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/3UY;LX/G0U<-LX/HtJ<-TR;>;+Ljava/lang/Object;>;LX/HtJ<-TR;>;)Ljava/lang/Object; */
    public final Object A01(C3UY c3uy, HtJ htJ, G0U g0u) {
        return Hxb.A00(new C60H(c3uy, this, g0u, null, 0), htJ);
    }

    public static final void A00(C5WX c5wx, C5WW c5ww) {
        AtomicReference<C5WX> atomicReference;
        C5WX c5wx2;
        do {
            atomicReference = c5ww.A00;
            c5wx2 = atomicReference.get();
            if (c5wx2 != null && c5wx.A00.compareTo(c5wx2.A00) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!Bs8.A00(c5wx2, c5wx, atomicReference));
        if (c5wx2 != null) {
            c5wx2.A01.A5w(new MutationInterruptedException());
        }
    }
}
