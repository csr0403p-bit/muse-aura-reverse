package com.facebook.rsys.videosubscriptions.gen;

import X.AbstractC7610F5x;
import X.C60O;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class VideoSubscriptions {
    public static G50<VideoSubscriptions> CONVERTER = new C8924Ftg(7);
    public static long sMcfTypeId;
    public final boolean dominantIncludeSelf;
    public final int dominantStreamQuality;
    public final Map<String, Integer> subscriptionsMap;
    public final int videoSubscriptionsMode;

    public class Builder {
        public boolean dominantIncludeSelf;
        public int dominantStreamQuality;
        public Map<String, Integer> subscriptionsMap;
        public int videoSubscriptionsMode;

        public VideoSubscriptions build() {
            return new VideoSubscriptions(this);
        }
    }

    public static native VideoSubscriptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoSubscriptions) {
                VideoSubscriptions videoSubscriptions = (VideoSubscriptions) obj;
                if (this.videoSubscriptionsMode != videoSubscriptions.videoSubscriptionsMode || !this.subscriptionsMap.equals(videoSubscriptions.subscriptionsMap) || this.dominantStreamQuality != videoSubscriptions.dominantStreamQuality || this.dominantIncludeSelf != videoSubscriptions.dominantIncludeSelf) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.videoSubscriptionsMode) * 31) + this.subscriptionsMap.hashCode()) * 31) + this.dominantStreamQuality) * 31) + (this.dominantIncludeSelf ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoSubscriptions{videoSubscriptionsMode=");
        sbA0x.append(this.videoSubscriptionsMode);
        sbA0x.append(",subscriptionsMap=");
        sbA0x.append(this.subscriptionsMap);
        sbA0x.append(",dominantStreamQuality=");
        sbA0x.append(this.dominantStreamQuality);
        sbA0x.append(",dominantIncludeSelf=");
        return AbstractC7610F5x.A0y(sbA0x, this.dominantIncludeSelf);
    }

    public VideoSubscriptions(Builder builder) {
        builder.subscriptionsMap.getClass();
        this.videoSubscriptionsMode = builder.videoSubscriptionsMode;
        this.subscriptionsMap = builder.subscriptionsMap;
        this.dominantStreamQuality = builder.dominantStreamQuality;
        this.dominantIncludeSelf = builder.dominantIncludeSelf;
    }
}
