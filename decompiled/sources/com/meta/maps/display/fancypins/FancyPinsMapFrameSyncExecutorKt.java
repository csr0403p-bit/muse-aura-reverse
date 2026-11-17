package com.meta.maps.display.fancypins;

import X.AbstractC5321DgF;
import X.F0C;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class FancyPinsMapFrameSyncExecutorKt {
    public static final boolean TRACING_ENABLED = false;
    public static final F0C mainThreadHandler$delegate = AbstractC5321DgF.A03(FancyPinsMapFrameSyncExecutorKt$mainThreadHandler$2.INSTANCE);

    public static final Handler getMainThreadHandler() {
        return (Handler) mainThreadHandler$delegate.getValue();
    }

    public static final void postToMainThreadAsynchronously(Runnable runnable) {
        Handler mainThreadHandler = getMainThreadHandler();
        Message messageObtain = Message.obtain(getMainThreadHandler(), runnable);
        messageObtain.setAsynchronous(true);
        mainThreadHandler.sendMessage(messageObtain);
    }

    public static final <T> T traceSection(String str, Function0<? extends T> function0) {
        return function0.invoke();
    }
}
