package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Auj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1945Auj extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj, InterfaceC1332AhJ {
    public int A00;
    public int A01;
    public int A02;
    public C1963AvF A03;
    public C1DN A04;
    public C1822Arm A05;
    public C1822Arm A06;
    public C2K7 A07;
    public String A08;
    public G0U<? super List<C1958Aux>, Boolean> A09;
    public boolean A0A;
    public C1948Aum A0B;
    public Map<AbstractC1493Ak0, Integer> A0C;

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        C1948Aum c1948AumA00;
        if (!this.isAttached) {
            return;
        }
        C1963AvF c1963AvF = this.A03;
        if (c1963AvF == null || !c1963AvF.A02 || (c1948AumA00 = c1963AvF.A00) == null) {
            c1948AumA00 = A00(this);
        }
        InterfaceC2006AwF interfaceC2006AwF = c1948AumA00.A07;
        if (interfaceC2006AwF == null) {
            StringBuilder sbA0x = C60O.A0x("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=");
            sbA0x.append(this.A0B);
            sbA0x.append(", textSubstitution=");
            throw C60O.A0i(AnonymousClass007.A0Z(this.A03, sbA0x));
        }
        InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(c16z);
        boolean z = c1948AumA00.A0E;
        if (z) {
            long j = c1948AumA00.A04;
            float fA0G = C8j3.A0G(j);
            float fA09 = AnonymousClass002.A09(j);
            interfaceC1327AhEA01.Ac2();
            interfaceC1327AhEA01.A6N(0.0f, 0.0f, fA0G, fA09, 1);
        }
        try {
            A02();
            C1822Arm c1822Arm = this.A05;
            if (c1822Arm == null) {
                c1822Arm = this.A06;
            }
            C1824Aro c1824Aro = c1822Arm.A02;
            BG3 bg3 = c1824Aro.A0C;
            if (bg3 == null) {
                bg3 = BG3.A02;
            }
            C1780Aqg c1780Aqg = c1824Aro.A03;
            if (c1780Aqg == null) {
                c1780Aqg = C1780Aqg.A03;
            }
            C16b c16b = c1824Aro.A04;
            if (c16b == null) {
                c16b = C16a.A00;
            }
            InterfaceC1829Art interfaceC1829Art = c1824Aro.A0D;
            C1EQ c1eqAD4 = interfaceC1829Art.AD4();
            if (c1eqAD4 != null) {
                interfaceC2006AwF.AXa(c1eqAD4, interfaceC1327AhEA01, c1780Aqg, c16b, bg3, interfaceC1829Art.getAlpha(), 3);
            } else {
                C1DN c1dn = this.A04;
                long jAO0 = c1dn != null ? c1dn.AO0() : B6A.A07;
                if (jAO0 == 16) {
                    jAO0 = interfaceC1829Art.ADn() != 16 ? interfaceC1829Art.ADn() : B6A.A01;
                }
                C1957Auw c1957Auw = (C1957Auw) interfaceC2006AwF;
                C1779Aqf c1779Aqf = c1957Auw.A02.A05;
                int i = c1779Aqf.A00;
                c1779Aqf.A02(jAO0);
                c1779Aqf.A04(c1780Aqg);
                c1779Aqf.A06(bg3);
                c1779Aqf.A05(c16b);
                c1779Aqf.A01(3);
                C1957Auw.A01(interfaceC1327AhEA01, c1957Auw);
                c1779Aqf.A01(i);
            }
            if (z) {
                interfaceC1327AhEA01.Abc();
            }
        } finally {
        }
    }

    public static final C1948Aum A00(C1945Auj c1945Auj) {
        C1822Arm c1822Arm = c1945Auj.A05;
        if (c1822Arm == null) {
            c1822Arm = c1945Auj.A06;
        }
        C1948Aum c1948Aum = c1945Auj.A0B;
        if (c1948Aum == null) {
            String str = c1945Auj.A08;
            c1948Aum = new C1948Aum(c1822Arm, c1945Auj.A07, str, c1945Auj.A02, c1945Auj.A00, c1945Auj.A01, c1945Auj.A0A);
            c1945Auj.A0B = c1948Aum;
        }
        C7384Etj.A0X(c1948Aum);
        return c1948Aum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.Arm, java.lang.Object] */
    private final boolean A02() {
        C1822Arm c1822Arm = this.A05;
        ?? r3 = this.A06;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = r3;
        AbstractC1235AfP.A01(this, "StyleOuterNode", new BT9(4, (Object) r3, c10543HqvA0z));
        this.A05 = (C1822Arm) c10543HqvA0z.element;
        if (c1822Arm == null) {
            return false;
        }
        return !c1822Arm.equals(r0);
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        G0U g0uA00 = this.A09;
        if (g0uA00 == null) {
            g0uA00 = C2294BSu.A00(this, 49);
            this.A09 = g0uA00;
        }
        String str = this.A08;
        C0881AGi c0881AGi = C0881AGi.A00;
        AbstractC1564Ale.A07(interfaceC0857A6e, new ApQ(str, c0881AGi));
        C1963AvF c1963AvF = this.A03;
        if (c1963AvF != null) {
            InterfaceC0857A6e.A01(AbstractC1671Anw.A0N, interfaceC0857A6e, c1963AvF.A02);
            interfaceC0857A6e.Aca(AbstractC1671Anw.A0f, new ApQ(c1963AvF.A01, c0881AGi));
        }
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0R, interfaceC0857A6e, null, C2297BSx.A00(this, 0));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0S, interfaceC0857A6e, null, C2297BSx.A00(this, 1));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A00, interfaceC0857A6e, null, C2293BSt.A00(this, 5));
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    @Override // X.InterfaceC1356Ahh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi AQV(X.AXY r16, X.C3TG r17, long r18) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1945Auj.AQV(X.AXY, X.3TG, long):X.Abi");
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    private final C1948Aum A01(C3TF c3tf) {
        C1948Aum c1948AumA00;
        if (A02()) {
            C1822Arm c1822Arm = this.A05;
            if (c1822Arm == null) {
                c1822Arm = this.A06;
            }
            AbstractC1439Aj8.A0H(A00(this), this, c1822Arm, this.A08);
        }
        C1963AvF c1963AvF = this.A03;
        if (c1963AvF == null || !c1963AvF.A02 || (c1948AumA00 = c1963AvF.A00) == null) {
            c1948AumA00 = A00(this);
        }
        c1948AumA00.A04(c3tf);
        return c1948AumA00;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return A01(c3tf).A03(c3tf.getLayoutDirection(), i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AbstractC2060AxX.A00(C1948Aum.A01(A01(c3tf), c3tf.getLayoutDirection()).AHR());
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return A01(c3tf).A03(c3tf.getLayoutDirection(), i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AbstractC2060AxX.A00(C1948Aum.A01(A01(c3tf), c3tf.getLayoutDirection()).AHj());
    }
}
