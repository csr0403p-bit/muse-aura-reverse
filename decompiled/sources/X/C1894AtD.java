package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.AtD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1894AtD implements InterfaceC1380AiA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1897AtH A01;
    public final /* synthetic */ InterfaceC2128Ayu A02;
    public final /* synthetic */ C1805ArO A03;
    public final /* synthetic */ AXN A04;
    public final /* synthetic */ G0U<C1958Aux, Unit> A05;

    /* JADX WARN: Incorrect types in method signature: (LX/AtH;LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/ArO;LX/Ayu;LX/AXN;I)V */
    public C1894AtD(C1897AtH c1897AtH, InterfaceC2128Ayu interfaceC2128Ayu, C1805ArO c1805ArO, AXN axn, G0U g0u, int i) {
        this.A01 = c1897AtH;
        this.A05 = g0u;
        this.A03 = c1805ArO;
        this.A02 = interfaceC2128Ayu;
        this.A04 = axn;
        this.A00 = i;
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        C1897AtH c1897AtH = this.A01;
        c1897AtH.A01.A00(c3tf.getLayoutDirection());
        C1834Ary c1834Ary = c1897AtH.A01.A00;
        if (c1834Ary != null) {
            return AbstractC2060AxX.A00(c1834Ary.AHR());
        }
        throw C3cG.A0Q("layoutIntrinsics must be called first");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(X.AXY r35, java.util.List<? extends X.C3TG> r36, long r37) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1894AtD.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
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
