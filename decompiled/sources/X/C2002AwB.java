package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.AwB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2002AwB implements LineHeightSpan {
    public int A03;
    public int A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public int A02 = Integer.MIN_VALUE;
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A04 = Integer.MIN_VALUE;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int iMin = fontMetricsInt.descent;
        int i5 = fontMetricsInt.ascent;
        int i6 = iMin - i5;
        if (i6 > 0) {
            boolean zA1Q = AnonymousClass002.A1Q(i, 0);
            boolean z = i2 == this.A0B;
            if (zA1Q && z && this.A09 && this.A0A && this.A08 != 2) {
                return;
            }
            int iMax = this.A02;
            if (iMax == Integer.MIN_VALUE) {
                int iA08 = C8j3.A08(this.A06);
                int i7 = iA08 - i6;
                int i8 = this.A08;
                int i9 = 0;
                if (!AnonymousClass002.A1Q(i8, 1) || i7 > 0) {
                    float fAbs = this.A07;
                    if (fAbs == -1.0f) {
                        fAbs = Math.abs(i5) / i6;
                    }
                    float f = i7;
                    int iA082 = iMin + C8j3.A08(i7 <= 0 ? f * fAbs : f * (1.0f - fAbs));
                    this.A01 = iA082;
                    int i10 = iA082 - iA08;
                    this.A00 = i10;
                    if (i8 == 0 || i7 >= 0) {
                        if (this.A09) {
                            i10 = i5;
                        }
                        this.A02 = i10;
                        iMax = i10;
                        if (this.A0A) {
                            iA082 = iMin;
                        }
                        this.A04 = iA082;
                        this.A03 = i5 - i10;
                        i9 = iA082 - iMin;
                        this.A05 = i9;
                    } else if (i8 == 2) {
                        iMax = this.A09 ? Math.max(i5, i10) : Math.min(i5, i10);
                        this.A02 = iMax;
                        iMin = this.A0A ? Math.min(iMin, iA082) : Math.max(iMin, iA082);
                    }
                } else {
                    this.A00 = i5;
                    this.A01 = iMin;
                    this.A02 = i5;
                    iMax = i5;
                }
                this.A04 = iMin;
                this.A03 = 0;
                this.A05 = i9;
            }
            if (!zA1Q) {
                iMax = this.A00;
            }
            fontMetricsInt.ascent = iMax;
            fontMetricsInt.descent = z ? this.A04 : this.A01;
        }
    }

    public C2002AwB(float f, float f2, int i, int i2, boolean z, boolean z2) {
        this.A06 = f;
        this.A0B = i;
        this.A09 = z;
        this.A0A = z2;
        this.A07 = f2;
        this.A08 = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw C3cG.A0Q("topRatio should be in [0..1] range or -1");
        }
    }
}
