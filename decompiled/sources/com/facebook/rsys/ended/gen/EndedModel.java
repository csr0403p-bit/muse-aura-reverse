package com.facebook.rsys.ended.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class EndedModel {
    public static G50<EndedModel> CONVERTER = C8925Fth.A00(23);
    public static long sMcfTypeId;
    public final boolean canTryAgain;
    public final UnsupportedCapabilityFallbacks fallbacks;
    public final Integer joinResponseStatusCode;
    public final Integer joinResponseSubCode;
    public final int postCallViewType;
    public final int reason;
    public final boolean remoteEnded;
    public final boolean shouldInformPeer;
    public final boolean shouldTriggerVoicemail;
    public final String subReason;
    public final VideoQuality videoQuality;
    public final VoicemailInfo voicemailInfo;
    public final boolean wasConnected;

    public static native EndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EndedModel) {
                EndedModel endedModel = (EndedModel) obj;
                if (this.reason == endedModel.reason && this.subReason.equals(endedModel.subReason) && this.wasConnected == endedModel.wasConnected && this.postCallViewType == endedModel.postCallViewType && this.canTryAgain == endedModel.canTryAgain && this.remoteEnded == endedModel.remoteEnded && this.shouldInformPeer == endedModel.shouldInformPeer && this.shouldTriggerVoicemail == endedModel.shouldTriggerVoicemail) {
                    UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks = this.fallbacks;
                    UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks2 = endedModel.fallbacks;
                    if (unsupportedCapabilityFallbacks != null ? unsupportedCapabilityFallbacks.equals(unsupportedCapabilityFallbacks2) : unsupportedCapabilityFallbacks2 == null) {
                        VideoQuality videoQuality = this.videoQuality;
                        VideoQuality videoQuality2 = endedModel.videoQuality;
                        if (videoQuality == null) {
                            if (videoQuality2 != null) {
                                return false;
                            }
                        } else if (videoQuality.equals(videoQuality2)) {
                        }
                        VoicemailInfo voicemailInfo = this.voicemailInfo;
                        VoicemailInfo voicemailInfo2 = endedModel.voicemailInfo;
                        if (voicemailInfo == null) {
                            if (voicemailInfo2 != null) {
                                return false;
                            }
                        } else if (voicemailInfo.equals(voicemailInfo2)) {
                        }
                        Integer num = this.joinResponseStatusCode;
                        Integer num2 = endedModel.joinResponseStatusCode;
                        if (num == null) {
                            if (num2 != null) {
                                return false;
                            }
                        } else if (num.equals(num2)) {
                        }
                        Integer num3 = this.joinResponseSubCode;
                        Integer num4 = endedModel.joinResponseSubCode;
                        if (num3 == null) {
                            if (num4 != null) {
                                return false;
                            }
                        } else if (num3.equals(num4)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass005.A0I(this.subReason, (527 + this.reason) * 31) + (this.wasConnected ? 1 : 0)) * 31) + this.postCallViewType) * 31) + (this.canTryAgain ? 1 : 0)) * 31) + (this.remoteEnded ? 1 : 0)) * 31) + (this.shouldInformPeer ? 1 : 0)) * 31) + (this.shouldTriggerVoicemail ? 1 : 0)) * 31) + AnonymousClass006.A0D(this.fallbacks)) * 31) + AnonymousClass006.A0D(this.videoQuality)) * 31) + AnonymousClass006.A0D(this.voicemailInfo)) * 31) + AnonymousClass006.A0D(this.joinResponseStatusCode)) * 31) + C3cH.A02(this.joinResponseSubCode);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("EndedModel{reason=");
        sbA0x.append(this.reason);
        sbA0x.append(",subReason=");
        sbA0x.append(this.subReason);
        sbA0x.append(",wasConnected=");
        sbA0x.append(this.wasConnected);
        sbA0x.append(",postCallViewType=");
        sbA0x.append(this.postCallViewType);
        sbA0x.append(",canTryAgain=");
        sbA0x.append(this.canTryAgain);
        sbA0x.append(",remoteEnded=");
        sbA0x.append(this.remoteEnded);
        sbA0x.append(",shouldInformPeer=");
        sbA0x.append(this.shouldInformPeer);
        sbA0x.append(",shouldTriggerVoicemail=");
        sbA0x.append(this.shouldTriggerVoicemail);
        sbA0x.append(",fallbacks=");
        sbA0x.append(this.fallbacks);
        sbA0x.append(",videoQuality=");
        sbA0x.append(this.videoQuality);
        sbA0x.append(",voicemailInfo=");
        sbA0x.append(this.voicemailInfo);
        sbA0x.append(",joinResponseStatusCode=");
        sbA0x.append(this.joinResponseStatusCode);
        sbA0x.append(",joinResponseSubCode=");
        return BV8.A0v(this.joinResponseSubCode, sbA0x);
    }

    public EndedModel(int i, String str, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks, VideoQuality videoQuality, VoicemailInfo voicemailInfo, Integer num, Integer num2) {
        str.getClass();
        this.reason = i;
        this.subReason = str;
        this.wasConnected = z;
        this.postCallViewType = i2;
        this.canTryAgain = z2;
        this.remoteEnded = z3;
        this.shouldInformPeer = z4;
        this.shouldTriggerVoicemail = z5;
        this.fallbacks = unsupportedCapabilityFallbacks;
        this.videoQuality = videoQuality;
        this.voicemailInfo = voicemailInfo;
        this.joinResponseStatusCode = num;
        this.joinResponseSubCode = num2;
    }
}
