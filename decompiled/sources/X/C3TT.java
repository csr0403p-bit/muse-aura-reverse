package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* renamed from: X.3TT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TT implements InterfaceC1380AiA {
    public final float A00;
    public final C3TQ A01;
    public final boolean A02;
    public final G0U<AWA, Unit> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/3TF;Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    private final int A00(C3TF c3tf, List list, G0V g0v, int i) {
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
            long j = C1A3.A00;
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
            long j2 = C1A3.A00;
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
                iA083 = obj5 != null ? AnonymousClass007.A08(obj5, g0v, C3WD.A01(this.A00, i2, i)) : 0;
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
            long j3 = C1A3.A00;
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
            long j4 = C1A3.A00;
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
                return C1A3.A00(this.A01, this.A00, c3tf.AEm(), iA08, iA082, iA084, iA085, iA0F2, iA083, iA0F, iA086, AbstractC046219w.A00);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3TF;Ljava/util/List<+LX/3Tr;>;ILX/G0V<-LX/3Tr;-Ljava/lang/Integer;Ljava/lang/Integer;>;)I */
    private final int A01(C3TF c3tf, List list, G0V g0v, int i) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj4), "Leading")) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj5), "Prefix")) {
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
                    if (C7384Etj.areEqual(AbstractC046219w.A00((C3Tr) obj6), "Suffix")) {
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
                float f = this.A00;
                long j = AbstractC046219w.A00;
                float fAEm = c3tf.AEm();
                C3TQ c3tq = this.A01;
                long j2 = C1A3.A00;
                int i9 = iA0F4 + iA0F5;
                return Math.max(AnonymousClass007.A05(iA0F6 + i9, C3WD.A01(f, iA0F, 0), iA0F7 + i9, iA0F3, iA0F2), Math.max(C1DP.A00((C1DP) c3tq, fAEm, f, iA0F), Constraints.A03(j)));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C05423bo(10), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C05423bo(11), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d7  */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(X.AXY r44, java.util.List<? extends X.C3TG> r45, long r46) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TT.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C05423bo(12), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C05423bo(13), i);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/AWA;Lkotlin/Unit;>;ZFLX/3TQ;)V */
    public C3TT(C3TQ c3tq, G0U g0u, float f, boolean z) {
        this.A03 = g0u;
        this.A02 = z;
        this.A00 = f;
        this.A01 = c3tq;
    }
}
