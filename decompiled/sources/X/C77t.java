package X;

import androidx.glance.session.TimeoutCancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.77t, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77t implements C3UX, C77Q {
    public final AtomicReference<Long> A00 = new AtomicReference<>(null);
    public final /* synthetic */ InterfaceC066377f A01;
    public final /* synthetic */ AtomicReference<HoC> A02;
    public final /* synthetic */ G0V<C77Q, HtJ<? super T>, Object> A03;
    public final /* synthetic */ C3UX A04;
    public final /* synthetic */ C3UX A05;

    /* JADX WARN: Incorrect types in method signature: (LX/3UX;LX/77f;LX/3UX;LX/G0V<-LX/77Q;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;Ljava/util/concurrent/atomic/AtomicReference<LX/HoC;>;)V */
    public C77t(InterfaceC066377f interfaceC066377f, AtomicReference atomicReference, G0V g0v, C3UX c3ux, C3UX c3ux2) {
        this.A01 = interfaceC066377f;
        this.A04 = c3ux2;
        this.A03 = g0v;
        this.A02 = atomicReference;
        this.A05 = c3ux;
    }

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A05.AEA();
    }

    @Override // X.C77Q
    public final long ALe() {
        Long l = this.A00.get();
        if (l == null) {
            return C0851A5x.A01;
        }
        return AbstractC0852A5y.A02(F24.A04, l.longValue() - System.currentTimeMillis());
    }

    @Override // X.C77Q
    public final void AgM(long j) {
        if (C0851A5x.A02(j) <= 0) {
            Hxb.A03(new TimeoutCancellationException("Timed out immediately", this.A03.hashCode()), this.A04);
            return;
        }
        if (C0851A5x.A01(ALe(), j) >= 0) {
            AtomicReference<Long> atomicReference = this.A00;
            InterfaceC066377f interfaceC066377f = this.A01;
            atomicReference.set(Long.valueOf(System.currentTimeMillis() + C0851A5x.A02(j)));
            AtomicReference<HoC> atomicReference2 = this.A02;
            C3UX c3ux = this.A04;
            HoC andSet = atomicReference2.getAndSet(AnonymousClass001.A11(new C07298ii(this.A03, interfaceC066377f, c3ux, this, null, 8), c3ux));
            if (andSet != null) {
                andSet.A5w(null);
            }
        }
    }
}
