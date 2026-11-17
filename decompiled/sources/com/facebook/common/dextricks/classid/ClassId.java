package com.facebook.common.dextricks.classid;

import X.BV4;
import X.BV6;
import X.C8j3;
import X.ETi;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class ClassId {
    public static Field javaLangClass_dexCache;
    public static Field javaLangClass_dexClassDefIndex;
    public static Method javaLangClass_getDexClassDefIndex;
    public static Field javaLangDexCache_dexFile;
    public static final ConcurrentHashMap<Object, Integer> sDexKeyToDexSignature;
    public static final boolean sInitialized;

    static {
        boolean z;
        boolean z2 = false;
        try {
            ETi.loadLibrary("classid");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.w("ClassId", "Failed to load native library", e);
            z = false;
        }
        sDexKeyToDexSignature = new ConcurrentHashMap<>(0, 0.9f);
        if (z) {
            synchronized (ClassId.class) {
                try {
                    Field declaredField = Class.class.getDeclaredField("dexClassDefIndex");
                    Field declaredField2 = Class.class.getDeclaredField("dexCache");
                    Class<?> cls = Class.forName("java.lang.DexCache");
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    javaLangClass_dexClassDefIndex = declaredField;
                    javaLangClass_dexCache = declaredField2;
                    javaLangDexCache_dexFile = BV4.A0r(cls, "dexFile");
                    getClassDef(ClassId.class);
                    if (getDexSignature(ClassId.class) == 0) {
                        throw C8j3.A17();
                    }
                } catch (Exception unused) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        sInitialized = z2;
    }

    public static native int getSignatureFromDexFile_10_0_0(long j);

    public static native int getSignatureFromDexFile_11_0_0(long j);

    public static native int getSignatureFromDexFile_8_0_0(long j);

    public static native int getSignatureFromDexFile_8_1_0(long j);

    public static native int getSignatureFromDexFile_9_0_0(long j);

    public static int getClassDef(Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        Object objInvoke;
        try {
            Field field = javaLangClass_dexClassDefIndex;
            if (field != null) {
                Object obj = field.get(cls);
                if (obj != null) {
                    return BV6.A07(obj);
                }
            } else {
                Method method = javaLangClass_getDexClassDefIndex;
                if (method != null && (objInvoke = method.invoke(cls, null)) != null) {
                    return BV6.A07(objInvoke);
                }
            }
            throw BV4.A0T();
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    public static int getDexSignature(Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        int signatureFromDexFile_11_0_0;
        try {
            if (javaLangDexCache_dexFile == null) {
                throw BV4.A0T();
            }
            Object obj = javaLangClass_dexCache.get(cls);
            if (obj == null) {
                return 0;
            }
            AbstractMap abstractMap = sDexKeyToDexSignature;
            Number numberA0j = BV6.A0j(obj, abstractMap);
            if (numberA0j == null) {
                long j = javaLangDexCache_dexFile.getLong(obj);
                switch (Build.VERSION.SDK_INT) {
                    case 29:
                        signatureFromDexFile_11_0_0 = getSignatureFromDexFile_10_0_0(j);
                        break;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        signatureFromDexFile_11_0_0 = getSignatureFromDexFile_11_0_0(j);
                        break;
                    default:
                        signatureFromDexFile_11_0_0 = 0;
                        break;
                }
                numberA0j = Integer.valueOf(signatureFromDexFile_11_0_0);
                abstractMap.put(obj, numberA0j);
            }
            return numberA0j.intValue();
        } catch (IOException | IllegalAccessException | InvocationTargetException e) {
            throw BV4.A0e(e);
        }
    }

    public static long getCurrentJavaThreadIdOrNotFound() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == null) {
            return -1L;
        }
        return threadCurrentThread.getId();
    }
}
