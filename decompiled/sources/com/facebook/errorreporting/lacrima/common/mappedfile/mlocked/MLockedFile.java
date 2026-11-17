package com.facebook.errorreporting.lacrima.common.mappedfile.mlocked;

import X.C3193C2r;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class MLockedFile extends C3193C2r {
    public static native void mlockBuffer(ByteBuffer byteBuffer);

    public static native void munlockBuffer(ByteBuffer byteBuffer);
}
