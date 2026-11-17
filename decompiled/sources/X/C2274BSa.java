package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.BSa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2274BSa implements InterfaceC1134Abi {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: Multi-variable type inference failed */
    public C2274BSa(Object obj, int i, int i2, Map<AbstractC1493Ak0, Integer> map, G0U<? super InterfaceC1620Amr, Unit> g0u, G0U<? super AYU, Unit> g0u2, C1353Ahe c1353Ahe) {
        this.$t = c1353Ahe;
        this.A02 = map;
        this.A05 = obj;
        this.A01 = g0u;
        this.A00 = g0u2;
        this.A03 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return (Map) (this.$t != 0 ? this.A02 : this.A03);
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return (G0U) this.A04;
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
        G0U g0u;
        AbstractC1424Ait abstractC1424Ait;
        if (this.$t != 0) {
            g0u = (G0U) this.A03;
            abstractC1424Ait = (AbstractC1424Ait) this.A05;
        } else {
            g0u = (G0U) this.A02;
            abstractC1424Ait = ((C1353Ahe) this.A05).A02;
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
