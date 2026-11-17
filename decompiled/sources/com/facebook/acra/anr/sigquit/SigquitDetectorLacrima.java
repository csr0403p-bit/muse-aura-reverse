package com.facebook.acra.anr.sigquit;

import X.CFK;
import android.os.Handler;

/* loaded from: classes5.dex */
public class SigquitDetectorLacrima implements SigquitDetector {
    public static final String TAG = "SigquitDetectorLacrima";
    public static SigquitDetector sInstance;
    public SigquitDetectorListener mListener;
    public Handler mMainThreadHandler;
    public boolean mNotifyJavaOnSigquit;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    public static SigquitDetector getInstance(SigquitDetectorListener sigquitDetectorListener) {
        SigquitDetector sigquitDetector = sInstance;
        if (sigquitDetector != null) {
            return sigquitDetector;
        }
        SigquitDetectorLacrima sigquitDetectorLacrima = new SigquitDetectorLacrima(sigquitDetectorListener);
        sInstance = sigquitDetectorLacrima;
        return sigquitDetectorLacrima;
    }

    private void onSigquit(boolean z, long j, long j2, long j3) {
        this.mListener.onSigquit(z, j, j2, j3);
    }

    private void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2) {
        CFK.A0H(TAG, "sigquitDetected inFgV1: %b inFgV2: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.mListener.onSigquitTracesAvailable(str, str2, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.C8f r19, boolean r20) {
        /*
            r18 = this;
            java.lang.String r1 = com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.TAG
            java.lang.String r0 = "nativeInit"
            X.CFK.A06(r1, r0)
            r2 = r19
            android.os.Handler r0 = r2.A02
            r3 = r18
            r3.mMainThreadHandler = r0
            r12 = 0
            r3.mNotifyJavaOnSigquit = r12
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = ""
            java.lang.String r7 = r2.A05
            java.lang.String r8 = ".stacktrace"
            java.lang.String r1 = r2.A04
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r9 = 0
            if (r0 == 0) goto L2e
        L2d:
            r9 = 1
        L2e:
            r11 = 1
            java.lang.String r14 = r2.A00()
            r10 = r20
            r6 = r5
            r13 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            nativeInit(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.init(X.C8f, boolean):void");
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void installSignalHandler(final Handler handler, final boolean z) {
        final Runnable runnable = new Runnable(this) { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.1
            public final /* synthetic */ SigquitDetectorLacrima this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zNativeHookMethods = SigquitDetectorLacrima.nativeHookMethods();
                this.this$0.mListener.onHookedMethods(zNativeHookMethods);
                if (zNativeHookMethods && z) {
                    this.this$0.startDetector();
                }
            }
        };
        if (this.mNotifyJavaOnSigquit) {
            new Thread("LacrimaSigquitNotifier") { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    SigquitDetectorLacrima.nativeWaitForSignal();
                }
            }.start();
        }
        this.mMainThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.3
            public final /* synthetic */ SigquitDetectorLacrima this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                SigquitDetectorLacrima.nativeAddSignalHandler();
                handler.post(runnable);
            }
        });
    }

    public SigquitDetectorLacrima(SigquitDetectorListener sigquitDetectorListener) {
        this.mListener = sigquitDetectorListener;
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void cleanupAppStateFile() {
        nativeCleanupAppStateFile();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void doNotIgnoreNextSiguit() {
        nativeSendNextSigquitTraceUnconditionally();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void startDetector() {
        nativeStartDetector();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void stopDetector() {
        nativeStopDetector();
    }
}
