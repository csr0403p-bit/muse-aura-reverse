package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public class BQw<T> {
    public static final int $stable = 0;
    public final G0W<BRL<T>, BFM, Integer, Unit> decorate;
    public final G0U<Object, Unit> onPop;

    public final G0W<BRL<T>, BFM, Integer, Unit> getDecorate$navigation3_runtime() {
        return this.decorate;
    }

    public final G0U<Object, Unit> getOnPop$navigation3_runtime() {
        return this.onPop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BQw(G0U<Object, Unit> g0u, G0W<? super BRL<T>, ? super BFM, ? super Integer, Unit> g0w) {
        this.onPop = g0u;
        this.decorate = g0w;
    }

    public /* synthetic */ BQw(G0U g0u, G0W g0w, int i, C06H c06h) {
        this((i & 1) != 0 ? new C2276BSc(28) : g0u, g0w);
    }
}
