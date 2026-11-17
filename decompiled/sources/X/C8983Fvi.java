package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* renamed from: X.Fvi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8983Fvi<T> {
    public final G0V<T, HtJ<? super Unit>, Object> A01;
    public final C3UX A02;
    public final HzR<T> A03 = new GCV(Integer.MAX_VALUE, null);
    public final AtomicInteger A00 = new AtomicInteger(0);

    /* JADX WARN: Multi-variable type inference failed */
    public C8983Fvi(C3UX c3ux, G0U<? super Throwable, Unit> g0u, G0V<? super T, ? super Throwable, Unit> g0v, G0V<? super T, ? super HtJ<? super Unit>, ? extends Object> g0v2) {
        this.A02 = c3ux;
        this.A01 = g0v2;
        HoC hoC = (HoC) C3cH.A0t(c3ux);
        if (hoC != null) {
            hoC.AO5(new C8192FYj(this, g0u, g0v, 0));
        }
    }

    public final void A00(T t) {
        Throwable th;
        Object objAhZ = this.A03.AhZ(t);
        if (objAhZ instanceof Ho5) {
            Ho5 ho5 = (Ho5) objAhZ;
            if (ho5 != null && (th = ho5.A00) != null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!(!(objAhZ instanceof C2zT))) {
            throw BV4.A0S();
        }
        if (this.A00.getAndIncrement() == 0) {
            AnonymousClass001.A1J(new C8899FtG(this, (HtJ) null, (HtJ<? super C8899FtG>) 0), this.A02);
        }
    }
}
