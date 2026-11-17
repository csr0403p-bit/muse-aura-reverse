package com.facebook.aura.analytics.accesslibrary;

import X.AbstractC6670EOh;
import X.FBB;
import X.InterfaceC7542F0w;
import android.content.Context;

/* loaded from: classes5.dex */
public final class AuraAccessLibraryLoggerProvider {
    public static final AuraAccessLibraryLoggerProvider INSTANCE = new AuraAccessLibraryLoggerProvider();

    public AbstractC6670EOh getAccessLibraryLogger(Context context, InterfaceC7542F0w interfaceC7542F0w, FBB fbb) {
        return new AuraAccessLibraryLogger();
    }
}
