package com.facebook.breakpad;

import X.AbstractC3416CMe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.C45;
import X.C60O;
import X.CFK;
import X.ETi;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.util.Formatter;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class BreakpadManager {
    public static volatile boolean initialized;
    public static volatile File mCrashDirectory;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessBoundsSan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native void install(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap<String, String> treeMap);

    public static native long nativeGetMinidumpFlags();

    public static native void nativeRegisterMethods();

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z);

    public static native void nativeSetMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static native void uninstall();

    public static synchronized void ensureLoadLibrary() {
        if (!initialized) {
            ETi.loadLibrary("breakpad");
            initialized = true;
        }
    }

    public static File getCrashDirectory() {
        if (mCrashDirectory != null) {
            return mCrashDirectory;
        }
        throw BV4.A0c("Breakpad not installed");
    }

    public static boolean isActive() {
        return initialized && mCrashDirectory != null;
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        if (z) {
            ETi.loadLibrary("breakpad_cpp_helper");
            nativeSetJvmStreamEnabled(z);
        } else {
            nativeSetJvmStreamEnabled(z);
        }
    }

    public static void start(Context context) {
        start(context, 0L, 1536000, null, null, false, false);
    }

    public static boolean containsKey(String str) {
        boolean zNativeContainsKey;
        if (isActive()) {
            ensureLoadLibrary();
            if (AnonymousClass002.A1L(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
                synchronized (BreakpadManager.class) {
                    zNativeContainsKey = nativeContainsKey(str);
                }
                return zNativeContainsKey;
            }
        } else {
            CFK.A06("BreakpadManager", "Breakpad is not active (containsKey).");
        }
        return false;
    }

    public static boolean enableCoreDumping(Context context) {
        if (isPrivacyModeEnabled()) {
            return false;
        }
        ensureLoadLibrary();
        if (isCoreResourceHardUnlimited()) {
            return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
        }
        return false;
    }

    public static String getCustomData(String str) {
        String strNativeGetCustomData;
        if (!isActive()) {
            CFK.A06("BreakpadManager", "Breakpad is not active (getCustomData).");
            return "";
        }
        ensureLoadLibrary();
        if (!AnonymousClass002.A1L(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            return "";
        }
        synchronized (BreakpadManager.class) {
            strNativeGetCustomData = nativeGetCustomData(str);
        }
        return strNativeGetCustomData;
    }

    public static void removeCustomData(String str) {
        if (!isActive()) {
            CFK.A06("BreakpadManager", "Breakpad is not active (removeCustomData).");
            return;
        }
        ensureLoadLibrary();
        if (AnonymousClass002.A1L(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            synchronized (BreakpadManager.class) {
                nativeRemoveCustomData(str);
            }
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (!isActive()) {
            CFK.A06("BreakpadManager", "Breakpad is not active (setCustomData).");
            return;
        }
        ensureLoadLibrary();
        if (AnonymousClass002.A1L(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            synchronized (BreakpadManager.class) {
                if (objArr.length > 0 && str2 != null) {
                    StringBuilder sbA0w = C60O.A0w();
                    Formatter formatter = new Formatter(sbA0w);
                    formatter.format(str2, objArr);
                    formatter.close();
                    str2 = sbA0w.toString();
                }
                nativeSetCustomData(str, str2);
            }
        }
    }

    public static synchronized void start(Context context, long j, int i, String str, String str2, boolean z, boolean z2) {
        String str3 = str;
        synchronized (BreakpadManager.class) {
            Trace.beginSection("BreakpadManager.ensureLoadLibrary");
            try {
                ensureLoadLibrary();
                Trace.endSection();
                if (mCrashDirectory == null) {
                    Trace.beginSection("BreakpadManager.crashDirectory");
                    try {
                        AnonymousClass003.A0u(context, C45.A00);
                        File fileA00 = AbstractC3416CMe.A00(context, 1874789883);
                        fileA00.mkdirs();
                        Trace.endSection();
                        Trace.beginSection("BreakpadManager.install");
                        String absolutePath = fileA00.getAbsolutePath();
                        if (str == null) {
                            str3 = "";
                        }
                        install(absolutePath, str3, null, 1536000, Build.VERSION.SDK_INT, false, AnonymousClass002.A1M(((j & 65536) > 65536L ? 1 : ((j & 65536) == 65536L ? 0 : -1))), false);
                        Trace.endSection();
                        mCrashDirectory = fileA00;
                        Trace.beginSection("BreakpadManager.setMinidumpInfo");
                        ensureLoadLibrary();
                        long jNativeGetMinidumpFlags = j | nativeGetMinidumpFlags() | 6;
                        ensureLoadLibrary();
                        nativeSetMinidumpFlags(jNativeGetMinidumpFlags);
                        int iA01 = BuildConstants.A01();
                        String str4 = Build.FINGERPRINT;
                        setVersionInfo(iA01, "16.0.0.11.159", str4);
                        setCustomData("Fingerprint", str4, new Object[0]);
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }
}
