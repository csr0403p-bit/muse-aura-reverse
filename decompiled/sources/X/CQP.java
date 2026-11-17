package X;

import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class CQP {
    public final PackageManager A00;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CZx A00() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            r3 = 0
            android.content.pm.PackageManager r2 = r9.A00     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            java.lang.String r1 = "com.facebook.appmanager"
            r0 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L5c
            java.lang.Integer r4 = X.CQO.A00(r2)
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            if (r3 == 0) goto L83
            java.lang.String r1 = r3.dataDir
            if (r1 == 0) goto L83
            java.lang.String r0 = "/0/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L76
            java.lang.Integer r5 = X.C79.A00
        L25:
            android.content.pm.Signature[] r3 = r2.signatures
            if (r3 == 0) goto L73
            int r1 = r3.length
            r0 = 1
            if (r1 != r0) goto L73
            r0 = 0
            r1 = r3[r0]
            android.content.pm.Signature r0 = X.CQQ.A01
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
            java.lang.Integer r6 = X.C79.A00
        L3a:
            int r1 = r2.versionCode
            r0 = 20297189(0x135b5e5, float:3.3374953E-38)
            r8 = -1
            if (r1 < r0) goto L43
            r8 = 1
        L43:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L51
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L51
            java.lang.String r0 = "com.facebook.appmanager.api.level"
            int r8 = r1.getInt(r0, r8)
        L51:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            boolean r9 = r0.enabled
            int r7 = r2.versionCode
            X.CZx r3 = new X.CZx
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L5c:
            return r3
        L5d:
            android.content.pm.Signature r0 = X.CQQ.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            java.lang.Integer r6 = X.C79.A01
            goto L3a
        L68:
            android.content.pm.Signature r0 = X.CQQ.A02
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            java.lang.Integer r6 = X.C79.A0C
            goto L3a
        L73:
            java.lang.Integer r6 = X.C79.A0K
            goto L3a
        L76:
            java.lang.String r1 = r3.dataDir
            java.lang.String r0 = "/10/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L83
            java.lang.Integer r5 = X.C79.A01
            goto L25
        L83:
            java.lang.Integer r5 = X.C79.A0C
            goto L25
        L86:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQP.A00():X.CZx");
    }

    public CQP(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
