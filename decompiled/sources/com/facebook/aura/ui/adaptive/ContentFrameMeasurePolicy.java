package com.facebook.aura.ui.adaptive;

import X.AXQ;
import X.AXY;
import X.AYL;
import X.AZE;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C06H;
import X.C1DG;
import X.C3TF;
import X.C3TG;
import X.C3Tr;
import X.G0U;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ContentFrameMeasurePolicy implements InterfaceC1380AiA {
    public final C1DG areaWidth;
    public final float maxWidth;

    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        int iA01;
        int iA012;
        G0U contentFrameMeasurePolicy$measure$3;
        int iIntValue;
        int iIntValue2;
        ?? A1a = AnonymousClass002.A1a(axy, list);
        float f = this.maxWidth;
        int iAbr = (Float.isNaN(f) || !Constraints.A0A(j)) ? Integer.MAX_VALUE : axy.Abr(f);
        C1DG c1dg = this.areaWidth;
        Integer numValueOf = null;
        int iIntValue3 = 0;
        if (c1dg != null && Constraints.A0A(j)) {
            int iAbr2 = axy.Abr(c1dg.A00);
            if (iAbr2 < 0) {
                iAbr2 = 0;
            }
            numValueOf = Integer.valueOf(iAbr2);
        }
        int i = 1;
        if (numValueOf == null || (iIntValue2 = numValueOf.intValue()) == (iA01 = Constraints.A01(j))) {
            iA01 = Constraints.A01(j);
            if (iAbr >= iA01) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(list.get(i2).AQW(j));
                }
                if (arrayList.isEmpty()) {
                    iIntValue = 0;
                } else {
                    Integer numValueOf2 = Integer.valueOf(((AZE) arrayList.get(0)).A01);
                    int size2 = arrayList.size() - 1;
                    if (A1a <= size2) {
                        int i3 = 1;
                        while (true) {
                            Integer numValueOf3 = Integer.valueOf(((AZE) arrayList.get(i3)).A01);
                            if (numValueOf3.compareTo(numValueOf2) > 0) {
                                numValueOf2 = numValueOf3;
                            }
                            if (i3 == size2) {
                                break;
                            }
                            i3++;
                        }
                    }
                    iIntValue = numValueOf2.intValue();
                }
                iA01 = AYL.A02(j, iIntValue);
                if (!arrayList.isEmpty()) {
                    Integer numValueOf4 = Integer.valueOf(((AZE) arrayList.get(0)).A00);
                    int size3 = arrayList.size() - 1;
                    if (A1a <= size3) {
                        while (true) {
                            Integer numValueOf5 = Integer.valueOf(((AZE) arrayList.get(i)).A00);
                            if (numValueOf5.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf5;
                            }
                            if (i == size3) {
                                break;
                            }
                            i++;
                        }
                    }
                    iIntValue3 = numValueOf4.intValue();
                }
                iA012 = AYL.A01(j, iIntValue3);
                contentFrameMeasurePolicy$measure$3 = new ContentFrameMeasurePolicy$measure$2(arrayList);
            } else {
                int iA03 = Constraints.A03(j);
                if (iA03 > iAbr) {
                    iA03 = iAbr;
                }
                long jA0x = AnonymousClass004.A0x(j, iA03, iAbr);
                ArrayList arrayList2 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    arrayList2.add(list.get(i4).AQW(jA0x));
                }
                if (!arrayList2.isEmpty()) {
                    Integer numValueOf6 = Integer.valueOf(((AZE) arrayList2.get(0)).A00);
                    int size5 = arrayList2.size() - 1;
                    if (A1a <= size5) {
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((AZE) arrayList2.get(i)).A00);
                            if (numValueOf7.compareTo(numValueOf6) > 0) {
                                numValueOf6 = numValueOf7;
                            }
                            if (i == size5) {
                                break;
                            }
                            i++;
                        }
                    }
                    iIntValue3 = numValueOf6.intValue();
                }
                iA012 = AYL.A01(j, iIntValue3);
                contentFrameMeasurePolicy$measure$3 = new ContentFrameMeasurePolicy$measure$3(arrayList2, iA01);
            }
        } else {
            long jM2360atWidthK40F9xA = AuraContentFrameKt.m2360atWidthK40F9xA(j, Math.min(iAbr, iIntValue2));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size6 = list.size();
            for (int i5 = 0; i5 < size6; i5++) {
                arrayList3.add(list.get(i5).AQW(jM2360atWidthK40F9xA));
            }
            if (!arrayList3.isEmpty()) {
                Integer numValueOf8 = Integer.valueOf(((AZE) arrayList3.get(0)).A00);
                int size7 = arrayList3.size() - 1;
                if (A1a <= size7) {
                    while (true) {
                        Integer numValueOf9 = Integer.valueOf(((AZE) arrayList3.get(i)).A00);
                        if (numValueOf9.compareTo(numValueOf8) > 0) {
                            numValueOf8 = numValueOf9;
                        }
                        if (i == size7) {
                            break;
                        }
                        i++;
                    }
                }
                iIntValue3 = numValueOf8.intValue();
            }
            iA012 = AYL.A01(j, iIntValue3);
            contentFrameMeasurePolicy$measure$3 = new ContentFrameMeasurePolicy$measure$1(arrayList3, iA01, numValueOf);
        }
        return AnonymousClass002.A0X(axy, contentFrameMeasurePolicy$measure$3, iA01, iA012);
    }

    public ContentFrameMeasurePolicy(float f, C1DG c1dg) {
        this.maxWidth = f;
        this.areaWidth = c1dg;
    }

    @Override // X.InterfaceC1380AiA
    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return AXQ.A02(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return AXQ.A03(c3tf, this, list, i);
    }

    public /* synthetic */ ContentFrameMeasurePolicy(float f, C1DG c1dg, C06H c06h) {
        this(f, c1dg);
    }
}
