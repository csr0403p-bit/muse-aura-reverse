package com.facebook.quicklog;

/* loaded from: classes5.dex */
public final class QplPointNotFoundException extends IllegalArgumentException {
    public final int instanceKey;
    public final String[] knownPoints;
    public final int markerId;

    public QplPointNotFoundException(int i, int i2, String str, String[] strArr) {
        super(str);
        this.knownPoints = strArr;
        this.markerId = i;
        this.instanceKey = i2;
    }
}
