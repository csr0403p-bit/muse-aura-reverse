package com.facebook.aura.analytics.accesslibrary;

import X.AbstractC6670EOh;
import X.FBB;
import X.InterfaceC7542F0w;
import android.content.Context;

/* loaded from: classes5.dex */
public final class AuraDebugAccessLibraryLoggerProvider {
    public static final AuraDebugAccessLibraryLoggerProvider INSTANCE = new AuraDebugAccessLibraryLoggerProvider();

    public AbstractC6670EOh getAccessLibraryLogger(Context context, InterfaceC7542F0w interfaceC7542F0w, FBB fbb) {
        return new AuraAccessLibraryLogger();
    }
}
