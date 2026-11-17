package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AZp implements InterfaceC1009APa {
    public Function0<? extends InterfaceC1497Ak4> A00 = null;

    @Override // X.InterfaceC1009APa
    public final /* synthetic */ long APl(InterfaceC1497Ak4 interfaceC1497Ak4, InterfaceC1497Ak4 interfaceC1497Ak42, long j, boolean z) {
        return AZo.A00(interfaceC1497Ak4, interfaceC1497Ak42, this, j, z);
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 AHI(AYU ayu) {
        Function0<? extends InterfaceC1497Ak4> function0 = this.A00;
        C7384Etj.A0X(function0);
        return function0.invoke();
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 Ah1(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1384AiE c1384AiE;
        if ((interfaceC1497Ak4 instanceof C1384AiE) && interfaceC1497Ak4 != null) {
            return interfaceC1497Ak4;
        }
        C7384Etj.A0Z(interfaceC1497Ak4, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        AbstractC1387AiH abstractC1387AiH = (AbstractC1387AiH) interfaceC1497Ak4;
        AbstractC1383AiD abstractC1383AiDA0l = abstractC1387AiH.A0l();
        return (abstractC1383AiDA0l == null || (c1384AiE = abstractC1383AiDA0l.A04) == null) ? abstractC1387AiH : c1384AiE;
    }
}
