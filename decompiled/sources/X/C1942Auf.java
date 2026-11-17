package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Auf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1942Auf extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj, InterfaceC1332AhJ {
    public int A00;
    public int A01;
    public int A02;
    public C1951Aup A03;
    public C1964AvG A04;
    public C1DN A05;
    public ApQ A06;
    public C1822Arm A07;
    public C2K7 A08;
    public List<C1733ApU<C1821Arl>> A09;
    public G0U<? super List<AaC>, Unit> A0A;
    public G0U<? super C1964AvG, Unit> A0B;
    public G0U<? super C1958Aux, Unit> A0C;
    public boolean A0D;
    public C1944Aui A0E;
    public Map<AbstractC1493Ak0, Integer> A0F;
    public G0U<? super List<C1958Aux>, Boolean> A0G;

    public static final C1944Aui A00(C1942Auf c1942Auf) {
        C1944Aui c1944Aui = c1942Auf.A0E;
        if (c1944Aui == null) {
            ApQ apQ = c1942Auf.A06;
            C1822Arm c1822Arm = c1942Auf.A07;
            C2K7 c2k7 = c1942Auf.A08;
            int i = c1942Auf.A02;
            boolean z = c1942Auf.A0D;
            int i2 = c1942Auf.A00;
            int i3 = c1942Auf.A01;
            List<C1733ApU<C1821Arl>> list = c1942Auf.A09;
            c1944Aui = new C1944Aui();
            c1944Aui.A08 = apQ;
            c1944Aui.A0C = c2k7;
            c1944Aui.A04 = i;
            c1944Aui.A0F = z;
            c1944Aui.A02 = i2;
            c1944Aui.A03 = i3;
            c1944Aui.A0E = list;
            c1944Aui.A06 = AbstractC1967AvY.A00;
            c1944Aui.A0B = c1822Arm;
            c1944Aui.A01 = -1;
            c1944Aui.A00 = -1;
            c1942Auf.A0E = c1944Aui;
        }
        C7384Etj.A0X(c1944Aui);
        return c1944Aui;
    }

    private final C1944Aui A01(AXN axn) {
        C1944Aui c1944AuiA00;
        C1964AvG c1964AvG = this.A04;
        if (c1964AvG == null || !c1964AvG.A02 || (c1944AuiA00 = c1964AvG.A00) == null) {
            c1944AuiA00 = A00(this);
        }
        c1944AuiA00.A04(axn);
        return c1944AuiA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            if (r11 != 0) goto L6
            if (r12 != 0) goto L6
            if (r13 == 0) goto L1d
        L6:
            X.Aui r0 = A00(r9)
            X.ApQ r1 = r9.A06
            X.Arm r2 = r9.A07
            X.2K7 r3 = r9.A08
            int r5 = r9.A02
            boolean r8 = r9.A0D
            int r6 = r9.A00
            int r7 = r9.A01
            java.util.List<X.ApU<X.Arl>> r4 = r9.A09
            r0.A03(r1, r2, r3, r4, r5, r6, r7, r8)
        L1d:
            boolean r0 = r9.isAttached
            if (r0 == 0) goto L3d
            if (r11 != 0) goto L29
            if (r10 == 0) goto L2e
            X.G0U<? super java.util.List<X.Aux>, java.lang.Boolean> r0 = r9.A0G
            if (r0 == 0) goto L2e
        L29:
            X.AaW.A00(r9)
            if (r11 != 0) goto L32
        L2e:
            if (r12 != 0) goto L32
            if (r13 == 0) goto L38
        L32:
            X.AbstractC1339AhQ.A00(r9)
            X.AaD.A00(r9)
        L38:
            if (r10 == 0) goto L3d
            X.AaD.A00(r9)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942Auf.A02(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/G0U<-Ljava/util/List<LX/AaC;>;Lkotlin/Unit;>;LX/Aup;LX/G0U<-LX/AvG;Lkotlin/Unit;>;)Z */
    public final boolean A03(C1951Aup c1951Aup, G0U g0u, G0U g0u2, G0U g0u3) {
        boolean z;
        if (this.A0C != g0u) {
            this.A0C = g0u;
            z = true;
        } else {
            z = false;
        }
        if (this.A0A != g0u2) {
            this.A0A = g0u2;
            z = true;
        }
        if (!C7384Etj.areEqual(this.A03, c1951Aup)) {
            this.A03 = c1951Aup;
            z = true;
        }
        if (this.A0B == g0u3) {
            return z;
        }
        this.A0B = g0u3;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.ApQ r4) {
        /*
            r3 = this;
            X.ApQ r0 = r3.A06
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r4.A00
            boolean r2 = X.C7384Etj.areEqual(r1, r0)
            X.ApQ r0 = r3.A06
            java.util.List<X.ApU<? extends X.1OS>> r1 = r0.A01
            java.util.List<X.ApU<? extends X.1OS>> r0 = r4.A01
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r2 == 0) goto L19
            r1 = 0
            if (r0 != 0) goto L21
        L19:
            r1 = 1
            r3.A06 = r4
            if (r2 != 0) goto L21
            r0 = 0
            r3.A04 = r0
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942Auf.A04(X.ApQ):boolean");
    }

    public final boolean A05(C1822Arm c1822Arm, C2K7 c2k7, List list, int i, int i2, int i3, boolean z) {
        boolean z2 = !this.A07.A03(c1822Arm);
        this.A07 = c1822Arm;
        if (!C7384Etj.areEqual(this.A09, list)) {
            this.A09 = list;
            z2 = true;
        }
        if (this.A01 != i) {
            this.A01 = i;
            z2 = true;
        }
        if (this.A00 != i2) {
            this.A00 = i2;
            z2 = true;
        }
        if (this.A0D != z) {
            this.A0D = z;
            z2 = true;
        }
        if (!C7384Etj.areEqual(this.A08, c2k7)) {
            this.A08 = c2k7;
            z2 = true;
        }
        if (this.A02 == i3) {
            return z2;
        }
        this.A02 = i3;
        return true;
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        G0U g0uA00 = this.A0G;
        if (g0uA00 == null) {
            g0uA00 = C2294BSu.A00(this, 46);
            this.A0G = g0uA00;
        }
        AbstractC1564Ale.A07(interfaceC0857A6e, this.A06);
        C1964AvG c1964AvG = this.A04;
        if (c1964AvG != null) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A0f, c1964AvG.A01);
            InterfaceC0857A6e.A01(AbstractC1671Anw.A0N, interfaceC0857A6e, c1964AvG.A02);
        }
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0R, interfaceC0857A6e, null, C2294BSu.A00(this, 47));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0S, interfaceC0857A6e, null, C2294BSu.A00(this, 48));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A00, interfaceC0857A6e, null, C2293BSt.A00(this, 4));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A08, interfaceC0857A6e, null, g0uA00);
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:3:0x0007, B:5:0x0021, B:6:0x0038, B:8:0x003c, B:10:0x0046, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:18:0x0066, B:20:0x0071, B:30:0x00de, B:27:0x00d2, B:29:0x00d6, B:35:0x00f7, B:37:0x0102, B:38:0x0105, B:40:0x0109, B:42:0x010f, B:44:0x011d, B:46:0x0127, B:47:0x012e, B:48:0x0139, B:50:0x013d, B:51:0x0141, B:52:0x0151, B:54:0x0155, B:55:0x015a, B:58:0x0181, B:59:0x018b, B:33:0x00ed, B:23:0x0079, B:25:0x0091, B:26:0x0093, B:22:0x0075), top: B:63:0x0007 }] */
    @Override // X.InterfaceC1356Ahh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi AQV(X.AXY r28, X.C3TG r29, long r30) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942Auf.AQV(X.AXY, X.3TG, long):X.Abi");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    @Override // X.InterfaceC1332AhJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(X.C16Z r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942Auf.draw(X.16Z):void");
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return A01(c3tf).A02(c3tf.getLayoutDirection(), i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AbstractC2060AxX.A00(C1944Aui.A01(A01(c3tf), c3tf.getLayoutDirection()).AHR());
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return A01(c3tf).A02(c3tf.getLayoutDirection(), i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AbstractC2060AxX.A00(C1944Aui.A01(A01(c3tf), c3tf.getLayoutDirection()).AHj());
    }
}
