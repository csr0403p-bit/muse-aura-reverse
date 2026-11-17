package com.facebook.acra.anr.sigquit;

import X.C8f;
import android.os.Handler;

/* loaded from: classes5.dex */
public interface SigquitDetector {
    void cleanupAppStateFile();

    void doNotIgnoreNextSiguit();

    void init(C8f c8f, boolean z);

    void installSignalHandler(Handler handler, boolean z);

    void startDetector();

    void stopDetector();
}
