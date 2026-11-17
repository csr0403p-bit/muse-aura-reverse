package com.facebook.acra.anr;

/* loaded from: classes5.dex */
public interface ANRDetectorListener {
    String getBlackBoxTraceId();

    String getLongStallTraceId();

    void onEndANRDataCapture();

    void onStartANRDataCapture();
}
