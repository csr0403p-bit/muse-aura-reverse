package X;

import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class C8S implements Runnable {
    public static final String __redex_internal_original_name = "IapMutator$executeWithRetry$retry$1";
    public final /* synthetic */ IapMutator A00;
    public final /* synthetic */ AtomicBoolean A01;
    public final /* synthetic */ AtomicBoolean A02;
    public final /* synthetic */ G0U<Throwable, Unit> A03;
    public final /* synthetic */ G0U<G0U<? super Throwable, Unit>, Unit> A04;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;LX/G0U<-LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;Lkotlin/Unit;>;Lcom/facebook/payments/dcp/iap/internal/mutator/IapMutator;LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;)V */
    public C8S(IapMutator iapMutator, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, G0U g0u, G0U g0u2) {
        this.A02 = atomicBoolean;
        this.A01 = atomicBoolean2;
        this.A04 = g0u;
        this.A00 = iapMutator;
        this.A03 = g0u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = this.A02;
        if (atomicBoolean.get() || this.A01.get()) {
            return;
        }
        this.A04.invoke(new EE5(atomicBoolean, this.A03, this.A00, 0));
    }
}
