package com.facebook.imagepipeline.nativecode;

import X.AbstractC6994Edv;
import X.C7003Ee6;
import X.C7007EeE;
import X.C7384Etj;
import X.InterfaceC7006EeD;
import X.InterfaceC7026EeX;

/* loaded from: classes5.dex */
public final class NativeJpegTranscoderFactory implements InterfaceC7006EeD {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC7006EeD
    public InterfaceC7026EeX createImageTranscoder(C7003Ee6 c7003Ee6, boolean z) {
        C7384Etj.A0Y(c7003Ee6, 0);
        if (c7003Ee6 != AbstractC6994Edv.A07) {
            return null;
        }
        int i = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A01;
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.mResizingEnabled = z;
        nativeJpegTranscoder.mMaxBitmapSize = i;
        nativeJpegTranscoder.mUseDownsamplingRatio = z2;
        if (!z3) {
            return nativeJpegTranscoder;
        }
        C7007EeE.A00();
        return nativeJpegTranscoder;
    }

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
