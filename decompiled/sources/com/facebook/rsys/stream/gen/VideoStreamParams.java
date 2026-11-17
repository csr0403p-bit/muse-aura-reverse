package com.facebook.rsys.stream.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes6.dex */
public class VideoStreamParams {
    public static G50<VideoStreamParams> CONVERTER = C8922Fte.A00(27);
    public static long sMcfTypeId;
    public final int preferredCodec;
    public final StreamCallbacks streamCallbacks;
    public final int syncGroup;
    public final StreamInfo videoStreamInfo;

    public static native VideoStreamParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoStreamParams) {
                VideoStreamParams videoStreamParams = (VideoStreamParams) obj;
                if (this.videoStreamInfo.equals(videoStreamParams.videoStreamInfo) && this.syncGroup == videoStreamParams.syncGroup && this.preferredCodec == videoStreamParams.preferredCodec) {
                    StreamCallbacks streamCallbacks = this.streamCallbacks;
                    StreamCallbacks streamCallbacks2 = videoStreamParams.streamCallbacks;
                    if (streamCallbacks != null ? !streamCallbacks.equals(streamCallbacks2) : streamCallbacks2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((BV8.A09(this.videoStreamInfo) + this.syncGroup) * 31) + this.preferredCodec) * 31) + AnonymousClass006.A0D(this.streamCallbacks);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoStreamParams{videoStreamInfo=");
        sbA0x.append(this.videoStreamInfo);
        sbA0x.append(",syncGroup=");
        sbA0x.append(this.syncGroup);
        sbA0x.append(",preferredCodec=");
        sbA0x.append(this.preferredCodec);
        sbA0x.append(",streamCallbacks=");
        return BV8.A0v(this.streamCallbacks, sbA0x);
    }

    public VideoStreamParams(StreamInfo streamInfo, int i, int i2, StreamCallbacks streamCallbacks) {
        streamInfo.getClass();
        this.videoStreamInfo = streamInfo;
        this.syncGroup = i;
        this.preferredCodec = i2;
        this.streamCallbacks = streamCallbacks;
    }
}
