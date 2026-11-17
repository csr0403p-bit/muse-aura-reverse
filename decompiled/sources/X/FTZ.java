package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FTZ implements FUF {
    public final FU8 A02;
    public HsC<C8102FTp> A01 = new C3111Bya(30);
    public final ArrayList<C8102FTp> A04 = C3cG.A0h();
    public final ArrayList<C8102FTp> A05 = C3cG.A0h();
    public int A00 = 0;
    public final FUG A03 = new FUG(this);

    public FTZ(FU8 fu8) {
        this.A02 = fu8;
    }

    @Override // X.FUF
    public final void AZu(C8102FTp c8102FTp) {
        c8102FTp.A03 = null;
        this.A01.AaC(c8102FTp);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList<X.FTp> r4 = r8.A05
            int r2 = r4.size()
            r1 = 1
            int r2 = r2 - r1
        L8:
            r7 = 8
            if (r2 < 0) goto L91
            java.lang.Object r3 = r4.get(r2)
            X.FTp r3 = (X.C8102FTp) r3
            int r0 = r3.A00
            r6 = 2
            int r5 = r3.A02
            if (r0 != r7) goto L70
            int r0 = r3.A01
            if (r5 >= r0) goto L6b
            int r5 = r3.A02
            int r0 = r3.A01
        L21:
            if (r9 < r5) goto L4d
            if (r9 > r0) goto L4d
            int r0 = r3.A02
            if (r5 != r0) goto L3c
            if (r10 != r1) goto L36
            int r0 = r3.A01
            int r0 = r0 + 1
        L2f:
            r3.A01 = r0
        L31:
            int r9 = r9 + 1
        L33:
            int r2 = r2 + (-1)
            goto L8
        L36:
            if (r10 != r6) goto L31
            int r0 = r3.A01
            int r0 = r0 - r1
            goto L2f
        L3c:
            if (r10 != r1) goto L47
            int r0 = r3.A02
            int r0 = r0 + 1
        L42:
            r3.A02 = r0
        L44:
            int r9 = r9 + (-1)
            goto L33
        L47:
            if (r10 != r6) goto L44
            int r0 = r3.A02
            int r0 = r0 - r1
            goto L42
        L4d:
            int r0 = r3.A02
            if (r9 >= r0) goto L33
            if (r10 != r1) goto L60
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            int r0 = r3.A01
            int r0 = r0 + 1
        L5d:
            r3.A01 = r0
            goto L33
        L60:
            if (r10 != r6) goto L33
            int r0 = r3.A02
            int r0 = r0 - r1
            r3.A02 = r0
            int r0 = r3.A01
            int r0 = r0 - r1
            goto L5d
        L6b:
            int r5 = r3.A01
            int r0 = r3.A02
            goto L21
        L70:
            if (r5 > r9) goto L82
            int r0 = r3.A00
            if (r0 != r1) goto L7a
            int r0 = r3.A01
            int r9 = r9 - r0
            goto L33
        L7a:
            int r0 = r3.A00
            if (r0 != r6) goto L33
            int r0 = r3.A01
            int r9 = r9 + r0
            goto L33
        L82:
            if (r10 != r1) goto L8b
            int r0 = r3.A02
            int r0 = r0 + 1
        L88:
            r3.A02 = r0
            goto L33
        L8b:
            if (r10 != r6) goto L33
            int r0 = r3.A02
            int r0 = r0 - r1
            goto L88
        L91:
            int r3 = X.AbstractC7607F5u.A0I(r4, r1)
        L95:
            if (r3 < 0) goto Lb7
            java.lang.Object r2 = r4.get(r3)
            X.FTp r2 = (X.C8102FTp) r2
            int r0 = r2.A00
            int r1 = r2.A01
            if (r0 != r7) goto Lb4
            int r0 = r2.A02
            if (r1 == r0) goto Lab
            int r0 = r2.A01
            if (r0 >= 0) goto Lb1
        Lab:
            r4.remove(r3)
            r8.AZu(r2)
        Lb1:
            int r3 = r3 + (-1)
            goto L95
        Lb4:
            if (r1 > 0) goto Lb1
            goto Lab
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTZ.A00(int, int):int");
    }

    public static final int A01(FTZ ftz, int i, int i2) {
        ArrayList<C8102FTp> arrayList = ftz.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C8102FTp c8102FTp = arrayList.get(i2);
            int i3 = c8102FTp.A00;
            int i4 = c8102FTp.A02;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c8102FTp.A01;
                } else {
                    if (c8102FTp.A02 < i) {
                        i--;
                    }
                    if (c8102FTp.A01 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (c8102FTp.A00 == 2) {
                if (i < c8102FTp.A02 + c8102FTp.A01) {
                    return -1;
                }
                i -= c8102FTp.A01;
            } else if (c8102FTp.A00 == 1) {
                i += c8102FTp.A01;
            }
            i2++;
        }
        return i;
    }

    private void A02(C8102FTp c8102FTp) {
        int i;
        int i2 = c8102FTp.A00;
        if (i2 == 1 || i2 == 8) {
            throw C60O.A0i("should not dispatch add or move for pre layout");
        }
        int iA00 = A00(c8102FTp.A02, i2);
        int i3 = c8102FTp.A02;
        int i4 = c8102FTp.A00;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw BV5.A0O(c8102FTp, "op should be remove or update.");
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c8102FTp.A01; i6++) {
            int iA002 = A00(c8102FTp.A02 + (i * i6), i4);
            i4 = c8102FTp.A00;
            if (i4 == 2 ? iA002 != iA00 : !(i4 == 4 && iA002 == iA00 + 1)) {
                C8102FTp c8102FTpARd = ARd(c8102FTp.A03, i4, iA00, i5);
                A04(c8102FTpARd, i3);
                AZu(c8102FTpARd);
                i4 = c8102FTp.A00;
                if (i4 == 4) {
                    i3 += i5;
                }
                iA00 = iA002;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = c8102FTp.A03;
        AZu(c8102FTp);
        if (i5 > 0) {
            C8102FTp c8102FTpARd2 = ARd(obj, c8102FTp.A00, iA00, i5);
            A04(c8102FTpARd2, i3);
            AZu(c8102FTpARd2);
        }
    }

    private void A03(C8102FTp c8102FTp) {
        this.A05.add(c8102FTp);
        int i = c8102FTp.A00;
        if (i == 1) {
            this.A02.ARe(c8102FTp.A02, c8102FTp.A01);
            return;
        }
        if (i == 2) {
            FU8 fu8 = this.A02;
            int i2 = c8102FTp.A02;
            int i3 = c8102FTp.A01;
            RecyclerView recyclerView = ((FTY) fu8).A00;
            recyclerView.A0u(i2, i3, false);
            recyclerView.A0X = true;
            return;
        }
        if (i != 4) {
            if (i != 8) {
                throw BV5.A0O(c8102FTp, "Unknown update op type for ");
            }
            this.A02.ARf(c8102FTp.A02, c8102FTp.A01);
        } else {
            this.A02.AQA(c8102FTp.A03, c8102FTp.A02, c8102FTp.A01);
        }
    }

    private final void A04(C8102FTp c8102FTp, int i) {
        FU8 fu8 = this.A02;
        FTY fty = (FTY) fu8;
        FTY.A00(c8102FTp, fty);
        int i2 = c8102FTp.A00;
        if (i2 != 2) {
            if (i2 != 4) {
                throw C60O.A0i("only remove and update ops can be dispatched in first pass");
            }
            fu8.AQA(c8102FTp.A03, i, c8102FTp.A01);
            return;
        }
        int i3 = c8102FTp.A01;
        RecyclerView recyclerView = fty.A00;
        recyclerView.A0u(i, i3, true);
        recyclerView.A0X = true;
        recyclerView.A13.A00 += i3;
    }

    private boolean A06(int i) {
        ArrayList<C8102FTp> arrayList = this.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8102FTp c8102FTp = arrayList.get(i2);
            if (c8102FTp.A00 != 8) {
                if (c8102FTp.A00 == 1) {
                    int i3 = c8102FTp.A02;
                    int i4 = i3 + c8102FTp.A01;
                    while (i3 < i4) {
                        if (A01(this, i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (A01(this, c8102FTp.A01, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A07() {
        ArrayList<C8102FTp> arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FTY.A00(arrayList.get(i), (FTY) this.A02);
        }
        A05(this, arrayList);
        this.A00 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0252 A[PHI: r5
  0x0252: PHI (r5v2 X.FTp) = (r5v1 X.FTp), (r5v4 X.FTp), (r5v1 X.FTp) binds: [B:110:0x01a8, B:156:0x024b, B:116:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc A[PHI: r12
  0x00fc: PHI (r12v7 boolean) = (r12v5 boolean), (r12v9 boolean) binds: [B:59:0x00f8, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[PHI: r1
  0x0129: PHI (r1v30 int) = (r1v23 int), (r1v33 int) binds: [B:90:0x0163, B:74:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTZ.A09():void");
    }

    @Override // X.FUF
    public final C8102FTp ARd(Object obj, int i, int i2, int i3) {
        C8102FTp c8102FTpA2t = this.A01.A2t();
        if (c8102FTpA2t == null) {
            c8102FTpA2t = new C8102FTp();
        }
        c8102FTpA2t.A00 = i;
        c8102FTpA2t.A02 = i2;
        c8102FTpA2t.A01 = i3;
        c8102FTpA2t.A03 = obj;
        return c8102FTpA2t;
    }

    public static final void A05(FTZ ftz, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ftz.AZu((C8102FTp) list.get(i));
        }
        list.clear();
    }

    public final void A08() {
        A07();
        ArrayList<C8102FTp> arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8102FTp c8102FTp = arrayList.get(i);
            int i2 = c8102FTp.A00;
            if (i2 == 1) {
                FU8 fu8 = this.A02;
                FTY.A00(c8102FTp, (FTY) fu8);
                fu8.ARe(c8102FTp.A02, c8102FTp.A01);
            } else if (i2 == 2) {
                FTY fty = (FTY) this.A02;
                FTY.A00(c8102FTp, fty);
                int i3 = c8102FTp.A02;
                int i4 = c8102FTp.A01;
                RecyclerView recyclerView = fty.A00;
                recyclerView.A0u(i3, i4, true);
                recyclerView.A0X = true;
                recyclerView.A13.A00 += i4;
            } else if (i2 == 4) {
                FU8 fu82 = this.A02;
                FTY.A00(c8102FTp, (FTY) fu82);
                fu82.AQA(c8102FTp.A03, c8102FTp.A02, c8102FTp.A01);
            } else if (i2 == 8) {
                FU8 fu83 = this.A02;
                FTY.A00(c8102FTp, (FTY) fu83);
                fu83.ARf(c8102FTp.A02, c8102FTp.A01);
            }
        }
        A05(this, arrayList);
        this.A00 = 0;
    }
}
