package X;

import java.util.List;

/* renamed from: X.Avm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1981Avm {
    /* JADX WARN: Incorrect types in method signature: (LX/AwR;IIIIILX/AXY;Ljava/util/List<+LX/3TG;>;[LX/AZE;II[II)LX/Abi; */
    public static final InterfaceC1134Abi A00(InterfaceC2013AwR interfaceC2013AwR, AXY axy, List list, int[] iArr, AZE[] azeArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int iMax;
        int iMax2;
        C1983Avo c1983Avo;
        AbstractC2062AxZ abstractC2062AxZ;
        AbstractC2062AxZ abstractC2062AxZ2;
        long j = i5;
        int i10 = i7 - i6;
        int[] iArr2 = new int[i10];
        int i11 = i6;
        int iMin = 0;
        int iMax3 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        float f = 0.0f;
        while (true) {
            int i14 = Integer.MAX_VALUE;
            boolean z2 = true;
            if (i11 >= i7) {
                break;
            }
            C3TG c3tg = (C3TG) list.get(i11);
            C1983Avo c1983AvoA00 = AbstractC2103AyT.A00(c3tg);
            float f2 = c1983AvoA00 != null ? c1983AvoA00.A00 : 0.0f;
            if (!z && (c1983AvoA00 == null || (abstractC2062AxZ2 = c1983AvoA00.A01) == null || !(abstractC2062AxZ2 instanceof C2010AwL))) {
                z2 = false;
            }
            if (f2 > 0.0f) {
                f += f2;
                i12++;
            } else {
                int i15 = i3 - i13;
                AZE azeAQW = azeArr[i11];
                if (azeAQW == null) {
                    if (i3 != Integer.MAX_VALUE) {
                        i14 = i15;
                        if (i15 < 0) {
                            i14 = 0;
                        }
                    }
                    azeAQW = c3tg.AQW(interfaceC2013AwR.A7c(0, 0, i14, i4, false));
                }
                int iAQ1 = interfaceC2013AwR.AQ1(azeAQW);
                int iA86 = interfaceC2013AwR.A86(azeAQW);
                iArr2[i11 - i6] = iAQ1;
                int i16 = i15 - iAQ1;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += iAQ1 + iMin;
                iMax3 = Math.max(iMax3, iA86);
                azeArr[i11] = azeAQW;
            }
            i11++;
            z = z2;
        }
        if (i12 == 0) {
            i13 -= iMin;
            i9 = 0;
        } else {
            int i17 = i;
            if (i3 != Integer.MAX_VALUE) {
                i17 = i3;
            }
            long j2 = j * (i12 - 1);
            long jRound = (i17 - i13) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f;
            for (int i18 = i6; i18 < i7; i18++) {
                jRound -= Math.round((AbstractC2103AyT.A00((C3Tr) list.get(i18)) != null ? r0.A00 : 0.0f) * f3);
            }
            int i19 = 0;
            for (int i20 = i6; i20 < i7; i20++) {
                if (azeArr[i20] == null) {
                    C3TG c3tg2 = (C3TG) list.get(i20);
                    C1983Avo c1983AvoA002 = AbstractC2103AyT.A00(c3tg2);
                    if (c1983AvoA002 != null) {
                        float f4 = c1983AvoA002.A00;
                        if (f4 > 0.0f) {
                            int iSignum = Long.signum(jRound);
                            jRound -= iSignum;
                            int iRound = Math.round(f4 * f3) + iSignum;
                            int i21 = 0;
                            int iMax4 = Math.max(0, iRound);
                            if (c1983AvoA002.A02 && iMax4 != Integer.MAX_VALUE) {
                                i21 = iMax4;
                            }
                            AZE azeAQW2 = c3tg2.AQW(interfaceC2013AwR.A7c(i21, 0, iMax4, i4, true));
                            int iAQ12 = interfaceC2013AwR.AQ1(azeAQW2);
                            int iA862 = interfaceC2013AwR.A86(azeAQW2);
                            iArr2[i20 - i6] = iAQ12;
                            i19 += iAQ12;
                            iMax3 = Math.max(iMax3, iA862);
                            azeArr[i20] = azeAQW2;
                        }
                    }
                    throw new IllegalStateException("All weights <= 0 should have placeables");
                }
            }
            i9 = (int) (i19 + j2);
            int i22 = i3 - i13;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i22) {
                i9 = i22;
            }
        }
        if (z) {
            iMax2 = 0;
            iMax = 0;
            for (int i23 = i6; i23 < i7; i23++) {
                AZE aze = azeArr[i23];
                C7384Etj.A0X(aze);
                Object objAIX = aze.AIX();
                if ((objAIX instanceof C1983Avo) && (c1983Avo = (C1983Avo) objAIX) != null && (abstractC2062AxZ = c1983Avo.A01) != null && (abstractC2062AxZ instanceof C2010AwL)) {
                    int iIntValue = Integer.valueOf(aze.ABt(((C2009AwK) ((C2010AwL) abstractC2062AxZ).A00).A00)).intValue();
                    int iA863 = interfaceC2013AwR.A86(aze);
                    iMax2 = Math.max(iMax2, iIntValue != Integer.MIN_VALUE ? iIntValue : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iA863;
                    }
                    iMax = Math.max(iMax, iA863 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i24 = i13 + i9;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax5 = Math.max(i24, i);
        int iMax6 = Math.max(iMax3, Math.max(i2, iMax + iMax2));
        int[] iArr3 = new int[i10];
        interfaceC2013AwR.AY6(axy, iArr2, iArr3, iMax5);
        return interfaceC2013AwR.AXw(axy, iArr3, iArr, azeArr, iMax2, iMax5, iMax6, i8, i6, i7);
    }
}
