package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class CCw extends CD8 {
    public static CCw A00;
    public static final C3299CCv A01 = new C3299CCv();

    public static final Context A00(Context context) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = BV5.A0A(context).applicationInfo;
            if (applicationInfo != null) {
                String str = applicationInfo.sourceDir;
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 != null && !C7384Etj.areEqual(str, applicationInfo2.sourceDir)) {
                    CFK.A0F("FbVoltronModuleLoader", "Need to update context. Expected %s, got %s", str, applicationInfo2.sourceDir);
                    Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 1);
                    ApplicationInfo applicationInfo3 = contextCreatePackageContext.getApplicationInfo();
                    if (C7384Etj.areEqual(str, applicationInfo3 != null ? applicationInfo3.sourceDir : null)) {
                        ApplicationInfo applicationInfo4 = contextCreatePackageContext.getApplicationInfo();
                        CFK.A0F("FbVoltronModuleLoader", "Context was updated successfully to %s by createPackageContext", applicationInfo4 != null ? applicationInfo4.sourceDir : null);
                        return contextCreatePackageContext;
                    }
                    ApplicationInfo applicationInfo5 = context.getApplicationInfo();
                    CFK.A0F("FbVoltronModuleLoader", "Context was not updated successfully to %s by createPackageContext, returning original context %s", str, applicationInfo5 != null ? applicationInfo5.sourceDir : null);
                }
            }
            return context;
        } catch (Exception e) {
            CFK.A08("FbVoltronModuleLoader", "Unable to get updated context", e);
            return context;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.CCw r18, java.io.File r19, java.lang.String r20, java.lang.String r21, int r22, int r23, boolean r24) {
        /*
            r12 = r24
            if (r24 == 0) goto L23
            java.lang.String r13 = "main"
        L6:
            r11 = 1
            r4 = 0
            java.lang.String r1 = "FbVoltronModuleLoader"
            r6 = r18
            r8 = r20
            r3 = r23
            if (r23 <= 0) goto L4a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            java.lang.String r18 = "Retrying %s split for module %s (attempt %d/%d)"
            r14 = r8
            r17 = r1
            X.CFK.A00(r13, r14, r15, r16, r17, r18)
            goto L26
        L23:
            java.lang.String r13 = "ABI"
            goto L6
        L26:
            android.content.Context r2 = r6.A00     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r2.getPackageName()     // Catch: java.lang.Throwable -> L31
            android.content.Context r4 = r2.createPackageContext(r0, r4)     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r0 = move-exception
            X.Hud r4 = X.C3cG.A0s(r0)
        L36:
            java.lang.Throwable r2 = X.HsJ.A00(r4)
            if (r2 == 0) goto L41
            java.lang.String r0 = "Unable to get updated context"
            X.CFK.A09(r1, r0, r2)
        L41:
            boolean r0 = r4 instanceof X.C10571Hud
            if (r0 == 0) goto L46
            r4 = 0
        L46:
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L4c
        L4a:
            android.content.Context r4 = r6.A00
        L4c:
            X.CCz r0 = r6.A01
            X.CDB r0 = r0.A02(r4, r8)
            if (r24 == 0) goto Ld4
            java.io.File r5 = r0.A01
        L56:
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r8}
            java.lang.String r0 = "loadSplitWithRetry: %s split=%s"
            X.CFK.A0H(r1, r0, r2)
            if (r24 != 0) goto L64
            if (r5 != 0) goto L6b
        L63:
            return
        L64:
            if (r5 != 0) goto L6b
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        L6b:
            r7 = r19
            boolean r0 = X.C3210C3l.A04(r7, r5, r8)
            if (r0 == 0) goto La3
            java.lang.String r2 = "Split registration succeeded: %s -> %s"
            java.lang.String r0 = r5.getCanonicalPath()
            X.CFK.A02(r8, r0, r1, r2)
            java.lang.Integer r2 = X.C79.A00
        L7e:
            java.lang.Integer r0 = X.C79.A00
            r9 = r21
            if (r2 != r0) goto L92
            X.CDC r0 = X.CD1.A06
            X.CD1 r0 = r0.A00()
            r0.A02(r9)
            java.lang.String r0 = "Split loaded: "
            X.C3cG.A1G(r0, r9, r1)
        L92:
            java.lang.Integer r0 = X.C79.A01
            if (r2 != r0) goto Lc1
            if (r3 >= r11) goto Lc1
            java.lang.String r0 = "Retrying %s split due to file not existing: %s"
            X.CFK.A02(r13, r8, r1, r0)
            r10 = r22
            A01(r6, r7, r8, r9, r10, r11, r12)
            return
        La3:
            boolean r4 = r5.exists()
            java.lang.String r0 = r5.getCanonicalPath()
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r0}
            if (r4 != 0) goto Lb9
            java.lang.String r0 = "Split registration failed because file doesn't exist (path may have changed): %s -> %s"
            X.CFK.A0H(r1, r0, r2)
            java.lang.Integer r2 = X.C79.A01
            goto L7e
        Lb9:
            java.lang.String r0 = "Split registration failed even though file exists: %s -> %s"
            X.CFK.A0H(r1, r0, r2)
            java.lang.Integer r2 = X.C79.A0C
            goto L7e
        Lc1:
            java.lang.Integer r0 = X.C79.A0C
            if (r2 != r0) goto L63
            X.CDC r0 = X.CD1.A06
            X.CD1 r0 = r0.A00()
            r0.A02(r9)
            java.lang.String r0 = "Split loaded without native lib: "
            X.C3cG.A1G(r0, r9, r1)
            return
        Ld4:
            java.io.File r5 = r0.A00
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CCw.A01(X.CCw, java.io.File, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
