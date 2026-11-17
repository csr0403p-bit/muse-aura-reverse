package X;

import android.view.ViewConfiguration;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import java.util.List;

/* renamed from: X.Ah9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1322Ah9 extends AbstractC1437Aj6 implements InterfaceC1348AhZ, C1Z2 {
    public C5V9 A00;
    public G0U<? super AWx, Boolean> A01;
    public boolean A02;
    public InterfaceC1285AgV A03;
    public InterfaceC1348AhZ A04;
    public final SuspendingPointerInputModifierNode A05;
    public final G0U<AWx, Boolean> A06 = C2295BSv.A00(this, 15);
    public final HzR<BRI> A07 = new GCV(Integer.MAX_VALUE, null);

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        this.A05.onViewConfigurationChange();
        InterfaceC1348AhZ interfaceC1348AhZ = this.A04;
        if (interfaceC1348AhZ != null) {
            interfaceC1348AhZ.onViewConfigurationChange();
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        InterfaceC1285AgV interfaceC1285AgV = this.A03;
        if (this.A02) {
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (C8j3.A0h(list, i).A07 != 2) {
                    i++;
                } else if (interfaceC1285AgV != null && this.A04 == null) {
                    BSK bsk = new BSK(0, interfaceC1285AgV, this);
                    C1247Afe c1247Afe2 = AaM.A00;
                    AaN aaN = new AaN(bsk, null, null, null);
                    A0G(aaN);
                    this.A04 = aaN;
                }
            }
        }
        this.A05.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
        InterfaceC1348AhZ interfaceC1348AhZ = this.A04;
        if (interfaceC1348AhZ != null) {
            interfaceC1348AhZ.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
        }
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public C1322Ah9(C5V9 c5v9, G0U g0u, boolean z) {
        this.A00 = c5v9;
        this.A01 = g0u;
        this.A02 = z;
        BSJ bsj = new BSJ(this, 1);
        C1247Afe c1247Afe = AaM.A00;
        AaN aaN = new AaN(bsj, null, null, null);
        A0G(aaN);
        this.A05 = aaN;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A03 = new C1289AgZ(ViewConfiguration.get(AbstractC1329AhG.A00(this).getContext()));
    }
}
