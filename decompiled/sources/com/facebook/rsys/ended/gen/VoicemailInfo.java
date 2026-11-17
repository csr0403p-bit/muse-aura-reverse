package com.facebook.rsys.ended.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VoicemailInfo {
    public static G50<VoicemailInfo> CONVERTER = C8925Fth.A00(28);
    public static long sMcfTypeId;
    public final boolean shouldPlayPromptWithSpeakerOn;
    public final boolean shouldTriggerVoicemail;
    public final String voicemailPromptLocale;

    public static native VoicemailInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicemailInfo) {
                VoicemailInfo voicemailInfo = (VoicemailInfo) obj;
                if (this.shouldTriggerVoicemail != voicemailInfo.shouldTriggerVoicemail || !this.voicemailPromptLocale.equals(voicemailInfo.voicemailPromptLocale) || this.shouldPlayPromptWithSpeakerOn != voicemailInfo.shouldPlayPromptWithSpeakerOn) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.voicemailPromptLocale, (527 + (this.shouldTriggerVoicemail ? 1 : 0)) * 31) + (this.shouldPlayPromptWithSpeakerOn ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VoicemailInfo{shouldTriggerVoicemail=");
        sbA0x.append(this.shouldTriggerVoicemail);
        sbA0x.append(",voicemailPromptLocale=");
        sbA0x.append(this.voicemailPromptLocale);
        sbA0x.append(",shouldPlayPromptWithSpeakerOn=");
        return AbstractC7610F5x.A0y(sbA0x, this.shouldPlayPromptWithSpeakerOn);
    }

    public VoicemailInfo(boolean z, String str, boolean z2) {
        str.getClass();
        this.shouldTriggerVoicemail = z;
        this.voicemailPromptLocale = str;
        this.shouldPlayPromptWithSpeakerOn = z2;
    }
}
