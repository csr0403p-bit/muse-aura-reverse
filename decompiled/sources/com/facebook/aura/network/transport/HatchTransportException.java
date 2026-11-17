package com.facebook.aura.network.transport;

import X.AnonymousClass003;
import java.io.IOException;

/* loaded from: classes3.dex */
public class HatchTransportException extends IOException {
    public final String failureKind;

    public final String getFailureKind() {
        return this.failureKind;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTransportException(String str, String str2) {
        super(str);
        AnonymousClass003.A0u(str, str2);
        this.failureKind = str2;
    }
}
