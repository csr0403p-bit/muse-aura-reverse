package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes4.dex */
public final class AQN extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1332AhJ, InterfaceC1451AjK, C1Z2 {
    public APZ A00;

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        this.A00.A00();
        AbstractC1441AjA.A00(this, this.A00.A06);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AbstractC1441AjA.A00(this, this.A00.A06);
        this.A00.A02 = C2328BUc.A00(this, 6);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A00.A02 = null;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
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
        return AXY.A01(axy, new C2339BUn(axy, azeAQW, this, 5), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
        SnapshotStateList<APo> snapshotStateList = this.A00.A04;
        if (snapshotStateList.size() > 1) {
            AbstractC06907md.A04(snapshotStateList, new BSF(0));
        }
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((APo) snapshotStateList.get(i)).A9U(c16z);
        }
    }
}
