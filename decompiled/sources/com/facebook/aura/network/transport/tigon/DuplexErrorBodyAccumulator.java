package com.facebook.aura.network.transport.tigon;

import X.BV4;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DuplexErrorBodyAccumulator {
    public final ByteArrayOutputStream buffer;
    public final int maxBytes;
    public boolean truncated;

    public final void append(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        int length = bArr.length;
        if (length != 0) {
            int size = this.maxBytes - this.buffer.size();
            if (size > 0) {
                this.buffer.write(bArr, 0, Math.min(size, length));
                if (length <= size) {
                    return;
                }
            }
            this.truncated = true;
        }
    }

    public final byte[] bytesOrNull() {
        if (this.buffer.size() != 0 || this.truncated) {
            return this.buffer.toByteArray();
        }
        return null;
    }

    public DuplexErrorBodyAccumulator(int i) {
        this.maxBytes = i;
        if (i <= 0) {
            throw C60O.A0i("maxBytes must be positive");
        }
        this.buffer = BV4.A0F();
    }

    public final String errorMessageOrNull() {
        byte[] bArrBytesOrNull = bytesOrNull();
        if (bArrBytesOrNull == null) {
            return null;
        }
        String strA0o = BV4.A0o(bArrBytesOrNull);
        return this.truncated ? strA0o.concat(" [truncated]") : strA0o;
    }

    public /* synthetic */ DuplexErrorBodyAccumulator(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 65536 : i);
    }

    public DuplexErrorBodyAccumulator() {
        this(65536);
    }
}
