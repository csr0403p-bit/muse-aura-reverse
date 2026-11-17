package X;

import kotlin.Unit;

/* renamed from: X.AxL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049AxL extends AbstractC2134Az2 implements AbB {
    public final G0W<BRg, BFM, Integer, BRg> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C2049AxL(G0U<? super ASF, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, ? extends BRg> g0w) {
        super(g0u);
        this.A00 = g0w;
    }

    @Override // X.BRg
    public final /* synthetic */ boolean all(G0U g0u) {
        return AnonymousClass003.A1X(this, g0u);
    }

    @Override // X.BRg
    public final /* synthetic */ Object foldIn(Object obj, G0V g0v) {
        return g0v.invoke(obj, this);
    }

    @Override // X.BRg
    public final /* synthetic */ BRg then(BRg bRg) {
        return BRP.A00(this, bRg);
    }
}
