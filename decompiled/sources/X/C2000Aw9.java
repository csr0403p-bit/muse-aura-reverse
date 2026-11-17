package X;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aw9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2000Aw9 {
    public char[] A00;
    public final Layout A01;
    public final List<Integer> A02;
    public final List<Bidi> A03;
    public final boolean[] A04;

    public static final int A00(C2000Aw9 c2000Aw9, int i, int i2) {
        while (i > i2) {
            char cCharAt = c2000Aw9.A01.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\u1680') {
                if (C7384Etj.A00(cCharAt, 8192) < 0 || C7384Etj.A00(cCharAt, 8202) > 0) {
                    if (cCharAt != '\u205f' && cCharAt != '\u3000') {
                        break;
                    }
                } else if (cCharAt == '\u2007') {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.text.Bidi A01(X.C2000Aw9 r13, int r14) {
        /*
            boolean[] r2 = r13.A04
            boolean r0 = r2[r14]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r13.A03
            java.lang.Object r6 = r0.get(r14)
            java.text.Bidi r6 = (java.text.Bidi) r6
            return r6
        Lf:
            r8 = 0
            if (r14 != 0) goto L6b
            r6 = 0
        L13:
            java.util.List<java.lang.Integer> r5 = r13.A02
            int r4 = X.C8j4.A0H(r5, r14)
            int r11 = r4 - r6
            char[] r7 = r13.A00
            if (r7 == 0) goto L22
            int r0 = r7.length
            if (r0 >= r11) goto L24
        L22:
            char[] r7 = new char[r11]
        L24:
            r1 = r7
            android.text.Layout r3 = r13.A01
            java.lang.CharSequence r0 = r3.getText()
            android.text.TextUtils.getChars(r0, r6, r4, r7, r8)
            boolean r0 = java.text.Bidi.requiresBidi(r7, r8, r11)
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L52
            if (r14 != 0) goto L64
            r0 = 0
        L39:
            int r0 = r3.getLineForOffset(r0)
            int r3 = r3.getParagraphDirection(r0)
            r0 = -1
            boolean r12 = X.AnonymousClass002.A1Q(r3, r0)
            java.text.Bidi r6 = new java.text.Bidi
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r4) goto L53
        L52:
            r6 = r9
        L53:
            java.util.List<java.text.Bidi> r0 = r13.A03
            r0.set(r14, r6)
            r2[r14] = r4
            if (r6 == 0) goto L61
            char[] r1 = r13.A00
            if (r7 != r1) goto L61
            r1 = r9
        L61:
            r13.A00 = r1
            return r6
        L64:
            int r0 = r14 + (-1)
            int r0 = X.C8j4.A0H(r5, r0)
            goto L39
        L6b:
            java.util.List<java.lang.Integer> r1 = r13.A02
            int r0 = r14 + (-1)
            int r6 = X.C8j4.A0H(r1, r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2000Aw9.A01(X.Aw9, int):java.text.Bidi");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0168, code lost:
    
        if (r17 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0147, code lost:
    
        if (r17 == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A02(int r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2000Aw9.A02(int, boolean, boolean):float");
    }

    public C2000Aw9(Layout layout) {
        this.A01 = layout;
        ArrayList arrayListA0h = C3cG.A0h();
        int iA0H = 0;
        do {
            int iA08 = C7BY.A08(this.A01.getText(), '\n', iA0H);
            iA0H = iA08 < 0 ? C8j3.A0H(this.A01) : iA08 + 1;
            C60Q.A1P(arrayListA0h, iA0H);
        } while (iA0H < C8j3.A0H(this.A01));
        this.A02 = arrayListA0h;
        int size = arrayListA0h.size();
        ArrayList arrayListA11 = C60O.A11(size);
        for (int i = 0; i < size; i++) {
            arrayListA11.add(null);
        }
        this.A03 = arrayListA11;
        this.A04 = new boolean[arrayListA0h.size()];
        this.A02.size();
    }
}
