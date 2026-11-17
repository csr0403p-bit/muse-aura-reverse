package X;

import java.util.regex.Pattern;

/* renamed from: X.E2n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6361E2n {
    public static final Pattern A02 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int A00 = -1;
    public int A01 = -1;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C5402Dhv r7) throws java.lang.NumberFormatException {
        /*
            r6 = this;
            r3 = 0
        L1:
            X.Dhw[] r1 = r7.A01
            int r0 = r1.length
            if (r3 >= r0) goto L62
            r5 = r1[r3]
            boolean r0 = r5 instanceof X.E3W
            java.lang.String r4 = "iTunSMPB"
            r2 = 1
            if (r0 == 0) goto L43
            X.E3W r5 = (X.E3W) r5
            java.lang.String r0 = r5.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            java.lang.String r1 = r5.A02
        L1b:
            java.util.regex.Pattern r0 = X.C6361E2n.A02
            java.util.regex.Matcher r4 = r0.matcher(r1)
            boolean r0 = r4.find()
            if (r0 == 0) goto L5e
            java.lang.String r0 = r4.group(r2)     // Catch: java.lang.NumberFormatException -> L5e
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r0, r2)     // Catch: java.lang.NumberFormatException -> L5e
            r0 = 2
            java.lang.String r0 = r4.group(r0)     // Catch: java.lang.NumberFormatException -> L5e
            int r0 = java.lang.Integer.parseInt(r0, r2)     // Catch: java.lang.NumberFormatException -> L5e
            if (r1 > 0) goto L3e
            if (r0 <= 0) goto L5e
        L3e:
            r6.A00 = r1     // Catch: java.lang.NumberFormatException -> L5e
            r6.A01 = r0     // Catch: java.lang.NumberFormatException -> L5e
            goto L61
        L43:
            boolean r0 = r5 instanceof X.E3V
            if (r0 == 0) goto L5e
            X.E3V r5 = (X.E3V) r5
            java.lang.String r1 = "com.apple.iTunes"
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
            java.lang.String r0 = r5.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            java.lang.String r1 = r5.A02
            goto L1b
        L5e:
            int r3 = r3 + 1
            goto L1
        L61:
            return
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6361E2n.A00(X.Dhv):void");
    }
}
