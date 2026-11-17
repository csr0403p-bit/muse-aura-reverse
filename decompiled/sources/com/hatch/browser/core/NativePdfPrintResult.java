package com.hatch.browser.core;

import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class NativePdfPrintResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public byte[] bytes;

    public NativePdfPrintResult(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.bytes = bArr;
    }

    public final NativePdfPrintResult copy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return new NativePdfPrintResult(bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativePdfPrintResult) && C7384Etj.areEqual(this.bytes, ((NativePdfPrintResult) obj).bytes));
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

    public static /* synthetic */ NativePdfPrintResult copy$default(NativePdfPrintResult nativePdfPrintResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = nativePdfPrintResult.bytes;
        }
        C7384Etj.A0Y(bArr, 0);
        return new NativePdfPrintResult(bArr);
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
        return C60O.A0r("NativePdfPrintResult(bytes=", Arrays.toString(this.bytes));
    }
}
