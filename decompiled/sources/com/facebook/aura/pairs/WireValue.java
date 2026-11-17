package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface WireValue {

    public final class Bytes implements WireValue {
        public static final int $stable = 8;
        public final byte[] value;

        public Bytes(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            this.value = bArr;
        }

        public final byte[] getValue() {
            return this.value;
        }
    }

    public final class Varint implements WireValue {
        public static final int $stable = 0;
        public final long value;

        public final long getValue() {
            return this.value;
        }

        public Varint(long j) {
            this.value = j;
        }
    }
}
