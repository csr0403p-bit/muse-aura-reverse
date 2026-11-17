package com.facebook.systrace;

import X.AbstractC3459COf;
import X.AnonymousClass002;
import X.C3463COl;
import X.C3cG;
import X.CFK;
import X.COZ;
import X.InterfaceC3465COn;
import com.facebook.common.util.TriState;

/* loaded from: classes5.dex */
public class TraceDirect {
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sForceJavaImpl = "true".equals(AbstractC3459COf.A02("debug.fbsystrace.force_java"));
    public static final boolean sTraceLoad = "true".equals(AbstractC3459COf.A02("debug.fbsystrace.trace_load"));
    public static volatile TriState sNativeAvailable = TriState.A03;

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetDefaultTags(long j);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        boolean zA1X;
        InterfaceC3465COn interfaceC3465COn;
        if (sNativeAvailable == TriState.A03) {
            if (sForceJavaImpl) {
                CFK.A05("TraceDirect", "Forcing java implementation.");
                sNativeAvailable = TriState.A02;
            } else {
                synchronized (C3463COl.class) {
                    zA1X = AnonymousClass002.A1X(C3463COl.A00);
                }
                if (zA1X) {
                    synchronized (C3463COl.class) {
                        interfaceC3465COn = C3463COl.A00;
                        if (interfaceC3465COn == null) {
                            throw C3cG.A0Q("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    int iAKm = interfaceC3465COn.AKm();
                    if (iAKm > 0 && iAKm != sPrevSoLoaderSourcesVersion) {
                        sPrevSoLoaderSourcesVersion = iAKm;
                        try {
                            C3463COl.loadLibrary("fbsystrace");
                            String str = COZ.A00;
                            nativeSetEnabledTags(AbstractC3459COf.A00("debug.fbsystrace.tags"));
                            nativeBeginSection("fbsystrace.so loaded");
                            nativeEndSection();
                            sNativeAvailable = TriState.A04;
                            CFK.A05("TraceDirect", "fbsystrace.so loaded.");
                        } catch (UnsatisfiedLinkError unused) {
                            sNativeAvailable = TriState.A02;
                            CFK.A06("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                        }
                    }
                }
            }
        }
        return sNativeAvailable == TriState.A04;
    }
}
