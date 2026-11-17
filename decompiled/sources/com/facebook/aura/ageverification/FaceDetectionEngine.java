package com.facebook.aura.ageverification;

import X.C3555CTs;
import X.C4209CqH;
import X.C7384Etj;
import X.CFK;
import X.CRy;
import X.CWM;
import X.Cbv;
import X.Cc0;
import X.ETi;
import android.content.Context;

/* loaded from: classes5.dex */
public final class FaceDetectionEngine {
    public static final int $stable = 0;
    public static final FaceDetectionEngine INSTANCE = new FaceDetectionEngine();

    public final boolean load(Context context) {
        C7384Etj.A0Y(context, 0);
        boolean z = false;
        try {
            Class.forName(FaceDetectionEngineKt.BUNDLED_ENGINE_CLASS, false, FaceDetectionEngine.class.getClassLoader());
            ETi.loadLibrary(FaceDetectionEngineKt.ENGINE_LIBRARY);
            System.loadLibrary(FaceDetectionEngineKt.ENGINE_LIBRARY);
            try {
                C3555CTs.A01(context.getApplicationContext());
            } catch (IllegalStateException unused) {
            }
            try {
                C4209CqH c4209CqH = FaceDetectionEngineKt.FACE_DETECTOR_OPTIONS;
                CRy.A04(c4209CqH, "You must provide a valid FaceDetectorOptions.");
                CWM cwm = (CWM) C3555CTs.A00().A02(CWM.class);
                CRy.A04(c4209CqH, "You must provide a valid FaceDetectorOptions.");
                new Cbv(cwm.A00, (Cc0) cwm.A01.A00(c4209CqH)).close();
                CFK.A05(FaceDetectionEngineKt.TAG, "Bundled face engine loaded");
                z = true;
                return true;
            } catch (Throwable th) {
                CFK.A0A(FaceDetectionEngineKt.TAG, "Failed to create the face detector", th);
                return z;
            }
        } catch (Throwable th2) {
            CFK.A0A(FaceDetectionEngineKt.TAG, "Failed to load the bundled engine", th2);
            return false;
        }
    }
}
