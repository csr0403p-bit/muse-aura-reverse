package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.3TV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TV implements InterfaceC1380AiA {
    public final float A00;
    public final C3TQ A01;
    public final boolean A02;

    public static final int A00(C3TQ c3tq, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        boolean zA1N = AnonymousClass002.A1N(i2);
        C1DP c1dp = (C1DP) c3tq;
        float fA01 = (c1dp.A03 + c1dp.A00) * f2;
        if (zA1N) {
            BRg bRg = AbstractC046219w.A01;
            fA01 = AnonymousClass003.A01(f, 16.0f * 2.0f * f2, fA01);
        }
        int[] iArr = {i7, i5, i6, C3WD.A01(f, i2, 0)};
        int i9 = 0;
        do {
            i = Math.max(i, iArr[i9]);
            i9++;
        } while (i9 < 4);
        return Math.max(Constraints.A02(j), Math.max(i3, Math.max(i4, Ab3.A01(fA01 + ((int) Math.round(i2 * f)) + i))) + i8);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3TF;Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    private final int A01(C3TF c3tf, List list, G0V g0v, int i) {
        Object obj;
        int i2;
        int iA08;
        Object obj2;
        int iA082;
        int iA083;
        Object obj3;
        int iA084;
        Object obj4;
        int iA085;
        int iA0F;
        int iA086;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj), "Leading")) {
                break;
            }
            i3++;
        }
        C3Tr c3Tr = (C3Tr) obj;
        if (c3Tr != null) {
            int iAQO = c3Tr.AQO(Integer.MAX_VALUE);
            i2 = i;
            if (i != Integer.MAX_VALUE) {
                i2 = i - iAQO;
            }
            iA08 = AnonymousClass007.A08(c3Tr, g0v, i);
        } else {
            i2 = i;
            iA08 = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        C3Tr c3Tr2 = (C3Tr) obj2;
        if (c3Tr2 != null) {
            int iAQO2 = c3Tr2.AQO(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iAQO2;
            }
            iA082 = AnonymousClass007.A08(c3Tr2, g0v, i);
        } else {
            iA082 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                break;
            }
            Object obj5 = list.get(i5);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj5), "Label")) {
                iA083 = obj5 != null ? AnonymousClass007.A08(obj5, g0v, i2) : 0;
            } else {
                i5++;
            }
        }
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj3), "Prefix")) {
                break;
            }
            i6++;
        }
        C3Tr c3Tr3 = (C3Tr) obj3;
        if (c3Tr3 != null) {
            iA084 = AnonymousClass007.A08(c3Tr3, g0v, i2);
            int iAQO3 = c3Tr3.AQO(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iAQO3;
            }
        } else {
            iA084 = 0;
        }
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj4), "Suffix")) {
                break;
            }
            i7++;
        }
        C3Tr c3Tr4 = (C3Tr) obj4;
        if (c3Tr4 != null) {
            iA085 = AnonymousClass007.A08(c3Tr4, g0v, i2);
            int iAQO4 = c3Tr4.AQO(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iAQO4;
            }
        } else {
            iA085 = 0;
        }
        int size6 = list.size();
        for (int i8 = 0; i8 < size6; i8++) {
            Object obj6 = list.get(i8);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj6), "TextField")) {
                Integer numValueOf = Integer.valueOf(i2);
                int iA0F2 = AnonymousClass006.A0F(obj6, numValueOf, g0v);
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj7), "Hint")) {
                        iA0F = obj7 != null ? AnonymousClass006.A0F(obj7, numValueOf, g0v) : 0;
                    } else {
                        i9++;
                    }
                }
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        break;
                    }
                    Object obj8 = list.get(i10);
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj8), "Supporting")) {
                        iA086 = obj8 != null ? AnonymousClass007.A08(obj8, g0v, i) : 0;
                    } else {
                        i10++;
                    }
                }
                return A00(this.A01, this.A00, c3tf.AEm(), iA0F2, iA083, iA08, iA082, iA084, iA085, iA0F, iA086, AbstractC046219w.A00);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C05423bo(15), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A02(list, new C05423bo(16), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0268  */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(X.AXY r47, java.util.List<? extends X.C3TG> r48, long r49) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TV.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C05423bo(17), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A02(list, new C05423bo(18), i);
    }

    public C3TV(C3TQ c3tq, float f, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = c3tq;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    public static final int A02(List list, G0V g0v, int i) {
        int iA0F;
        int iA0F2;
        int iA0F3;
        int iA0F4;
        int iA0F5;
        int iA0F6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj), "TextField")) {
                Integer numValueOf = Integer.valueOf(i);
                int iA0F7 = AnonymousClass006.A0F(obj, numValueOf, g0v);
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj2 = list.get(i3);
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj2), "Label")) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj3), "Trailing")) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj4), "Prefix")) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj5), "Suffix")) {
                        iA0F4 = obj5 != null ? AnonymousClass006.A0F(obj5, numValueOf, g0v) : 0;
                    } else {
                        i6++;
                    }
                }
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        break;
                    }
                    Object obj6 = list.get(i7);
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj6), "Leading")) {
                        iA0F5 = obj6 != null ? AnonymousClass006.A0F(obj6, numValueOf, g0v) : 0;
                    } else {
                        i7++;
                    }
                }
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj7 = list.get(i8);
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj7), "Hint")) {
                        iA0F6 = obj7 != null ? AnonymousClass006.A0F(obj7, numValueOf, g0v) : 0;
                    } else {
                        i8++;
                    }
                }
                int i9 = iA0F3 + iA0F4;
                return Math.max(AnonymousClass007.A05(iA0F6 + i9, iA0F, iA0F7 + i9, iA0F5, iA0F2), Constraints.A03(AbstractC046219w.A00));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
