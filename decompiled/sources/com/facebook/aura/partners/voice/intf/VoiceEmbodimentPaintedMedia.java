package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEmbodimentPaintedMedia {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentPaintedMedia[] $VALUES;
    public static final VoiceEmbodimentPaintedMedia IDLE;
    public static final VoiceEmbodimentPaintedMedia LIVE;
    public static final VoiceEmbodimentPaintedMedia MAKING_SOMETHING;
    public static final VoiceEmbodimentPaintedMedia NONE;
    public static final VoiceEmbodimentPaintedMedia STATIC;
    public static final VoiceEmbodimentPaintedMedia WORKING;
    public final String value;

    static {
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia = new VoiceEmbodimentPaintedMedia(HatchCheckoutClientKt.CONTAINER_MODE_LIVE, 0, VoiceCallActivityRepository.MIC_STATUS_LIVE);
        LIVE = voiceEmbodimentPaintedMedia;
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia2 = new VoiceEmbodimentPaintedMedia("IDLE", 1, "idle");
        IDLE = voiceEmbodimentPaintedMedia2;
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia3 = new VoiceEmbodimentPaintedMedia("WORKING", 2, "working");
        WORKING = voiceEmbodimentPaintedMedia3;
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia4 = new VoiceEmbodimentPaintedMedia("MAKING_SOMETHING", 3, "making_something");
        MAKING_SOMETHING = voiceEmbodimentPaintedMedia4;
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia5 = new VoiceEmbodimentPaintedMedia("STATIC", 4, "static");
        STATIC = voiceEmbodimentPaintedMedia5;
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia6 = new VoiceEmbodimentPaintedMedia(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 5, "none");
        NONE = voiceEmbodimentPaintedMedia6;
        VoiceEmbodimentPaintedMedia[] voiceEmbodimentPaintedMediaArr = {voiceEmbodimentPaintedMedia, voiceEmbodimentPaintedMedia2, voiceEmbodimentPaintedMedia3, voiceEmbodimentPaintedMedia4, voiceEmbodimentPaintedMedia5, voiceEmbodimentPaintedMedia6};
        $VALUES = voiceEmbodimentPaintedMediaArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentPaintedMediaArr);
    }

    public static Ey9<VoiceEmbodimentPaintedMedia> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentPaintedMedia valueOf(String str) {
        return (VoiceEmbodimentPaintedMedia) Enum.valueOf(VoiceEmbodimentPaintedMedia.class, str);
    }

    public static VoiceEmbodimentPaintedMedia[] values() {
        return (VoiceEmbodimentPaintedMedia[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceEmbodimentPaintedMedia(String str, int i, String str2) {
        this.value = str2;
    }
}
