package com.facebook.quicklog.reliability;

import X.AnonymousClass002;

/* loaded from: classes5.dex */
public final class UserFlowJNIProvider {
    public static final UserFlowJNIProvider INSTANCE = new UserFlowJNIProvider();
    public static UserFlowLogger userFlowInstance;

    public static final UserFlowLogger getUserFlowInstance() {
        return userFlowInstance;
    }

    public static final synchronized boolean isInitialized() {
        return AnonymousClass002.A1X(userFlowInstance);
    }

    public static final synchronized void setUserFlowLogger(UserFlowLogger userFlowLogger) {
        userFlowInstance = userFlowLogger;
    }
}
