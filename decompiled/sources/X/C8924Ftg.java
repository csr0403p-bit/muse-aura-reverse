package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.video.gen.VideoFrameRenderedCallback;
import com.facebook.rsys.video.gen.VideoStream;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderFrameCallback;
import com.facebook.rsys.videorender.gen.VideoRenderItem;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsModel;
import com.facebook.rsys.voiceads.gen.AdContext;
import com.facebook.rsys.voiceads.gen.CallAdsContext;
import com.facebook.rsys.voiceads.gen.LeadAdsContext;
import com.facebook.rsys.voiceads.gen.VoiceAdsModel;

/* renamed from: X.Ftg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8924Ftg implements G50 {
    public final int $t;

    public C8924Ftg(int i) {
        this.$t = i;
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                return VideoFrameRenderedCallback.CProxy.createFromMcfType(mcfReference);
            case 1:
                GYS.A00();
                return VideoStream.createFromMcfType(mcfReference);
            case 2:
                return VideoRenderApi.CProxy.createFromMcfType(mcfReference);
            case 3:
                return VideoRenderFrameCallback.CProxy.createFromMcfType(mcfReference);
            case 4:
                GUn.A00();
                return VideoRenderItem.createFromMcfType(mcfReference);
            case 5:
                return VideoRenderProxy.CProxy.createFromMcfType(mcfReference);
            case 6:
                return VideoRenderSurface.CProxy.createFromMcfType(mcfReference);
            case 7:
                GYr.A00();
                return VideoSubscriptions.createFromMcfType(mcfReference);
            case 8:
                return VideoSubscriptionsApi.CProxy.createFromMcfType(mcfReference);
            case 9:
                GYr.A00();
                return VideoSubscriptionsModel.createFromMcfType(mcfReference);
            case 10:
                GZA.A00();
                return AdContext.createFromMcfType(mcfReference);
            case 11:
                GZA.A00();
                return CallAdsContext.createFromMcfType(mcfReference);
            case 12:
                GZA.A00();
                return LeadAdsContext.createFromMcfType(mcfReference);
            case 13:
                GZA.A00();
                return VoiceAdsModel.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<VideoFrameRenderedCallback> AHp() {
        switch (this.$t) {
            case 0:
                return VideoFrameRenderedCallback.class;
            case 1:
                return VideoStream.class;
            case 2:
                return VideoRenderApi.class;
            case 3:
                return VideoRenderFrameCallback.class;
            case 4:
                return VideoRenderItem.class;
            case 5:
                return VideoRenderProxy.class;
            case 6:
                return VideoRenderSurface.class;
            case 7:
                return VideoSubscriptions.class;
            case 8:
                return VideoSubscriptionsApi.class;
            case 9:
                return VideoSubscriptionsModel.class;
            case 10:
                return AdContext.class;
            case 11:
                return CallAdsContext.class;
            case 12:
                return LeadAdsContext.class;
            case 13:
                return VoiceAdsModel.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                long j = VideoFrameRenderedCallback.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = VideoFrameRenderedCallback.CProxy.nativeGetMcfTypeId();
                VideoFrameRenderedCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                GYS.A00();
                long j2 = VideoStream.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = VideoStream.nativeGetMcfTypeId();
                VideoStream.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                long j3 = VideoRenderApi.CProxy.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = VideoRenderApi.CProxy.nativeGetMcfTypeId();
                VideoRenderApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                long j4 = VideoRenderFrameCallback.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = VideoRenderFrameCallback.CProxy.nativeGetMcfTypeId();
                VideoRenderFrameCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GUn.A00();
                long j5 = VideoRenderItem.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = VideoRenderItem.nativeGetMcfTypeId();
                VideoRenderItem.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                long j6 = VideoRenderProxy.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = VideoRenderProxy.CProxy.nativeGetMcfTypeId();
                VideoRenderProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                long j7 = VideoRenderSurface.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = VideoRenderSurface.CProxy.nativeGetMcfTypeId();
                VideoRenderSurface.CProxy.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                GYr.A00();
                long j8 = VideoSubscriptions.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = VideoSubscriptions.nativeGetMcfTypeId();
                VideoSubscriptions.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                long j9 = VideoSubscriptionsApi.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = VideoSubscriptionsApi.CProxy.nativeGetMcfTypeId();
                VideoSubscriptionsApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                GYr.A00();
                long j10 = VideoSubscriptionsModel.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = VideoSubscriptionsModel.nativeGetMcfTypeId();
                VideoSubscriptionsModel.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                GZA.A00();
                long j11 = AdContext.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = AdContext.nativeGetMcfTypeId();
                AdContext.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                GZA.A00();
                long j12 = CallAdsContext.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = CallAdsContext.nativeGetMcfTypeId();
                CallAdsContext.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                GZA.A00();
                long j13 = LeadAdsContext.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = LeadAdsContext.nativeGetMcfTypeId();
                LeadAdsContext.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                GZA.A00();
                long j14 = VoiceAdsModel.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = VoiceAdsModel.nativeGetMcfTypeId();
                VoiceAdsModel.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            default:
                return 0L;
        }
    }
}
