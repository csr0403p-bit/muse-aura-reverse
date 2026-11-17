package com.facebook.aura.backgroundwork.api;

import X.AbstractC3358CGz;

/* loaded from: classes2.dex */
public interface BackgroundWorkHook {
    void onAcknowledged(AbstractC3358CGz abstractC3358CGz, String str);

    void onFinished(AbstractC3358CGz abstractC3358CGz, BackgroundWorkContent backgroundWorkContent);
}
