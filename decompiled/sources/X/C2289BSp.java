package X;

/* renamed from: X.BSp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2289BSp implements AbB, BRg, InterfaceC1195AeC {
    public final int $t;
    public final Object A00;

    public C2289BSp(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
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
