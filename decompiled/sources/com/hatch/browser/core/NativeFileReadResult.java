package com.hatch.browser.core;

import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class NativeFileReadResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public byte[] bytes;

    public NativeFileReadResult(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.bytes = bArr;
    }

    public final NativeFileReadResult copy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return new NativeFileReadResult(bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativeFileReadResult) && C7384Etj.areEqual(this.bytes, ((NativeFileReadResult) obj).bytes));
    }

    public final void setBytes(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.bytes = bArr;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativeFileReadResult copy$default(NativeFileReadResult nativeFileReadResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = nativeFileReadResult.bytes;
        }
        C7384Etj.A0Y(bArr, 0);
        return new NativeFileReadResult(bArr);
    }

    public final byte[] component1() {
        return this.bytes;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public String toString() {
        return C60O.A0r("NativeFileReadResult(bytes=", Arrays.toString(this.bytes));
    }
}
