package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.77m, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C77m {
    public static boolean A01(Context context) {
        if (context instanceof Activity) {
            return true;
        }
        if (context instanceof ContextWrapper) {
            return A01(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A05(Context context, Intent intent) {
        C77m c77m;
        PackageItemInfo packageItemInfo;
        if (this instanceof C7nR) {
            C7nR c7nR = (C7nR) this;
            A02(context, intent);
            Iterator it = c7nR.A00.A00.A06.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("rewriteActivityIntent");
            }
            c77m = c7nR.A01;
        } else {
            if (this instanceof C77o) {
                A02(context, intent);
                Iterator it2 = ((C77o) this).A00.iterator();
                while (it2.hasNext()) {
                    if (((C77m) it2.next()).A05(context, intent)) {
                        return true;
                    }
                }
                return false;
            }
            if (this instanceof C77n) {
                C77n c77n = (C77n) this;
                if (intent == null) {
                    throw C60Q.A0U("Intent", " cannot be null");
                }
                if (context == null) {
                    throw C60Q.A0U("Context", " cannot be null");
                }
                A02(context, intent);
                c77m = c77n.A00;
            } else if (this instanceof C7nM) {
                C7nM c7nM = (C7nM) this;
                C7nP c7nP = c7nM.A01;
                String str = c7nP.A05;
                C7nN c7nNAMN = c7nP.A02.AMN();
                c7nP.A04.AMN();
                if (intent == null) {
                    return false;
                }
                ComponentName component = intent.getComponent();
                if (component == null || !component.getPackageName().equals(str)) {
                    PackageManager packageManager = c7nNAMN.A01;
                    ApplicationInfo applicationInfo = c7nNAMN.A00;
                    List<ResolveInfo> listA0h = C3cG.A0h();
                    try {
                        listA0h = packageManager.queryIntentActivities(intent, 64);
                    } catch (RuntimeException e) {
                        CFK.A0A("SecureContextHelperUtil", "Cannot query PackageManager.", e);
                    }
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator<ResolveInfo> it3 = listA0h.iterator();
                    while (it3.hasNext()) {
                        ActivityInfo activityInfo = it3.next().activityInfo;
                        int i = applicationInfo.uid;
                        int i2 = ((ComponentInfo) activityInfo).applicationInfo.uid;
                        if (i == i2 || packageManager.checkSignatures(i, i2) == 0) {
                            arrayListA0h.add(activityInfo);
                        }
                    }
                    F0O f0o = new F0O(arrayListA0h);
                    if (!f0o.isEmpty()) {
                        if (f0o.size() > 1) {
                            Iterator<E> it4 = f0o.iterator();
                            while (it4.hasNext()) {
                                packageItemInfo = (PackageItemInfo) it4.next();
                                if (str.equals(packageItemInfo.packageName)) {
                                }
                            }
                        } else {
                            packageItemInfo = (PackageItemInfo) f0o.get(0);
                        }
                        C60R.A0x(intent, packageItemInfo);
                    }
                    if (intent.getAction() != null) {
                        intent.getAction();
                    }
                    if (intent.getComponent() == null) {
                        return false;
                    }
                    intent.getComponent();
                    return false;
                }
                c77m = c7nM.A00;
            } else {
                if (!(this instanceof C7nQ)) {
                    C7oD c7oD = (C7oD) this;
                    try {
                        Intent intentAAf = c7oD.A02.AAf(context, intent, null);
                        if (intentAAf == null) {
                            intentAAf = c7oD.A03.AAf(context, intent, null);
                            if (intentAAf == null) {
                                return false;
                            }
                            Eu1 eu1AcquireEvent = c7oD.A01.acquireEvent("secure_uri_launcher");
                            if (eu1AcquireEvent.isSampled()) {
                                ArrayList arrayListA0h2 = C3cG.A0h();
                                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                                    arrayListA0h2.add(stackTraceElement.toString());
                                }
                                eu1AcquireEvent.A3y("callsite", "DefaultInternalIntentHandler");
                                eu1AcquireEvent.A3y("scheme", intent.getScheme());
                                eu1AcquireEvent.A42("stack_traces", arrayListA0h2);
                                eu1AcquireEvent.APu();
                            }
                        }
                        if (intentAAf == null) {
                            return false;
                        }
                        context.startActivity(intentAAf);
                        C7oE c7oE = c7oD.A00;
                        if (!((C5059DSb) c7oE.A02.AMN()).getBoolean(C7oH.A00)) {
                            return true;
                        }
                        Eu1 eu1AcquireEvent2 = ((C8ee) c7oE.A01.A00.AMN()).acquireEvent("android_security_fb4a_intent_logging_outgoing");
                        if (!eu1AcquireEvent2.isSampled()) {
                            return true;
                        }
                        try {
                            eu1AcquireEvent2.A3y("intent", C7m5.A00(intentAAf, new C7m5(), true).A01.toString());
                            eu1AcquireEvent2.A3y("call_site", context.getPackageName());
                            eu1AcquireEvent2.APu();
                            return true;
                        } catch (JSONException unused) {
                            c7oE.A00.A00.AMN();
                            return true;
                        }
                    } catch (Exception e2) {
                        PackageManager packageManager2 = context.getPackageManager();
                        packageManager2.getClass();
                        ComponentName component2 = intent.getComponent();
                        component2.getClass();
                        int componentEnabledSetting = packageManager2.getComponentEnabledSetting(component2);
                        String str2 = componentEnabledSetting != 0 ? componentEnabledSetting != 1 ? componentEnabledSetting != 2 ? componentEnabledSetting != 3 ? componentEnabledSetting != 4 ? "NA" : "DISABLED_UNTIL_USED" : "DISABLED_USER" : "DISABLED" : "ENABLED" : "DEFAULT";
                        ComponentName component3 = intent.getComponent();
                        component3.getClass();
                        CFK.A06("DefaultIntentHandler", String.format("Exception while trying to start activity[%s] componentState[%s]. error[%s]", component3.getClassName(), str2, e2.getMessage()));
                        throw e2;
                    }
                }
                C7nQ c7nQ = (C7nQ) this;
                try {
                    ComponentName component4 = intent.getComponent();
                    if (component4 != null && C7nV.class.isAssignableFrom(Class.forName(component4.getClassName()))) {
                        c7nQ.A01.A01.AMN();
                    }
                } catch (ClassNotFoundException e3) {
                    CFK.A0A("DefaultSecureContextHelper", "Unable to track activity launch.", e3);
                }
                c77m = c7nQ.A00;
            }
        }
        return c77m.A05(context, intent);
    }

    public static void A00(Context context, Intent intent) {
        C7mU.A00().A01().A05(context, intent);
    }

    public static final boolean A02(Context context, Intent intent) {
        if ((intent.getFlags() & 268435456) != 0 || A01(context)) {
            return false;
        }
        intent.addFlags(268435456);
        return true;
    }
}
