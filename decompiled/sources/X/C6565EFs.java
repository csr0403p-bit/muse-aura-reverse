package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EFs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6565EFs {
    public static volatile EG1<?> A00;
    public static volatile List A01;

    public static void A04(Context context, List list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, null);
        A01(context);
        Iterator it = A00(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onShortcutRemoved");
        }
    }

    public static List A00(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList arrayListA0h = C3cG.A0h();
            PackageManager packageManager = context.getPackageManager();
            Intent intentA03 = C60P.A03("androidx.core.content.pm.SHORTCUT_LISTENER");
            intentA03.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intentA03, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = ((PackageItemInfo) activityInfo).metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        Class.forName(string, false, C6565EFs.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                        arrayListA0h.add(null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (A01 == null) {
                A01 = arrayListA0h;
            }
        }
        return A01;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Context;)LX/EG1<*>; */
    public static void A01(Context context) {
        if (A00 == null) {
            try {
                A00 = (EG1) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C6565EFs.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (A00 == null) {
                A00 = new EG1();
            }
        }
    }

    public static void A02(Context context, C6566EFu c6566EFu) {
        int i;
        InputStream inputStreamA04;
        Bitmap bitmapDecodeStream;
        context.getClass();
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity != 0) {
            if (Build.VERSION.SDK_INT <= 29) {
                IconCompat iconCompat = c6566EFu.A01;
                if (iconCompat != null && (((i = iconCompat.A02) == 6 || i == 4) && (inputStreamA04 = iconCompat.A04(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamA04)) != null)) {
                    IconCompat iconCompat2 = i == 6 ? new IconCompat(5) : new IconCompat(1);
                    iconCompat2.A06 = bitmapDecodeStream;
                    c6566EFu.A01 = iconCompat2;
                }
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (shortcutManager.isRateLimitingActive()) {
                    return;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                    int rank = -1;
                    String id = null;
                    for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                        if (shortcutInfo.getRank() > rank) {
                            id = shortcutInfo.getId();
                            rank = shortcutInfo.getRank();
                        }
                    }
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(id));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(c6566EFu.A00()));
            } else {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(c6566EFu.A00());
            }
            A01(context);
            try {
                ArrayList arrayListA0h = C3cG.A0h();
                if (arrayListA0h.size() >= maxShortcutCountPerActivity) {
                    Iterator it = arrayListA0h.iterator();
                    char c = '\uffff';
                    String str = null;
                    while (it.hasNext()) {
                        C6566EFu c6566EFu2 = (C6566EFu) it.next();
                        if (0 > c) {
                            str = c6566EFu2.A04;
                            c = 0;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(c6566EFu);
                Iterator it2 = A00(context).iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw BV4.A0a("onShortcutAdded");
                }
            } catch (Exception unused) {
                Iterator it3 = A00(context).iterator();
                if (it3.hasNext()) {
                    it3.next();
                    throw BV4.A0a("onShortcutAdded");
                }
            } catch (Throwable th) {
                Iterator it4 = A00(context).iterator();
                if (it4.hasNext()) {
                    it4.next();
                    throw BV4.A0a("onShortcutAdded");
                }
                A03(context, c6566EFu.A04);
                throw th;
            }
            A03(context, c6566EFu.A04);
        }
    }

    public static void A03(Context context, String str) {
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = A00(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onShortcutUsageReported");
        }
    }

    public static void A05(Context context, List<C6566EFu> list) {
        List<C6566EFu> listA0t;
        list.getClass();
        if (Build.VERSION.SDK_INT > 32) {
            listA0t = list;
        } else {
            listA0t = BV4.A0t(list);
            Iterator<C6566EFu> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        Iterator<C6566EFu> it2 = listA0t.iterator();
        while (it2.hasNext()) {
            arrayListA0t.add(it2.next().A04);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayListA0t);
        A01(context);
        Iterator it3 = A00(context).iterator();
        if (it3.hasNext()) {
            it3.next();
            throw BV4.A0a("onShortcutAdded");
        }
    }
}
