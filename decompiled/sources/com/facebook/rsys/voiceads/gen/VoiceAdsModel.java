package com.facebook.rsys.voiceads.gen;

import X.C8924Ftg;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VoiceAdsModel {
    public static G50<VoiceAdsModel> CONVERTER = new C8924Ftg(13);
    public static long sMcfTypeId;
    public final String adId;

    public static native VoiceAdsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VoiceAdsModel) {
            return this.adId.equals(((VoiceAdsModel) obj).adId);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.adId.hashCode();
    }

    public String toString() {
        return FGI.A0U("VoiceAdsModel{adId=", this.adId, "}");
    }

    public VoiceAdsModel(String str) {
        str.getClass();
        this.adId = str;
    }
}
