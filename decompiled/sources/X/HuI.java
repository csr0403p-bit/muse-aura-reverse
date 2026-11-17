package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlinx.coroutines.JobCancellationException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes6.dex */
public final class HuI<E> extends GAq implements HyO<E>, HyO {
    public final HzR<E> A00;

    public HuI(C78T c78t, HzR<E> hzR) {
        super(c78t, true);
        this.A00 = hzR;
    }

    @Override // X.GBM
    public final void A0L(Throwable th) {
        CancellationException jobCancellationException;
        if (!(th instanceof CancellationException) || (jobCancellationException = (CancellationException) th) == null) {
            jobCancellationException = new JobCancellationException(A0F(), th, this);
        }
        this.A00.A5w(jobCancellationException);
        A0Q(jobCancellationException);
    }

    @Override // X.GAq
    public final /* bridge */ /* synthetic */ void A0T() {
        this.A00.A6R(null);
    }

    @Override // X.GAq
    public final void A0W(Throwable th, boolean z) {
        if (this.A00.A6R(th) || z) {
            return;
        }
        HwS.A00(super.A00, th);
    }

    @Override // X.HxO
    public final boolean A6R(Throwable th) {
        return this.A00.A6R(th);
    }

    public final C9284GCl AIF() {
        return this.A00.AIF();
    }

    @Override // X.HxO
    public final void AO4(G0U<? super Throwable, Unit> g0u) {
        this.A00.AO4(g0u);
    }

    @Override // X.HxO
    public final boolean AOF() {
        return this.A00.AOF();
    }

    public final GCW APO() {
        return this.A00.APO();
    }

    public final Object AZg(HtJ<? super E> htJ) {
        return this.A00.AZg(htJ);
    }

    public final Object AZh(HtJ<? super HoI<? extends E>> htJ) {
        return this.A00.AZh(htJ);
    }

    @Override // X.HxO
    public final Object AcU(E e, HtJ<? super Unit> htJ) {
        return this.A00.AcU(e, htJ);
    }

    public final Object AhX() {
        return this.A00.AhX();
    }

    @Override // X.HxO
    public final Object AhZ(E e) {
        return this.A00.AhZ(e);
    }

    @Override // X.GBM, X.HoC
    public final void A5w(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(A0F(), null, this);
        }
        A0L(cancellationException);
    }
}
