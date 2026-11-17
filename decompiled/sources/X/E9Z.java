package X;

import java.text.BreakIterator;

/* loaded from: classes5.dex */
public abstract class E9Z {
    public static final E9X A02() {
        if (AnonymousClass002.A1X(E9X.A08)) {
            E9X e9xA00 = E9X.A00();
            if (e9xA00.A01() == 1) {
                return e9xA00;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.String r13, int r14) {
        /*
            X.E9X r2 = A02()
            r7 = r13
            r13 = r14
            if (r2 == 0) goto L48
            int r0 = r2.A01()
            boolean r1 = X.BV7.A1Q(r0)
            java.lang.String r0 = "Not initialized yet"
            X.BeS.A07(r1, r0)
            java.lang.String r0 = "charSequence cannot be null"
            X.BeS.A03(r7, r0)
            X.E9b r1 = r2.A00
            boolean r0 = r1.A01
            if (r0 != 0) goto L48
            X.E9T r5 = r1.A02
            if (r14 < 0) goto L48
            int r4 = r7.length()
            if (r14 >= r4) goto L48
            boolean r0 = r7 instanceof android.text.Spanned
            r3 = 0
            if (r0 == 0) goto L54
            r2 = r7
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r14 + 1
            java.lang.Class<X.E9U> r0 = X.E9U.class
            java.lang.Object[] r1 = r2.getSpans(r14, r1, r0)
            X.E9U[] r1 = (X.E9U[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L54
            r0 = r1[r3]
            int r1 = r2.getSpanEnd(r0)
        L45:
            r0 = -1
            if (r1 != r0) goto L53
        L48:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r7)
            int r1 = r0.following(r13)
        L53:
            return r1
        L54:
            int r0 = r14 + (-16)
            int r9 = java.lang.Math.max(r3, r0)
            int r0 = r14 + 16
            int r10 = java.lang.Math.min(r4, r0)
            r6 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 1
            r8 = r6
            r14 = r12
            java.lang.Object r0 = X.E9T.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.E9V r0 = (X.E9V) r0
            if (r0 == 0) goto L48
            int r1 = r0.A00
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9Z.A00(java.lang.String, int):int");
    }

    public static final int A01(String str, int i) {
        int iA02;
        E9X e9xA02 = A02();
        if (e9xA02 != null && (iA02 = e9xA02.A02(str, Math.max(0, i - 1))) != -1) {
            return iA02;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
