package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AXO implements ARG, ARH {
    public final EnumC1820Arj A00;
    public final /* synthetic */ ARG A01;

    @Override // X.AXY
    public final /* synthetic */ InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return APW(map, null, g0u, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i < 0) {
            i3 = 0;
        }
        if (i2 < 0) {
            i4 = 0;
        }
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new BSY(map, g0u, i3, i4, 0);
        }
        ASP.A00(i3, i4);
        throw F60.createAndThrow();
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A01.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A01.AFo();
    }

    @Override // X.ARG
    public final long AHJ() {
        return this.A01.AHJ();
    }

    @Override // X.C3TF
    public final boolean AOh() {
        return this.A01.AOh();
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return this.A01.Abr(f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return this.A01.Agw(j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return this.A01.Agx(f);
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return this.A01.Agy(i);
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return this.A01.Agz(j);
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return this.A01.Ah3(j);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return this.A01.Ah4(f);
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return this.A01.Ah6(j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return this.A01.Ah7(f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return this.A01.Ah8(f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return this.A01.Ah9(i);
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A00;
    }

    public AXO(ARG arg, EnumC1820Arj enumC1820Arj) {
        this.A01 = arg;
        this.A00 = enumC1820Arj;
    }
}
