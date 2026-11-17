package com.facebook.mobileconfig;

import X.Bzi;
import X.ETi;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class MobileConfigMmapHandleHolder extends Bzi {
    public final HybridData mHybridData;

    public native String getFilename();

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }

    public MobileConfigMmapHandleHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.DSZ
    public ByteBuffer getJavaByteBuffer() {
        return Bzi.A00(getFilename());
    }
}
