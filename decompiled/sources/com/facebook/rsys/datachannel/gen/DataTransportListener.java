package com.facebook.rsys.datachannel.gen;

import X.F60;

/* loaded from: classes6.dex */
public abstract class DataTransportListener {
    public abstract void onMessage(byte[] bArr, String str, Long l);

    public abstract void onReady();

    public DataTransportListener() {
        throw F60.createAndThrow();
    }
}
