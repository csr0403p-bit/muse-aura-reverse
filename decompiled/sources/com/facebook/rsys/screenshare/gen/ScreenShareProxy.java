package com.facebook.rsys.screenshare.gen;

import X.F60;

/* loaded from: classes6.dex */
public abstract class ScreenShareProxy {
    public abstract void setApi(ScreenShareApi screenShareApi);

    public abstract void setScreenShareAvailability(int i);

    public abstract void setScreenShareFrameCaptureRate(int i);

    public abstract void setScreenShareStopSharing();

    public ScreenShareProxy() {
        throw F60.createAndThrow();
    }
}
