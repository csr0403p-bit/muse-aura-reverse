package X;

import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BSY implements InterfaceC1134Abi {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: Multi-variable type inference failed */
    public BSY(Map map, int i, int i2, Map<AbstractC1493Ak0, Integer> map2, G0U<? super InterfaceC1620Amr, Unit> g0u) {
        this.$t = g0u;
        this.A01 = i2;
        this.A00 = map2;
        this.A02 = map;
        this.A03 = i;
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return (Map) this.A02;
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return (G0U) this.A03;
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
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
