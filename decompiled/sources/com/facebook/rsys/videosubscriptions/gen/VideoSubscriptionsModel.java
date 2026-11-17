package com.facebook.rsys.videosubscriptions.gen;

import X.BV8;
import X.C60O;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class VideoSubscriptionsModel {
    public static G50<VideoSubscriptionsModel> CONVERTER = new C8924Ftg(9);
    public static long sMcfTypeId;
    public final Map<String, Integer> renderSubscriptionsMap;
    public final Map<String, Integer> streamIdToQuality;
    public final Map<String, Integer> streamSubscriptionsMap;
    public final VideoSubscriptions videoSubscriptions;

    public class Builder {
        public Map<String, Integer> renderSubscriptionsMap;
        public Map<String, Integer> streamIdToQuality;
        public Map<String, Integer> streamSubscriptionsMap;
        public VideoSubscriptions videoSubscriptions;

        public VideoSubscriptionsModel build() {
            return new VideoSubscriptionsModel(this);
        }
    }

    public static native VideoSubscriptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoSubscriptionsModel) {
                VideoSubscriptionsModel videoSubscriptionsModel = (VideoSubscriptionsModel) obj;
                if (!this.videoSubscriptions.equals(videoSubscriptionsModel.videoSubscriptions) || !this.renderSubscriptionsMap.equals(videoSubscriptionsModel.renderSubscriptionsMap) || !this.streamSubscriptionsMap.equals(videoSubscriptionsModel.streamSubscriptionsMap) || !this.streamIdToQuality.equals(videoSubscriptionsModel.streamIdToQuality)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((BV8.A09(this.videoSubscriptions) + this.renderSubscriptionsMap.hashCode()) * 31) + this.streamSubscriptionsMap.hashCode()) * 31) + this.streamIdToQuality.hashCode();
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoSubscriptionsModel{videoSubscriptions=");
        sbA0x.append(this.videoSubscriptions);
        sbA0x.append(",renderSubscriptionsMap=");
        sbA0x.append(this.renderSubscriptionsMap);
        sbA0x.append(",streamSubscriptionsMap=");
        sbA0x.append(this.streamSubscriptionsMap);
        sbA0x.append(",streamIdToQuality=");
        return BV8.A0v(this.streamIdToQuality, sbA0x);
    }

    public VideoSubscriptionsModel(Builder builder) {
        builder.videoSubscriptions.getClass();
        builder.renderSubscriptionsMap.getClass();
        builder.streamSubscriptionsMap.getClass();
        builder.streamIdToQuality.getClass();
        this.videoSubscriptions = builder.videoSubscriptions;
        this.renderSubscriptionsMap = builder.renderSubscriptionsMap;
        this.streamSubscriptionsMap = builder.streamSubscriptionsMap;
        this.streamIdToQuality = builder.streamIdToQuality;
    }
}
