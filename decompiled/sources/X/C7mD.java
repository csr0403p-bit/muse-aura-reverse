package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mD extends C7mJ {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r5.A00 == X.C79.A01) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if ((r5 & 16) != r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02(android.content.Context r15, android.content.Intent r16, android.content.pm.ComponentInfo r17, java.lang.String r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r14 = this;
            r1 = 0
            r7 = r17
            boolean r0 = r7.exported
            java.lang.String r4 = "AccessibleByAnyAppIntentScope"
            r8 = 2
            r6 = 0
            r3 = 1
            r11 = r18
            if (r0 == 0) goto L71
            if (r18 == 0) goto Lc2
            X.C7384Etj.A0Y(r15, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            boolean r0 = android.os.Trace.isEnabled()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r0 == 0) goto L2f
            java.lang.String r0 = "PackageManagerCompat.getPermissionInfo"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PackageManager r0 = r15.getPackageManager()     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r11, r6)     // Catch: java.lang.Throwable -> L2a
            android.os.Trace.endSection()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            goto L37
        L2a:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            throw r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
        L2f:
            android.content.pm.PackageManager r0 = r15.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r11, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
        L37:
            X.C7384Etj.A0W(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            int r5 = r0.protectionLevel     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            goto L65
        L3d:
            r2 = move-exception
            boolean r0 = r14.A0B()
            if (r0 != 0) goto L52
            X.7mP r5 = r14.A00
            monitor-enter(r5)
            java.lang.Integer r1 = r5.A00     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r0
        L4d:
            monitor-exit(r5)
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto Lc1
        L52:
            X.7mY r5 = r14.A01
            java.lang.String r6 = r7.packageName
            java.lang.String r1 = r7.name
            boolean r0 = r7.exported
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r0, r11}
            java.lang.String r0 = "Error checking permission for %s/%s but fail-open: exported=%s, permission=%s."
            goto La9
        L65:
            int r2 = A00()
            r0 = r5 & 2
            if (r0 == r8) goto L71
            r0 = r5 & 16
            if (r0 != r2) goto Lc2
        L71:
            boolean r0 = r14.A0B()
            if (r0 == 0) goto Lc1
            r2 = 0
            r5 = r16
            if (r16 == 0) goto L90
            X.7m5 r0 = new X.7m5     // Catch: org.json.JSONException -> L89
            r0.<init>()     // Catch: org.json.JSONException -> L89
            X.7m6 r0 = X.C7m5.A00(r5, r0, r3)     // Catch: org.json.JSONException -> L89
            org.json.JSONObject r1 = r0.A01     // Catch: org.json.JSONException -> L89
            r6 = 1
            goto L90
        L89:
            r0 = move-exception
            java.lang.String r13 = r0.getMessage()
            r6 = 0
            goto L91
        L90:
            r13 = r2
        L91:
            X.7mY r5 = r14.A01
            java.lang.String r8 = r7.packageName
            java.lang.String r9 = r7.name
            boolean r0 = r7.exported
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r12 = r15.getPackageName()
            if (r6 != 0) goto Lb1
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s with error in intent parser %s"
        La9:
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r5.report(r4, r0, r2)
            return r3
        Lb1:
            if (r1 != 0) goto Lbc
            java.lang.String r13 = ""
        Lb5:
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s from intent %s"
            goto La9
        Lbc:
            java.lang.String r13 = r1.toString()
            goto Lb5
        Lc1:
            return r6
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mD.A02(android.content.Context, android.content.Intent, android.content.pm.ComponentInfo, java.lang.String):boolean");
    }

    public static int A00() {
        return 16;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Landroid/content/Intent;>; */
    @Override // X.C7n1
    public final List AAg(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C7n1
    public final Intent AAh(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C7n1
    public final Integer AK1() {
        return C79.A0P;
    }

    @Override // X.C7n1
    public final boolean AKY() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Ljava/util/List<+Landroid/content/pm/ComponentInfo;>;ZLandroid/content/Context;)Landroid/content/Intent; */
    private Intent A01(Context context, Intent intent, List list, boolean z) {
        if (list.isEmpty()) {
            this.A01.report("AccessibleByAnyAppIntentScope", "No matching public components.", null);
            return null;
        }
        intent.putExtra("CI_SKIP_CALLER_FROM_ACTIVITY", true);
        if (!z) {
            if (context.getPackageName().equals(intent.getPackage() != null ? intent.getPackage() : intent.getComponent() != null ? intent.getComponent().getPackageName() : null)) {
                return intent;
            }
        } else {
            if (list.size() > 1) {
                AbstractC066877w.A00(intent, this.A01, A0B());
                ArrayList arrayListA0t = C60Q.A0t(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PackageItemInfo packageItemInfo = (PackageItemInfo) it.next();
                    Intent intent2 = new Intent(intent);
                    C60R.A0x(intent2, packageItemInfo);
                    intent2.setPackage(packageItemInfo.packageName);
                    arrayListA0t.add(intent2);
                }
                return C7mJ.A03(arrayListA0t);
            }
            C60R.A0x(intent, (PackageItemInfo) list.get(0));
        }
        AbstractC066877w.A00(intent, this.A01, A0B());
        return intent;
    }

    @Override // X.C7n1
    public final Intent AAf(Context context, Intent intent, String str) {
        ArrayList arrayListA05 = C7mJ.A05(context, intent, this, 268501056);
        if (arrayListA05.isEmpty()) {
            arrayListA05 = C7mJ.A05(context, intent, this, 0);
        }
        if (arrayListA05.isEmpty() && intent.hasExtra("expect_activity_not_found")) {
            AbstractC066877w.A00(intent, this.A01, A0B());
            return intent;
        }
        Iterator it = arrayListA05.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = (ActivityInfo) it.next();
            if (!A02(context, intent, activityInfo, activityInfo.permission)) {
                it.remove();
                z = true;
            }
        }
        return A01(context, intent, arrayListA05, z);
    }

    @Override // X.C7n1
    public final Intent AAi(Context context, Intent intent, String str) {
        ArrayList arrayListA06 = C7mJ.A06(context, intent, this, 268501056);
        Iterator it = arrayListA06.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ServiceInfo serviceInfo = (ServiceInfo) it.next();
            if (!A02(context, intent, serviceInfo, serviceInfo.permission)) {
                it.remove();
                z = true;
            }
        }
        return A01(context, intent, arrayListA06, z);
    }
}
