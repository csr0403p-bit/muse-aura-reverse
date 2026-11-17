package com.facebook.aura.gateway;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class PinnedHostData {
    public static final int $stable = 8;
    public final byte[] hostData;
    public final String vmId;

    public final byte[] getHostData() {
        return this.hostData;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public PinnedHostData(String str, byte[] bArr) {
        AnonymousClass003.A0u(str, bArr);
        this.vmId = str;
        this.hostData = bArr;
    }
}
