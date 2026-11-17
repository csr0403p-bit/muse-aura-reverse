package com.facebook.traffic.constants;

/* loaded from: classes5.dex */
public enum BweAnnotationRequestType {
    UNKNOWN("unknown"),
    ANDROID_PREFETCH_VIDEO("android-prefetch-video"),
    ANDROID_PLAYING_VIDEO("android-playing-video"),
    ANDROID_DOWNLOAD_VIDEO("android-download-video");

    public final String value;

    public String getValue() {
        return this.value;
    }

    BweAnnotationRequestType(String str) {
        this.value = str;
    }
}
