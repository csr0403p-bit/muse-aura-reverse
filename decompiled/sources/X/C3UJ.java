package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.3UJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UJ implements InterfaceC1380AiA {
    public static final C3UJ A00 = new C3UJ();

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
        return AnonymousClass002.A0X(axy, new C3bM(6), Constraints.A0C(j) ? Constraints.A01(j) : 0, Constraints.A0B(j) ? Constraints.A00(j) : 0);
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
