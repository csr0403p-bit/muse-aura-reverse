package com.facebook.aura.localbrowser.connector;

import X.C7438Evz;
import android.net.LocalSocket;
import java.io.OutputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class DevToolsBridge$forward$2$2 extends C7438Evz implements Function0<OutputStream> {
    public DevToolsBridge$forward$2$2(Object obj) {
        super(0, obj, LocalSocket.class, "getOutputStream", "getOutputStream()Ljava/io/OutputStream;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final OutputStream invoke() {
        return ((LocalSocket) this.receiver).getOutputStream();
    }
}
