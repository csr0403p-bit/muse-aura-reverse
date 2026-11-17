package X;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* renamed from: X.Aug, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1943Aug {
    public C1085AXt A00;
    public InterfaceC2026Awf A01;
    public InterfaceC1961AvD A02;
    public C1518AkS A03;
    public AWx A04;
    public C0dx A05;
    public InterfaceC1497Ak4 A06;
    public C1JY A07;
    public G0U<? super ApQ, Unit> A08;
    public G0U<? super C1940Aud, Unit> A09;
    public C3UX A0A;
    public boolean A0B;
    public boolean A0C;
    public final C1949Aun A0D;
    public final MutableState<Boolean> A0E;
    public final MutableState<C1940Aud> A0F;
    public final MutableState A0G;
    public final MutableState A0H;
    public final MutableState A0I;
    public final MutableState A0J;
    public final MutableState A0K;
    public final MutableState A0L;
    public final MutableState A0M;
    public final MutableState A0N;
    public final C1BO A0O;

    public static int A00(Av4 av4, C1962AvE c1962AvE, long j) {
        return Integer.valueOf(av4.A03(c1962AvE.A01)).compareTo(Integer.valueOf(av4.A03(Long.valueOf(j).longValue())));
    }

    public static final long A02(C1943Aug c1943Aug, InterfaceC1497Ak4 interfaceC1497Ak4, long j) {
        InterfaceC1497Ak4 interfaceC1497Ak42 = c1943Aug.A06;
        if (interfaceC1497Ak42 == null || !interfaceC1497Ak42.isAttached()) {
            return 9205357640488583168L;
        }
        return c1943Aug.A08().APm(interfaceC1497Ak4, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C1943Aug r16) {
        /*
            r6 = r16
            androidx.compose.runtime.MutableState<X.Aud> r0 = r6.A0F
            java.lang.Object r11 = r0.getValue()
            X.Aud r11 = (X.C1940Aud) r11
            X.Ak4 r9 = r6.A06
            r5 = 0
            if (r11 == 0) goto L37
            X.AvE r0 = r11.A01
            if (r0 == 0) goto Lae
            X.AxB r1 = X.AXH.A00(r0, r6)
        L17:
            X.AvE r0 = r11.A00
            if (r0 == 0) goto Lab
            X.AxB r10 = X.AXH.A00(r0, r6)
        L1f:
            if (r1 == 0) goto La8
            X.Ak4 r14 = r1.AGx()
        L25:
            if (r10 == 0) goto La6
            X.Ak4 r8 = r10.AGx()
        L2b:
            if (r9 == 0) goto L37
            boolean r0 = r9.isAttached()
            if (r0 == 0) goto L37
            if (r14 != 0) goto L42
            if (r8 != 0) goto L42
        L37:
            androidx.compose.runtime.MutableState r0 = r6.A0N
            r0.Af8(r5)
        L3c:
            androidx.compose.runtime.MutableState r0 = r6.A0K
            r0.Af8(r5)
            return
        L42:
            X.AaC r7 = X.AbstractC1703Aoi.A00(r9)
            r15 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r14 == 0) goto La4
            r0 = 1
            long r0 = r1.AG2(r11, r0)
            long r3 = r0 & r12
            int r2 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r2 == 0) goto La4
            long r0 = r9.APm(r14, r0)
            X.AWx r4 = X.AWx.A0B(r0)
            long r2 = r4.A00
            androidx.compose.runtime.MutableState r0 = r6.A0J
            java.lang.Object r1 = r0.getValue()
            X.AWv r0 = X.AWv.A04
            if (r1 == r0) goto L77
            boolean r0 = X.AbstractC1703Aoi.A01(r7, r2)
            if (r0 == 0) goto La4
        L77:
            androidx.compose.runtime.MutableState r0 = r6.A0N
            r0.Af8(r4)
            if (r8 == 0) goto L3c
            r0 = 0
            long r0 = r10.AG2(r11, r0)
            long r12 = r12 & r0
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 == 0) goto L3c
            long r0 = r9.APm(r8, r0)
            X.AWx r4 = X.AWx.A0B(r0)
            long r2 = r4.A00
            androidx.compose.runtime.MutableState r0 = r6.A0J
            java.lang.Object r1 = r0.getValue()
            X.AWv r0 = X.AWv.A03
            if (r1 == r0) goto La2
            boolean r0 = X.AbstractC1703Aoi.A01(r7, r2)
            if (r0 == 0) goto L3c
        La2:
            r5 = r4
            goto L3c
        La4:
            r4 = r5
            goto L77
        La6:
            r8 = r5
            goto L2b
        La8:
            r14 = r5
            goto L25
        Lab:
            r10 = r5
            goto L1f
        Lae:
            r1 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1943Aug.A04(X.Aug):void");
    }

    public static final void A05(C1943Aug c1943Aug) {
        if (MutableState.A0A(c1943Aug.A0L)) {
            if (!c1943Aug.A0C || !MutableState.A0A((MutableState) c1943Aug.A0E)) {
                c1943Aug.A00.A00();
            } else if (c1943Aug.A0O.getValue() != null) {
                c1943Aug.A00.A01();
            }
        }
    }

    public static final void A06(C1943Aug c1943Aug, boolean z) {
        MutableState<Boolean> mutableState = c1943Aug.A0E;
        if (MutableState.A0A((MutableState) mutableState) != z) {
            MutableState.A09(z, mutableState);
            A05(c1943Aug);
        }
    }

    public static final boolean A07(Ay9 ay9, C1943Aug c1943Aug, long j, long j2, boolean z) {
        InterfaceC1961AvD c1954Aus;
        C1958Aux c1958AuxInvoke;
        Integer num;
        Integer num2;
        Integer num3;
        C1962AvE c1962AvE;
        int iA01;
        int iA012;
        C1962AvE c1962AvE2;
        C1962AvE c1962AvE3;
        C1962AvE c1962AvE4;
        c1943Aug.A0J.Af8(z ? AWv.A04 : AWv.A03);
        c1943Aug.A0G.Af8(AWx.A0B(j));
        InterfaceC1497Ak4 interfaceC1497Ak4A08 = c1943Aug.A08();
        C1949Aun c1949Aun = c1943Aug.A0D;
        List<InterfaceC2043AxB> listA00 = c1949Aun.A00(interfaceC1497Ak4A08);
        Av8 av8 = AbstractC2074Axp.A00;
        Av8 av82 = new Av8();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        Av8.A02(av82, 6);
        int size = listA00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            av82.A04(((C1941Aue) listA00.get(i2)).A02, i2);
        }
        long j3 = j2 & 9223372034707292159L;
        C1940Aud value = j3 == 9205357640488583168L ? null : c1943Aug.A0F.getValue();
        InterfaceC1961AvD interfaceC1961AvD = null;
        Av8 av83 = new Av8();
        Av8.A02(av83, 6);
        ArrayList arrayListA0h = C3cG.A0h();
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int size2 = listA00.size();
        while (true) {
            int i6 = i;
            if (i6 >= size2) {
                break;
            }
            C1941Aue c1941Aue = (C1941Aue) listA00.get(i6);
            InterfaceC1497Ak4 interfaceC1497Ak4AGx = c1941Aue.AGx();
            if (interfaceC1497Ak4AGx != null && (c1958AuxInvoke = c1941Aue.A03.invoke()) != null) {
                long jAPm = interfaceC1497Ak4A08.APm(interfaceC1497Ak4AGx, 0L);
                long jA04 = AWx.A04(j, jAPm);
                long jA042 = j3 == 9205357640488583168L ? 9205357640488583168L : AWx.A04(j2, jAPm);
                long j4 = c1941Aue.A02;
                long j5 = c1958AuxInvoke.A02;
                float f = (int) (j5 >> 32);
                float f2 = (int) (j5 & 4294967295L);
                float fA00 = AnonymousClass001.A00(jA04);
                Integer numA03 = fA00 < 0.0f ? C79.A00 : fA00 > f ? C79.A0C : C79.A01;
                Integer num4 = numA03;
                float fA01 = AnonymousClass001.A01(jA04, 4294967295L);
                Integer num5 = fA01 < 0.0f ? C79.A00 : fA01 > f2 ? C79.A0C : C79.A01;
                Integer numA032 = num5;
                if (z) {
                    if (value == null || (c1962AvE4 = value.A00) == null) {
                        numA03 = A03(numA03, num5);
                    } else {
                        int iA00 = A00(av82, c1962AvE4, j4);
                        numA03 = iA00 < 0 ? C79.A00 : iA00 > 0 ? C79.A0C : C79.A01;
                    }
                    num2 = num4;
                    num = numA03;
                    num3 = numA03;
                } else {
                    if (value == null || (c1962AvE = value.A01) == null) {
                        numA032 = A03(numA03, num5);
                    } else {
                        int iA002 = A00(av82, c1962AvE, j4);
                        numA032 = iA002 < 0 ? C79.A00 : iA002 > 0 ? C79.A0C : C79.A01;
                    }
                    num = num5;
                    num2 = numA032;
                    num3 = numA032;
                }
                Integer numA033 = A03(num4, num5);
                if (numA033 == C79.A01 || numA033 != num3) {
                    int iA003 = C1870Ask.A00(c1958AuxInvoke);
                    if (z) {
                        iA012 = A01(c1958AuxInvoke, jA04);
                        if (value == null || (c1962AvE3 = value.A00) == null) {
                            iA01 = iA012;
                        } else {
                            int iA004 = A00(av82, c1962AvE3, j4);
                            if (iA004 < 0) {
                                iA003 = 0;
                            } else if (iA004 <= 0) {
                                iA003 = c1962AvE3.A00;
                            }
                            iA01 = iA003;
                        }
                    } else {
                        iA01 = A01(c1958AuxInvoke, jA04);
                        if (value == null || (c1962AvE2 = value.A01) == null) {
                            iA012 = iA01;
                        } else {
                            int iA005 = A00(av82, c1962AvE2, j4);
                            if (iA005 < 0) {
                                iA003 = 0;
                            } else if (iA005 <= 0) {
                                iA003 = c1962AvE2.A00;
                            }
                            iA012 = iA003;
                        }
                    }
                    i5 += 2;
                    AvA avA = new AvA(c1958AuxInvoke, i5, iA012, iA01, (9223372034707292159L & jA042) == 9205357640488583168L ? -1 : A01(c1958AuxInvoke, jA042), j4);
                    if (i3 == -1) {
                        int iIntValue = A03(num2, numA032).intValue();
                        if (iIntValue == 0) {
                            i3 = i5 - 1;
                        } else if (iIntValue == 1) {
                            i3 = i5;
                        }
                    }
                    if (i4 == -1) {
                        int iIntValue2 = A03(numA03, num).intValue();
                        if (iIntValue2 == 0) {
                            i4 = i5 - 1;
                        } else if (iIntValue2 == 1) {
                            i4 = i5;
                        }
                    }
                    av83.A04(j4, arrayListA0h.size());
                    arrayListA0h.add(avA);
                }
            }
            i++;
        }
        int i7 = i5 + 1;
        int size3 = arrayListA0h.size();
        if (size3 != 0) {
            if (size3 != 1) {
                if (i3 == -1) {
                    i3 = i7;
                }
                if (i4 == -1) {
                    i4 = i7;
                }
                c1954Aus = new C1946Auk(av83, value, arrayListA0h, i3, i4, z);
            } else {
                AvA avA2 = (AvA) AbstractC0878AGe.A0J(arrayListA0h);
                if (i3 == -1) {
                    i3 = i7;
                }
                if (i4 == -1) {
                    i4 = i7;
                }
                c1954Aus = new C1954Aus(avA2, value, i3, i4, z);
            }
            interfaceC1961AvD = c1954Aus;
        }
        if (interfaceC1961AvD == null || !interfaceC1961AvD.AfY(c1943Aug.A02)) {
            return false;
        }
        C1940Aud c1940AudA44 = ay9.A44(interfaceC1961AvD);
        if (!MutableState.A0B(c1943Aug.A0F, c1940AudA44)) {
            if (MutableState.A0A((MutableState) c1943Aug.A0E)) {
                List<InterfaceC2043AxB> list = c1949Aun.A0B;
                int size4 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        break;
                    }
                    if (list.get(i8).ALZ().length() > 0) {
                        C0dx c0dx = c1943Aug.A05;
                        if (c0dx != null) {
                            c0dx.AXr(9);
                        }
                    } else {
                        i8++;
                    }
                }
            }
            c1949Aun.A0A.Af8(interfaceC1961AvD.A82(c1940AudA44));
            c1943Aug.A09.invoke(c1940AudA44);
            c1943Aug.A0B = false;
        }
        c1943Aug.A02 = interfaceC1961AvD;
        return true;
    }

    public final InterfaceC1497Ak4 A08() {
        InterfaceC1497Ak4 interfaceC1497Ak4 = this.A06;
        if (interfaceC1497Ak4 == null) {
            throw C60O.A0i("null coordinates");
        }
        if (interfaceC1497Ak4.isAttached()) {
            return interfaceC1497Ak4;
        }
        AbstractC1061ATk.A00("unattached coordinates");
        throw F60.createAndThrow();
    }

    public final HxE<ApQ, Au3> A09() {
        int iA02;
        int length;
        if (this.A0F.getValue() != null) {
            C1949Aun c1949Aun = this.A0D;
            if (!c1949Aun.A0B.isEmpty()) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                List<InterfaceC2043AxB> listA00 = c1949Aun.A00(A08());
                ListIterator<InterfaceC2043AxB> listIterator = listA00.listIterator(listA00.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    InterfaceC2043AxB interfaceC2043AxBPrevious = listIterator.previous();
                    MutableState mutableState = c1949Aun.A0A;
                    C1940Aud c1940AudA01 = AXH.A01(mutableState, interfaceC2043AxBPrevious);
                    if (c1940AudA01 != null && c1940AudA01.A01.A00 != c1940AudA01.A00.A00) {
                        int iNextIndex = listIterator.nextIndex();
                        if (iNextIndex != -1) {
                            int size = listA00.size();
                            int i = 0;
                            iA02 = -1;
                            length = -1;
                            while (i < size) {
                                InterfaceC2043AxB interfaceC2043AxB = listA00.get(i);
                                C1940Aud c1940AudA012 = AXH.A01(mutableState, interfaceC2043AxB);
                                if (c1940AudA012 != null) {
                                    ApQ apQALZ = interfaceC2043AxB.ALZ();
                                    long jA00 = AbstractC1815ArZ.A00(c1940AudA012.A01.A00, c1940AudA012.A00.A00);
                                    boolean z = i >= iNextIndex;
                                    if (iA02 == -1) {
                                        iA02 = Au3.A02(jA00);
                                        c1731ApSA0W.A08(apQALZ, 0, iA02);
                                    }
                                    int iA022 = Au3.A02(jA00);
                                    int iA01 = Au3.A01(jA00);
                                    c1731ApSA0W.A08(apQALZ, iA022, iA01);
                                    if (z) {
                                        length = c1731ApSA0W.A00.length();
                                        c1731ApSA0W.A08(apQALZ, iA01, apQALZ.length());
                                    } else {
                                        c1731ApSA0W.A00.append('\n');
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
                iA02 = -1;
                length = -1;
                ApQ apQA04 = c1731ApSA0W.A04();
                if (iA02 != -1 && length != -1) {
                    return C3cG.A0r(apQA04, C8j3.A0j(AbstractC1815ArZ.A00(iA02, length)));
                }
            }
        }
        return null;
    }

    public final void A0A() {
        G0U<? super ApQ, Unit> g0u;
        if (this.A0F.getValue() != null) {
            C1949Aun c1949Aun = this.A0D;
            MutableState mutableState = c1949Aun.A0A;
            if (((AXH) mutableState.getValue()).A01 != 0) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                List<InterfaceC2043AxB> listA00 = c1949Aun.A00(A08());
                ListIterator<InterfaceC2043AxB> listIterator = listA00.listIterator(listA00.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    C1940Aud c1940AudA01 = AXH.A01(mutableState, listIterator.previous());
                    if (c1940AudA01 != null && c1940AudA01.A01.A00 != c1940AudA01.A00.A00) {
                        int iNextIndex = listIterator.nextIndex();
                        if (iNextIndex != -1) {
                            int size = listA00.size();
                            int i = 0;
                            while (i < size) {
                                InterfaceC2043AxB interfaceC2043AxB = listA00.get(i);
                                C1940Aud c1940AudA012 = AXH.A01(mutableState, interfaceC2043AxB);
                                if (c1940AudA012 != null) {
                                    ApQ apQALZ = interfaceC2043AxB.ALZ();
                                    long jA00 = AbstractC1815ArZ.A00(c1940AudA012.A01.A00, c1940AudA012.A00.A00);
                                    boolean z = i >= iNextIndex;
                                    c1731ApSA0W.A08(apQALZ, Au3.A02(jA00), Au3.A01(jA00));
                                    if (!z) {
                                        c1731ApSA0W.A00.append('\n');
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
                ApQ apQA04 = c1731ApSA0W.A04();
                if (apQA04.length() <= 0 || (g0u = this.A08) == null) {
                    return;
                }
                g0u.invoke(apQA04);
            }
        }
    }

    public final void A0B() {
        C0dx c0dx;
        this.A0D.A0A.Af8(AXJ.A00);
        this.A0C = false;
        A05(this);
        if (this.A0F.getValue() != null) {
            this.A09.invoke(null);
            if (!MutableState.A0A((MutableState) this.A0E) || (c0dx = this.A05) == null) {
                return;
            }
            c0dx.AXr(9);
        }
    }

    public final boolean A0C() {
        C1940Aud value = this.A0F.getValue();
        if (value != null) {
            C1962AvE c1962AvE = value.A01;
            C1962AvE c1962AvE2 = value.A00;
            if (!C7384Etj.areEqual(c1962AvE, c1962AvE2)) {
                if (c1962AvE.A01 != c1962AvE2.A01) {
                    C1949Aun c1949Aun = this.A0D;
                    List<InterfaceC2043AxB> listA00 = c1949Aun.A00(A08());
                    int size = listA00.size();
                    for (int i = 0; i < size; i++) {
                        C1940Aud c1940AudA01 = AXH.A01(c1949Aun.A0A, listA00.get(i));
                        if (c1940AudA01 == null || c1940AudA01.A01.A00 == c1940AudA01.A00.A00) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C1943Aug(C1949Aun c1949Aun) {
        this.A0D = c1949Aun;
        AGE age = AGE.A00;
        this.A0F = C3cG.A08(age, null);
        this.A0E = C3cG.A08(age, AnonymousClass001.A0i());
        this.A09 = new C2297BSx(this, 15);
        this.A00 = new C1085AXt(0);
        this.A03 = new C1518AkS();
        this.A0L = C3cG.A08(age, false);
        this.A0O = new BBP(null, C2293BSt.A00(this, 12));
        this.A0M = C3cG.A08(AGG.A00, Unit.INSTANCE);
        this.A0H = AWx.A0A(age, 0L);
        this.A0I = AWx.A0A(age, 0L);
        this.A0N = C3cG.A08(age, null);
        this.A0K = C3cG.A08(age, null);
        this.A0J = C3cG.A08(age, null);
        this.A0G = C3cG.A08(age, null);
        c1949Aun.A03 = new C2297BSx(this, 16);
        c1949Aun.A06 = new C2299BSz(this, 2);
        c1949Aun.A05 = new C2296BSw(this, 9);
        c1949Aun.A07 = new G2l() { // from class: X.Avb
            @Override // X.G2l
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                C1943Aug c1943Aug = this.A00;
                boolean zA1X = AnonymousClass001.A1X(obj);
                InterfaceC1497Ak4 interfaceC1497Ak4 = (InterfaceC1497Ak4) obj2;
                boolean zA1X2 = AnonymousClass001.A1X(obj5);
                long jA02 = C1943Aug.A02(c1943Aug, interfaceC1497Ak4, ((AWx) obj3).A00);
                long jA022 = C1943Aug.A02(c1943Aug, interfaceC1497Ak4, ((AWx) obj4).A00);
                C1943Aug.A06(c1943Aug, zA1X);
                return Boolean.valueOf(C1943Aug.A07((Ay9) obj6, c1943Aug, jA02, jA022, zA1X2));
            }
        };
        c1949Aun.A01 = C2293BSt.A00(this, 11);
        c1949Aun.A04 = new C2297BSx(this, 9);
        c1949Aun.A02 = new C2297BSx(this, 10);
    }

    public static final int A01(C1958Aux c1958Aux, long j) {
        float fA03 = C8j5.A03(j);
        if (fA03 <= 0.0f) {
            return 0;
        }
        C1956Auv c1956Auv = c1958Aux.A03;
        return fA03 >= c1956Auv.A00 ? C1870Ask.A00(c1958Aux) : c1956Auv.A0B(j);
    }

    public static final Integer A03(Integer num, Integer num2) {
        int iIntValue = num2.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        return C79.A01;
                    }
                }
            }
            return C79.A0C;
        }
        return C79.A00;
    }
}
