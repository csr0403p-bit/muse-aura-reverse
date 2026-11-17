package X;

import kotlin.Unit;

/* renamed from: X.AiP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1394AiP extends Ab8<C1389AiK> {
    public final G0U<C2av, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1394AiP) && this.A00 == ((C1394AiP) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<C2av, Unit> g0u = this.A00;
        C1389AiK c1389AiK = new C1389AiK();
        c1389AiK.A00 = g0u;
        return c1389AiK;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "graphicsLayer";
        asf.A02.A01("block", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1389AiK c1389AiK = (C1389AiK) abstractC1439Aj8;
        G0U<C2av, Unit> g0u = this.A00;
        c1389AiK.A00 = g0u;
        AbstractC1339AhQ.A01(c1389AiK, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1394AiP(G0U<? super C2av, Unit> g0u) {
        this.A00 = g0u;
    }
}
