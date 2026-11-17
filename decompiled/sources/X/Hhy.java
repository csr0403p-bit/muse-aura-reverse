package X;

import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class Hhy {
    public int A00;
    public int A01;
    public CharSequence A02;
    public final BreakIterator A03;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 == (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.Hhy r3, int r4, boolean r5) {
        /*
            int r0 = r3.A01
            int r4 = r4 - r0
            A02(r3, r4)
            boolean r0 = r3.A04(r4)
            r2 = -1
            if (r0 == 0) goto L21
            java.text.BreakIterator r1 = r3.A03
            boolean r0 = r1.isBoundary(r4)
            if (r0 == 0) goto L29
            boolean r0 = r3.A03(r4)
            if (r0 == 0) goto L1d
            if (r5 != 0) goto L29
        L1d:
            int r0 = r3.A01
            int r4 = r4 + r0
            return r4
        L21:
            boolean r0 = r3.A03(r4)
            if (r0 == 0) goto L2f
            java.text.BreakIterator r1 = r3.A03
        L29:
            int r4 = r1.preceding(r4)
            if (r4 != r2) goto L1d
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hhy.A00(X.Hhy, int, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 == (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.Hhy r3, int r4, boolean r5) {
        /*
            int r0 = r3.A01
            int r4 = r4 - r0
            A02(r3, r4)
            boolean r0 = r3.A03(r4)
            r2 = -1
            if (r0 == 0) goto L21
            java.text.BreakIterator r1 = r3.A03
            boolean r0 = r1.isBoundary(r4)
            if (r0 == 0) goto L29
            boolean r0 = r3.A04(r4)
            if (r0 == 0) goto L1d
            if (r5 != 0) goto L29
        L1d:
            int r0 = r3.A01
            int r4 = r4 + r0
            return r4
        L21:
            boolean r0 = r3.A04(r4)
            if (r0 == 0) goto L2f
            java.text.BreakIterator r1 = r3.A03
        L29:
            int r4 = r1.following(r4)
            if (r4 != r2) goto L1d
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hhy.A01(X.Hhy, int, boolean):int");
    }

    public static void A02(Hhy hhy, int i) {
        if (i < 0 || i > hhy.A00 - hhy.A01) {
            throw BV5.A0Q(C8j2.A00(17), i + hhy.A01);
        }
    }

    private boolean A03(int i) {
        int i2 = this.A01;
        int i3 = i + i2;
        if (i3 <= i2 || i3 > this.A00) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(this.A02, i3));
    }

    private boolean A04(int i) {
        int i2 = this.A01;
        int i3 = i + i2;
        if (i3 < i2 || i3 >= this.A00) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(this.A02, i3));
    }

    public static boolean A05(int i) {
        return i == 23 || i == 20 || i == 22 || i == 30 || i == 29 || i == 24 || i == 21;
    }

    public final boolean A07(int i) {
        if (this.A01 >= i || i > this.A00) {
            return false;
        }
        return A05(Character.getType(Character.codePointBefore(this.A02, i)));
    }

    public final boolean A08(int i) {
        if (this.A01 > i || i >= this.A00) {
            return false;
        }
        return A05(Character.getType(Character.codePointAt(this.A02, i)));
    }

    public Hhy(Locale locale) {
        this.A03 = BreakIterator.getWordInstance(locale);
    }

    public final void A06(CharSequence charSequence, int i, int i2) {
        if (i2 > charSequence.length()) {
            throw BV6.A0g(FGI.A0Z("Invalid range: [", ", ", ") in sequence of length ", i, i2, charSequence.length()));
        }
        this.A02 = charSequence;
        this.A01 = Math.max(0, i - 50);
        int iMin = Math.min(charSequence.length(), i2 + 50);
        this.A00 = iMin;
        this.A03.setText(charSequence.subSequence(this.A01, iMin).toString());
    }
}
