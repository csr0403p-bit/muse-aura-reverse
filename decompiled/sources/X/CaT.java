package X;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.zzl;

/* loaded from: classes5.dex */
public final class CaT {
    public static CaT A01;
    public final Context A00;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(android.content.pm.PackageInfo r6, boolean r7) {
        /*
            r3 = 1
            r5 = 0
            if (r7 == 0) goto L5f
            if (r6 == 0) goto L36
            java.lang.String r0 = "com.android.vending"
            java.lang.String r1 = r6.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
        L18:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L23
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            r7 = 1
            if (r0 != 0) goto L24
        L23:
            r7 = 0
        L24:
            android.content.pm.Signature[] r1 = r6.signatures
            if (r1 == 0) goto L36
            if (r7 == 0) goto L56
            com.google.android.gms.common.zzj[] r4 = X.CaV.A00
        L2c:
            int r0 = r1.length
            if (r0 == r3) goto L37
            java.lang.String r1 = "GoogleSignatureVerifier"
            java.lang.String r0 = "Package has more than one signature."
            android.util.Log.w(r1, r0)
        L36:
            return r5
        L37:
            r2 = 0
            r0 = r1[r5]
            byte[] r0 = r0.toByteArray()
            com.google.android.gms.common.zzk r1 = new com.google.android.gms.common.zzk
            r1.<init>(r0)
        L43:
            int r0 = r4.length
            if (r2 >= r0) goto L36
            r0 = r4[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            r0 = r4[r2]
            if (r0 == 0) goto L36
            return r3
        L53:
            int r2 = r2 + 1
            goto L43
        L56:
            com.google.android.gms.common.zzj[] r0 = X.CaV.A00
            r0 = r0[r5]
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[]{r0}
            goto L2c
        L5f:
            if (r6 == 0) goto L36
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CaT.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public CaT(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static CaT A00(Context context) {
        CRy.A03(context);
        synchronized (CaT.class) {
            if (A01 == null) {
                zzl zzlVar = CaW.A01;
                synchronized (CaW.class) {
                    if (CaW.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        CaW.A00 = context.getApplicationContext();
                    }
                }
                A01 = new CaT(context);
            }
        }
        return A01;
    }
}
