package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.ARx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1034ARx implements InterfaceC1380AiA {
    public static final C1034ARx A00 = new C1034ARx();
    public static final G0U<AYU, Unit> A01 = new C2279BSf(10);

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        return AXY.A01(axy, A01, Constraints.A01(j), Constraints.A00(j));
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A02(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A03(c3tf, this, list, i);
    }
}
