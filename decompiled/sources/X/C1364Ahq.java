package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Ahq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1364Ahq implements C3Su {
    public float A00;
    public float A01;
    public EnumC1820Arj A02 = EnumC1820Arj.A03;
    public final /* synthetic */ C1369Ahv A03;

    @Override // X.AXY
    public final /* synthetic */ InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return APW(map, null, g0u, i, i2);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / this.A00;
    }

    public C1364Ahq(C1369Ahv c1369Ahv) {
        this.A03 = c1369Ahv;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A00;
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A01;
    }

    @Override // X.C3TF
    public final boolean AOh() {
        Integer num = this.A03.A0D.A0d.A05;
        return num == C79.A0K || num == C79.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new C1363Ahp(this, this.A03, map, g0u, g0u2, i, i2);
        }
        ASP.A00(i, i2);
        throw F60.createAndThrow();
    }

    @Override // X.C3Su
    public final List<C3TG> AgZ(Object obj, G0V<? super BFM, ? super Integer, Unit> g0v) {
        String str;
        C1369Ahv c1369Ahv = this.A03;
        c1369Ahv.A0A();
        C1453AjM c1453AjM = c1369Ahv.A0D;
        Integer num = c1453AjM.A0d.A05;
        Integer num2 = C79.A00;
        if (num == num2 || num == C79.A0C || num == C79.A01 || num == C79.A0K) {
            C0918AHu<Object, C1453AjM> c0918AHu = c1369Ahv.A09;
            C1453AjM c1453AjMA05 = c0918AHu.A05(obj);
            if (c1453AjMA05 == null) {
                c1453AjMA05 = c1369Ahv.A08.A0B(obj);
                if (c1453AjMA05 != null) {
                    c1369Ahv.A07.A05(c1453AjMA05);
                    int i = c1369Ahv.A02;
                    if (i > 0) {
                        c1369Ahv.A02 = i - 1;
                    } else {
                        str = "Check failed.";
                    }
                } else {
                    c1453AjMA05 = C1369Ahv.A01(c1369Ahv, obj);
                    if (c1453AjMA05 == null) {
                        int i2 = c1369Ahv.A01;
                        c1453AjMA05 = new C1453AjM(true, ARD.A00.addAndGet(1));
                        c1453AjM.A0O = true;
                        c1453AjM.A0V(c1453AjMA05, i2);
                        c1453AjM.A0O = false;
                    }
                }
                c0918AHu.A0E(obj, c1453AjMA05);
            }
            C1453AjM c1453AjM2 = c1453AjMA05;
            C0910AHm<C1453AjM> c0910AHm = c1453AjM.A0e.A00;
            if (AbstractC0878AGe.A0A(c1369Ahv.A01, c0910AHm.A08()) != c1453AjM2) {
                int iIndexOf = c0910AHm.A08().indexOf(c1453AjM2);
                int i3 = c1369Ahv.A01;
                if (iIndexOf < i3) {
                    throw C60O.A0i(AnonymousClass001.A0v("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.", C3cG.A0f(obj, "Key \"")));
                }
                if (i3 != iIndexOf) {
                    C1369Ahv.A05(c1369Ahv, iIndexOf, i3);
                }
            }
            c1369Ahv.A01++;
            C1369Ahv.A06(c1369Ahv, c1453AjM2, obj, g0v, false);
            return (num == num2 || num == C79.A0C) ? c1453AjM2.A0d.A0G.A0c() : c1453AjM2.A0G();
        }
        str = "subcompose can only be used inside the measure or layout blocks";
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / this.A00;
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * this.A00;
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A02;
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
