package com.facebook.rendercore;

import X.FGI;
import X.FGT;

/* loaded from: classes6.dex */
public final class RenderUnit$RenderUnitOperationException extends RuntimeException {
    public RenderUnit$RenderUnitOperationException(FGT<?> fgt, String str, Throwable th) {
        super(FGI.A0d("[", fgt.A0L(), "] ", str));
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
    }
}
