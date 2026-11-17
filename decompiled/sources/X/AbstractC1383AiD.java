package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AiD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1383AiD extends AbstractC1424Ait implements C3TG {
    public InterfaceC1134Abi A01;
    public Map<AbstractC1493Ak0, Integer> A02;
    public final AeA<AbstractC1493Ak0> A03;
    public final AbstractC1387AiH A05;
    public long A00 = 0;
    public final C1384AiE A04 = new C1384AiE(this);

    public static final void A02(InterfaceC1134Abi interfaceC1134Abi, AbstractC1383AiD abstractC1383AiD) {
        long height;
        Map<AbstractC1493Ak0, Integer> map;
        if (interfaceC1134Abi != null) {
            height = (interfaceC1134Abi.getHeight() & 4294967295L) | (interfaceC1134Abi.getWidth() << 32);
        } else {
            height = 0;
        }
        abstractC1383AiD.A0W(height);
        if (!C7384Etj.areEqual(abstractC1383AiD.A01, interfaceC1134Abi) && interfaceC1134Abi != null && (((map = abstractC1383AiD.A02) != null && !map.isEmpty()) || !interfaceC1134Abi.ACJ().isEmpty())) {
            Map<AbstractC1493Ak0, Integer> mapACJ = interfaceC1134Abi.ACJ();
            if (!C7384Etj.areEqual(mapACJ, abstractC1383AiD.A02)) {
                C1455AjO c1455AjO = abstractC1383AiD.A05.A0P.A0d.A04;
                C7384Etj.A0X(c1455AjO);
                c1455AjO.A0J.A01();
                Map linkedHashMap = abstractC1383AiD.A02;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    abstractC1383AiD.A02 = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(mapACJ);
            }
        }
        abstractC1383AiD.A01 = interfaceC1134Abi;
    }

    public static final void A04(AbstractC1383AiD abstractC1383AiD, long j) {
        if (abstractC1383AiD.A00 != j) {
            abstractC1383AiD.A00 = j;
            AbstractC1387AiH abstractC1387AiH = abstractC1383AiD.A05;
            C1455AjO c1455AjO = abstractC1387AiH.A0P.A0d.A04;
            if (c1455AjO != null) {
                c1455AjO.A0c();
            }
            AbstractC1424Ait.A0V(abstractC1387AiH);
        }
        if (((AbstractC1424Ait) abstractC1383AiD).A05) {
            return;
        }
        abstractC1383AiD.A0g(abstractC1383AiD.A0e());
    }

    @Override // X.AbstractC1424Ait
    public final InterfaceC1497Ak4 A0d() {
        return this.A04;
    }

    @Override // X.AbstractC1424Ait
    public final InterfaceC1134Abi A0e() {
        InterfaceC1134Abi interfaceC1134Abi = this.A01;
        if (interfaceC1134Abi != null) {
            return interfaceC1134Abi;
        }
        throw C3cG.A0Q("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // X.AbstractC1424Ait
    public final AbstractC1424Ait A0f() {
        AbstractC1387AiH abstractC1387AiH = this.A05.A09;
        if (abstractC1387AiH != null) {
            return abstractC1387AiH.A0l();
        }
        return null;
    }

    public final long A0i(AbstractC1383AiD abstractC1383AiD, boolean z) {
        long jA02 = 0;
        while (!this.equals(abstractC1383AiD)) {
            if (!((AbstractC1424Ait) this).A04 || !z) {
                jA02 = C2ae.A02(jA02, this.A00);
            }
            AbstractC1387AiH abstractC1387AiH = this.A05.A09;
            C7384Etj.A0X(abstractC1387AiH);
            this = AZE.A01(abstractC1387AiH);
        }
        return jA02;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A05.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A05.AFo();
    }

    @Override // X.AbstractC1424Ait, X.InterfaceC1351Ahc
    public final C1453AjM AGz() {
        return this.A05.A0P;
    }

    @Override // X.AZE, X.C3Tr
    public final Object AIX() {
        return this.A05.AIX();
    }

    @Override // X.AbstractC1424Ait, X.C3TF
    public final boolean AOh() {
        return true;
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        if (!(this instanceof C1355Ahg)) {
            C1381AiB c1381AiBA00 = C1453AjM.A00(this.A05.A0P);
            InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
            C1453AjM c1453AjM = c1381AiBA00.A01;
            return interfaceC1380AiA.maxIntrinsicHeight(c1453AjM.A0f.A04, c1453AjM.A0G(), i);
        }
        C1355Ahg c1355Ahg = (C1355Ahg) this;
        C1354Ahf c1354Ahf = c1355Ahg.A00;
        InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1354Ahf).A08;
        C7384Etj.A0X(abstractC1387AiH);
        return interfaceC1356Ahh.AQN(AZE.A01(abstractC1387AiH), c1355Ahg, i);
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        if (!(this instanceof C1355Ahg)) {
            C1381AiB c1381AiBA00 = C1453AjM.A00(this.A05.A0P);
            InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
            C1453AjM c1453AjM = c1381AiBA00.A01;
            return interfaceC1380AiA.maxIntrinsicWidth(c1453AjM.A0f.A04, c1453AjM.A0G(), i);
        }
        C1355Ahg c1355Ahg = (C1355Ahg) this;
        C1354Ahf c1354Ahf = c1355Ahg.A00;
        InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1354Ahf).A08;
        C7384Etj.A0X(abstractC1387AiH);
        return interfaceC1356Ahh.AQP(AZE.A01(abstractC1387AiH), c1355Ahg, i);
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        if (!(this instanceof C1355Ahg)) {
            C1381AiB c1381AiBA00 = C1453AjM.A00(this.A05.A0P);
            InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
            C1453AjM c1453AjM = c1381AiBA00.A01;
            return interfaceC1380AiA.minIntrinsicHeight(c1453AjM.A0f.A04, c1453AjM.A0G(), i);
        }
        C1355Ahg c1355Ahg = (C1355Ahg) this;
        C1354Ahf c1354Ahf = c1355Ahg.A00;
        InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1354Ahf).A08;
        C7384Etj.A0X(abstractC1387AiH);
        return interfaceC1356Ahh.AQp(AZE.A01(abstractC1387AiH), c1355Ahg, i);
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        if (!(this instanceof C1355Ahg)) {
            C1381AiB c1381AiBA00 = C1453AjM.A00(this.A05.A0P);
            InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
            C1453AjM c1453AjM = c1381AiBA00.A01;
            return interfaceC1380AiA.minIntrinsicWidth(c1453AjM.A0f.A04, c1453AjM.A0G(), i);
        }
        C1355Ahg c1355Ahg = (C1355Ahg) this;
        C1354Ahf c1354Ahf = c1355Ahg.A00;
        InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1354Ahf).A08;
        C7384Etj.A0X(abstractC1387AiH);
        return interfaceC1356Ahh.AQr(AZE.A01(abstractC1387AiH), c1355Ahg, i);
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A05.A0P.A0G;
    }

    public AbstractC1383AiD(AbstractC1387AiH abstractC1387AiH) {
        this.A05 = abstractC1387AiH;
        AeA<Object> aeA = AbstractC1189Ads.A00;
        this.A03 = new AeA<>(6);
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AZE
    public final void A0b(G0U g0u, float f, long j) {
        A04(this, j);
        if (this.A06) {
            return;
        }
        A0j();
    }

    public void A0j() {
        A0e().AXv();
    }
}
