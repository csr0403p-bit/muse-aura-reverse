package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.facebook.common.dextricks.utils.DexUtils$FindApplicationDexException;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CAy {
    public static Context A00(Context context) throws PackageManager.NameNotFoundException {
        String str;
        try {
            context = context.createPackageContext(context.getPackageName(), 0);
            return context;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = "Unable to get updated context";
            CFK.A09("DexUtils", str, e);
            return context;
        } catch (SecurityException e2) {
            e = e2;
            str = "Unable to get updated context due to security exception";
            CFK.A09("DexUtils", str, e);
            return context;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;Ljava/util/List<Ldalvik/system/DexFile;>;Ljava/util/List<Ldalvik/system/DexFile;>;)Z */
    public static void A01(ApplicationInfo applicationInfo, ClassLoader classLoader, List list, List list2) throws IllegalAccessException, DexUtils$FindApplicationDexException, IllegalArgumentException, InvocationTargetException {
        System.currentTimeMillis();
        if (!CBP.A01) {
            throw new DexUtils$FindApplicationDexException("Cannot call needed hidden apis on this platform");
        }
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.VmPolicy.Builder builder = vmPolicy != null ? new StrictMode.VmPolicy.Builder(vmPolicy) : new StrictMode.VmPolicy.Builder();
        try {
            CBP.A00.invoke(builder, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            CFK.A09("StrictModeAllowHiddenApis", "Could not call PermitNonHiddenApis", e);
        }
        StrictMode.setVmPolicy(builder.build());
        try {
            try {
                Object[] objArr = (Object[]) BV5.A0c(BV5.A0c(classLoader, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList"), Class.forName("dalvik.system.DexPathList"), "dexElements");
                Field fieldA0r = BV4.A0r(Class.forName("dalvik.system.DexPathList$Element"), "dexFile");
                String str = applicationInfo.sourceDir;
                if (str == null) {
                    throw new DexUtils$FindApplicationDexException("Cannot find a primary dex name");
                }
                boolean zA1V = BV5.A1V(str);
                if (objArr == null) {
                    throw new DexUtils$FindApplicationDexException("dexElements is null");
                }
                for (Object obj : objArr) {
                    DexFile dexFile = (DexFile) fieldA0r.get(obj);
                    if (dexFile != null) {
                        String name = dexFile.getName();
                        if (str.equals(name) || (list.isEmpty() && !zA1V && name != null && name.startsWith("/data/app/") && name.endsWith("/base.apk") && name.contains(((PackageItemInfo) applicationInfo).packageName))) {
                            list.add(dexFile);
                        } else {
                            list2.add(dexFile);
                        }
                    }
                }
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                throw new DexUtils$FindApplicationDexException("Dalvik system code not of expected form", e2);
            }
        } finally {
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
            }
            System.currentTimeMillis();
        }
    }
}
