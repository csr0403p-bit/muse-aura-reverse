package X;

import android.content.pm.ApplicationInfo;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/* loaded from: classes5.dex */
public abstract class C2D {
    public static C1Y A00(File file, File file2) throws IOException {
        try {
            return C1W.A00(file2);
        } catch (FileNotFoundException e) {
            try {
                if (file.setWritable(true)) {
                    return C1W.A00(file2);
                }
                throw e;
            } finally {
                if (!file.setWritable(false)) {
                    BV4.A1K("error removing ", file.getCanonicalPath(), " write permission", "SysUtil");
                }
            }
        }
    }

    public static String A01() {
        ClassLoader classLoader = ETi.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            StringBuilder sb = new StringBuilder("ClassLoader ");
            sb.append(classLoader.getClass().getName());
            sb.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(sb.toString());
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
        } catch (Exception e) {
            A05(e);
            return null;
        }
    }

    public static String A02(ApplicationInfo applicationInfo) {
        try {
            String str = (String) ApplicationInfo.class.getDeclaredField("primaryCpuAbi").get(applicationInfo);
            if (str != null) {
                return str;
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Log.e("SysUtil", "Cannot get primaryCpuAbi", e);
        }
        String[] strArrA03 = AbstractC3181C1l.A03();
        BV4.A1L("Falling back to device supported ABIs: ", Arrays.toString(strArrA03), ", nativeLibraryDir: ", applicationInfo.nativeLibraryDir, "SysUtil");
        if (strArrA03.length > 0) {
            return strArrA03[0];
        }
        throw C3cG.A0Q("No supported ABIs found on this device");
    }

    public static void A03(File file) {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayListA0h = C3cG.A0h();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayListA0h.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                A04(file2);
            }
        }
        int size = arrayListA0h.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                A04((File) arrayListA0h.get(size));
            }
        }
    }

    public static void A05(Throwable th) {
        Log.e("SysUtil", "Cannot call getLdLibraryPath", th);
    }

    public static void A04(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", AnonymousClass007.A0a("Enable write permission failed: ", parentFile));
        }
        if (!file.delete() && file.exists()) {
            throw BV8.A0j(file, "Could not delete file ");
        }
    }
}
