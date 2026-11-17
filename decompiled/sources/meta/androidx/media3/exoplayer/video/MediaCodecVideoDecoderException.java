package meta.androidx.media3.exoplayer.video;

import meta.androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* loaded from: classes5.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaCodecVideoDecoderException(android.view.Surface r3, java.lang.Throwable r4, X.C6153Dwv r5) {
        /*
            r2 = this;
            r2.<init>(r4, r5)
            int r0 = java.lang.System.identityHashCode(r3)
            r2.surfaceIdentityHashCode = r0
            if (r3 == 0) goto L12
            boolean r1 = r3.isValid()
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            r2.isSurfaceValid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: meta.androidx.media3.exoplayer.video.MediaCodecVideoDecoderException.<init>(android.view.Surface, java.lang.Throwable, X.Dwv):void");
    }
}
