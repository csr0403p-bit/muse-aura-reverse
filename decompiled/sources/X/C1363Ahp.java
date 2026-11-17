package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Ahp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1363Ahp implements InterfaceC1134Abi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1364Ahq A02;
    public final /* synthetic */ C1369Ahv A03;
    public final /* synthetic */ Map<AbstractC1493Ak0, Integer> A04;
    public final /* synthetic */ G0U<AYU, Unit> A05;
    public final /* synthetic */ G0U<InterfaceC1620Amr, Unit> A06;

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/Ahq;LX/Ahv;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)V */
    public C1363Ahp(C1364Ahq c1364Ahq, C1369Ahv c1369Ahv, Map map, G0U g0u, G0U g0u2, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = map;
        this.A06 = g0u;
        this.A02 = c1364Ahq;
        this.A03 = c1369Ahv;
        this.A05 = g0u2;
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return this.A04;
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return this.A06;
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
        G0U<AYU, Unit> g0u;
        AbstractC1424Ait abstractC1424Ait;
        if (!this.A02.AOh() || (abstractC1424Ait = this.A03.A0D.A0f.A07.A00) == null) {
            g0u = this.A05;
            abstractC1424Ait = this.A03.A0D.A0f.A07;
        } else {
            g0u = this.A05;
        }
        g0u.invoke(abstractC1424Ait.A08);
    }

    @Override // X.InterfaceC1134Abi
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC1134Abi
    public final int getWidth() {
        return this.A01;
    }
}
