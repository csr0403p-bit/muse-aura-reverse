package com.facebook.rsys.ended.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VideoQuality {
    public static G50<VideoQuality> CONVERTER = C8925Fth.A00(26);
    public static long sMcfTypeId;
    public final VideoStats receiverVideoQuality;
    public final VideoStats senderVideoQuality;

    public static native VideoQuality createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoQuality) {
                VideoQuality videoQuality = (VideoQuality) obj;
                if (!this.senderVideoQuality.equals(videoQuality.senderVideoQuality) || !this.receiverVideoQuality.equals(videoQuality.receiverVideoQuality)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.receiverVideoQuality, BV8.A09(this.senderVideoQuality));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoQuality{senderVideoQuality=");
        sbA0x.append(this.senderVideoQuality);
        sbA0x.append(",receiverVideoQuality=");
        return BV8.A0v(this.receiverVideoQuality, sbA0x);
    }

    public VideoQuality(VideoStats videoStats, VideoStats videoStats2) {
        videoStats.getClass();
        videoStats2.getClass();
        this.senderVideoQuality = videoStats;
        this.receiverVideoQuality = videoStats2;
    }
}
