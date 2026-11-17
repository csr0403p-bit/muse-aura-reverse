package X;

import android.text.Layout;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTP implements Ht9, G0U {
    public final int $t;
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BTP(Object obj, Object obj2, Object obj3, int i, long j) {
        this.$t = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A00 = j;
        this.A03 = obj2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        String str;
        float fA00;
        float fA002;
        if (this.$t != 0) {
            long j = this.A00;
            float[] fArr = (float[]) this.A01;
            F1E f1e = (F1E) this.A02;
            C1051ASv c1051ASv = (C1051ASv) this.A03;
            C1960Auz c1960Auz = (C1960Auz) obj;
            int i = c1960Auz.A05;
            int i2 = i;
            int iA02 = Au3.A02(j);
            if (i <= iA02) {
                i2 = iA02;
            }
            int i3 = c1960Auz.A04;
            int iA01 = Au3.A01(j);
            if (i3 < iA01) {
                iA01 = i3;
            }
            long jA00 = AbstractC1815ArZ.A00(ATD.A04(i2, i, i3) - i, ATD.A04(iA01, i, i3) - i);
            InterfaceC2006AwF interfaceC2006AwF = c1960Auz.A06;
            int i4 = f1e.element;
            C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
            int iA022 = Au3.A02(jA00);
            int iA012 = Au3.A01(jA00);
            Layout layout = c1999Aw8.A09;
            int iA0H = C8j3.A0H(layout);
            if (iA022 < 0) {
                str = "startOffset must be > 0";
            } else if (iA022 >= iA0H) {
                str = "startOffset must be less than text length";
            } else if (iA012 <= iA022) {
                str = "endOffset must be greater than startOffset";
            } else if (iA012 <= iA0H) {
                int i5 = (iA012 - iA022) * 4;
                if (fArr.length - i4 >= i5) {
                    int lineForOffset = layout.getLineForOffset(iA022);
                    int lineForOffset2 = layout.getLineForOffset(iA012 - 1);
                    AvX avX = new AvX(c1999Aw8);
                    if (lineForOffset <= lineForOffset2) {
                        while (true) {
                            int lineStart = layout.getLineStart(lineForOffset);
                            int iA07 = c1999Aw8.A07(lineForOffset);
                            int iMin = Math.min(iA012, iA07);
                            float fA04 = c1999Aw8.A04(lineForOffset);
                            float fA03 = c1999Aw8.A03(lineForOffset);
                            boolean zA1Q = AnonymousClass002.A1Q(layout.getParagraphDirection(lineForOffset), 1);
                            for (int iMax = Math.max(iA022, lineStart); iMax < iMin; iMax++) {
                                boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                                if (zA1Q) {
                                    if (zIsRtlCharAt) {
                                        fA002 = AvX.A00(avX, iMax, false, false, false);
                                        fA00 = AvX.A00(avX, iMax + 1, true, true, false);
                                    } else {
                                        fA00 = AvX.A00(avX, iMax, false, false, true);
                                        fA002 = AvX.A00(avX, iMax + 1, true, true, true);
                                    }
                                } else if (zIsRtlCharAt) {
                                    fA002 = AvX.A00(avX, iMax, false, false, true);
                                    fA00 = AvX.A00(avX, iMax + 1, true, true, true);
                                } else {
                                    fA00 = AvX.A00(avX, iMax, false, false, false);
                                    fA002 = AvX.A00(avX, iMax + 1, true, true, false);
                                }
                                fArr[i4] = fA00;
                                fArr[i4 + 1] = fA04;
                                fArr[i4 + 2] = fA002;
                                fArr[i4 + 3] = fA03;
                                i4 += 4;
                            }
                            if (lineForOffset == lineForOffset2) {
                                break;
                            }
                            lineForOffset++;
                        }
                    }
                    int i6 = f1e.element;
                    int i7 = i6 + i5;
                    while (i6 < i7) {
                        int i8 = i6 + 1;
                        float f = fArr[i8];
                        float f2 = c1051ASv.element;
                        fArr[i8] = f + f2;
                        int i9 = i6 + 3;
                        fArr[i9] = fArr[i9] + f2;
                        i6 += 4;
                    }
                    f1e.element = i7;
                    c1051ASv.element += interfaceC2006AwF.AGD();
                } else {
                    str = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4";
                }
            } else {
                str = "endOffset must be smaller or equal to text length";
            }
            throw C60O.A0i(str);
        }
        AaC aaC = (AaC) this.A01;
        C10543Hqv c10543Hqv = (C10543Hqv) this.A02;
        long j2 = this.A00;
        C1423Ais c1423Ais = (C1423Ais) this.A03;
        C16Z c16z = (C16Z) obj;
        c16z.A9O();
        float f3 = aaC.A01;
        float f4 = aaC.A03;
        AT2 at2A00 = AT2.A00(c16z, f3, f4);
        try {
            c16z.A9Q(c1423Ais, (InterfaceC2178B0w) c10543Hqv.element, C16a.A00, 1.0f, 3, 1, 0L, j2, 0L, j2);
        } finally {
            AT2.A01(at2A00, f3, f4);
        }
        return Unit.INSTANCE;
    }
}
