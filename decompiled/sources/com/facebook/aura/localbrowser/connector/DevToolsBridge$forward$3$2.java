package com.facebook.aura.localbrowser.connector;

import X.C7438Evz;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class DevToolsBridge$forward$3$2 extends C7438Evz implements Function0<OutputStream> {
    public DevToolsBridge$forward$3$2(Object obj) {
        super(0, obj, Socket.class, "getOutputStream", "getOutputStream()Ljava/io/OutputStream;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final OutputStream invoke() {
        return ((Socket) this.receiver).getOutputStream();
    }
}
