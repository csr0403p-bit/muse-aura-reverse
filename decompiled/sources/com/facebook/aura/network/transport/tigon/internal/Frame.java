package com.facebook.aura.network.transport.tigon.internal;

import X.C7384Etj;

/* loaded from: classes5.dex */
public interface Frame {

    public final class Data implements Frame {
        public final byte[] bytes;

        public Data(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }
}
