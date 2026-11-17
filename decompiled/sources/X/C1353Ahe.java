package X;

import java.util.Map;

/* renamed from: X.Ahe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1353Ahe implements AXY, InterfaceC1009APa, ARH {
    public InterfaceC1357Ahi A00;
    public boolean A01;
    public final C1354Ahf A02;

    @Override // X.InterfaceC1009APa
    public final /* synthetic */ long APl(InterfaceC1497Ak4 interfaceC1497Ak4, InterfaceC1497Ak4 interfaceC1497Ak42, long j, boolean z) {
        return AZo.A00(interfaceC1497Ak4, interfaceC1497Ak42, this, j, z);
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A02.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A02.AFo();
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 AHI(AYU ayu) {
        C1438Aj7 c1438Aj7;
        C1453AjM c1453AjM = this.A02.A0P.A0B;
        if (c1453AjM == null) {
            throw C60O.A0i("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
        }
        if (c1453AjM.A0T) {
            C1453AjM c1453AjMA0E = c1453AjM.A0E();
            if (c1453AjMA0E != null) {
                return c1453AjMA0E.A0f.A07;
            }
            c1438Aj7 = ((C1453AjM) C8j4.A0p(C0910AHm.A04(c1453AjM))).A0f;
        } else {
            c1438Aj7 = c1453AjM.A0f;
        }
        return c1438Aj7.A04;
    }

    @Override // X.ARG
    public final long AHJ() {
        AbstractC1383AiD abstractC1383AiD = this.A02.A02;
        C7384Etj.A0X(abstractC1383AiD);
        InterfaceC1134Abi interfaceC1134AbiA0e = abstractC1383AiD.A0e();
        return AnonymousClass007.A0C(interfaceC1134AbiA0e.getWidth(), interfaceC1134AbiA0e.getHeight());
    }

    @Override // X.C3TF
    public final boolean AOh() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return this.A02.APV(map, g0u, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new C2274BSa(this, map, g0u, g0u2, i, i2, 0);
        }
        ASP.A00(i, i2);
        throw F60.createAndThrow();
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return ASU.A01(this.A02, f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return AbstractC1499Ak6.A00(this.A02, j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return f / this.A02.AEm();
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return i / this.A02.AEm();
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return ASU.A02(this.A02, j);
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 Ah1(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1384AiE c1384AiE;
        if (!(interfaceC1497Ak4 instanceof C1384AiE)) {
            if (!(interfaceC1497Ak4 instanceof AbstractC1387AiH)) {
                throw C60O.A0i("Unsupported LayoutCoordinates");
            }
            AbstractC1383AiD abstractC1383AiDA0l = ((AbstractC1387AiH) interfaceC1497Ak4).A0l();
            if (abstractC1383AiDA0l != null && (c1384AiE = abstractC1383AiDA0l.A04) != null) {
                return c1384AiE;
            }
        }
        return interfaceC1497Ak4;
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return ASU.A00(j, this.A02);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return f * this.A02.AEm();
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return ASU.A03(this.A02, j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return AbstractC1499Ak6.A01(this.A02, f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return AXN.A02(this.A02, f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return AXN.A03(this.A02, i);
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A02.A0P.A0G;
    }

    public C1353Ahe(InterfaceC1357Ahi interfaceC1357Ahi, C1354Ahf c1354Ahf) {
        this.A02 = c1354Ahf;
        this.A00 = interfaceC1357Ahi;
    }
}
