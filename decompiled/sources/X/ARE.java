package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class ARE extends AbstractC1439Aj8 implements InterfaceC1357Ahi, InterfaceC1332AhJ, C1Z2 {
    public AP0 A00;
    public InterfaceC1009APa A01;
    public G0V<? super BL4, ? super Constraints, Constraints> A02;
    public boolean A03 = true;
    public final ARF A04 = new ARF();

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A03 = true;
    }

    @Override // X.InterfaceC1357Ahi
    public final InterfaceC1134Abi A4h(ARH arh, C3TG c3tg, long j) {
        AaC aaC;
        AT5<AaC, AT9> at5;
        ARF arf = this.A04;
        long jA01 = arf.A02;
        if (jA01 == 9205357640488583168L) {
            jA01 = AQY.A01(arh.AHJ());
        }
        if ((arf.A07 || ((at5 = arf.A05) != null && MutableState.A0A(at5.A0A))) && (aaC = (AaC) arf.A08.getValue()) != null) {
            jA01 = aaC.A01();
        }
        long jA00 = AQY.A00(jA01);
        long j2 = this.A02.invoke(BL4.A00(jA00), new Constraints(j)).A00;
        AZE azeAQW = c3tg.AQW(j2);
        long jA09 = AYL.A09(j2, jA00);
        return AXY.A01(arh, new C2334BUi(1, azeAQW, this), C8j3.A0G(jA09), AnonymousClass002.A09(jA09));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // X.InterfaceC1357Ahi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOk(long r10) {
        /*
            r9 = this;
            X.ARF r9 = r9.A04
            long r3 = X.AQY.A01(r10)
            long r1 = r9.A04
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L20
            long r5 = X.AQY.A00(r3)
            long r1 = X.AQY.A00(r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            r0 = 1
            r9.A07 = r0
        L20:
            r9.A04 = r3
            long r1 = r9.A02
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
            r9.A02 = r3
        L2a:
            boolean r0 = r9.A07
            if (r0 != 0) goto L3b
            X.AT5<X.AaC, X.AT9> r0 = r9.A05
            r1 = 1
            if (r0 == 0) goto L3c
            androidx.compose.runtime.MutableState r0 = r0.A0A
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != r1) goto L3c
        L3b:
            r1 = 0
        L3c:
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARE.AOk(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    @Override // X.InterfaceC1357Ahi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOs(X.AYU r17) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARE.AOs(X.AYU):boolean");
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public ARE(AP0 ap0, InterfaceC1009APa interfaceC1009APa, G0V g0v) {
        this.A01 = interfaceC1009APa;
        this.A00 = ap0;
        this.A02 = g0v;
    }

    public static long A00(InterfaceC1497Ak4 interfaceC1497Ak4) {
        InterfaceC1497Ak4 interfaceC1497Ak4AIa = interfaceC1497Ak4.AIa();
        if (interfaceC1497Ak4AIa != null) {
            return interfaceC1497Ak4AIa.APm(interfaceC1497Ak4, 0L);
        }
        return 0L;
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
    public final /* synthetic */ InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, BUX.A00(azeAQW, 31), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
    }
}
