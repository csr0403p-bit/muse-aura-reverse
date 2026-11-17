package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.Bgj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2651Bgj<T> implements InterfaceC2620Bfm<T> {
    public static final C2651Bgj<Object> A01 = new C2651Bgj<>(null);
    public final ListenableFuture<T> A00;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    @Override // X.InterfaceC2620Bfm
    public final void A3j(final InterfaceC2655Bgn interfaceC2655Bgn, Executor executor) {
        this.A00.addListener(new Runnable() { // from class: X.Bgl
            public static final String __redex_internal_original_name = "ConstantObservable$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C2651Bgj c2651Bgj = this.A00;
                InterfaceC2655Bgn interfaceC2655Bgn2 = interfaceC2655Bgn;
                try {
                    interfaceC2655Bgn2.AUJ(c2651Bgj.A00.get());
                } catch (InterruptedException | ExecutionException e) {
                    interfaceC2655Bgn2.onError(e);
                }
            }
        }, executor);
    }

    @Override // X.InterfaceC2620Bfm
    public final ListenableFuture<T> ABL() {
        return this.A00;
    }

    public C2651Bgj(T t) {
        this.A00 = t == null ? BpQ.A01 : new BpQ<>(t);
    }

    @Override // X.InterfaceC2620Bfm
    public final void Aau(InterfaceC2655Bgn<? super T> interfaceC2655Bgn) {
    }
}
