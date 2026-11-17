package X;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* renamed from: X.3TU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TU implements InterfaceC1380AiA {
    public final float A00;
    public final C3TQ A01;
    public final boolean A02;
    public final G0U<AWA, Unit> A03;

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C3bO(3), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C3bO(1), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A00(c3tf, list, new C3bO(0), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return A01(c3tf, list, new C3bO(2), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022b A[EDGE_INSN: B:78:0x022b->B:70:0x022b BREAK  A[LOOP:3: B:41:0x011f->B:50:0x015e], SYNTHETIC] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(final X.AXY r27, java.util.List<? extends X.C3TG> r28, long r29) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TU.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/AWA;Lkotlin/Unit;>;ZFLX/3TQ;)V */
    public C3TU(C3TQ c3tq, G0U g0u, float f, boolean z) {
        this.A03 = g0u;
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
                iA083 = obj3 != null ? AnonymousClass007.A08(obj3, g0v, C3WD.A01(this.A00, iA00, i)) : 0;
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
                float f = this.A00;
                long jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
                float fAEm = c3tf.AEm();
                C3TQ c3tq = this.A01;
                AbstractC045819r abstractC045819r = AbstractC045819r.$redex_init_class;
                int iMax = Math.max(iA0F2, Math.max(iA0F, C3WD.A01(f, iA083, 0)));
                C1DP c1dp = (C1DP) c3tq;
                float f2 = c1dp.A03 * fAEm;
                return AYL.A01(jA06, Math.max(iA08, Math.max(iA082, Ab3.A01(AnonymousClass003.A01(f, f2, Math.max(f2, iA083 / 2.0f)) + iMax + (c1dp.A00 * fAEm)))));
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
                float f = this.A00;
                long jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
                float fAEm = c3tf.AEm();
                C3TQ c3tq = this.A01;
                AbstractC045819r abstractC045819r = AbstractC045819r.$redex_init_class;
                return AYL.A02(jA06, Math.max(AnonymousClass007.A05(C3WD.A01(f, iA0F, 0), iA0F4, iA0F5, iA0F3, iA0F2), C1DP.A00((C1DP) c3tq, fAEm, f, iA0F)));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
