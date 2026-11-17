package com.facebook.aura.localbrowser.connector;

import X.C7438Evz;
import android.net.LocalSocket;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class DevToolsBridge$forward$3$1 extends C7438Evz implements Function0<InputStream> {
    public DevToolsBridge$forward$3$1(Object obj) {
        super(0, obj, LocalSocket.class, "getInputStream", "getInputStream()Ljava/io/InputStream;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InputStream invoke() {
        return ((LocalSocket) this.receiver).getInputStream();
    }
}
