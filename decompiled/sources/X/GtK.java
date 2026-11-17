package X;

import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes6.dex */
public final class GtK implements AutoCloseable {
    public static final char[] A01 = {'*', '|', '_', '-'};
    public final GtL A00;

    public final boolean A05() {
        boolean z = false;
        while (Gt5.A07(this.A00.A06())) {
            A01(this);
            z = true;
        }
        return z;
    }

    public static String A00(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbA0t.append(c2);
                    c = 0;
                }
            } else {
                sbA0t.append(c2);
            }
            c = c2;
        }
        return Gt5.A01(sbA0t);
    }

    public static final void A01(GtK gtK) {
        GtL gtL = gtK.A00;
        if (gtL.A0F()) {
            return;
        }
        gtL.A02++;
    }

    public static boolean A02(char c) {
        if (c != '-') {
            C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
            if ((c < '0' || (c > '9' && c != '_')) && !Gt5.A05(c) && c < '\u0080') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtK.A03():java.lang.String");
    }

    public final boolean A06(char c) throws IOException {
        GtL gtL = this.A00;
        if (!gtL.A0H(c)) {
            return false;
        }
        gtL.A05();
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public GtK(String str) {
        C7318Ekj<String[]> c7318Ekj = GtL.A0B;
        this.A00 = new GtL(new StringReader(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r5 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0037 A[EDGE_INSN: B:44:0x0037->B:15:0x0037 BREAK  A[LOOP:0: B:6:0x001e->B:33:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A04(char r10, char r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r7 = X.AbstractC7609F5w.A0t()
            X.GtL r6 = r9.A00
            int r1 = r6.A00
            int r0 = r6.A02
            int r1 = r1 - r0
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 >= r0) goto L12
            r0 = 0
            r6.A04 = r0
        L12:
            X.GtL.A03(r6)
            int r0 = r6.A02
            r6.A01 = r0
            r9 = 0
            r8 = 0
            r5 = 0
            r4 = 0
            r3 = 0
        L1e:
            boolean r0 = r6.A0F()
            if (r0 != 0) goto L37
            char r2 = r6.A05()
            r0 = 92
            r1 = 1
            if (r9 != r0) goto L54
            r0 = 81
            if (r2 != r0) goto L4e
            r3 = 1
        L32:
            r7.append(r2)
        L35:
            if (r4 > 0) goto L6b
        L37:
            java.lang.String r2 = X.Gt5.A01(r7)
            if (r4 <= 0) goto L7d
            r6.A0D()
            java.lang.String r1 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r1 = X.FGI.A0U(r1, r2, r0)
            org.jsoup.helper.ValidationException r0 = new org.jsoup.helper.ValidationException
            r0.<init>(r1)
            throw r0
        L4e:
            r0 = 69
            if (r2 != r0) goto L32
            r3 = 0
            goto L32
        L54:
            r0 = 39
            if (r2 != r0) goto L74
            if (r8 != 0) goto L5c
            r5 = r5 ^ 1
        L5c:
            if (r5 != 0) goto L32
        L5e:
            if (r8 != 0) goto L32
            if (r3 != 0) goto L32
            if (r2 != r10) goto L6d
            int r4 = r4 + 1
            if (r4 <= r1) goto L35
        L68:
            r7.append(r2)
        L6b:
            r9 = r2
            goto L1e
        L6d:
            if (r2 != r11) goto L32
            int r4 = r4 + (-1)
            if (r4 <= 0) goto L37
            goto L68
        L74:
            r0 = 34
            if (r2 != r0) goto L5c
            if (r5 != 0) goto L32
            r8 = r8 ^ 1
            goto L5e
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtK.A04(char, char):java.lang.String");
    }
}
