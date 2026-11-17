package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FF4 {
    public static final FF4 A00 = new FF4();

    public static final int A00(FDW fdw) {
        int i;
        C7384Etj.A0Y(fdw, 0);
        FDW fdwA0C = fdw.A0C(132);
        if (fdwA0C != null) {
            int i2 = fdwA0C.A05;
            if (i2 != 16372) {
                i = i2 == 24201 ? 68 : 35;
            }
            return fdwA0C.A07(i, 1);
        }
        return 1;
    }

    /* JADX WARN: Incorrect types in method signature: (I[IIZILjava/lang/Float;Landroid/graphics/Rect;)LX/HxE<Ljava/lang/Integer;Ljava/lang/Integer;>; */
    public static final HxE A02(Rect rect, Float f, int[] iArr, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int iA05;
        int iA052;
        C7384Etj.A0Y(rect, 6);
        int i6 = i3 + i2;
        int i7 = 0;
        while (i2 < i6) {
            i7 += iArr[i2];
            i2++;
        }
        if (i == 1) {
            i4 = rect.left;
            i5 = rect.right;
        } else {
            i4 = rect.top;
            i5 = rect.bottom;
        }
        int i8 = i7 - (i4 + i5);
        if (f == null || z) {
            iA05 = FF1.A00;
        } else {
            int iFloatValue = (int) (i8 * f.floatValue());
            int i9 = FF1.A00;
            iA05 = AbstractC7608F5v.A05(iFloatValue);
        }
        if (i == 0) {
            iA052 = iA05;
            iA05 = AbstractC7608F5v.A05(i8);
        } else {
            iA052 = AbstractC7608F5v.A05(i8);
        }
        return AnonymousClass002.A0p(Integer.valueOf(iA052), iA05);
    }

    public static final boolean A03(FDW fdw) {
        int i;
        C7384Etj.A0Y(fdw, 0);
        FDW fdwA0C = fdw.A0C(132);
        if (fdwA0C != null) {
            int i2 = fdwA0C.A05;
            if (i2 != 16372) {
                i = i2 == 24201 ? 67 : 36;
            }
            return fdwA0C.A0L(i, false);
        }
        return false;
    }

    public final C7802FFi A05(Context context, FDW fdw) {
        Integer num;
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        Rect rect;
        FDW fdwA0C = fdw.A0C(94);
        if (fdwA0C == null) {
            throw C60O.A0i("GridCommonUtils: grid layout config should be defined");
        }
        int iA00 = FF3.A00(fdw);
        int i2 = fdwA0C.A05;
        if (i2 == 16373) {
            num = C79.A00;
        } else {
            if (i2 != 16483) {
                throw BV5.A0Q("GridCommonUtils: Grid type is unknown for style ", i2);
            }
            num = C79.A01;
        }
        int iIntValue = num.intValue();
        int iA07 = fdwA0C.A07(iIntValue != 0 ? 40 : 41, -1);
        if (iA07 <= 0) {
            FFI.A02("Specified span count must be greater than 0, received: ", iA07);
            iA07 = 1;
        }
        HxE hxEA0p = iIntValue != 0 ? AnonymousClass002.A0p(36, 35) : C60Q.A0y(36, 38);
        int iA0F = AnonymousClass001.A0F(hxEA0p.first);
        int iA0F2 = AnonymousClass001.A0F(hxEA0p.second);
        int iA01 = HjB.A01(fdwA0C, 0.0f, iA0F);
        int iA012 = HjB.A01(fdwA0C, 0.0f, iA0F2);
        if (iA00 == 1) {
            numValueOf = Integer.valueOf(iA012);
            numValueOf2 = Integer.valueOf(iA01);
        } else {
            numValueOf = Integer.valueOf(iA01);
            numValueOf2 = Integer.valueOf(iA012);
        }
        int iIntValue2 = numValueOf.intValue();
        int iIntValue3 = numValueOf2.intValue();
        FDW fdwA0C2 = fdwA0C.A0C(iIntValue != 0 ? 38 : 40);
        if (fdwA0C2 == null) {
            rect = AbstractC7607F5u.A0X();
        } else {
            int iA013 = HjB.A01(fdwA0C2, 0.0f, 42);
            int iA014 = HjB.A01(fdwA0C2, 0.0f, 40);
            int iA015 = HjB.A01(fdwA0C2, 0.0f, 41);
            int iA016 = HjB.A01(fdwA0C2, 0.0f, 35);
            int iA017 = HjB.A01(fdwA0C2, 0.0f, 36);
            int iA018 = HjB.A01(fdwA0C2, 0.0f, 38);
            if (FKH.A00(context)) {
                i = iA015;
                if (iA015 == 0) {
                    i = iA017;
                }
            } else {
                i = iA013;
                if (iA013 == 0) {
                    i = iA017;
                }
                iA013 = iA015;
            }
            if (iA013 == 0) {
                iA013 = iA018;
            }
            rect = new Rect(i, iA014, iA013, iA016);
        }
        return new C7802FFi(rect, fdwA0C, "match_largest".equals(fdwA0C.A0F(49)) ? C79.A01 : C79.A00, iA00, iA07, iIntValue2, iIntValue3);
    }

    /* JADX WARN: Incorrect types in method signature: (IIILjava/util/List<+Ljava/util/List<LX/FEl;>;>;Landroid/graphics/Rect;)LX/HxE<Ljava/lang/Integer;Ljava/lang/Integer;>; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.HxE A07(android.graphics.Rect r22, java.util.List r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FF4.A07(android.graphics.Rect, java.util.List, int, int, int):X.HxE");
    }

    public static final int[] A04(int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int i4 = i / i2;
        int i5 = i % i2;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i6 += i5;
            if (i6 <= 0 || i2 - i6 >= i5) {
                i3 = i4;
            } else {
                i3 = i4 + 1;
                i6 -= i2;
            }
            iArr[i7] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/FDW;>;IZIIIIILjava/util/List<Landroid/graphics/Rect;>;)Ljava/util/List<Landroid/graphics/Rect;>; */
    public static final ArrayList A01(List list, List list2, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8;
        int i9;
        ArrayList arrayListA0t = C60Q.A0t(list);
        int i10 = 0;
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            FDW fdw = (FDW) obj;
            int iA00 = (A03(fdw) ? i5 : A00(fdw)) + i11;
            int i13 = iA00 - 1;
            boolean z2 = true;
            boolean z3 = i != 1 ? i11 == 0 : i6 == 0;
            boolean z4 = i != 1 ? i6 == 0 : i11 == 0;
            boolean z5 = i != 1 ? i6 == i4 + (-1) : i13 == i5 + (-1);
            if (i != 1 ? i13 != i5 - 1 : i6 != i4 - 1) {
                z2 = false;
            }
            double d = i5;
            double d2 = i2 / d;
            double d3 = i3 / d;
            int iA002 = z4 ? 0 : i == 1 ? Ab3.A00(i11 * d2) : i2 / 2;
            int iA003 = z3 ? 0 : i == 0 ? Ab3.A00(i11 * d3) : i3 / 2;
            int iA004 = z5 ? 0 : i == 1 ? i2 - Ab3.A00(iA00 * d2) : i2 / 2;
            int iA005 = z2 ? 0 : i == 0 ? i3 - Ab3.A00(iA00 * d3) : i3 / 2;
            Rect rect = i10 < list2.size() ? (Rect) list2.get(i10) : null;
            if (z) {
                i7 = iA004 + (rect != null ? rect.left : 0);
                i8 = iA003 + (rect != null ? rect.top : 0);
                i9 = iA002 + (rect != null ? rect.right : 0);
            } else {
                i7 = iA002 + (rect != null ? rect.left : 0);
                i8 = iA003 + (rect != null ? rect.top : 0);
                i9 = iA004 + (rect != null ? rect.right : 0);
            }
            arrayListA0t.add(new Rect(i7, i8, i9, iA005 + (rect != null ? rect.bottom : 0)));
            i11 = iA00;
            i10 = i12;
        }
        return arrayListA0t;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<+LX/FDW;>;)Ljava/util/List<Ljava/util/List<LX/FDW;>;>; */
    public final ArrayList A06(List list, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FDW fdwA0z = AbstractC7607F5u.A0z(list, i3);
            int iA00 = A03(fdwA0z) ? i : A00(fdwA0z);
            i2 += iA00;
            if (i2 > i) {
                arrayListA0h.add(AbstractC0878AGe.A0X(arrayListA0h2));
                arrayListA0h2.clear();
                arrayListA0h2.add(fdwA0z);
                i2 = iA00;
            } else {
                arrayListA0h2.add(fdwA0z);
            }
            if (i3 == C60O.A00(list)) {
                arrayListA0h.add(AbstractC0878AGe.A0X(arrayListA0h2));
            }
        }
        return arrayListA0h;
    }
}
