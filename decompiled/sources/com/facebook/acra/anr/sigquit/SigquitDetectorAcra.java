package com.facebook.acra.anr.sigquit;

import X.CFK;
import android.os.Handler;

/* loaded from: classes5.dex */
public class SigquitDetectorAcra implements SigquitDetector {
    public static final String TAG = "SigquitDetectorAcra";
    public static SigquitDetector sInstance;
    public SigquitDetectorListener mListener;
    public Handler mMainThreadHandler;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, boolean z6);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    private void onSigquit(boolean z, long j, long j2, long j3) {
    }

    public static SigquitDetector getInstance(SigquitDetectorListener sigquitDetectorListener) {
        SigquitDetector sigquitDetector = sInstance;
        if (sigquitDetector != null) {
            return sigquitDetector;
        }
        SigquitDetectorAcra sigquitDetectorAcra = new SigquitDetectorAcra(sigquitDetectorListener);
        sInstance = sigquitDetectorAcra;
        return sigquitDetectorAcra;
    }

    private void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2) {
        CFK.A0H(TAG, "sigquitDetected inFgV1: %b inFgV2: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.mListener.onSigquitTracesAvailable(str, str2, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.C8f r13, boolean r14) {
        /*
            r12 = this;
            android.os.Handler r0 = r13.A02
            r2 = r12
            r12.mMainThreadHandler = r0
            java.lang.String r1 = com.facebook.acra.anr.sigquit.SigquitDetectorAcra.TAG
            java.lang.String r0 = "nativeInit"
            X.CFK.A06(r1, r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = ""
            java.lang.String r6 = r13.A05
            java.lang.String r7 = ".stacktrace"
            java.lang.String r1 = r13.A04
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r8 = 0
            if (r0 == 0) goto L28
        L27:
            r8 = 1
        L28:
            r10 = 1
            r11 = 0
            java.lang.String r13 = r13.A00()
            r9 = r14
            r5 = r4
            r12 = r11
            r14 = r11
            nativeInit(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorAcra.init(X.C8f, boolean):void");
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void installSignalHandler(final Handler handler, final boolean z) {
        final Runnable runnable = new Runnable(this) { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorAcra.1
            public final /* synthetic */ SigquitDetectorAcra this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zNativeHookMethods = SigquitDetectorAcra.nativeHookMethods();
                this.this$0.mListener.onHookedMethods(zNativeHookMethods);
                if (zNativeHookMethods && z) {
                    this.this$0.startDetector();
                }
            }
        };
        this.mMainThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorAcra.2
            public final /* synthetic */ SigquitDetectorAcra this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                SigquitDetectorAcra.nativeAddSignalHandler();
                handler.post(runnable);
            }
        });
    }

    public SigquitDetectorAcra(SigquitDetectorListener sigquitDetectorListener) {
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
