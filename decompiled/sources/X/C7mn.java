package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;

/* renamed from: X.7mn, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C06967mj A01(android.content.Context r6, android.content.Intent r7, int r8, long r9) throws java.security.NoSuchAlgorithmException {
        /*
            r0 = 0
            if (r7 == 0) goto L30
            X.7mj r5 = X.AbstractC06887mb.A00(r6, r7, r0, r8)
            if (r5 == 0) goto L28
            r0 = 32
            long r3 = r9 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            int r1 = android.os.Binder.getCallingPid()
            int r0 = android.os.Process.myPid()
            if (r1 == r0) goto L52
            int r1 = android.os.Binder.getCallingUid()
            int r0 = r5.A00
            if (r1 == r0) goto L52
            android.os.Binder.getCallingUid()
        L28:
            java.lang.String r0 = "CI_SKIP_CALLER_FROM_ACTIVITY"
            boolean r0 = r7.hasExtra(r0)
            if (r0 != 0) goto L53
        L30:
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L53
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L53
            r0 = 64
            long r3 = r9 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            r0 = r6
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = X.AbstractC07007mp.A00(r0)
            if (r1 == 0) goto L53
            r0 = 1
            X.7mj r5 = X.C06967mj.A02(r6, r1, r0)
        L52:
            return r5
        L53:
            r0 = 128(0x80, double:6.32E-322)
            long r9 = r9 & r0
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L68
            int r1 = android.os.Binder.getCallingPid()
            int r0 = android.os.Process.myPid()
            if (r1 != r0) goto L68
            r5 = 0
            return r5
        L68:
            int r3 = android.os.Binder.getCallingUid()
            r2 = 1
            java.lang.String[] r1 = X.AbstractC06937mg.A02(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            r0 = 0
            r1 = r1[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            r0 = 64
            X.7mi r1 = X.AbstractC06937mg.A00(r6, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            java.util.HashSet r0 = X.C60O.A13()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            X.7mj r5 = X.C06967mj.A03(r1, r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            return r5
        L83:
            r2 = move-exception
            java.lang.String r0 = "Unable to get packageInfo for uid "
            java.lang.String r1 = X.FGI.A0H(r0, r3)
            com.facebook.secure.trustedapp.exception.PackageNameNotFoundException r0 = new com.facebook.secure.trustedapp.exception.PackageNameNotFoundException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mn.A01(android.content.Context, android.content.Intent, int, long):X.7mj");
    }

    public static C06967mj A00(BroadcastReceiver broadcastReceiver, Context context) {
        String sentFromPackage;
        if (Build.VERSION.SDK_INT < 34 || (sentFromPackage = broadcastReceiver.getSentFromPackage()) == null) {
            return null;
        }
        return C06967mj.A02(context, sentFromPackage, true);
    }
}
