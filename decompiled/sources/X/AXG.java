package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AXG extends AX2 implements C1Z2 {
    public C1298Agj A00;
    public C1299Agk A01;
    public String A02;
    public Function0<Unit> A03;
    public HoC A04;
    public HoC A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AXI A09;
    public final AXI<HoC> A0A;

    public AXG(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, String str, String str2, Function0 function0, Function0 function02, boolean z, boolean z2, boolean z3) {
        super(c3uh, interfaceC1072AWd, c1yd, str2, function0, z2, z3);
        this.A02 = str;
        this.A03 = function02;
        this.A06 = z;
        this.A0A = AXJ.A00();
        this.A09 = AXJ.A00();
    }

    public static final void A02(AXG axg, boolean z) {
        if (z) {
            axg.A00 = null;
            HoC hoC = axg.A04;
            if (hoC != null) {
                hoC.A5w(null);
            }
            axg.A04 = null;
            axg.A07 = false;
        } else {
            axg.A01 = null;
            HoC hoC2 = axg.A05;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            axg.A05 = null;
            axg.A08 = false;
        }
        axg.A0P(z);
    }

    @Override // X.InterfaceC1447AjG
    public final void AS5() {
        A02(this, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AXG r23) {
        /*
            r14 = r23
            X.AXI<X.HoC> r11 = r14.A0A
            java.lang.Object[] r10 = r11.A04
            long[] r8 = r11.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            r23 = 7
            r21 = -1
            r6 = 0
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r17 = 128(0x80, double:6.32E-322)
            r9 = 8
            if (r7 < 0) goto L52
            r5 = 0
        L1c:
            r15 = r8[r5]
            long r3 = r15 ^ r21
            long r3 = r3 << r23
            long r1 = r15 & r3
            long r1 = r1 & r19
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L4b
            int r0 = X.C8j3.A0E(r5, r7)
            r12 = 255(0xff, double:1.26E-321)
            int r4 = 8 - r0
            r3 = 0
        L33:
            if (r3 >= r4) goto L48
            long r1 = r15 & r12
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 >= 0) goto L44
            java.lang.Object r0 = X.C8j3.A11(r10, r5, r3)
            X.HoC r0 = (X.HoC) r0
            r0.A5w(r6)
        L44:
            long r15 = r15 >> r9
            int r3 = r3 + 1
            goto L33
        L48:
            if (r4 != r9) goto L54
            goto L4d
        L4b:
            r12 = 255(0xff, double:1.26E-321)
        L4d:
            if (r5 == r7) goto L54
            int r5 = r5 + 1
            goto L1c
        L52:
            r12 = 255(0xff, double:1.26E-321)
        L54:
            r11.A09()
            X.AXI r8 = r14.A09
            long[] r7 = r8.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L8f
            r5 = 0
        L61:
            r10 = r7[r5]
            long r3 = r10 ^ r21
            long r3 = r3 << r23
            long r1 = r10 & r3
            long r1 = r1 & r19
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L8a
            int r4 = X.C8j4.A07(r5, r6)
            r3 = 0
        L74:
            if (r3 >= r4) goto L88
            long r1 = r10 & r12
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 >= 0) goto L84
            java.lang.String r1 = "job"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L84:
            long r10 = r10 >> r9
            int r3 = r3 + 1
            goto L74
        L88:
            if (r4 != r9) goto L8f
        L8a:
            if (r5 == r6) goto L8f
            int r5 = r5 + 1
            goto L61
        L8f:
            r8.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXG.A01(X.AXG):void");
    }

    @Override // X.AX2
    public final void A0O(InterfaceC0857A6e interfaceC0857A6e) {
        if (this.A03 != null) {
            AbstractC1564Ale.A0B(interfaceC0857A6e, this.A02, C2292BSs.A00(this, 9));
        }
    }

    @Override // X.AX2, X.InterfaceC1447AjG
    public final void ATZ(AX8 ax8, EnumC1080AXj enumC1080AXj) {
        boolean z;
        super.ATZ(ax8, enumC1080AXj);
        if (enumC1080AXj != EnumC1080AXj.A04) {
            if (enumC1080AXj != EnumC1080AXj.A02 || this.A00 == null || this.A07) {
                return;
            }
            List<C1298Agj> list = ((C1303Ago) ax8).A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1298Agj c1298AgjA0Z = C8j4.A0Z(list, i);
                if (c1298AgjA0Z.A00 && !c1298AgjA0Z.equals(this.A00)) {
                    z = true;
                }
            }
            return;
        }
        int i2 = 0;
        if (this.A00 == null) {
            List<C1298Agj> list2 = ((C1303Ago) ax8).A02;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C1298Agj c1298AgjA0Z2 = C8j4.A0Z(list2, i3);
                if (!c1298AgjA0Z2.A06 && c1298AgjA0Z2.A05) {
                    C1298Agj c1298AgjA0Z3 = C8j4.A0Z(list2, 0);
                    c1298AgjA0Z3.A00 = true;
                    this.A00 = c1298AgjA0Z3;
                    if (super.A09) {
                        this.A07 = false;
                        A0M(c1298AgjA0Z3);
                        if (this.A03 != null) {
                            this.A04 = AnonymousClass001.A11(BU2.A0O(this, null, 5), getCoroutineScope());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        boolean z2 = this.A07;
        List<C1298Agj> list3 = ((C1303Ago) ax8).A02;
        int size3 = list3.size();
        int i4 = 0;
        if (z2) {
            while (i4 < size3) {
                C1298Agj c1298AgjA0Z4 = C8j4.A0Z(list3, i4);
                if (!c1298AgjA0Z4.A06 || c1298AgjA0Z4.A05) {
                    int size4 = list3.size();
                    while (i2 < size4) {
                        C8j4.A0Z(list3, i2).A00 = true;
                        i2++;
                    }
                    return;
                }
                i4++;
            }
        } else {
            while (i4 < size3) {
                C1298Agj c1298AgjA0Z5 = C8j4.A0Z(list3, i4);
                if (c1298AgjA0Z5.A00 || !c1298AgjA0Z5.A06 || c1298AgjA0Z5.A05) {
                    float fALr = ARZ.A00(this).ALr();
                    int size5 = list3.size();
                    while (i2 < size5) {
                        C1298Agj c1298AgjA0Z6 = C8j4.A0Z(list3, i2);
                        long j = c1298AgjA0Z6.A02;
                        C1298Agj c1298Agj = this.A00;
                        C7384Etj.A0X(c1298Agj);
                        float fAbs = Math.abs(AWx.A00(AWx.A04(j, c1298Agj.A02)));
                        z = true;
                        boolean zA1N = AnonymousClass002.A1N((fAbs > fALr ? 1 : (fAbs == fALr ? 0 : -1)));
                        if (!c1298AgjA0Z6.A00 && !zA1N) {
                            i2++;
                        }
                    }
                    return;
                }
                i4++;
            }
        }
        C8j4.A0Z(list3, 0).A00 = true;
        C1298Agj c1298Agj2 = this.A00;
        C7384Etj.A0X(c1298Agj2);
        if (super.A09) {
            A0K(c1298Agj2.A02, true);
            if (!this.A07) {
                super.A08.invoke();
            }
        }
        this.A00 = null;
        HoC hoC = this.A04;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.A04 = null;
        this.A07 = false;
        return;
        A02(this, z);
    }

    @Override // X.AX2, X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        super.onViewConfigurationChange();
        A02(this, false);
    }

    @Override // X.AX2, X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        boolean z;
        super.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
        if (enumC1080AXj != EnumC1080AXj.A04) {
            if (enumC1080AXj != EnumC1080AXj.A02 || this.A01 == null || this.A08) {
                return;
            }
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            z = false;
            for (int i = 0; i < size; i++) {
                C1299Agk c1299AgkA0h = C8j3.A0h(list, i);
                if (!c1299AgkA0h.A03() || c1299AgkA0h.equals(this.A01)) {
                }
            }
            return;
        }
        z = false;
        z = false;
        if (this.A01 == null) {
            if (TapGestureDetectorKt.A09(c1247Afe, true, false)) {
                C1299Agk c1299AgkA0h2 = C8j3.A0h(c1247Afe.A05, 0);
                c1299AgkA0h2.A02();
                this.A01 = c1299AgkA0h2;
                if (super.A09) {
                    this.A08 = false;
                    A0N(c1299AgkA0h2);
                    if (this.A03 != null) {
                        this.A05 = AnonymousClass001.A11(BU2.A0O(this, null, 4), getCoroutineScope());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (c1247Afe.A02 == 2 && !this.A08 && super.A09 && this.A03 != null) {
            this.A05 = C3cI.A15(this.A05);
            Function0<Unit> function0 = this.A03;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.A06) {
                ((C0dx) ARZ.A01(Am0.A08, this)).AXr(0);
            }
            this.A08 = true;
        }
        boolean z2 = this.A08;
        List<C1299Agk> list2 = c1247Afe.A05;
        int size2 = list2.size();
        int i2 = 0;
        if (z2) {
            while (i2 < size2) {
                if (!AbstractC1078AXh.A03(C8j3.A0h(list2, i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        C1299Agk.A00(list2, i3);
                    }
                    return;
                }
                i2++;
            }
        } else {
            while (i2 < size2) {
                if (!AbstractC1078AXh.A02(C8j3.A0h(list2, i2))) {
                    long jA0I = A0I(j);
                    int size4 = list2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        C1299Agk c1299AgkA0h3 = C8j3.A0h(list2, i4);
                        if (!c1299AgkA0h3.A03() && !AbstractC1078AXh.A04(c1299AgkA0h3, j, jA0I)) {
                        }
                    }
                    return;
                }
                i2++;
            }
        }
        C1299Agk.A00(list2, 0);
        C1299Agk c1299Agk = this.A01;
        C7384Etj.A0X(c1299Agk);
        if (super.A09) {
            A0K(c1299Agk.A0A, false);
            if (!this.A08) {
                super.A08.invoke();
            }
        }
        this.A01 = null;
        HoC hoC = this.A05;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.A05 = null;
        this.A08 = false;
        return;
        A02(this, z);
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        A01(this);
    }
}
