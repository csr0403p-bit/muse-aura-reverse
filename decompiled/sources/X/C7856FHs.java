package X;

import com.instagram.common.bloks.lexer.ParsingException;

/* renamed from: X.FHs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7856FHs {
    public static final C7861FHx A00 = new C7861FHx();

    public static float[] A06(C7861FHx c7861FHx) {
        C7861FHx.A00(c7861FHx, 2);
        return c7861FHx.A01;
    }

    public static final FDW A02(InterfaceC7751FDd<?> interfaceC7751FDd) {
        FDW fdwA0C;
        if (!(interfaceC7751FDd instanceof FDW)) {
            return null;
        }
        FDW fdw = (FDW) interfaceC7751FDd;
        if (fdw.A0C(132) == null) {
            return null;
        }
        FDW fdwA0C2 = fdw.A0C(132);
        if ((fdwA0C2 == null || fdwA0C2.A05 != 13368) && ((fdwA0C = fdw.A0C(132)) == null || fdwA0C.A05 != 24201)) {
            return null;
        }
        return fdw.A0C(132);
    }

    public static void A05(C7861FHx c7861FHx, float[] fArr, float f, int i, int i2) {
        fArr[i] = f;
        c7861FHx.A00 = i2 + 1;
    }

    public static final float A00(FDW fdw, float f, int i, boolean z) {
        String strA0F = fdw.A0F(i);
        if (strA0F == null || (z && strA0F.equals("auto"))) {
            return Float.NaN;
        }
        try {
            return AbstractC7607F5u.A1X(strA0F) ? HiY.A00(strA0F) * 0.01f * f : HiY.A01(strA0F);
        } catch (ParsingException e) {
            FFI.A01(null, "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static final float A01(FDW fdw, int i) {
        String strA0F = fdw.A0F(i);
        float fA01 = Float.NaN;
        if (strA0F == null) {
            return Float.NaN;
        }
        try {
            fA01 = HiY.A01(strA0F);
            return fA01;
        } catch (ParsingException e) {
            FFI.A01(null, "Error parsing padding value", e);
            return fA01;
        }
    }

    public static final void A03(C7861FHx c7861FHx, Integer num, String str) {
        float fA01;
        float[] fArr;
        int i;
        try {
            if (AbstractC7607F5u.A1X(str)) {
                fA01 = HiY.A00(str);
                if (C7861FHx.A02(fA01)) {
                    return;
                }
                C7861FHx.A00(c7861FHx, 3);
                fArr = c7861FHx.A01;
                int i2 = c7861FHx.A00;
                int i3 = i2 + 1;
                c7861FHx.A00 = i3;
                fArr[i2] = 25.0f;
                i = i3 + 1;
                c7861FHx.A00 = i;
                c7861FHx.A00 = AbstractC7866FId.A01(num, fArr, i3, i);
            } else {
                if ("auto".equals(str)) {
                    float[] fArrA06 = A06(c7861FHx);
                    int i4 = c7861FHx.A00;
                    int i5 = i4 + 1;
                    c7861FHx.A00 = i5;
                    A05(c7861FHx, fArrA06, 26.0f, i4, i5);
                    fArrA06[i5] = AbstractC7866FId.A00(num);
                    return;
                }
                fA01 = HiY.A01(str);
                if (C7861FHx.A02(fA01)) {
                    return;
                }
                C7861FHx.A00(c7861FHx, 3);
                fArr = c7861FHx.A01;
                int i6 = c7861FHx.A00;
                int i7 = i6 + 1;
                c7861FHx.A00 = i7;
                fArr[i6] = 24.0f;
                i = i7 + 1;
                c7861FHx.A00 = i;
                c7861FHx.A00 = AbstractC7866FId.A01(num, fArr, i7, i);
            }
            fArr[i] = fA01;
        } catch (ParsingException e) {
            FFI.A01(null, "Error parsing margin value", e);
        }
    }

    public static final void A04(C7861FHx c7861FHx, Integer num, String str) {
        float fA01;
        float[] fArr;
        int i;
        try {
            if (AbstractC7607F5u.A1X(str)) {
                fA01 = HiY.A00(str);
                if (C7861FHx.A02(fA01)) {
                    return;
                }
                C7861FHx.A00(c7861FHx, 3);
                fArr = c7861FHx.A01;
                int i2 = c7861FHx.A00;
                int i3 = i2 + 1;
                c7861FHx.A00 = i3;
                fArr[i2] = 28.0f;
                i = i3 + 1;
                c7861FHx.A00 = i;
                c7861FHx.A00 = AbstractC7866FId.A01(num, fArr, i3, i);
            } else {
                fA01 = HiY.A01(str);
                if (C7861FHx.A02(fA01)) {
                    return;
                }
                C7861FHx.A00(c7861FHx, 3);
                fArr = c7861FHx.A01;
                int i4 = c7861FHx.A00;
                int i5 = i4 + 1;
                c7861FHx.A00 = i5;
                fArr[i4] = 27.0f;
                i = i5 + 1;
                c7861FHx.A00 = i;
                c7861FHx.A00 = AbstractC7866FId.A01(num, fArr, i5, i);
            }
            fArr[i] = fA01;
        } catch (ParsingException e) {
            FFI.A01(null, "Error parsing position value", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7861FHx A07(X.InterfaceC7751FDd<X.FBB> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7856FHs.A07(X.FDd, boolean):X.FHx");
    }
}
