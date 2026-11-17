package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* loaded from: classes4.dex */
public final class AcE implements Ac9<Float, AOW> {
    public final AOc<Float> A00;

    public AcE(AOc<Float> aOc) {
        this.A00 = aOc;
    }

    @Override // X.Ac9
    public final /* bridge */ /* synthetic */ Object A4g(C3Q0 c3q0, Object obj, Object obj2, HtJ htJ, G0U g0u) {
        float fA02 = AnonymousClass001.A02(obj);
        float fA022 = AnonymousClass001.A02(obj2);
        return SnapFlingBehaviorKt.A00(this.A00, ATB.A00(0.0f, fA022), c3q0, htJ, g0u, Math.abs(fA02) * Math.signum(fA022), fA02);
    }
}
