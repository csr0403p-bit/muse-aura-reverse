package X;

import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DcQ implements InterfaceC5106DYe {
    public final /* synthetic */ IapMutator A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ AtomicBoolean A02;
    public final /* synthetic */ AtomicReference<DcR> A03;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/payments/dcp/iap/internal/mutator/IapMutator;Ljava/lang/Runnable;Ljava/util/concurrent/atomic/AtomicReference<LX/DcR;>;)V */
    public DcQ(IapMutator iapMutator, Runnable runnable, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        this.A02 = atomicBoolean;
        this.A00 = iapMutator;
        this.A01 = runnable;
        this.A03 = atomicReference;
    }

    @Override // X.InterfaceC5106DYe
    public final void cancel() {
        this.A02.set(true);
        this.A00.A00.removeCallbacks(this.A01);
        DcR dcR = this.A03.get();
        if (dcR != null) {
            dcR.A00.set(true);
            DcR.A00(dcR);
        }
    }
}
