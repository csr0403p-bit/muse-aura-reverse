package X;

/* renamed from: X.Hix, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10454Hix {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(android.graphics.RectF r10, android.text.Layout r11, android.text.Spannable r12, android.text.TextPaint r13, float r14, float r15, float r16, float r17, int r18, int r19, int r20, boolean r21, boolean r22, boolean r23) {
        /*
            r9 = r14
        L1:
            int r0 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r0 > 0) goto La8
            float r4 = r14 + r15
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            if (r23 == 0) goto L9d
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            r3.<init>(r4)
        L11:
            r2 = 0
            r1 = r19
            r0 = r20
            r12.setSpan(r3, r1, r0, r2)
            android.text.Layout$Alignment r7 = r11.getAlignment()
            X.C7384Etj.A0U(r7)
            float r0 = r10.right
            int r6 = X.Ab3.A01(r0)
            r5 = r18
            r1 = r5
            int r0 = r12.length()
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r12, r2, r0, r13, r6)
            android.text.StaticLayout$Builder r2 = r0.setAlignment(r7)
            r0 = -1
            if (r5 != r0) goto L3b
            r1 = 2147483647(0x7fffffff, float:NaN)
        L3b:
            android.text.StaticLayout$Builder r0 = r2.setMaxLines(r1)
            android.text.StaticLayout r8 = r0.build()
            X.C7384Etj.A0X(r8)
            int r1 = r8.getHeight()
            if (r23 == 0) goto L9b
            float r2 = r16 * r4
        L4e:
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r6 = X.BV7.A1R(r0)
            float r1 = (float) r1
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r7 = X.BV7.A1R(r0)
            if (r21 != 0) goto L6f
            int r0 = r8.getWidth()
            float r2 = (float) r0
            float r0 = r10.right
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L99
            if (r6 == 0) goto L99
        L6f:
            r6 = 1
        L70:
            if (r22 != 0) goto L7a
            float r0 = r10.bottom
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L97
            if (r7 == 0) goto L97
        L7a:
            r2 = 1
        L7b:
            if (r18 <= 0) goto L84
            int r1 = r8.getLineCount()
            r0 = 0
            if (r1 > r5) goto L85
        L84:
            r0 = 1
        L85:
            if (r6 == 0) goto L93
            if (r2 == 0) goto L93
            if (r0 == 0) goto L93
            float r14 = r4 + r17
            r9 = r4
        L8e:
            r12.removeSpan(r3)
            goto L1
        L93:
            float r4 = r4 - r17
            r15 = r4
            goto L8e
        L97:
            r2 = 0
            goto L7b
        L99:
            r6 = 0
            goto L70
        L9b:
            r2 = r4
            goto L4e
        L9d:
            int r0 = X.Ab3.A01(r4)
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r3.<init>(r0)
            goto L11
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10454Hix.A00(android.graphics.RectF, android.text.Layout, android.text.Spannable, android.text.TextPaint, float, float, float, float, int, int, int, boolean, boolean, boolean):float");
    }
}
