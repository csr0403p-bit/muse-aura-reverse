package com.facebook.acra.anr.sigquit;

/* loaded from: classes5.dex */
public interface SigquitDetectorListener {
    void onHookedMethods(boolean z);

    void onSigquit(boolean z, long j, long j2, long j3);

    void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2);
}
