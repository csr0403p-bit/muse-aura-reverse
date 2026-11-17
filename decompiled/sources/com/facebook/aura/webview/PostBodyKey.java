package com.facebook.aura.webview;

import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class PostBodyKey {
    public final byte[] bytes;

    public PostBodyKey(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.bytes = bArr;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PostBodyKey) && Arrays.equals(this.bytes, ((PostBodyKey) obj).bytes);
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }
}
