package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AtC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1893AtC extends AbstractC1437Aj6 implements InterfaceC1356Ahh, InterfaceC1487Aju, C1Z2 {
    public C1881Asv A00;
    public boolean A01;
    public Map<AbstractC1493Ak0, Integer> A02;
    public final C2017AwV A03;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        C1881Asv c1881Asv = this.A00;
        EnumC1820Arj layoutDirection = axy.getLayoutDirection();
        C2K7 c2k7 = (C2K7) ARZ.A01(Am0.A06, this);
        C1892AtB c1892AtB = c1881Asv.A00;
        C1915Atc c1915Atc = new C1915Atc(c2k7, axy, layoutDirection, j);
        c1892AtB.A02.Af8(c1915Atc);
        C1931Atu c1931Atu = (C1931Atu) c1892AtB.A03.getValue();
        if (c1931Atu == null) {
            throw C3cG.A0Q("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        }
        C1958Aux c1958AuxA00 = C1892AtB.A00(c1915Atc, c1931Atu, c1892AtB);
        G0V<? super AXN, ? super Function0<C1958Aux>, Unit> g0v = c1881Asv.A01;
        if (g0v != null) {
            g0v.invoke(axy, C2298BSy.A00(c1881Asv, 42));
        }
        long j2 = c1958AuxA00.A02;
        int iA0G = C8j3.A0G(j2);
        int iA09 = AnonymousClass002.A09(j2);
        AZE azeAQW = c3tg.AQW(Constraints.A07(iA0G, iA0G, iA09, iA09));
        C1DG.A06(this.A01 ? axy.Agy(AbstractC2060AxX.A00(c1958AuxA00.A03.A06(0))) : 0.0f, this.A00.A06);
        Map<AbstractC1493Ak0, Integer> mapA15 = this.A02;
        if (mapA15 == null) {
            mapA15 = C60O.A15(2);
        }
        AbstractC1439Aj8.A0I(AbstractC2094AyJ.A00, mapA15, c1958AuxA00.A00);
        AbstractC1439Aj8.A0I(AbstractC2094AyJ.A01, mapA15, c1958AuxA00.A01);
        this.A02 = mapA15;
        return axy.APV(mapA15, C2294BSu.A00(azeAQW, 40), iA0G, iA09);
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A00.A07.Af8(interfaceC1497Ak4);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Asv;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;LX/Arm;ZLX/G0V<-LX/AXN;-Lkotlin/jvm/functions/Function0<LX/Aux;>;Lkotlin/Unit;>;LX/AuJ;)V */
    public C1893AtC(AuJ auJ, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, C1822Arm c1822Arm, G0V g0v, boolean z) {
        this.A00 = c1881Asv;
        this.A01 = z;
        InterfaceC1866Asg interfaceC1866Asg = c1881Asv.A02;
        C2017AwV c2017AwV = new C2017AwV();
        c2017AwV.A00 = interfaceC1866Asg;
        A0G(c2017AwV);
        this.A03 = c2017AwV;
        C1881Asv c1881Asv2 = this.A00;
        c1881Asv2.A01 = g0v;
        boolean z2 = this.A01;
        c1881Asv2.A00.A03.Af8(new C1931Atu(transformedTextFieldState, c1822Arm, z2, !z2, AnonymousClass003.A17(auJ.A02)));
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
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
