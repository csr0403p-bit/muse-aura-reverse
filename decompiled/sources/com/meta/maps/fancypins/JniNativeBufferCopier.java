package com.meta.maps.fancypins;

import X.C7384Etj;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class JniNativeBufferCopier implements FancyPinNativeBufferCopier {
    public static final JniNativeBufferCopier INSTANCE = new JniNativeBufferCopier();

    @Override // com.meta.maps.fancypins.FancyPinNativeBufferCopier
    public void copy(long j, int i, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 2);
        FancyPinRenderBufferNative.nativeCopyBuffer(j, i, byteBuffer);
    }

    static {
        SdkModule.INSTANCE.ensureLoaded();
    }
}
