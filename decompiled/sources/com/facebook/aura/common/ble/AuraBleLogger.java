package com.facebook.aura.common.ble;

import X.C8j3;

/* loaded from: classes4.dex */
public interface AuraBleLogger {

    /* renamed from: com.facebook.aura.common.ble.AuraBleLogger$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void error$default(AuraBleLogger auraBleLogger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            auraBleLogger.error(str, th);
        }
    }

    void debug(String str);

    void error(String str, Throwable th);

    void log(String str);

    void warning(String str);

    public abstract class DefaultImpls {
    }
}
