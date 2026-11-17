package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.BV4;
import X.FGI;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public final class MemoryReductionHack {
    public static final String TAG = "MemoryReductionHack";

    public static Object getDexPathList(BaseDexClassLoader baseDexClassLoader) {
        return getField(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
    }

    public static File getFileOrZip(Object obj, int i) {
        if (i <= 22) {
            try {
                return (File) getField(obj, obj.getClass(), "file");
            } catch (NoSuchFieldException unused) {
            }
        }
        return (File) getField(obj, obj.getClass(), "zip");
    }

    public static void freeApkZip(Context context) {
    }

    public static Object getDexElementsArray(Object obj) {
        return getField(obj, obj.getClass(), "dexElements");
    }

    public static Object getField(Object obj, Class<?> cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static void removeZipFromPathClassLoader(String str, PathClassLoader pathClassLoader) throws IllegalAccessException, NoSuchFieldException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Object dexElementsArray = getDexElementsArray(getDexPathList(pathClassLoader));
        int length = Array.getLength(dexElementsArray);
        int i = Build.VERSION.SDK_INT;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = Array.get(dexElementsArray, i2);
            File fileOrZip = getFileOrZip(obj, i);
            if (fileOrZip != null && str.equals(fileOrZip.getPath())) {
                setField(obj, obj.getClass(), "initialized", AnonymousClass001.A0i());
                Log.d(TAG, FGI.A0M("Marked as initialized entry corresponding to path ", str));
                return;
            }
        }
        BV4.A1J("Could not find zipFile entry corresponding to path ", str, TAG);
    }

    public static void setField(Object obj, Class<?> cls, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
