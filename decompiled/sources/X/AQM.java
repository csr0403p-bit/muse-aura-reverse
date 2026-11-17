package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* loaded from: classes4.dex */
public final class AQM extends AbstractC1439Aj8 implements InterfaceC1357Ahi, InterfaceC1219Aex, InterfaceC1332AhJ, InterfaceC1451AjK, APe, C1Z2 {
    public APh A00;
    public AaC A01;
    public boolean A02;
    public GraphicsLayer A03;
    public final ARP A04;

    @Override // X.InterfaceC1357Ahi
    public final /* synthetic */ boolean AOs(AYU ayu) {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A01 = null;
        GraphicsLayer graphicsLayer = this.A03;
        if (graphicsLayer != null) {
            AbstractC1414Aij.A02(this).AaE(graphicsLayer);
        }
        A01(AbstractC1414Aij.A02(this).A7n());
    }

    public static final void A00(AQM aqm) {
        String strA0v;
        ARR<APh> arr = ARQ.A00;
        APh aPh = aqm.A00;
        ARP arp = aqm.A04;
        if (arp == ARN.A00) {
            strA0v = "In order to provide locals you must override providedValues: ModifierLocalMap";
        } else {
            if (arp.A02(arr)) {
                arp.A01(arr, aPh);
                aqm.A00.A01 = (APh) AbstractC1218Aew.A00(aqm, arr);
                aqm.A01(AbstractC1414Aij.A02(aqm).A7n());
                aqm.A02 = false;
                aqm.A00.A00 = aqm;
                return;
            }
            strA0v = AnonymousClass001.A0v(" was not found.", C3cG.A0f(arr, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key "));
        }
        throw C60O.A0i(strA0v);
    }

    private final void A01(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.A03;
            if (graphicsLayer2 != null) {
                AbstractC1414Aij.A02(this).AaE(graphicsLayer2);
            }
        } else {
            this.A00.A06.Af8(graphicsLayer);
        }
        this.A03 = graphicsLayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[PHI: r0
  0x0029: PHI (r0v5 X.AaC) = (r0v4 X.AaC), (r0v44 X.AaC) binds: [B:3:0x000e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1357Ahi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi A4h(X.ARH r10, X.C3TG r11, long r12) {
        /*
            r9 = this;
            X.APh r0 = r9.A00
            androidx.compose.runtime.MutableState r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.AOz r0 = (X.C1008AOz) r0
            X.AaC r0 = r0.A01()
            if (r0 != 0) goto L29
            X.APc r0 = X.APh.A00(r9)
            X.APd r2 = r0.A02
            r2.A01()
            androidx.compose.runtime.MutableState r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.APl r1 = (X.AbstractC1010APl) r1
            X.APc r0 = r2.A04
            X.AaC r0 = r1.A03(r0)
            if (r0 == 0) goto L4b
        L29:
            long r0 = r0.A01()
            long r0 = X.AQY.A00(r0)
            int r2 = X.C8j3.A0G(r0)
            int r1 = X.AnonymousClass002.A09(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto La7
            if (r1 == r0) goto La7
            r0 = 0
            if (r2 >= r0) goto L44
            r2 = 0
        L44:
            if (r1 >= r0) goto L47
            r1 = 0
        L47:
            long r12 = X.AYL.A06(r2, r2, r1, r1)
        L4b:
            X.AZE r6 = r11.AQW(r12)
            X.APh r0 = r9.A00
            androidx.compose.runtime.MutableState r0 = r0.A0B
            X.APl r0 = X.APc.A00(r0)
            boolean r0 = r0.A01()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            if (r0 == 0) goto L9e
            X.APh r0 = r9.A00
            androidx.compose.runtime.MutableState r0 = r0.A08
            java.lang.Object r7 = r0.getValue()
            X.AQf r7 = (X.InterfaceC1021AQf) r7
            X.APc r0 = X.APh.A00(r9)
            X.APZ r0 = r0.A01
            X.AiH r1 = X.AbstractC1414Aij.A05(r9)
            X.APa r0 = r0.A08
            X.Ak4 r0 = r0.Ah1(r1)
            long r4 = r0.AKd()
            int r1 = r6.A01
            int r0 = r6.A00
            long r0 = X.C8j3.A0S(r1, r0)
            long r0 = r7.A5o(r4, r0)
        L8e:
            long r4 = r0 >> r8
            int r7 = (int) r4
            long r2 = r2 & r0
            int r4 = (int) r2
            r1 = 6
            X.BUi r0 = new X.BUi
            r0.<init>(r9, r6, r1)
            X.Abi r0 = X.AXY.A01(r10, r0, r7, r4)
            return r0
        L9e:
            int r1 = r6.A01
            int r0 = r6.A00
            long r0 = X.C8j3.A0R(r1, r0)
            goto L8e
        La7:
            java.lang.String r0 = "Error: Infinite width/height is invalid. animated bounds: "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            X.APh r0 = r9.A00
            androidx.compose.runtime.MutableState r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.AOz r0 = (X.C1008AOz) r0
            X.AaC r0 = r0.A01()
            r1.append(r0)
            java.lang.String r0 = ", current bounds: "
            r1.append(r0)
            X.APh r0 = r9.A00
            androidx.compose.runtime.MutableState r0 = r0.A0B
            X.APl r0 = X.APc.A00(r0)
            X.AaC r0 = r0.A02()
            java.lang.String r0 = X.C8j3.A14(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQM.A4h(X.ARH, X.3TG, long):X.Abi");
    }

    @Override // X.InterfaceC1219Aex
    public final ARP AJE() {
        return this.A04;
    }

    @Override // X.InterfaceC1357Ahi
    public final boolean AOk(long j) {
        return this.A00.A03() && APh.A00(this).A02() && APh.A00(this).A01.APC();
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public AQM(APh aPh) {
        this.A00 = aPh;
        this.A03 = (GraphicsLayer) aPh.A06.getValue();
        ARR<APh> arr = ARQ.A00;
        ARO aro = new ARO(arr);
        aro.A01(arr, aPh);
        this.A04 = aro;
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ Object AEO(ARR arr) {
        return AbstractC1218Aew.A00(this, arr);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, new C2334BUi(this, azeAQW, 7), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        APh.A00(this).A01();
        AbstractC1441AjA.A00(this, APh.A00(this).A08);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        APc aPcA00 = APh.A00(this);
        AaC aaCA02 = ((AbstractC1010APl) aPcA00.A02.A07.getValue()).A02();
        APh aPh = this.A00;
        InterfaceC1068ATy clipPath = null;
        if (aPh.A02() && aaCA02 != null) {
            clipPath = ((AOO) this.A00.A07.getValue()).getClipPath((APL) this.A00.A0C.getValue(), aaCA02, c16z.getLayoutDirection(), AbstractC1414Aij.A08(this));
        }
        aPh.A02 = clipPath;
        GraphicsLayer graphicsLayer = (GraphicsLayer) this.A00.A06.getValue();
        if (graphicsLayer == null) {
            StringBuilder sbA0x = C60O.A0x("Error: Layer is null when accessed for shared bounds/element : ");
            sbA0x.append(aPcA00.A06);
            sbA0x.append(",target: ");
            sbA0x.append(C1008AOz.A00(this.A00));
            sbA0x.append(", is attached: ");
            sbA0x.append(this.isAttached);
            throw C60O.A0i(sbA0x.toString());
        }
        ART.A04(c16z, graphicsLayer, new C2339BUn(aPcA00, aaCA02, c16z, 4));
        APh aPh2 = this.A00;
        if (!APc.A00(aPh2.A0B).A01() || (!aPh2.A02() && APh.A01(aPh2))) {
            ATI.A00(c16z, graphicsLayer);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AbstractC1441AjA.A00(this, APh.A00(this).A08);
        A00(this);
        MutableState.A09(true, this.A00.A05);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        InterfaceC1497Ak4 interfaceC1497Ak4 = APh.A00(this).A01.A01;
        if (interfaceC1497Ak4 != null) {
            this.A01 = (interfaceC1497Ak4.isAttached() && this.A02) ? C2J7.A00(AWx.A04(AbstractC1414Aij.A05(this).APo(0L), interfaceC1497Ak4.APo(0L)), AQY.A01(((AZE) AbstractC1414Aij.A05(this)).A03)) : null;
        }
        A01(null);
        APh aPh = this.A00;
        aPh.A01 = null;
        aPh.A00 = null;
        MutableState.A09(false, aPh.A05);
        this.A02 = false;
    }
}
