package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AQd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1020AQd extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1219Aex, InterfaceC1332AhJ {
    public long A00 = 0;
    public AQe A01;
    public APZ A02;
    public Function0<Boolean> A03;
    public boolean A04;
    public final C00q A05;

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ ARP AJE() {
        return ARN.A00;
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        GraphicsLayer graphicsLayer;
        AQe aQe = this.A01;
        if (aQe == null || (graphicsLayer = aQe.A00) == null) {
            throw C60O.A0i("Error: layer never initialized");
        }
        ART.A04(c16z, graphicsLayer, BUX.A00(c16z, 9));
        if (this.A04) {
            return;
        }
        ATI.A00(c16z, graphicsLayer);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        AQe aQe = this.A01;
        if (aQe != null) {
            this.A02.A04.remove(aQe);
            AbstractC1414Aij.A02(this).AaE(aQe.A00);
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public C1020AQd(APZ apz, Function0<Boolean> function0, float f) {
        this.A02 = apz;
        this.A03 = function0;
        this.A05 = new ParcelableSnapshotMutableFloatState(f);
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ Object AEO(ARR arr) {
        return AbstractC1218Aew.A00(this, arr);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, new C2339BUn(azeAQW, axy, this, 3), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AQe aQe = new AQe(this, AbstractC1414Aij.A02(this).A7n());
        this.A02.A04.add(aQe);
        this.A01 = aQe;
    }
}
