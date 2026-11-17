package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes5.dex */
public abstract class F3F {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        r2 = java.security.MessageDigest.getInstance(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto.SHA_256);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        r1 = r5.signatures[0].toByteArray();
        r2.update(r1, 0, r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        r1 = android.util.Base64.encodeToString(r2.digest(), 11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
    
        if (X.AbstractC06987ml.A02(r6) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007b, code lost:
    
        r0 = "Jm4bl26QMphvIVgzVUeQb6f37Ys3IKRmCw0LBgLJBzs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        return r0.equals(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        r0 = "uSEJtZCVlVzKr17Lzw8VPslkCkZYwQFmetlrfkmaQJI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ae, code lost:
    
        r2 = "FBNSPreloadAuthUtils";
        r1 = new java.lang.Object[]{r0};
        r0 = "AssertionError while encoding signature hash to Base64";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
    
        X.BzX.A00(r2, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b9, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(android.content.Context r6, java.lang.String r7) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException {
        /*
            r3 = 0
            if (r7 == 0) goto L13
            java.lang.String r0 = "com.facebook.services"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L14
            java.lang.String r0 = "com.facebook.services.dev"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L14
        L13:
            return r3
        L14:
            r2 = 1
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.RuntimeException -> L90 android.content.pm.PackageManager.NameNotFoundException -> La3
            if (r1 == 0) goto L13
            r0 = 4160(0x1040, float:5.83E-42)
            android.content.pm.PackageInfo r5 = r1.getPackageInfo(r7, r0)     // Catch: java.lang.RuntimeException -> L90 android.content.pm.PackageManager.NameNotFoundException -> La3
            if (r5 == 0) goto L13
            android.content.pm.ApplicationInfo r1 = r5.applicationInfo
            if (r1 == 0) goto L13
            boolean r0 = r1.enabled
            if (r0 == 0) goto L13
            android.content.pm.Signature[] r0 = r5.signatures
            if (r0 == 0) goto L13
            int r0 = r0.length
            if (r0 != r2) goto L13
            int r1 = r1.flags
            r0 = r1 & 1
            if (r0 != 0) goto L3d
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L3d
            return r3
        L3d:
            java.lang.String[] r4 = r5.requestedPermissions
            if (r4 == 0) goto L13
            int[] r2 = r5.requestedPermissionsFlags
            if (r2 == 0) goto L13
            r1 = 0
        L46:
            int r0 = r4.length
            if (r1 >= r0) goto L55
            int r0 = r2.length
            if (r1 >= r0) goto L55
            r0 = r2[r1]
            r0 = r0 & 2
            if (r0 == 0) goto L13
            int r1 = r1 + 1
            goto L46
        L55:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L86
            if (r2 == 0) goto L13
            android.content.pm.Signature[] r0 = r5.signatures
            r0 = r0[r3]
            byte[] r1 = r0.toByteArray()
            int r0 = r1.length
            r2.update(r1, r3, r0)
            byte[] r1 = r2.digest()
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.AssertionError -> Lad
            if (r1 == 0) goto L13
            boolean r0 = X.AbstractC06987ml.A02(r6)
            if (r0 == 0) goto L82
            java.lang.String r0 = "Jm4bl26QMphvIVgzVUeQb6f37Ys3IKRmCw0LBgLJBzs"
        L7d:
            boolean r3 = r0.equals(r1)
            return r3
        L82:
            java.lang.String r0 = "uSEJtZCVlVzKr17Lzw8VPslkCkZYwQFmetlrfkmaQJI"
            goto L7d
        L86:
            r0 = move-exception
            java.lang.String r2 = "FBNSPreloadAuthUtils"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "SHA-256 algorithm not available"
            goto Lb6
        L90:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto La2
            java.lang.String r2 = "FBNSPreloadAuthUtils"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "DeadObjectException while getting package info"
            goto Lb6
        La2:
            throw r1
        La3:
            r0 = move-exception
            java.lang.String r2 = "FBNSPreloadAuthUtils"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Package not found while getting signature hash"
            goto Lb6
        Lad:
            r0 = move-exception
            java.lang.String r2 = "FBNSPreloadAuthUtils"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "AssertionError while encoding signature hash to Base64"
        Lb6:
            X.BzX.A00(r2, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F3F.A01(android.content.Context, java.lang.String):boolean");
    }

    public static void A00(Context context, Intent intent) {
        C7m8 c7m8 = new C7m8();
        c7m8.A0B = true;
        c7m8.A09 = context.getPackageName();
        PendingIntent pendingIntentA01 = c7m8.A01(context, 0, 134217728);
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putParcelable("auth_pending_intent", pendingIntentA01);
        intent.putExtra("auth_bundle", bundleA0N);
    }
}
