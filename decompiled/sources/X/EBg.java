package X;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class EBg implements InputFilter {
    public AbstractC6499E9g A00;
    public final TextView A01;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 != 3) goto L10;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r2 = r3.A01
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L18
            X.E9X r0 = X.E9X.A00()
            int r1 = r0.A01()
            if (r1 == 0) goto L47
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L47
        L18:
            return r4
        L19:
            if (r9 != 0) goto L2a
            if (r8 != 0) goto L2a
            int r0 = r7.length()
            if (r0 != 0) goto L2a
            java.lang.CharSequence r0 = r2.getText()
            if (r4 != r0) goto L2a
            return r4
        L2a:
            if (r4 == 0) goto L18
            if (r5 != 0) goto L42
            int r0 = r4.length()
            if (r6 != r0) goto L42
        L34:
            X.E9X r2 = X.E9X.A00()
            int r1 = r4.length()
            r0 = 0
            java.lang.CharSequence r4 = r2.A03(r4, r0, r1, r0)
            return r4
        L42:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
            goto L34
        L47:
            X.E9X r1 = X.E9X.A00()
            X.E9g r0 = r3.A00
            if (r0 != 0) goto L56
            X.EBh r0 = new X.EBh
            r0.<init>(r2, r3)
            r3.A00 = r0
        L56:
            r1.A06(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBg.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public EBg(TextView textView) {
        this.A01 = textView;
    }
}
