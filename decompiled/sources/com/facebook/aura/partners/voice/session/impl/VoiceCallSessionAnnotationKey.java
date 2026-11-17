package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallSessionAnnotationKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallSessionAnnotationKey[] $VALUES;
    public static final VoiceCallSessionAnnotationKey ACTIVITY_CLIP_REENTRIES_AFTER_SPEECH;
    public static final VoiceCallSessionAnnotationKey EMBODIMENT_BACKGROUND_ENTRIES;
    public static final VoiceCallSessionAnnotationKey EMBODIMENT_MEDIA_CHANGES;
    public static final VoiceCallSessionAnnotationKey EMBODIMENT_PLACEMENT_CHANGES;
    public static final VoiceCallSessionAnnotationKey EMBODIMENT_TIMELINE_ROWS;
    public static final VoiceCallSessionAnnotationKey EMBODIMENT_TIMELINE_TRUNCATED;
    public static final VoiceCallSessionAnnotationKey ENDED_WHILE_RECONNECTING;
    public static final VoiceCallSessionAnnotationKey INTER_SPEECH_GAP_BUCKETS;
    public static final VoiceCallSessionAnnotationKey MEDIA_SWAPS_PER_CLIP_ELIGIBLE_INTERVAL;
    public static final VoiceCallSessionAnnotationKey RECONNECT_CAUSES;
    public static final VoiceCallSessionAnnotationKey RECONNECT_COUNT;
    public static final VoiceCallSessionAnnotationKey RECONNECT_MS;
    public static final VoiceCallSessionAnnotationKey RTC_VISIBLE_WHILE_BUSY_MS;
    public static final VoiceCallSessionAnnotationKey SHORT_CLIP_EXPOSURES_UNDER_1S;
    public static final VoiceCallSessionAnnotationKey SHORT_CLIP_EXPOSURES_UNDER_2S;
    public static final VoiceCallSessionAnnotationKey SPEECH_DURING_WORKING_SESSION;
    public static final VoiceCallSessionAnnotationKey WORKING_CLIP_VISIBLE_MS;
    public static final VoiceCallSessionAnnotationKey WORKING_VIDEO_GATE_ENABLED;
    public final String value;

    static {
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey = new VoiceCallSessionAnnotationKey("MEDIA_SWAPS_PER_CLIP_ELIGIBLE_INTERVAL", 0, "voice_media_swaps_per_clip_eligible_interval");
        MEDIA_SWAPS_PER_CLIP_ELIGIBLE_INTERVAL = voiceCallSessionAnnotationKey;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey2 = new VoiceCallSessionAnnotationKey("ACTIVITY_CLIP_REENTRIES_AFTER_SPEECH", 1, "voice_activity_clip_reentries_after_speech");
        ACTIVITY_CLIP_REENTRIES_AFTER_SPEECH = voiceCallSessionAnnotationKey2;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey3 = new VoiceCallSessionAnnotationKey("SHORT_CLIP_EXPOSURES_UNDER_1S", 2, "voice_short_clip_exposures_under_1s");
        SHORT_CLIP_EXPOSURES_UNDER_1S = voiceCallSessionAnnotationKey3;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey4 = new VoiceCallSessionAnnotationKey("SHORT_CLIP_EXPOSURES_UNDER_2S", 3, "voice_short_clip_exposures_under_2s");
        SHORT_CLIP_EXPOSURES_UNDER_2S = voiceCallSessionAnnotationKey4;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey5 = new VoiceCallSessionAnnotationKey("WORKING_CLIP_VISIBLE_MS", 4, "voice_working_clip_visible_ms");
        WORKING_CLIP_VISIBLE_MS = voiceCallSessionAnnotationKey5;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey6 = new VoiceCallSessionAnnotationKey("RTC_VISIBLE_WHILE_BUSY_MS", 5, "voice_rtc_visible_while_busy_ms");
        RTC_VISIBLE_WHILE_BUSY_MS = voiceCallSessionAnnotationKey6;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey7 = new VoiceCallSessionAnnotationKey("INTER_SPEECH_GAP_BUCKETS", 6, "voice_inter_speech_gap_buckets");
        INTER_SPEECH_GAP_BUCKETS = voiceCallSessionAnnotationKey7;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey8 = new VoiceCallSessionAnnotationKey("WORKING_VIDEO_GATE_ENABLED", 7, "voice_working_video_gate_enabled");
        WORKING_VIDEO_GATE_ENABLED = voiceCallSessionAnnotationKey8;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey9 = new VoiceCallSessionAnnotationKey("SPEECH_DURING_WORKING_SESSION", 8, "voice_speech_during_working_session");
        SPEECH_DURING_WORKING_SESSION = voiceCallSessionAnnotationKey9;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey10 = new VoiceCallSessionAnnotationKey("EMBODIMENT_PLACEMENT_CHANGES", 9, "voice_embodiment_placement_changes");
        EMBODIMENT_PLACEMENT_CHANGES = voiceCallSessionAnnotationKey10;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey11 = new VoiceCallSessionAnnotationKey("EMBODIMENT_MEDIA_CHANGES", 10, "voice_embodiment_media_changes");
        EMBODIMENT_MEDIA_CHANGES = voiceCallSessionAnnotationKey11;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey12 = new VoiceCallSessionAnnotationKey("EMBODIMENT_BACKGROUND_ENTRIES", 11, "voice_embodiment_background_entries");
        EMBODIMENT_BACKGROUND_ENTRIES = voiceCallSessionAnnotationKey12;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey13 = new VoiceCallSessionAnnotationKey("EMBODIMENT_TIMELINE_ROWS", 12, "voice_embodiment_timeline_rows");
        EMBODIMENT_TIMELINE_ROWS = voiceCallSessionAnnotationKey13;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey14 = new VoiceCallSessionAnnotationKey("EMBODIMENT_TIMELINE_TRUNCATED", 13, "voice_embodiment_timeline_truncated");
        EMBODIMENT_TIMELINE_TRUNCATED = voiceCallSessionAnnotationKey14;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey15 = new VoiceCallSessionAnnotationKey("RECONNECT_COUNT", 14, "reconnect_count");
        RECONNECT_COUNT = voiceCallSessionAnnotationKey15;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey16 = new VoiceCallSessionAnnotationKey("RECONNECT_MS", 15, "reconnect_ms");
        RECONNECT_MS = voiceCallSessionAnnotationKey16;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey17 = new VoiceCallSessionAnnotationKey("RECONNECT_CAUSES", 16, "reconnect_causes");
        RECONNECT_CAUSES = voiceCallSessionAnnotationKey17;
        VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey18 = new VoiceCallSessionAnnotationKey("ENDED_WHILE_RECONNECTING", 17, "ended_while_reconnecting");
        ENDED_WHILE_RECONNECTING = voiceCallSessionAnnotationKey18;
        VoiceCallSessionAnnotationKey[] voiceCallSessionAnnotationKeyArr = {voiceCallSessionAnnotationKey, voiceCallSessionAnnotationKey2, voiceCallSessionAnnotationKey3, voiceCallSessionAnnotationKey4, voiceCallSessionAnnotationKey5, voiceCallSessionAnnotationKey6, voiceCallSessionAnnotationKey7, voiceCallSessionAnnotationKey8, voiceCallSessionAnnotationKey9, voiceCallSessionAnnotationKey10, voiceCallSessionAnnotationKey11, voiceCallSessionAnnotationKey12, voiceCallSessionAnnotationKey13, voiceCallSessionAnnotationKey14, voiceCallSessionAnnotationKey15, voiceCallSessionAnnotationKey16, voiceCallSessionAnnotationKey17, voiceCallSessionAnnotationKey18};
        $VALUES = voiceCallSessionAnnotationKeyArr;
        $ENTRIES = C3cG.A0w(voiceCallSessionAnnotationKeyArr);
    }

    public static Ey9<VoiceCallSessionAnnotationKey> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallSessionAnnotationKey valueOf(String str) {
        return (VoiceCallSessionAnnotationKey) Enum.valueOf(VoiceCallSessionAnnotationKey.class, str);
    }

    public static VoiceCallSessionAnnotationKey[] values() {
        return (VoiceCallSessionAnnotationKey[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallSessionAnnotationKey(String str, int i, String str2) {
        this.value = str2;
    }
}
