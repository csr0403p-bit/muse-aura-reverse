package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.common.dextricks.DexStore;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mG extends C7mJ {
    public static boolean A01(Context context, ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2, C7mG c7mG) {
        try {
            return AbstractC06987ml.A03(context, applicationInfo.uid, applicationInfo2.uid);
        } catch (SecurityException e) {
            c7mG.A01.report("SameKeyIntentScope", FGI.A0M("Unexpected exception in verifying signature for: ", ((PackageItemInfo) applicationInfo2).packageName), e);
            return c7mG.A0B();
        }
    }

    @Override // X.C7n1
    public final Intent AAf(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, this.A01, str);
        if (intent == null) {
            return null;
        }
        return !C7mJ.A08(context, intent) ? A00(context, intent, C7mJ.A05(context, intent, this, 268501056)) : intent;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Landroid/content/Intent;>; */
    @Override // X.C7n1
    public final List AAg(Context context, Intent intent, String str) {
        C7mY c7mY = this.A01;
        AbstractC06887mb.A01(context, intent, c7mY, str);
        ArrayList arrayListA09 = A09(context, intent);
        if (arrayListA09.isEmpty()) {
            c7mY.report("SameKeyIntentScope", "No matching same-key packages", null);
            if (A0B()) {
                return Collections.singletonList(intent);
            }
        }
        return arrayListA09;
    }

    @Override // X.C7n1
    public final Intent AAi(Context context, Intent intent, String str) {
        AbstractC06887mb.A01(context, intent, this.A01, str);
        return !C7mJ.A08(context, intent) ? A00(context, intent, C7mJ.A06(context, intent, this, 268501056)) : intent;
    }

    @Override // X.C7n1
    public final Integer AK1() {
        return C79.A01;
    }

    @Override // X.C7n1
    public final boolean AKY() {
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/util/List<+Landroid/content/pm/ComponentInfo;>;)Landroid/content/Intent; */
    private Intent A00(Context context, Intent intent, List list) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            this.A01.report("SameKeyIntentScope", "Current app info is null.", null);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComponentInfo componentInfo = (ComponentInfo) it.next();
                ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
                if (applicationInfo2 == null) {
                    this.A01.report("SameKeyIntentScope", "Target app info is null.", null);
                } else if (A01(context, applicationInfo, applicationInfo2, this)) {
                    arrayListA0t.add(componentInfo);
                } else {
                    boolean zA0B = A0B();
                    C7mY c7mY = this.A01;
                    if (zA0B) {
                        c7mY.report("SameKeyIntentScope", FGI.A0h("Different signature of the component but fail-open: current app=", ((PackageItemInfo) applicationInfo).packageName, ", target app=", ((PackageItemInfo) applicationInfo2).packageName, "."), null);
                        arrayListA0t.add(componentInfo);
                    } else {
                        c7mY.report("SameKeyIntentScope", FGI.A0h("Different signature component blocked: current app=", ((PackageItemInfo) applicationInfo).packageName, ", target app=", ((PackageItemInfo) applicationInfo2).packageName, "."), null);
                    }
                }
            }
        }
        if (arrayListA0t.isEmpty()) {
            this.A01.report("SameKeyIntentScope", "No matching same-key components.", null);
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
                    if (num == (!context.getPackageName().equals(packageItemInfo2.packageName) ? C79.A01 : C79.A00)) {
                        packageItemInfo = packageItemInfo2;
                        break;
                    }
                }
            }
            ComponentName componentName = new ComponentName(packageItemInfo.packageName, packageItemInfo.name);
            intent.setComponent(componentName);
            if (arrayListA0t.size() > 1 && componentName.getPackageName() != context.getPackageName()) {
                C7mY c7mY2 = this.A01;
                StringBuilder sbA0x = C60O.A0x("multiple same-key components and use different package: action ");
                sbA0x.append(intent.getAction());
                sbA0x.append(", uri ");
                sbA0x.append(intent.getData() == null ? null : new C7m5().A01(intent.getData(), C7m4.A04));
                sbA0x.append(", categories ");
                sbA0x.append(intent.getCategories());
                sbA0x.append(", component ");
                sbA0x.append(componentName.toString());
                sbA0x.append(", context package ");
                c7mY2.report("SameKeyIntentScope", AnonymousClass001.A0v(context.getPackageName(), sbA0x), null);
                return intent;
            }
        }
        return intent;
    }

    @Override // X.C7n1
    public final Intent AAh(BroadcastReceiver broadcastReceiver, Context context, Intent intent) throws NoSuchAlgorithmException {
        boolean zA0B;
        int i = context.getApplicationInfo().uid;
        C7mY c7mY = this.A01;
        C06967mj c06967mjA00 = AbstractC06887mb.A00(context, intent, c7mY, DexStore.DAYS_TO_MS_FACTOR);
        int i2 = (c06967mjA00 == null && (c06967mjA00 = C7mn.A00(broadcastReceiver, context)) == null) ? -1 : c06967mjA00.A00;
        try {
            zA0B = AbstractC06987ml.A03(context, i, i2);
        } catch (SecurityException e) {
            c7mY.report("SameKeyIntentScope", FGI.A0H("Unexpected exception in verifying signature for: ", i2), e);
            zA0B = A0B();
        }
        if (zA0B) {
            return intent;
        }
        String strA0e = broadcastReceiver != null ? C60Q.A0e(broadcastReceiver) : "unknown";
        StringBuilder sbA0y = C60O.A0y("Access denied. Process ", i);
        sbA0y.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sbA0y.append(strA0e);
        c7mY.report("SameKeyIntentScope", C60P.A1O(" cannot receive broadcasts from ", sbA0y, i2), null);
        return null;
    }
}
