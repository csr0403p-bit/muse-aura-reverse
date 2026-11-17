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

/* renamed from: X.7mI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mI extends C7mJ {
    public final String A00;
    public final C7381Etf A01;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;Ljava/util/List<+Landroid/content/pm/ComponentInfo;>;)Landroid/content/Intent; */
    private Intent A00(Context context, Intent intent, String str, List list) {
        C7mY c7mY = super.A01;
        AbstractC06887mb.A01(context, intent, c7mY, str);
        ArrayList arrayListA0t = C60Q.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null && A01(context, applicationInfo, this)) {
                arrayListA0t.add(componentInfo);
            }
        }
        if (arrayListA0t.isEmpty()) {
            if (!list.isEmpty()) {
                String str2 = this.A00;
                c7mY.report(str2, FGI.A0U("Components matching the intent were found but none match the given scope. [", str2, "]"), null);
            }
            if (!A0B()) {
                return null;
            }
        } else {
            Integer num = this.A02;
            Collections.sort(arrayListA0t, new HuB());
            PackageItemInfo packageItemInfo = (PackageItemInfo) arrayListA0t.get(0);
            if (arrayListA0t.size() > 1) {
                Iterator it2 = arrayListA0t.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PackageItemInfo packageItemInfo2 = (PackageItemInfo) it2.next();
                    try {
                    } catch (SecurityException e) {
                        c7mY.report(this.A00, FGI.A0M("Error verifying the signature for ", packageItemInfo2.packageName), e);
                    }
                    Integer num2 = AbstractC06987ml.A04(context, packageItemInfo2.packageName) ^ true ? C79.A01 : C79.A00;
                    if (num == num2) {
                        packageItemInfo = packageItemInfo2;
                        break;
                    }
                }
            }
            C60R.A0x(intent, packageItemInfo);
        }
        return intent;
    }

    public static boolean A01(Context context, ApplicationInfo applicationInfo, C7mI c7mI) {
        String str = ((PackageItemInfo) applicationInfo).packageName;
        try {
            if (c7mI.A01.A02(C06967mj.A00(context, applicationInfo.uid), AbstractC06987ml.A02(context))) {
                return true;
            }
            if (!c7mI.A0B()) {
                return false;
            }
            ((C7mJ) c7mI).A01.report(c7mI.A00, FGI.A0M(str, " is not an app matching the targeted app filter, but fail-open."), null);
            return true;
        } catch (SecurityException e) {
            ((C7mJ) c7mI).A01.report(c7mI.A00, FGI.A0M("Unexpected exception in checking trusted app for ", str), e);
            return !c7mI.A0A();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Landroid/content/Intent;>; */
    @Override // X.C7n1
    public final List AAg(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, super.A01, str);
        return A09(context, intent);
    }

    public C7mI(C7mP c7mP, C7mY c7mY, C7381Etf c7381Etf, String str) {
        super(c7mP, c7mY);
        this.A00 = str;
        this.A01 = c7381Etf;
    }

    @Override // X.C7n1
    public final Intent AAf(Context context, Intent intent, String str) {
        ArrayList arrayListA05 = C7mJ.A05(context, intent, this, 268501056);
        if (arrayListA05.isEmpty()) {
            arrayListA05 = C7mJ.A05(context, intent, this, 0);
        }
        return A00(context, intent, str, arrayListA05);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // X.C7n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent AAh(android.content.BroadcastReceiver r10, android.content.Context r11, android.content.Intent r12) throws java.security.NoSuchAlgorithmException {
        /*
            r9 = this;
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r8 = r0.uid
            X.7mY r4 = r9.A01
            r1 = 0
            if (r12 == 0) goto L16
            java.lang.String r0 = "_ci_disable_ttl_"
            boolean r1 = r12.getBooleanExtra(r0, r1)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != 0) goto L19
        L16:
            r0 = 86400000(0x5265c00, float:7.82218E-36)
        L19:
            X.7mj r3 = X.AbstractC06887mb.A00(r11, r12, r4, r0)
            if (r3 != 0) goto L90
            X.7mj r3 = X.C7mn.A00(r10, r11)
            if (r3 != 0) goto L90
            r0 = -1
        L26:
            X.Etf r2 = r9.A01
            boolean r1 = X.AbstractC06987ml.A02(r11)
            boolean r1 = r2.A02(r3, r1)
            if (r1 != 0) goto L88
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            if (r1 == 0) goto L8c
            java.lang.String r7 = r1.getNameForUid(r8)
            java.lang.String r6 = r1.getNameForUid(r0)
        L40:
            if (r10 == 0) goto L89
            java.lang.String r5 = X.C60Q.A0e(r10)
        L46:
            java.lang.String r1 = "Access denied. Process "
            java.lang.StringBuilder r3 = X.C60O.A0y(r1, r8)
            java.lang.String r2 = "("
            r3.append(r2)
            r3.append(r7)
            java.lang.String r1 = ")/"
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = " cannot receive broadcasts from "
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = ") the event is: "
            r3.append(r0)
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = X.AnonymousClass001.A0v(r0, r3)
            java.lang.String r1 = r9.A00
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r2)
            r4.report(r1, r2, r0)
            boolean r0 = r9.A0B()
            if (r0 != 0) goto L88
            r12 = 0
        L88:
            return r12
        L89:
            java.lang.String r5 = "unknown"
            goto L46
        L8c:
            java.lang.String r7 = "no_name_available"
            r6 = r7
            goto L40
        L90:
            int r0 = r3.A00
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mI.AAh(android.content.BroadcastReceiver, android.content.Context, android.content.Intent):android.content.Intent");
    }

    @Override // X.C7n1
    public final Intent AAi(Context context, Intent intent, String str) {
        return A00(context, intent, str, C7mJ.A06(context, intent, this, 268501056));
    }
}
