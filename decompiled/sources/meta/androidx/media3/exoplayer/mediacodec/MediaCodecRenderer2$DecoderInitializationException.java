package meta.androidx.media3.exoplayer.mediacodec;

import X.AnonymousClass006;
import X.C60O;
import X.C6153Dwv;
import X.C6154Dwx;
import X.FGI;

/* loaded from: classes5.dex */
public class MediaCodecRenderer2$DecoderInitializationException extends Exception {
    public final C6153Dwv codecInfo;
    public final String diagnosticInfo;
    public final MediaCodecRenderer2$DecoderInitializationException fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    public MediaCodecRenderer2$DecoderInitializationException(C6154Dwx c6154Dwx, Throwable th, int i, boolean z) {
        this(AnonymousClass006.A0y(c6154Dwx, "], ", C60O.A0y("Decoder init failed: [", i)), c6154Dwx.A0b, FGI.A0S("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer2_", "neg_", Math.abs(i)), th, null, null, z);
    }

    public MediaCodecRenderer2$DecoderInitializationException(String str, String str2, String str3, Throwable th, C6153Dwv c6153Dwv, MediaCodecRenderer2$DecoderInitializationException mediaCodecRenderer2$DecoderInitializationException, boolean z) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = c6153Dwv;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = mediaCodecRenderer2$DecoderInitializationException;
    }
}
