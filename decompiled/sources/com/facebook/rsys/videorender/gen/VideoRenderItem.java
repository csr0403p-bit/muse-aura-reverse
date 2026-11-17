package com.facebook.rsys.videorender.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes6.dex */
public class VideoRenderItem {
    public static G50<VideoRenderItem> CONVERTER = new C8924Ftg(4);
    public static long sMcfTypeId;
    public final int preferredQuality;
    public final StreamInfo streamInfo;
    public final String userId;
    public final VideoRenderFrameCallback videoFrameCallback;

    public class Builder {
        public int preferredQuality;
        public StreamInfo streamInfo;
        public String userId;
        public VideoRenderFrameCallback videoFrameCallback;

        public VideoRenderItem build() {
            return new VideoRenderItem(this);
        }
    }

    public VideoRenderItem(StreamInfo streamInfo, VideoRenderFrameCallback videoRenderFrameCallback, String str) {
        str.getClass();
        this.userId = str;
        this.streamInfo = streamInfo;
        this.preferredQuality = 0;
        this.videoFrameCallback = videoRenderFrameCallback;
    }

    public static native VideoRenderItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoRenderItem) {
                VideoRenderItem videoRenderItem = (VideoRenderItem) obj;
                if (!this.userId.equals(videoRenderItem.userId) || !this.streamInfo.equals(videoRenderItem.streamInfo) || this.preferredQuality != videoRenderItem.preferredQuality || !this.videoFrameCallback.equals(videoRenderItem.videoFrameCallback)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.videoFrameCallback, (AnonymousClass005.A0F(this.streamInfo, BV8.A0B(this.userId)) + this.preferredQuality) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoRenderItem{userId=");
        sbA0x.append(this.userId);
        sbA0x.append(",streamInfo=");
        sbA0x.append(this.streamInfo);
        sbA0x.append(",preferredQuality=");
        sbA0x.append(this.preferredQuality);
        sbA0x.append(",videoFrameCallback=");
        return BV8.A0v(this.videoFrameCallback, sbA0x);
    }

    public VideoRenderItem(Builder builder) {
        builder.userId.getClass();
        builder.streamInfo.getClass();
        builder.videoFrameCallback.getClass();
        this.userId = builder.userId;
        this.streamInfo = builder.streamInfo;
        this.preferredQuality = builder.preferredQuality;
        this.videoFrameCallback = builder.videoFrameCallback;
    }
}
