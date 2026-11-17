package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aez, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1221Aez extends AbstractC1437Aj6 implements InterfaceC1348AhZ, InterfaceC1448AjH, ASY {
    public Function0<Unit> A00;
    public boolean A01;
    public final SuspendingPointerInputModifierNode A02;

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final long mo12getTouchBoundsExpansionRZrCHBk() {
        return AbstractC1643AnJ.A00.A00(AbstractC1414Aij.A08(this));
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        this.A02.onViewConfigurationChange();
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        this.A02.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public C1221Aez(Function0<Unit> function0) {
        this.A00 = function0;
        BSJ bsj = new BSJ(this, 7);
        C1247Afe c1247Afe = AaM.A00;
        AaN aaN = new AaN(bsj, null, null, null);
        A0G(aaN);
        this.A02 = aaN;
    }

    @Override // X.InterfaceC1448AjH
    public final void ATP(C2Um c2Um) {
        this.A01 = c2Um.AOS();
    }
}
