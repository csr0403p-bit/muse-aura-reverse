package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AhR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1340AhR extends C1343AhU {
    public C1247Afe A00;
    public InterfaceC1497Ak4 A01;
    public boolean A04;
    public final AbstractC1439Aj8 A06;
    public final C1344AhV A07 = new C1344AhV();
    public final C1685AoO<C1299Agk> A05 = new C1685AoO<>(2);
    public boolean A02 = true;
    public boolean A03 = true;

    /* JADX WARN: Incorrect types in method signature: (LX/AoO<LX/Agk;>;LX/Ak4;LX/Ah5;Z)Z */
    @Override // X.C1343AhU
    public final boolean A03(C1685AoO c1685AoO, C1319Ah5 c1319Ah5, InterfaceC1497Ak4 interfaceC1497Ak4, boolean z) {
        C1299Agk c1299Agk;
        C1247Afe c1247Afe;
        boolean z2;
        int i;
        int i2;
        boolean zA03 = super.A03(c1685AoO, c1319Ah5, interfaceC1497Ak4, z);
        AbstractC1439Aj8 abstractC1439Aj8A00 = this.A06;
        boolean z3 = true;
        if (abstractC1439Aj8A00.isAttached) {
            C0910AHm c0910AHmA0W = null;
            do {
                if (abstractC1439Aj8A00 instanceof InterfaceC1348AhZ) {
                    this.A01 = AbstractC1414Aij.A06(abstractC1439Aj8A00, 16);
                } else if ((abstractC1439Aj8A00.kindSet & 16) != 0 && (abstractC1439Aj8A00 instanceof AbstractC1437Aj6)) {
                    int i3 = 0;
                    for (AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1437Aj6) abstractC1439Aj8A00).A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
                        if ((abstractC1439Aj8.kindSet & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                abstractC1439Aj8A00 = abstractC1439Aj8;
                            } else {
                                c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                                if (abstractC1439Aj8A00 != null) {
                                    c0910AHmA0W.A0G(abstractC1439Aj8A00);
                                    abstractC1439Aj8A00 = null;
                                }
                                c0910AHmA0W.A0G(abstractC1439Aj8);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                abstractC1439Aj8A00 = AbstractC1414Aij.A00(c0910AHmA0W);
            } while (abstractC1439Aj8A00 != null);
            if (this.A01 != null) {
                int iA00 = c1685AoO.A00();
                for (int i4 = 0; i4 < iA00; i4++) {
                    long jA02 = c1685AoO.A02(i4);
                    C1299Agk c1299Agk2 = (C1299Agk) c1685AoO.A03(i4);
                    C1344AhV c1344AhV = this.A07;
                    int i5 = c1344AhV.A00;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            break;
                        }
                        if (c1344AhV.A01[i6] == jA02) {
                            long j = c1299Agk2.A0B;
                            long j2 = c1299Agk2.A0A;
                            if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                List list = c1299Agk2.A02;
                                if (list == null) {
                                    list = C0881AGi.A00;
                                }
                                ArrayList arrayListA0t = C60Q.A0t(list);
                                int size = list.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    C1301Agm c1301Agm = (C1301Agm) list.get(i7);
                                    long j3 = c1301Agm.A03;
                                    if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                        long j4 = c1301Agm.A04;
                                        InterfaceC1497Ak4 interfaceC1497Ak42 = this.A01;
                                        C7384Etj.A0X(interfaceC1497Ak42);
                                        arrayListA0t.add(new C1301Agm(c1301Agm.A01, j4, interfaceC1497Ak42.APm(interfaceC1497Ak4, j3), c1301Agm.A02, c1301Agm.A00));
                                    }
                                }
                                C1685AoO<C1299Agk> c1685AoO2 = this.A05;
                                InterfaceC1497Ak4 interfaceC1497Ak43 = this.A01;
                                C7384Etj.A0X(interfaceC1497Ak43);
                                long jAPm = interfaceC1497Ak43.APm(interfaceC1497Ak4, j);
                                InterfaceC1497Ak4 interfaceC1497Ak44 = this.A01;
                                C7384Etj.A0X(interfaceC1497Ak44);
                                long jAPm2 = interfaceC1497Ak44.APm(interfaceC1497Ak4, j2);
                                long j5 = c1299Agk2.A08;
                                long j6 = c1299Agk2.A0E;
                                boolean z4 = c1299Agk2.A0F;
                                long j7 = c1299Agk2.A0C;
                                boolean z5 = c1299Agk2.A0G;
                                int i8 = c1299Agk2.A07;
                                long j8 = c1299Agk2.A0D;
                                float f = c1299Agk2.A05;
                                float f2 = c1299Agk2.A06;
                                long j9 = c1299Agk2.A09;
                                long j10 = c1299Agk2.A00;
                                C1299Agk c1299Agk3 = new C1299Agk(f, f2, i8, j5, j6, jAPm2, j7, jAPm, j8, j9, z4, z5, false);
                                c1299Agk3.A02 = arrayListA0t;
                                c1299Agk3.A00 = j10;
                                C1299Agk c1299Agk4 = c1299Agk2.A01;
                                if (c1299Agk4 == null) {
                                    c1299Agk4 = c1299Agk2;
                                }
                                c1299Agk3.A01 = c1299Agk4;
                                C1299Agk c1299Agk5 = c1299Agk2.A01;
                                if (c1299Agk5 == null) {
                                    c1299Agk5 = c1299Agk2;
                                }
                                c1299Agk3.A01 = c1299Agk5;
                                c1685AoO2.A08(jA02, c1299Agk3);
                            }
                        } else {
                            i6++;
                        }
                    }
                }
                C1685AoO<C1299Agk> c1685AoO3 = this.A05;
                boolean zA1M = AnonymousClass002.A1M(c1685AoO3.A00());
                C1344AhV c1344AhV2 = this.A07;
                if (zA1M) {
                    c1344AhV2.A00 = 0;
                    super.A01.A09();
                    return true;
                }
                int i9 = c1344AhV2.A00;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    if (c1685AoO.A01(c1344AhV2.A01[i9]) < 0) {
                        int i10 = i9;
                        int i11 = c1344AhV2.A00;
                        if (i9 < i11) {
                            int i12 = i11 - 1;
                            while (i10 < i12) {
                                long[] jArr = c1344AhV2.A01;
                                int i13 = i10 + 1;
                                jArr[i10] = jArr[i13];
                                i10 = i13;
                            }
                            c1344AhV2.A00 = i11 - 1;
                        }
                    }
                }
                ArrayList arrayListA11 = C60O.A11(c1685AoO3.A00());
                int iA002 = c1685AoO3.A00();
                for (int i14 = 0; i14 < iA002; i14++) {
                    arrayListA11.add(c1685AoO3.A03(i14));
                }
                C1247Afe c1247Afe2 = new C1247Afe(c1319Ah5, arrayListA11);
                List<C1299Agk> list2 = c1247Afe2.A05;
                int size2 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        c1299Agk = null;
                        break;
                    }
                    c1299Agk = list2.get(i15);
                    if (c1319Ah5.A00(c1299Agk.A08)) {
                        break;
                    }
                    i15++;
                }
                C1299Agk c1299Agk6 = c1299Agk;
                if (c1299Agk6 != null) {
                    if (z) {
                        z2 = this.A02;
                        if (!z2 && (c1299Agk6.A0F || c1299Agk6.A0G)) {
                            InterfaceC1497Ak4 interfaceC1497Ak45 = this.A01;
                            C7384Etj.A0X(interfaceC1497Ak45);
                            long jAKd = interfaceC1497Ak45.AKd();
                            long j11 = c1299Agk6.A0A;
                            float fA00 = AnonymousClass001.A00(j11);
                            float fA01 = AnonymousClass001.A01(j11, 4294967295L);
                            z2 = !(AnonymousClass002.A1N((fA00 > ((int) (jAKd >> 32)) ? 1 : (fA00 == ((int) (jAKd >> 32)) ? 0 : -1))) | C8j3.A1R((fA00 > 0.0f ? 1 : (fA00 == 0.0f ? 0 : -1))) | C8j3.A1R((fA01 > 0.0f ? 1 : (fA01 == 0.0f ? 0 : -1))) | (fA01 > ((float) ((int) (jAKd & 4294967295L)))));
                            this.A02 = z2;
                        }
                    } else {
                        this.A02 = false;
                        z2 = false;
                    }
                    boolean z6 = this.A04;
                    if (z2 == z6 || !((i2 = c1247Afe2.A00) == 3 || i2 == 4 || i2 == 5)) {
                        int i16 = c1247Afe2.A00;
                        if (i16 != 4 ? !(i16 != 5 || !z2 || !c1299Agk6.A0F) : !(!z6 || this.A03)) {
                            i = 3;
                        }
                    } else {
                        i = 5;
                        if (z2) {
                            i = 4;
                        }
                    }
                    c1247Afe2.A00 = i;
                }
                if (!zA03 && c1247Afe2.A00 == 3 && (c1247Afe = this.A00) != null) {
                    List<C1299Agk> list3 = c1247Afe.A05;
                    if (list3.size() == list2.size()) {
                        int size3 = list2.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                z3 = false;
                                break;
                            }
                            if (C8j3.A0h(list3, i17).A0A != C8j3.A0h(list2, i17).A0A) {
                                break;
                            }
                            i17++;
                        }
                    }
                }
                this.A00 = c1247Afe2;
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Node(modifierNode=");
        sbA0x.append(this.A06);
        sbA0x.append(", children=");
        sbA0x.append(super.A01);
        sbA0x.append(", pointerIds=");
        return AnonymousClass007.A0Z(this.A07, sbA0x);
    }

    public C1340AhR(AbstractC1439Aj8 abstractC1439Aj8) {
        this.A06 = abstractC1439Aj8;
    }

    @Override // X.C1343AhU
    public final void A02(C1319Ah5 c1319Ah5) {
        super.A02(c1319Ah5);
        C1247Afe c1247Afe = this.A00;
        if (c1247Afe != null) {
            this.A04 = this.A02;
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1299Agk c1299AgkA0h = C8j3.A0h(list, i);
                boolean z = c1299AgkA0h.A0F;
                boolean zA00 = c1319Ah5.A00(c1299AgkA0h.A08);
                boolean z2 = this.A02;
                if (!z && (!zA00 || !z2)) {
                    this.A07.A01(c1299AgkA0h.A08);
                }
            }
            this.A02 = false;
            this.A03 = AnonymousClass002.A1Q(c1247Afe.A00, 5);
        }
    }
}
