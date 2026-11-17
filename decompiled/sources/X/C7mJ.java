package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mJ implements C7n1 {
    public static final C7m5 A03 = new C7m5();
    public final C7mP A00;
    public final C7mY A01;
    public final Integer A02;

    public C7mJ(C7mP c7mP, C7mY c7mY) {
        Integer num = C79.A01;
        this.A00 = c7mP;
        this.A01 = c7mY;
        this.A02 = num;
    }

    public static String A04(Intent intent) {
        String strA00;
        if (intent == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        StringBuilder sbA0x = C60O.A0x("intent(action = ");
        sbA0x.append(intent.getAction());
        sbA0x.append(", data= ");
        Uri data = intent.getData();
        if (data == null) {
            strA00 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        } else {
            try {
                strA00 = C7m4.A00(A03.A01(data, C7m4.A04));
            } catch (RuntimeException unused) {
                strA00 = "<unparseable>";
            }
        }
        sbA0x.append(strA00);
        sbA0x.append(", type= ");
        sbA0x.append(intent.getType());
        if (intent.getComponent() != null) {
            sbA0x.append(", component = ");
            sbA0x.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            sbA0x.append(", extras = [");
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                sbA0x.append(AnonymousClass005.A0j(it));
                sbA0x.append(", ");
            }
            sbA0x.append("]");
        }
        return AnonymousClass001.A0v(")", sbA0x);
    }

    private final boolean A0C(Context context, C06957mi c06957mi) {
        if (this instanceof C7mI) {
            C7mI c7mI = (C7mI) this;
            ApplicationInfo applicationInfo = c06957mi.A00;
            if (applicationInfo == null) {
                return false;
            }
            return C7mI.A01(context, applicationInfo, c7mI);
        }
        if (this instanceof C7mG) {
            return C7mG.A01(context, context.getApplicationInfo(), c06957mi.A00, (C7mG) this);
        }
        if (this instanceof C7mH) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean A0A() {
        Integer num;
        C7mP c7mP = this.A00;
        synchronized (c7mP) {
            num = c7mP.A00;
        }
        return AnonymousClass002.A1Z(num, C79.A0K);
    }

    public final boolean A0B() {
        Integer num;
        C7mP c7mP = this.A00;
        synchronized (c7mP) {
            num = c7mP.A00;
        }
        return AnonymousClass002.A1Z(num, C79.A00);
    }

    public static Intent A03(List<Intent> list) {
        Intent[] intentArr = new Intent[C60O.A00(list)];
        int i = 0;
        while (i < C60O.A00(list)) {
            int i2 = i + 1;
            intentArr[i] = list.get(i2);
            i = i2;
        }
        Intent intentCreateChooser = Intent.createChooser(list.get(0), "Choose an app to launch.");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intentCreateChooser;
    }

    public static ArrayList A05(Context context, Intent intent, C7mJ c7mJ, int i) {
        List<ResolveInfo> listQueryIntentActivities;
        boolean zA1Y = C60P.A1Y(context, intent);
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection("PackageManagerCompat.queryIntentActivities");
                PackageManager packageManager = context.getPackageManager();
                listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.queryIntentActivities(intent, i);
            } finally {
                Trace.endSection();
            }
        } else {
            PackageManager packageManager2 = context.getPackageManager();
            listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager2.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager2.queryIntentActivities(intent, i);
        }
        A07(c7mJ, listQueryIntentActivities);
        ArrayList arrayListA11 = C60O.A11(zA1Y ? 1 : 0);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && ((ComponentInfo) activityInfo).applicationInfo != null) {
                arrayListA11.add(activityInfo);
            }
        }
        return arrayListA11;
    }

    public static ArrayList A06(Context context, Intent intent, C7mJ c7mJ, int i) {
        List<ResolveInfo> listQueryIntentServices;
        boolean zA1Y = C60P.A1Y(context, intent);
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection("PackageManagerCompat.queryIntentServices");
                PackageManager packageManager = context.getPackageManager();
                listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.queryIntentServices(intent, i);
            } finally {
                Trace.endSection();
            }
        } else {
            PackageManager packageManager2 = context.getPackageManager();
            listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager2.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager2.queryIntentServices(intent, i);
        }
        A07(c7mJ, listQueryIntentServices);
        ArrayList arrayListA11 = C60O.A11(zA1Y ? 1 : 0);
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && ((ComponentInfo) serviceInfo).applicationInfo != null) {
                arrayListA11.add(serviceInfo);
            }
        }
        return arrayListA11;
    }

    public static void A07(C7mJ c7mJ, List list) {
        C7384Etj.A0W(list);
        if (list.iterator().hasNext()) {
            return;
        }
        c7mJ.A01.report("BaseIntentScope", FGI.A0U("PackageManager query returned no results. Target component either does not exist or package visibility is restricted (see https://fburl.com/workplace/isulnr27). [", C7mL.A00(c7mJ.AK1()), "]"), null);
    }

    public static boolean A08(Context context, Intent intent) {
        String packageName;
        ComponentName component = intent.getComponent();
        if ((component == null || (packageName = component.getPackageName()) == null) && (packageName = intent.getPackage()) == null) {
            return false;
        }
        if (context != null) {
            return packageName.equals(context.getPackageName());
        }
        throw C60O.A0i("context is null, did your Fragment destroy activity already?");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;)Ljava/util/List<Landroid/content/Intent;>; */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A09(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mJ.A09(android.content.Context, android.content.Intent):java.util.ArrayList");
    }
}
