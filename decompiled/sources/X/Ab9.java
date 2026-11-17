package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class Ab9 implements AbC {
    public final MutableState A00;

    public Ab9(boolean z) {
        this.A00 = AbstractC1798ArH.A08(z);
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
