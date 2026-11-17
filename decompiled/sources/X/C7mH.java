package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mH extends C7mJ {
    @Override // X.C7n1
    public final Intent AAf(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, this.A01, str);
        return !C7mJ.A08(context, intent) ? A00(context, intent, C7mJ.A05(context, intent, this, 268501056)) : intent;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Landroid/content/Intent;>; */
    @Override // X.C7n1
    public final List AAg(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, this.A01, str);
        if (!C7mJ.A08(context, intent)) {
            intent.setPackage(context.getPackageName());
        }
        return Collections.singletonList(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // X.C7n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent AAh(android.content.BroadcastReceiver r11, android.content.Context r12, android.content.Intent r13) throws java.security.NoSuchAlgorithmException {
        /*
            r10 = this;
            X.7mY r3 = r10.A01
            r1 = 0
            if (r13 == 0) goto L10
            java.lang.String r0 = "_ci_disable_ttl_"
            boolean r1 = r13.getBooleanExtra(r0, r1)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != 0) goto L13
        L10:
            r0 = 86400000(0x5265c00, float:7.82218E-36)
        L13:
            X.7mj r1 = X.AbstractC06887mb.A00(r12, r13, r3, r0)
            if (r1 != 0) goto L1d
            X.7mj r1 = X.C7mn.A00(r11, r12)
        L1d:
            r2 = 0
            if (r1 == 0) goto L5c
            java.lang.String r0 = r1.A05()
        L24:
            java.lang.String r5 = r12.getPackageName()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L55
            if (r11 == 0) goto L59
            java.lang.String r7 = X.C60Q.A0e(r11)
        L34:
            java.lang.String r4 = "Access denied. "
            java.lang.String r6 = "/"
            java.lang.String r8 = " cannot receive broadcasts from "
            if (r1 == 0) goto L56
            java.lang.String r9 = r1.toString()
        L40:
            java.lang.String r4 = X.FGI.A0j(r4, r5, r6, r7, r8, r9)
            boolean r0 = r10.A0B()
            java.lang.String r1 = "InternalIntentScope"
            if (r0 == 0) goto L5e
            java.lang.String r0 = "Fail-open: "
            java.lang.String r0 = X.FGI.A0M(r0, r4)
            r3.report(r1, r0, r2)
        L55:
            return r13
        L56:
            java.lang.String r9 = "null"
            goto L40
        L59:
            java.lang.String r7 = "unknown"
            goto L34
        L5c:
            r0 = r2
            goto L24
        L5e:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r4)
            r3.report(r1, r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mH.AAh(android.content.BroadcastReceiver, android.content.Context, android.content.Intent):android.content.Intent");
    }

    @Override // X.C7n1
    public final Intent AAi(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, this.A01, str);
        return !C7mJ.A08(context, intent) ? A00(context, intent, C7mJ.A06(context, intent, this, 268501056)) : intent;
    }

    @Override // X.C7n1
    public final Integer AK1() {
        return C79.A00;
    }

    @Override // X.C7n1
    public final boolean AKY() {
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/util/List<+Landroid/content/pm/ComponentInfo;>;)Landroid/content/Intent; */
    private Intent A00(Context context, Intent intent, List list) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null) {
                String str = ((PackageItemInfo) applicationInfo).packageName;
                if (!str.equals(context.getPackageName())) {
                    if (A0B()) {
                        this.A01.report("InternalIntentScope", FGI.A0M("Detected different package name component but fail open: ", str), null);
                    }
                }
                arrayListA0t.add(componentInfo);
            }
        }
        if (arrayListA0t.isEmpty()) {
            if (!list.isEmpty()) {
                this.A01.report("InternalIntentScope", "No matching internal components", null);
            }
            if (!A0B()) {
                return null;
            }
        } else {
            Collections.sort(arrayListA0t, new HuB());
            C60R.A0x(intent, (PackageItemInfo) arrayListA0t.get(0));
        }
        return intent;
    }
}
