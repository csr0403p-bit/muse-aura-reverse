package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Asd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1864Asd extends AbstractC1437Aj6 implements InterfaceC1356Ahh, InterfaceC1476Ajj, InterfaceC1332AhJ, InterfaceC1487Aju, C1Z2 {
    public int A00;
    public int A01;
    public C1110AYw A02;
    public EnumC1108AYu A03;
    public C1085AXt A04;
    public BPp A05;
    public C1881Asv A06;
    public TransformedTextFieldState A07;
    public TextFieldSelectionState A08;
    public InterfaceC2026Awf A09;
    public C1EQ A0A;
    public Au3 A0B;
    public HoC A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public AaC A0G = new AaC(-1.0f, -1.0f, -1.0f, -1.0f);
    public final AXs A0H;
    public final AbE A0I;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1864Asd r8, X.AXN r9, X.EnumC1820Arj r10, int r11, int r12, long r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864Asd.A01(X.Asd, X.AXN, X.Arj, int, int, long):void");
    }

    public static final void A00(C1864Asd c1864Asd) {
        if (c1864Asd.A05 == null) {
            c1864Asd.A05 = new BPp(AnonymousClass001.A1X(ARZ.A01(Am0.A03, c1864Asd)));
            AaD.A00(c1864Asd);
        }
        c1864Asd.A0C = AnonymousClass001.A11(BU2.A0O(c1864Asd, null, 34), c1864Asd.getCoroutineScope());
    }

    public static final boolean A02(C1864Asd c1864Asd) {
        if (!c1864Asd.A0F) {
            return false;
        }
        if (!c1864Asd.A0E && !c1864Asd.A0D) {
            return false;
        }
        C1EQ c1eq = c1864Asd.A0A;
        return ((c1eq instanceof C1326AhD) && ((C1326AhD) c1eq).A00 == 16) ? false : true;
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        this.A0I.A4Y(interfaceC0857A6e);
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

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        EnumC1108AYu enumC1108AYu = this.A03;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
        int iA03 = Constraints.A03(j);
        if (enumC1108AYu == enumC1108AYu2) {
            AZE azeAQW = c3tg.AQW(Constraints.A05(iA03, Constraints.A01(j), Constraints.A02(j), Integer.MAX_VALUE));
            int iMin = Math.min(azeAQW.A00, Constraints.A00(j));
            return AXY.A01(axy, new BTS(axy, this, azeAQW, iMin, 2), azeAQW.A01, iMin);
        }
        AZE azeAQW2 = c3tg.AQW(AnonymousClass004.A0x(j, iA03, Integer.MAX_VALUE));
        int iMin2 = Math.min(azeAQW2.A01, Constraints.A01(j));
        return AXY.A01(axy, new BTS(axy, this, azeAQW2, iMin2, 1), iMin2, azeAQW2.A00);
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A06.A04.Af8(interfaceC1497Ak4);
        ((AVg) this.A0I).A06.ATW(interfaceC1497Ak4);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        int iA02;
        int iA01;
        c16z.A9O();
        At0 at0A07 = this.A07.A07();
        C1958Aux c1958AuxA01 = C1881Asv.A01(this.A06);
        if (c1958AuxA01 != null) {
            HxE<C1867Ash, Au3> hxE = at0A07.A04;
            if (hxE != null) {
                int i = hxE.first.A00;
                long j = hxE.second.A00;
                if (!Au3.A04(j)) {
                    C1710Aot c1710AotA07 = c1958AuxA01.A07(Au3.A02(j), Au3.A01(j));
                    if (i == 1) {
                        InterfaceC1829Art interfaceC1829Art = c1958AuxA01.A04.A04.A02.A0D;
                        C1EQ c1eqAD4 = interfaceC1829Art.AD4();
                        if (c1eqAD4 != null) {
                            c16z.A9c(c1eqAD4, null, c1710AotA07, C16a.A00, 0.2f, 3);
                        } else {
                            long jADn = interfaceC1829Art.ADn();
                            if (jADn == 16) {
                                jADn = B6A.A01;
                            }
                            c16z.A9d(null, c1710AotA07, C16a.A00, 1.0f, 3, HxS.A04(HDi.A0O[(int) (jADn & 63)], B6A.A03(jADn), B6A.A02(jADn), B6A.A01(jADn), B6A.A00(jADn) * 0.2f));
                        }
                    } else {
                        C8j3.A1H(c1710AotA07, c16z, ((C1BT) ARZ.A01(C1BR.A00, this)).A00);
                    }
                }
            }
            long j2 = at0A07.A00;
            if (Au3.A04(j2)) {
                AbstractC1827Arr.A00(AW9.A01(c16z), c1958AuxA01);
                if (hxE == null) {
                    C1EQ c1eq = this.A0A;
                    boolean zA02 = A02(this);
                    BPp bPp = this.A05;
                    TextFieldSelectionState textFieldSelectionState = this.A08;
                    if (bPp != null) {
                        float fAFn = bPp.A01.AFn();
                        if (fAFn != 0.0f && zA02) {
                            AaC aaCA0D = textFieldSelectionState.A0D();
                            float f = aaCA0D.A01;
                            float f2 = aaCA0D.A02;
                            float f3 = f2 - f;
                            c16z.A9W(c1eq, null, null, f3, fAFn, 0, 3, AnonymousClass005.A0J(f + (f3 / 2.0f), aaCA0D.A03), AnonymousClass005.A0J(f + C8j3.A00(f2, f), aaCA0D.A00));
                        }
                    }
                }
            } else {
                if (hxE == null && (iA02 = Au3.A02(j2)) != (iA01 = Au3.A01(j2))) {
                    C8j3.A1H(c1958AuxA01.A07(iA02, iA01), c16z, ((C1BT) ARZ.A01(C1BR.A00, this)).A00);
                }
                AbstractC1827Arr.A00(AW9.A01(c16z), c1958AuxA01);
            }
            this.A0I.draw(c16z);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        if (this.A0E && A02(this)) {
            A00(this);
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1864Asd(X.C1110AYw r6, X.EnumC1108AYu r7, X.C1085AXt r8, X.C1881Asv r9, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r10, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r11, X.InterfaceC2026Awf r12, X.C1EQ r13, boolean r14, boolean r15, boolean r16) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0E = r14
            r5.A0D = r15
            r5.A06 = r9
            r5.A07 = r10
            r5.A08 = r11
            r5.A0A = r13
            r0 = r16
            r5.A0F = r0
            r5.A02 = r6
            r5.A03 = r7
            r5.A04 = r8
            r5.A09 = r12
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.AaC r0 = new X.AaC
            r0.<init>(r1, r1, r1, r1)
            r5.A0G = r0
            if (r14 != 0) goto L29
            r1 = 0
            if (r15 == 0) goto L2a
        L29:
            r1 = 1
        L2a:
            X.AVg r0 = new X.AVg
            r0.<init>(r9, r10, r11, r1)
            r5.A0G(r0)
            r5.A0I = r0
            X.AXt r4 = r5.A04
            r1 = 0
            r0 = 1
            X.BU1 r3 = new X.BU1
            r3.<init>(r5, r1, r0)
            r0 = 2
            X.BU1 r2 = new X.BU1
            r2.<init>(r5, r1, r0)
            r0 = 27
            X.BSu r1 = X.C2294BSu.A00(r5, r0)
            X.AXs r0 = new X.AXs
            r0.<init>(r4, r3, r2, r1)
            r5.A0G(r0)
            r5.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864Asd.<init>(X.AYw, X.AYu, X.AXt, X.Asv, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, X.Awf, X.1EQ, boolean, boolean, boolean):void");
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
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
