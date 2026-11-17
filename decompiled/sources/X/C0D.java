package X;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class C0D extends C0J {
    public static final Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern A02 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D A01(X.C0C r14, java.io.File r15, long r16) {
        /*
            r6 = r15
            r10 = r16
            java.lang.String r1 = r15.getName()
            java.lang.String r0 = ".v3.exo"
            boolean r0 = r1.endsWith(r0)
            r5 = 0
            r2 = r14
            if (r0 != 0) goto L63
            java.lang.String r4 = r15.getName()
            java.util.regex.Pattern r0 = X.C0D.A01
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.matches()
            r3 = 1
            if (r0 == 0) goto L2d
            java.lang.String r0 = X.BV6.A0p(r1, r3)
            java.lang.String r0 = androidx.media3.common.util.Util.A0J(r0)
            if (r0 != 0) goto L3d
        L2c:
            return r5
        L2d:
            java.util.regex.Pattern r0 = X.C0D.A00
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L2c
            java.lang.String r0 = X.BV6.A0p(r1, r3)
        L3d:
            java.io.File r12 = r15.getParentFile()
            X.C1G.A05(r12)
            X.C0H r0 = r14.A00(r0)
            int r13 = r0.A01
            r0 = 2
            long r14 = X.BV8.A0M(r1, r0)
            r0 = 3
            long r16 = X.BV8.A0M(r1, r0)
            java.io.File r1 = A03(r12, r13, r14, r16)
            boolean r0 = r6.renameTo(r1)
            if (r0 == 0) goto L2c
            r6 = r1
            java.lang.String r1 = r1.getName()
        L63:
            java.util.regex.Pattern r0 = X.C0D.A02
            java.util.regex.Matcher r3 = r0.matcher(r1)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L2c
            r0 = 1
            int r1 = X.BV8.A0D(r3, r0)
            android.util.SparseArray<java.lang.String> r0 = r2.A01
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L2c
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L88
            long r10 = r6.length()
        L88:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L2c
            r0 = 2
            long r8 = X.BV8.A0M(r3, r0)
            r0 = 3
            long r12 = X.BV8.A0M(r3, r0)
            X.C0D r5 = new X.C0D
            r5.<init>(r6, r7, r8, r10, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D.A01(X.C0C, java.io.File, long):X.C0D");
    }

    public static int A00(char c) {
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        if (c < 'A') {
            return -1;
        }
        if (c <= 'F') {
            return c - '7';
        }
        if (c < 'a') {
            return -1;
        }
        int i = c - 'W';
        if (c > 'f') {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D A02(X.C0C r22, java.io.File r23, java.lang.String r24, long r25) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D.A02(X.C0C, java.io.File, java.lang.String, long):X.C0D");
    }

    public static File A03(File file, int i, long j, long j2) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(i);
        BV7.A1H(".", sbA0w, j);
        sbA0w.append(j2);
        return C3cG.A0O(file, AnonymousClass001.A0v(".v3.exo", sbA0w));
    }
}
