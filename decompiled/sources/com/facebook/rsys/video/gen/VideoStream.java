package com.facebook.rsys.video.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.video.VideoSource;

/* loaded from: classes6.dex */
public class VideoStream {
    public static G50<VideoStream> CONVERTER = new C8924Ftg(1);
    public static long sMcfTypeId;
    public final boolean isFrozen;
    public final boolean isSuppressedByUser;
    public final String streamId;
    public final StreamInfo streamInfo;
    public final int streamState;
    public final VideoSource videoSource;

    public static native VideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoStream) {
                VideoStream videoStream = (VideoStream) obj;
                if (this.videoSource.equals(videoStream.videoSource) && this.isFrozen == videoStream.isFrozen && this.streamInfo.equals(videoStream.streamInfo)) {
                    String str = this.streamId;
                    String str2 = videoStream.streamId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.streamState != videoStream.streamState || this.isSuppressedByUser != videoStream.isSuppressedByUser) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.streamInfo, (BV8.A09(this.videoSource) + (this.isFrozen ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.streamId)) * 31) + this.streamState) * 31) + (this.isSuppressedByUser ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoStream{videoSource=");
        sbA0x.append(this.videoSource);
        sbA0x.append(",isFrozen=");
        sbA0x.append(this.isFrozen);
        sbA0x.append(",streamInfo=");
        sbA0x.append(this.streamInfo);
        sbA0x.append(",streamId=");
        sbA0x.append(this.streamId);
        sbA0x.append(",streamState=");
        sbA0x.append(this.streamState);
        sbA0x.append(",isSuppressedByUser=");
        return AbstractC7610F5x.A0y(sbA0x, this.isSuppressedByUser);
    }

    public VideoStream(VideoSource videoSource, boolean z, StreamInfo streamInfo, String str, int i, boolean z2) {
        videoSource.getClass();
        streamInfo.getClass();
        this.videoSource = videoSource;
        this.isFrozen = z;
        this.streamInfo = streamInfo;
        this.streamId = str;
        this.streamState = i;
        this.isSuppressedByUser = z2;
    }
}
