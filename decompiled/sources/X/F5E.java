package X;

import java.io.FileFilter;

/* loaded from: classes5.dex */
public final class F5E implements FileFilter {
    public final int $t;
    public final Object A00;

    public F5E(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
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
                case 0: goto L20;
                case 1: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "large_"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "_anr_prop.txt"
        L17:
            boolean r1 = r1.endsWith(r0)
            r0 = 1
            if (r1 != 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "anr_report_"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = ".dmp"
            goto L17
        L33:
            java.lang.Object r2 = r2.A00
            X.C4g r2 = (X.EnumC3223C4g) r2
            if (r3 == 0) goto L1e
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = r2.prefix
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L49
            X.C4g r0 = X.EnumC3223C4g.LARGE_REPORT
            if (r2 != r0) goto L1e
        L49:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "suppl_"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "_prop.txt"
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5E.accept(java.io.File):boolean");
    }
}
