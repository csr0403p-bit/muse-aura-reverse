package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.Avj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1978Avj implements InterfaceC2105AyV, AaH {
    public final int A00;
    public final InterfaceC04981Yd A01;
    public final InterfaceC1185Ado A02;
    public final AbstractC2062AxZ A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final C1982Avn A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1978Avj) {
                C1978Avj c1978Avj = (C1978Avj) obj;
                if (!this.A01.equals(c1978Avj.A01) || !this.A02.equals(c1978Avj.A02) || !C1DG.A08(this.A05, c1978Avj.A05) || !this.A03.equals(c1978Avj.A03) || !C1DG.A08(this.A04, c1978Avj.A04) || this.A00 != c1978Avj.A00 || this.A06 != c1978Avj.A06 || !C7384Etj.areEqual(this.A07, c1978Avj.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AaH
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i) {
        C1982Avn c1982Avn = this.A07;
        List list2 = (List) AbstractC0878AGe.A0A(1, list);
        C3Tr c3Tr = list2 != null ? (C3Tr) AbstractC0878AGe.A0G(list2) : null;
        List list3 = (List) AbstractC0878AGe.A0A(2, list);
        c1982Avn.A00(c3Tr, list3 != null ? (C3Tr) AbstractC0878AGe.A0G(list3) : null, AYL.A04(i));
        List list4 = (List) AbstractC0878AGe.A0G(list);
        if (list4 == null) {
            list4 = C0881AGi.A00;
        }
        return A00(c1982Avn, list4, i, c3tf.Abr(this.A05), c3tf.Abr(this.A04), this.A00, this.A06);
    }

    @Override // X.AaH
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i) {
        C1982Avn c1982Avn = this.A07;
        List list2 = (List) AbstractC0878AGe.A0A(1, list);
        C3Tr c3Tr = list2 != null ? (C3Tr) AbstractC0878AGe.A0G(list2) : null;
        List list3 = (List) AbstractC0878AGe.A0A(2, list);
        c1982Avn.A00(c3Tr, list3 != null ? (C3Tr) AbstractC0878AGe.A0G(list3) : null, AYL.A04(i));
        List list4 = (List) AbstractC0878AGe.A0G(list);
        if (list4 == null) {
            list4 = C0881AGi.A00;
        }
        return A00(c1982Avn, list4, i, c3tf.Abr(this.A05), c3tf.Abr(this.A04), this.A00, this.A06);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/3Tr;>;IIIIILX/Avn;)I */
    private final int A00(C1982Avn c1982Avn, List list, int i, int i2, int i3, int i4, int i5) {
        long jA0M;
        int iAQo;
        int iAQq;
        if (list.isEmpty()) {
            jA0M = C8j3.A0M();
        } else {
            C1985Avq c1985Avq = new C1985Avq(c1982Avn, i4, i5, i2, i3, AYL.A05(0, i, 0, Integer.MAX_VALUE));
            C3Tr c3Tr = (C3Tr) AbstractC0878AGe.A0A(0, list);
            if (c3Tr != null) {
                iAQo = c3Tr.AQo(i);
                iAQq = c3Tr.AQq(iAQo);
            } else {
                iAQo = 0;
                iAQq = 0;
            }
            boolean zA1V = C8j4.A1V(list.size(), 1);
            long jA0T = C8j3.A0T(i, Integer.MAX_VALUE);
            C2050AxN c2050AxN = c3Tr == null ? null : new C2050AxN(C8j3.A0T(iAQq, iAQo));
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            if (c1985Avq.A00(c2050AxN, 0, 0, 0, 0, jA0T, zA1V, false).A00) {
                c1982Avn.A04.intValue();
                jA0M = C8j3.A0M();
            } else {
                int size = list.size();
                int i9 = i;
                int iMax = 0;
                int i10 = 0;
                int i11 = 0;
                while (i6 < size) {
                    i9 -= iAQq;
                    i10++;
                    iMax = Math.max(iMax, iAQo);
                    C3Tr c3Tr2 = (C3Tr) AbstractC0878AGe.A0A(i10, list);
                    if (c3Tr2 != null) {
                        iAQo = c3Tr2.AQo(i);
                        iAQq = c3Tr2.AQq(iAQo) + i2;
                    } else {
                        iAQo = 0;
                        iAQq = 0;
                    }
                    C2133Az1 c2133Az1A00 = c1985Avq.A00(c3Tr2 == null ? null : new C2050AxN(C8j3.A0T(iAQq, iAQo)), i10 - i11, i8, i7, iMax, C8j3.A0T(i9, Integer.MAX_VALUE), C8j3.A1T(i6 + 2, list.size()), false);
                    if (c2133Az1A00.A01) {
                        i7 += iMax + i3;
                        iAQq -= i2;
                        i8++;
                        if (c2133Az1A00.A00) {
                            break;
                        }
                        i11 = i10;
                        iMax = 0;
                        i9 = i;
                    }
                    i6 = i10;
                }
                jA0M = C8j3.A0T(i7 - i3, i10);
            }
        }
        return C8j3.A0G(jA0M);
    }

    @Override // X.InterfaceC2013AwR
    public final /* synthetic */ long A7c(int i, int i2, int i3, int i4, boolean z) {
        return !z ? AYL.A05(i, i3, i2, i4) : Constraints.A07(i, i3, i2, i4);
    }

    @Override // X.InterfaceC2013AwR
    public final /* synthetic */ InterfaceC1134Abi AXw(AXY axy, final int[] iArr, final int[] iArr2, final AZE[] azeArr, final int i, int i2, final int i3, final int i4, final int i5, final int i6) {
        final EnumC1820Arj enumC1820Arj = EnumC1820Arj.A02;
        return AXY.A01(axy, new G0U() { // from class: X.Avr
            @Override // X.G0U
            public final Object invoke(Object obj) {
                AbstractC2062AxZ abstractC2062AxZ;
                C1983Avo c1983Avo;
                int[] iArr3 = iArr2;
                int i7 = i4;
                int i8 = i5;
                int i9 = i6;
                AZE[] azeArr2 = azeArr;
                InterfaceC2105AyV interfaceC2105AyV = this;
                int i10 = i3;
                EnumC1820Arj enumC1820Arj2 = enumC1820Arj;
                int i11 = i;
                int[] iArr4 = iArr;
                AYU ayu = (AYU) obj;
                int i12 = iArr3 != null ? iArr3[i7] : 0;
                for (int i13 = i8; i13 < i9; i13++) {
                    AZE aze = azeArr2[i13];
                    C7384Etj.A0X(aze);
                    Object objAIX = aze.AIX();
                    if (!(objAIX instanceof C1983Avo) || (c1983Avo = (C1983Avo) objAIX) == null || (abstractC2062AxZ = c1983Avo.A01) == null) {
                        abstractC2062AxZ = ((C1978Avj) interfaceC2105AyV).A03;
                    }
                    ayu.A0A(aze, 0.0f, iArr4[i13 - i8], abstractC2062AxZ.A00(aze, enumC1820Arj2, i10, aze.A0Y(), i11) + i12);
                }
                return Unit.INSTANCE;
            }
        }, i2, i3);
    }

    @Override // X.InterfaceC2013AwR
    public final /* synthetic */ void AY6(AXY axy, int[] iArr, int[] iArr2, int i) {
        this.A01.A4l(axy, axy.getLayoutDirection(), iArr, iArr2, i);
    }

    @Override // X.AaH
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i) {
        C1982Avn c1982Avn = this.A07;
        List list2 = (List) AbstractC0878AGe.A0A(1, list);
        C3Tr c3Tr = list2 != null ? (C3Tr) AbstractC0878AGe.A0G(list2) : null;
        List list3 = (List) AbstractC0878AGe.A0A(2, list);
        c1982Avn.A00(c3Tr, list3 != null ? (C3Tr) AbstractC0878AGe.A0G(list3) : null, AYL.A03(i));
        List list4 = (List) AbstractC0878AGe.A0G(list);
        if (list4 == null) {
            list4 = C0881AGi.A00;
        }
        int iAbr = c3tf.Abr(this.A05);
        int i2 = this.A00;
        int size = list4.size();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < size) {
            int iAQO = C8j4.A0a(list4, i3).AQO(i) + iAbr;
            int i6 = i3 + 1;
            if (i6 - i4 == i2 || i6 == list4.size()) {
                iMax = Math.max(iMax, (i5 + iAQO) - iAbr);
                i4 = i3;
                i5 = 0;
            } else {
                i5 += iAQO;
            }
            i3 = i6;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266 A[LOOP:1: B:64:0x0264->B:65:0x0266, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa A[SYNTHETIC] */
    @Override // X.AaH
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo14measure3p2s80s(X.AXY r52, java.util.List<? extends java.util.List<? extends X.C3TG>> r53, long r54) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1978Avj.mo14measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    @Override // X.AaH
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i) {
        long jA0M;
        int i2;
        int i3;
        C1982Avn c1982Avn = this.A07;
        List list2 = (List) AbstractC0878AGe.A0A(1, list);
        C3Tr c3Tr = list2 != null ? (C3Tr) AbstractC0878AGe.A0G(list2) : null;
        List list3 = (List) AbstractC0878AGe.A0A(2, list);
        c1982Avn.A00(c3Tr, list3 != null ? (C3Tr) AbstractC0878AGe.A0G(list3) : null, AYL.A05(0, Integer.MAX_VALUE, 0, i));
        List list4 = (List) AbstractC0878AGe.A0G(list);
        if (list4 == null) {
            list4 = C0881AGi.A00;
        }
        int iAbr = c3tf.Abr(this.A05);
        int iAbr2 = c3tf.Abr(this.A04);
        int i4 = this.A06;
        int i5 = this.A00;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        int size3 = list4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            C3Tr c3TrA0a = C8j4.A0a(list4, i6);
            int iAQq = c3TrA0a.AQq(i);
            iArr[i6] = iAQq;
            iArr2[i6] = c3TrA0a.AQo(iAQq);
        }
        int i7 = Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
            i7 = i5 * i4;
        }
        list4.size();
        int i8 = 1;
        list4.size();
        int iMin = Math.min(i7, list4.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr[i10];
        }
        int size4 = i9 + ((list4.size() - 1) * iAbr);
        if (size2 == 0) {
            throw C8j3.A1D();
        }
        int iA0G = iArr2[0];
        int i11 = size2 - 1;
        if (1 <= i11) {
            int i12 = 1;
            while (true) {
                int i13 = iArr2[i12];
                if (iA0G < i13) {
                    iA0G = i13;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        if (size == 0) {
            throw C8j3.A1D();
        }
        int i14 = iArr[0];
        int i15 = size - 1;
        if (1 <= i15) {
            while (true) {
                int i16 = iArr[i8];
                if (i14 < i16) {
                    i14 = i16;
                }
                if (i8 == i15) {
                    break;
                }
                i8++;
            }
        }
        int i17 = size4;
        while (i14 <= i17 && iA0G != i) {
            size4 = (i14 + i17) / 2;
            if (list4.isEmpty()) {
                jA0M = C8j3.A0M();
            } else {
                C1985Avq c1985Avq = new C1985Avq(c1982Avn, i5, i4, iAbr, iAbr2, AYL.A05(0, size4, 0, Integer.MAX_VALUE));
                Object objA0A = AbstractC0878AGe.A0A(0, list4);
                if (objA0A != null) {
                    i2 = iArr2[0];
                    i3 = iArr[0];
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                if (c1985Avq.A00(objA0A == null ? null : new C2050AxN(C8j3.A0T(i3, i2)), 0, 0, 0, 0, C8j3.A0T(size4, Integer.MAX_VALUE), C8j4.A1V(list4.size(), 1), false).A00) {
                    c1982Avn.A04.intValue();
                    jA0M = C8j3.A0M();
                } else {
                    int size5 = list4.size();
                    int i21 = size4;
                    int iMax = 0;
                    int i22 = 0;
                    int i23 = 0;
                    while (i18 < size5) {
                        i21 -= i3;
                        i22 = i18 + 1;
                        iMax = Math.max(iMax, i2);
                        Object objA0A2 = AbstractC0878AGe.A0A(i22, list4);
                        if (objA0A2 != null) {
                            i2 = iArr2[i22];
                            i3 = iArr[i22] + iAbr;
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                        C2133Az1 c2133Az1A00 = c1985Avq.A00(objA0A2 == null ? null : new C2050AxN(C8j3.A0T(i3, i2)), i22 - i23, i20, i19, iMax, C8j3.A0T(i21, Integer.MAX_VALUE), C8j3.A1T(i18 + 2, list4.size()), false);
                        if (c2133Az1A00.A01) {
                            i19 += iMax + iAbr2;
                            i3 -= iAbr;
                            i20++;
                            if (c2133Az1A00.A00) {
                                break;
                            }
                            i23 = i22;
                            iMax = 0;
                            i21 = size4;
                        }
                        i18 = i22;
                    }
                    jA0M = C8j3.A0T(i19 - iAbr2, i22);
                }
            }
            iA0G = C8j3.A0G(jA0M);
            int iA09 = AnonymousClass002.A09(jA0M);
            if (iA0G > i || iA09 < iMin) {
                i14 = size4 + 1;
                if (i14 > i17) {
                    return i14;
                }
            } else {
                if (iA0G >= i) {
                    return size4;
                }
                i17 = size4 - 1;
            }
        }
        return size4;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FlowMeasurePolicy(isHorizontal=");
        sbA0x.append(true);
        sbA0x.append(", horizontalArrangement=");
        sbA0x.append(this.A01);
        sbA0x.append(", verticalArrangement=");
        sbA0x.append(this.A02);
        sbA0x.append(", mainAxisSpacing=");
        C1DG.A07(sbA0x, this.A05);
        sbA0x.append(", crossAxisAlignment=");
        sbA0x.append(this.A03);
        sbA0x.append(", crossAxisArrangementSpacing=");
        C1DG.A07(sbA0x, this.A04);
        sbA0x.append(", maxItemsInMainAxis=");
        sbA0x.append(this.A00);
        sbA0x.append(", maxLines=");
        sbA0x.append(this.A06);
        sbA0x.append(", overflow=");
        return AnonymousClass007.A0Z(this.A07, sbA0x);
    }

    public C1978Avj(InterfaceC04981Yd interfaceC04981Yd, InterfaceC1185Ado interfaceC1185Ado, AbstractC2062AxZ abstractC2062AxZ, C1982Avn c1982Avn, float f, float f2, int i, int i2) {
        this.A01 = interfaceC04981Yd;
        this.A02 = interfaceC1185Ado;
        this.A05 = f;
        this.A03 = abstractC2062AxZ;
        this.A04 = f2;
        this.A00 = i;
        this.A06 = i2;
        this.A07 = c1982Avn;
    }

    @Override // X.InterfaceC2013AwR
    public final /* synthetic */ int A86(AZE aze) {
        return aze.A0Y();
    }

    @Override // X.InterfaceC2013AwR
    public final /* synthetic */ int AQ1(AZE aze) {
        return aze.A0Z();
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A07, (((AnonymousClass005.A02(AnonymousClass005.A0F(this.A03, AnonymousClass005.A02(AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, 38161)), this.A05)), this.A04) + this.A00) * 31) + this.A06) * 31);
    }
}
