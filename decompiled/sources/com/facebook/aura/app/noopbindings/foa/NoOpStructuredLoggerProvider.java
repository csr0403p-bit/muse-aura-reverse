package com.facebook.aura.app.noopbindings.foa;

import X.C8ee;
import X.InterfaceC7542F0w;

/* loaded from: classes5.dex */
public final class NoOpStructuredLoggerProvider {
    public static final NoOpStructuredLoggerProvider INSTANCE = new NoOpStructuredLoggerProvider();

    public C8ee<?> get(InterfaceC7542F0w interfaceC7542F0w) {
        return NoOpLogger.INSTANCE;
    }
}
