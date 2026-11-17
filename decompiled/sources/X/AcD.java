package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* loaded from: classes4.dex */
public final class AcD implements Ac9<Float, AOW> {
    public final C1YC<Float> A00;

    public AcD(C1YC<Float> c1yc) {
        this.A00 = c1yc;
    }

    @Override // X.Ac9
    public final /* bridge */ /* synthetic */ Object A4g(C3Q0 c3q0, Object obj, Object obj2, HtJ htJ, G0U g0u) {
        return SnapFlingBehaviorKt.A01(ATB.A00(0.0f, AnonymousClass001.A02(obj2)), this.A00, c3q0, htJ, g0u, AnonymousClass001.A02(obj));
    }
}
