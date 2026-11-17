package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import com.instagram.common.bloks.lexer.ParsingException;

/* renamed from: X.FHt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7857FHt extends ReplacementSpan implements FRR {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Rect A03;
    public final FET A04;
    public final String A05;
    public final int A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Float] */
    public static final Integer A01(FDW fdw, int i, int i2) {
        String strA0F;
        Number number;
        if (fdw == null || (strA0F = fdw.A0F(i)) == 0 || strA0F.equals("auto")) {
            return null;
        }
        try {
            strA0F = Float.valueOf(AbstractC7607F5u.A1X(strA0F) ? i2 == Integer.MAX_VALUE ? 0.0f : HiY.A00(strA0F) * 0.01f * i2 : HiY.A01(strA0F));
            number = strA0F;
        } catch (ParsingException unused) {
            FFI.A01(null, FGI.A0M("Error parsing inline component style size ", strA0F), null);
            number = null;
        }
        if (number == null) {
            return null;
        }
        float fAbs = Math.abs(number.floatValue());
        Number number2 = number;
        if (fAbs > Float.MAX_VALUE) {
            number2 = null;
        }
        if (number2 != null) {
            return Integer.valueOf(Ab3.A01(number2.floatValue()));
        }
        return null;
    }

    public static final int A00(C7857FHt c7857FHt, int i, int i2) {
        int i3;
        int i4;
        int i5 = c7857FHt.A06;
        if (i5 == 1) {
            return (i2 - c7857FHt.A00) - c7857FHt.A03.bottom;
        }
        if (i5 != 2) {
            i4 = -c7857FHt.A00;
            i3 = c7857FHt.A03.bottom;
        } else {
            Rect rect = c7857FHt.A03;
            int i6 = (i2 - i) + rect.top;
            i3 = rect.bottom;
            i4 = i + (((i6 + i3) - c7857FHt.A00) / 2);
        }
        return i4 - i3;
    }

    public static final HxE<Integer, Integer> A02(int i, int i2) {
        int i3 = C7838FGu.A00.A01.A01;
        if (i2 != Integer.MAX_VALUE) {
            i2 = ATD.A04(i2, 0, i3);
        }
        int iA04 = ATD.A04(i, 0, Math.min(i2, i3));
        if (iA04 != 0 && iA04 != i2) {
            ADq aDq = C7839FGv.A00.A01;
            int i4 = aDq.A00;
            if (iA04 > i4) {
                iA04 = i4;
            }
            if (i2 != Integer.MAX_VALUE) {
                i2 = ATD.A04(i2, iA04, aDq.A01);
            }
        }
        return AnonymousClass002.A0p(Integer.valueOf(iA04), i2);
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Float;LX/FDW;III)LX/HxE<Ljava/lang/Integer;Ljava/lang/Integer;>; */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.HxE A03(X.FDW r4, java.lang.Float r5, int r6, int r7, int r8, int r9) {
        /*
            if (r5 == 0) goto L1f
            float r2 = r5.floatValue()
            float r1 = java.lang.Math.abs(r2)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1f
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f
            int r0 = X.Ab3.A01(r2)
        L1a:
            X.HxE r0 = A02(r0, r0)
            return r0
        L1f:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != 0) goto L39
            r3 = 2147483647(0x7fffffff, float:NaN)
        L28:
            java.lang.Integer r0 = A01(r4, r7, r3)
            if (r0 == 0) goto L3e
            int r0 = r0.intValue()
            if (r0 < 0) goto L3e
            int r0 = java.lang.Math.min(r0, r3)
            goto L1a
        L39:
            int r3 = android.view.View.MeasureSpec.getSize(r6)
            goto L28
        L3e:
            java.lang.Integer r0 = A01(r4, r8, r3)
            java.lang.Integer r2 = A01(r4, r9, r3)
            r1 = 0
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
            int r1 = X.ATD.A04(r0, r1, r3)
        L51:
            if (r2 == 0) goto L5b
            int r0 = r2.intValue()
            int r3 = X.ATD.A04(r0, r1, r3)
        L5b:
            X.HxE r0 = A02(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7857FHt.A03(X.FDW, java.lang.Float, int, int, int, int):X.HxE");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.ascent;
            int i4 = fontMetricsInt.descent;
            int iA00 = A00(this, i3, i4);
            int i5 = this.A00 + iA00;
            Rect rect = this.A03;
            int i6 = iA00 - rect.top;
            fontMetricsInt.ascent = Math.min(i3, i6);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i6);
            int i7 = rect.bottom + i5;
            fontMetricsInt.descent = Math.max(i4, i7);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, i7);
        }
        Rect rect2 = this.A03;
        return rect2.left + this.A01 + rect2.right;
    }

    public C7857FHt(Rect rect, FET fet, String str, int i, int i2, int i3, long j) {
        this.A02 = j;
        this.A04 = fet;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = rect;
        this.A06 = i3;
        this.A05 = str;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
