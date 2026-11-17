package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEmbodimentVisibleMedia {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentVisibleMedia[] $VALUES;
    public static final VoiceEmbodimentVisibleMedia ACTIVITY_CLIP;
    public static final VoiceEmbodimentVisibleMedia LIVE_RTC;
    public static final VoiceEmbodimentVisibleMedia NONE;

    static {
        VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia = new VoiceEmbodimentVisibleMedia(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = voiceEmbodimentVisibleMedia;
        VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia2 = new VoiceEmbodimentVisibleMedia("LIVE_RTC", 1);
        LIVE_RTC = voiceEmbodimentVisibleMedia2;
        VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia3 = new VoiceEmbodimentVisibleMedia("ACTIVITY_CLIP", 2);
        ACTIVITY_CLIP = voiceEmbodimentVisibleMedia3;
        VoiceEmbodimentVisibleMedia[] voiceEmbodimentVisibleMediaArr = {voiceEmbodimentVisibleMedia, voiceEmbodimentVisibleMedia2, voiceEmbodimentVisibleMedia3};
        $VALUES = voiceEmbodimentVisibleMediaArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentVisibleMediaArr);
    }

    public static Ey9<VoiceEmbodimentVisibleMedia> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentVisibleMedia valueOf(String str) {
        return (VoiceEmbodimentVisibleMedia) Enum.valueOf(VoiceEmbodimentVisibleMedia.class, str);
    }

    public static VoiceEmbodimentVisibleMedia[] values() {
        return (VoiceEmbodimentVisibleMedia[]) $VALUES.clone();
    }

    public VoiceEmbodimentVisibleMedia(String str, int i) {
    }
}
