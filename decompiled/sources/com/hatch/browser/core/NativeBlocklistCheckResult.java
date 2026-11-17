package com.hatch.browser.core;

import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class NativeBlocklistCheckResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public byte[] response;

    public NativeBlocklistCheckResult(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.response = bArr;
    }

    public final NativeBlocklistCheckResult copy(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return new NativeBlocklistCheckResult(bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativeBlocklistCheckResult) && C7384Etj.areEqual(this.response, ((NativeBlocklistCheckResult) obj).response));
    }

    public final void setResponse(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.response = bArr;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativeBlocklistCheckResult copy$default(NativeBlocklistCheckResult nativeBlocklistCheckResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = nativeBlocklistCheckResult.response;
        }
        C7384Etj.A0Y(bArr, 0);
        return new NativeBlocklistCheckResult(bArr);
    }

    public final byte[] component1() {
        return this.response;
    }

    public final byte[] getResponse() {
        return this.response;
    }

    public int hashCode() {
        return Arrays.hashCode(this.response);
    }

    public String toString() {
        return C60O.A0r("NativeBlocklistCheckResult(response=", Arrays.toString(this.response));
    }
}
