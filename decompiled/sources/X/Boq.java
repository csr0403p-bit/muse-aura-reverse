package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Boq<T> implements InterfaceC2620Bfm<T> {
    public final C2934BpC<C2927Bot<T>> A00 = new C2934BpC<>();
    public final Map<InterfaceC2655Bgn<? super T>, C2925Bor<T>> A01 = BV4.A0u();

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    @Override // X.InterfaceC2620Bfm
    public final void A3j(InterfaceC2655Bgn interfaceC2655Bgn, Executor executor) {
        Map<InterfaceC2655Bgn<? super T>, C2925Bor<T>> map = this.A01;
        synchronized (map) {
            final C2925Bor<T> c2925Bor = map.get(interfaceC2655Bgn);
            if (c2925Bor != null) {
                c2925Bor.A02.set(false);
            }
            final C2925Bor<T> c2925Bor2 = new C2925Bor<>(interfaceC2655Bgn, executor);
            map.put(interfaceC2655Bgn, c2925Bor2);
            BoS.A00().execute(new Runnable() { // from class: X.Bow
                public static final String __redex_internal_original_name = "LiveDataObservable$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    Boq boq = this;
                    C2925Bor c2925Bor3 = c2925Bor;
                    C2925Bor c2925Bor4 = c2925Bor2;
                    if (c2925Bor3 != null) {
                        boq.A00.A07(c2925Bor3);
                    }
                    boq.A00.A08(c2925Bor4);
                }
            });
        }
    }

    @Override // X.InterfaceC2620Bfm
    public final ListenableFuture<T> ABL() {
        return AbstractC2947Bpi.A01(this, 18);
    }

    @Override // X.InterfaceC2620Bfm
    public final void Aau(InterfaceC2655Bgn<? super T> interfaceC2655Bgn) {
        Map<InterfaceC2655Bgn<? super T>, C2925Bor<T>> map = this.A01;
        synchronized (map) {
            final C2925Bor<T> c2925BorRemove = map.remove(interfaceC2655Bgn);
            if (c2925BorRemove != null) {
                c2925BorRemove.A02.set(false);
                BoS.A00().execute(new Runnable() { // from class: X.Bov
                    public static final String __redex_internal_original_name = "LiveDataObservable$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Boq boq = this;
                        boq.A00.A07(c2925BorRemove);
                    }
                });
            }
        }
    }
}
