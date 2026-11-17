package meta.androidx.media3.exoplayer.mediacodec;

import X.C6153Dwv;
import X.FGI;
import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* loaded from: classes5.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final C6153Dwv codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(Throwable th, C6153Dwv c6153Dwv) {
        super(FGI.A0M("Decoder failed: ", c6153Dwv == null ? null : c6153Dwv.A06), th);
        this.codecInfo = c6153Dwv;
        boolean z = th instanceof MediaCodec.CodecException;
        this.diagnosticInfo = z ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.errorCode = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
