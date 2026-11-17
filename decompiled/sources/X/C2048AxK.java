package X;

import kotlin.Deprecated;
import kotlin.Unit;

@Deprecated(level = Hs1.A04, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
/* renamed from: X.AxK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2048AxK extends AbstractC2134Az2 implements AbB {
    public final C2047AxJ A00;

    public C2048AxK(G0U<? super ASF, Unit> g0u) {
        super(g0u);
        this.A00 = new C2047AxJ(this);
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
