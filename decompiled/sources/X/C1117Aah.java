package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Aah, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1117Aah implements AXY, InterfaceC1126Aba {
    public final Ab2<List<C3TG>> A00;
    public final Ab2<List<AZE>> A01;
    public final C1131Abf A02;
    public final InterfaceC1129Abd A03;
    public final C3Su A04;

    @Override // X.InterfaceC1126Aba
    public final List<C3TG> A6h(int i) {
        Ab2<List<C3TG>> ab2 = this.A00;
        List<C3TG> listA04 = ab2.A04(i);
        if (listA04 != null) {
            return listA04;
        }
        InterfaceC1129Abd interfaceC1129Abd = this.A03;
        Object objAGm = interfaceC1129Abd.AGm(i);
        List<C3TG> listAgZ = this.A04.AgZ(objAGm, this.A02.A01(objAGm, interfaceC1129Abd.AE6(i), i));
        ab2.A0B(i, listAgZ);
        return listAgZ;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A04.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A04.AFo();
    }

    @Override // X.C3TF
    public final boolean AOh() {
        return this.A04.AOh();
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return this.A04.APV(map, g0u, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        return this.A04.APW(map, g0u, g0u2, i, i2);
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return this.A04.Abr(f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return this.A04.Agw(j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return this.A04.Agx(f);
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return this.A04.Agy(i);
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return this.A04.Agz(j);
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return this.A04.Ah3(j);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return this.A04.Ah4(f);
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return this.A04.Ah6(j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return this.A04.Ah7(f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return this.A04.Ah8(f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return this.A04.Ah9(i);
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A04.getLayoutDirection();
    }

    public C1117Aah(C1131Abf c1131Abf, C3Su c3Su) {
        this.A02 = c1131Abf;
        this.A04 = c3Su;
        this.A03 = c1131Abf.A01.invoke();
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A01 = new Ab2<>(6);
        this.A00 = new Ab2<>(6);
    }
}
