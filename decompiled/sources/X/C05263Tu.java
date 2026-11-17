package X;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.3Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05263Tu implements InterfaceC1380AiA {
    public final float A00;
    public final C3TQ A01;
    public final boolean A02;

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C3bO(6), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(list, new C3bO(4), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C3bO(5), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(list, new C3bO(7), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc A[SYNTHETIC] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(final X.AXY r33, java.util.List<? extends X.C3TG> r34, long r35) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05263Tu.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    public C05263Tu(C3TQ c3tq, float f, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = c3tq;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3TF;Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    private final int A00(C3TF c3tf, List list, G0V g0v, int i) {
        Object obj;
        int iA00;
        int iA08;
        Object obj2;
        int iA082;
        int iA083;
        int iA0F;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (C7384Etj.areEqual(C19W.A00((C3Tr) obj), "Leading")) {
                break;
            }
            i2++;
        }
        C3Tr c3Tr = (C3Tr) obj;
        if (c3Tr != null) {
            iA00 = C3Tr.A00(c3Tr, i);
            iA08 = AnonymousClass007.A08(c3Tr, g0v, i);
        } else {
            iA00 = i;
            iA08 = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (C7384Etj.areEqual(C19W.A00((C3Tr) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        C3Tr c3Tr2 = (C3Tr) obj2;
        if (c3Tr2 != null) {
            iA00 = C3Tr.A00(c3Tr2, iA00);
            iA082 = AnonymousClass007.A08(c3Tr2, g0v, i);
        } else {
            iA082 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                break;
            }
            Object obj3 = list.get(i4);
            if (C7384Etj.areEqual(C19W.A00((C3Tr) obj3), "Label")) {
                iA083 = obj3 != null ? AnonymousClass007.A08(obj3, g0v, iA00) : 0;
            } else {
                i4++;
            }
        }
        int size4 = list.size();
        for (int i5 = 0; i5 < size4; i5++) {
            Object obj4 = list.get(i5);
            if (C7384Etj.areEqual(C19W.A00((C3Tr) obj4), "TextField")) {
                Integer numValueOf = Integer.valueOf(iA00);
                int iA0F2 = AnonymousClass006.A0F(obj4, numValueOf, g0v);
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj5 = list.get(i6);
                    if (C7384Etj.areEqual(C19W.A00((C3Tr) obj5), "Hint")) {
                        iA0F = obj5 != null ? AnonymousClass006.A0F(obj5, numValueOf, g0v) : 0;
                    } else {
                        i6++;
                    }
                }
                boolean zA1N = AnonymousClass002.A1N(iA083);
                long jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
                float fAEm = c3tf.AEm();
                float f = 2.0f * fAEm;
                C1DP c1dp = (C1DP) this.A01;
                float f2 = c1dp.A03 * fAEm;
                float f3 = c1dp.A00 * fAEm;
                int iMax = Math.max(iA0F2, iA0F);
                if (zA1N) {
                    f2 = iA083 + f;
                }
                return AYL.A01(jA06, Math.max(Ab3.A01(f2 + iMax + f3), Math.max(iA08, iA082)));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    public static final int A01(List list, G0V g0v, int i) {
        int iA0F;
        int iA0F2;
        int iA0F3;
        int iA0F4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (C7384Etj.areEqual(C19W.A00((C3Tr) obj), "TextField")) {
                Integer numValueOf = Integer.valueOf(i);
                int iA0F5 = AnonymousClass006.A0F(obj, numValueOf, g0v);
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj2 = list.get(i3);
                    if (C7384Etj.areEqual(C19W.A00((C3Tr) obj2), "Label")) {
                        iA0F = obj2 != null ? AnonymousClass006.A0F(obj2, numValueOf, g0v) : 0;
                    } else {
                        i3++;
                    }
                }
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    Object obj3 = list.get(i4);
                    if (C7384Etj.areEqual(C19W.A00((C3Tr) obj3), "Trailing")) {
                        iA0F2 = obj3 != null ? AnonymousClass006.A0F(obj3, numValueOf, g0v) : 0;
                    } else {
                        i4++;
                    }
                }
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    }
                    Object obj4 = list.get(i5);
                    if (C7384Etj.areEqual(C19W.A00((C3Tr) obj4), "Leading")) {
                        iA0F3 = obj4 != null ? AnonymousClass006.A0F(obj4, numValueOf, g0v) : 0;
                    } else {
                        i5++;
                    }
                }
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj5 = list.get(i6);
                    if (C7384Etj.areEqual(C19W.A00((C3Tr) obj5), "Hint")) {
                        iA0F4 = obj5 != null ? AnonymousClass006.A0F(obj5, numValueOf, g0v) : 0;
                    } else {
                        i6++;
                    }
                }
                return AYL.A02(AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), AnonymousClass007.A05(iA0F, iA0F4, iA0F5, iA0F3, iA0F2));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
