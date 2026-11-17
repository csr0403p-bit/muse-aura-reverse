package X;

import java.util.Map;

/* renamed from: X.5rn, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5rn<T> {
    public final Map<C9uG<? extends T>, C5ro<? extends T>> A00 = C3cG.A0j();
    public final Map A01 = C3cG.A0j();
    public final G0U<T, BRL<T>> A02;

    /* JADX WARN: Incorrect types in method signature: <K::TT;>(LX/9uG<+TK;>;LX/G0U<TK;+Ljava/lang/Object;>;LX/G0U<-TK;+Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;>;LX/G0W<-TK;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public final void A00(G0U g0u, G0U g0u2, G0W g0w, C9uG c9uG) {
        Map<C9uG<? extends T>, C5ro<? extends T>> map = this.A00;
        if (map.containsKey(c9uG)) {
            throw new IllegalArgumentException(FGI.A0N("An `entry` with the same `clazz` has already been added: ", C0861A6i.A01(((C0861A6i) c9uG).A00), '.'));
        }
        map.put(c9uG, new C5ro<>(g0u, g0u2, g0w, c9uG));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5rn(G0U<? super T, BRL<T>> g0u) {
        this.A02 = g0u;
    }
}
