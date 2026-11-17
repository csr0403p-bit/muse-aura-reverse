package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.Cmd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4103Cmd {
    public static void A04(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, int i) {
        A05(broadcastReceiver, context, intentFilter, null, i);
    }

    public static void A05(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 4;
        if ((i & 2) == 0) {
            if (i2 == 0) {
                throw C60O.A0i("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i2 != 0) {
            throw C60O.A0i("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC4105Cmf.A00(broadcastReceiver, context, intentFilter, str, i);
            return;
        }
        if (i2 == 0 || str != null) {
            context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
            return;
        }
        String strA0M = FGI.A0M(context.getApplicationContext().getPackageName(), ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (AbstractC4104Cme.A00(context, strA0M) != 0) {
            strA0M = FGI.A0M(context.getOpPackageName(), ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            if (AbstractC4104Cme.A00(context, strA0M) != 0) {
                throw BV5.A0i("Permission ", strA0M, " is required by your application to receive broadcasts, please add it to your manifest");
            }
        }
        context.registerReceiver(broadcastReceiver, intentFilter, strA0M, null);
    }

    public static int A02(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C7380Etd(context).A00.areNotificationsEnabled() ? 0 : -1;
        }
        throw BV4.A0a("permission must be non-null");
    }

    public static ColorStateList A03(Context context, int i) throws Resources.NotFoundException {
        WeakHashMap<CMH, SparseArray<CMI>> weakHashMap;
        ColorStateList colorStateList;
        CMI cmi;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        CMH cmh = new CMH(theme2, resources);
        Object obj = CMG.A00;
        synchronized (obj) {
            weakHashMap = CMG.A02;
            SparseArray<CMI> sparseArray = weakHashMap.get(cmh);
            if (sparseArray == null || sparseArray.size() <= 0 || (cmi = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!cmi.A02.equals(cmh.A01.getConfiguration()) || (!((theme = cmh.A00) == null && cmi.A00 == 0) && (theme == null || cmi.A00 != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = cmi.A01;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = CMG.A01;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        ColorStateList colorStateListA01 = null;
        if (!(i2 >= 28 && i2 <= 31)) {
            try {
                colorStateListA01 = EGX.A01(theme2, resources, resources.getXml(i));
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA01 == null) {
            return resources.getColorStateList(i, theme2);
        }
        synchronized (obj) {
            SparseArray<CMI> sparseArrayA0B = weakHashMap.get(cmh);
            if (sparseArrayA0B == null) {
                sparseArrayA0B = BV4.A0B();
                weakHashMap.put(cmh, sparseArrayA0B);
            }
            sparseArrayA0B.append(i, new CMI(colorStateListA01, cmh.A01.getConfiguration(), theme2));
        }
        return colorStateListA01;
    }
}
