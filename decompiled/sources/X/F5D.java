package X;

import java.io.FileFilter;

/* loaded from: classes5.dex */
public final class F5D implements FileFilter {
    public final int $t;

    public F5D(int i) {
        this.$t = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[ORIG_RETURN, RETURN] */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accept(java.io.File r3) {
        /*
            r2 = this;
            int r0 = r2.$t
            switch(r0) {
                case 0: goto L47;
                case 1: goto L74;
                case 2: goto L2f;
                case 3: goto L64;
                case 4: goto L69;
                case 5: goto L22;
                case 6: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
        L6:
            return r2
        L7:
            if (r3 == 0) goto L5
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L5
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "session_"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L62
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "sess_"
            goto L2a
        L22:
            if (r3 == 0) goto L5
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "_attempt"
        L2a:
            boolean r0 = r1.startsWith(r0)
            goto L44
        L2f:
            java.util.List r0 = X.C4E.A05
            X.C1H.A00(r3)
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L62
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "_attach.txt"
            boolean r0 = r1.endsWith(r0)
        L44:
            if (r0 == 0) goto L5
            goto L62
        L47:
            boolean r0 = r3.isFile()
            r2 = 0
            if (r0 == 0) goto L6
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "batch-"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L6
            java.lang.String r0 = ".json"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L6
        L62:
            r2 = 1
            return r2
        L64:
            java.util.List r0 = X.C4E.A05
            X.C1H.A00(r3)
        L69:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = ".dmp"
            boolean r2 = r1.endsWith(r0)
            return r2
        L74:
            boolean r2 = r3.isDirectory()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5D.accept(java.io.File):boolean");
    }
}
