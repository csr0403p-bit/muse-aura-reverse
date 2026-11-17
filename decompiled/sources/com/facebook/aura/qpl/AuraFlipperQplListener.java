package com.facebook.aura.qpl;

import X.CP6;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* loaded from: classes5.dex */
public final class AuraFlipperQplListener {
    public static final AuraFlipperQplListener INSTANCE = new AuraFlipperQplListener();
    public static final CP6 instance = new CP6(AuraQplNameProvider.INSTANCE, AwakeTimeSinceBootClock.INSTANCE);

    public final CP6 getInstance() {
        return instance;
    }
}
