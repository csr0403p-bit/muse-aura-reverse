package X;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;

/* loaded from: classes5.dex */
public abstract class BWb implements InterfaceC2372BWd {
    public final MediaCodecInfo A00;
    public final MediaCodecInfo.CodecCapabilities A01;

    public BWb(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.A00 = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            capabilitiesForType.getClass();
            this.A01 = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(FGI.A0M("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
