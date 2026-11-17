package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEmbodimentStateEventField {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentStateEventField[] $VALUES;
    public static final VoiceEmbodimentStateEventField CALL_ID;
    public static final VoiceEmbodimentStateEventField FROM_MEDIA;
    public static final VoiceEmbodimentStateEventField FROM_PLACEMENT;
    public static final VoiceEmbodimentStateEventField PREV_STATE_MS;
    public static final VoiceEmbodimentStateEventField REASON;
    public static final VoiceEmbodimentStateEventField SEQ;
    public static final VoiceEmbodimentStateEventField SINCE_CONNECT_MS;
    public static final VoiceEmbodimentStateEventField TO_MEDIA;
    public static final VoiceEmbodimentStateEventField TO_PLACEMENT;
    public final String value;

    static {
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField = new VoiceEmbodimentStateEventField("CALL_ID", 0, VoiceCallStateHolderKt.CALL_ID_PARAM);
        CALL_ID = voiceEmbodimentStateEventField;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField2 = new VoiceEmbodimentStateEventField("SEQ", 1, AgeCheckFunnelLogging.KEY_SEQ);
        SEQ = voiceEmbodimentStateEventField2;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField3 = new VoiceEmbodimentStateEventField("SINCE_CONNECT_MS", 2, "since_connect_ms");
        SINCE_CONNECT_MS = voiceEmbodimentStateEventField3;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField4 = new VoiceEmbodimentStateEventField("FROM_PLACEMENT", 3, "from_placement");
        FROM_PLACEMENT = voiceEmbodimentStateEventField4;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField5 = new VoiceEmbodimentStateEventField("TO_PLACEMENT", 4, "to_placement");
        TO_PLACEMENT = voiceEmbodimentStateEventField5;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField6 = new VoiceEmbodimentStateEventField("FROM_MEDIA", 5, "from_media");
        FROM_MEDIA = voiceEmbodimentStateEventField6;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField7 = new VoiceEmbodimentStateEventField("TO_MEDIA", 6, "to_media");
        TO_MEDIA = voiceEmbodimentStateEventField7;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField8 = new VoiceEmbodimentStateEventField("REASON", 7, "reason");
        REASON = voiceEmbodimentStateEventField8;
        VoiceEmbodimentStateEventField voiceEmbodimentStateEventField9 = new VoiceEmbodimentStateEventField("PREV_STATE_MS", 8, "prev_state_ms");
        PREV_STATE_MS = voiceEmbodimentStateEventField9;
        VoiceEmbodimentStateEventField[] voiceEmbodimentStateEventFieldArr = {voiceEmbodimentStateEventField, voiceEmbodimentStateEventField2, voiceEmbodimentStateEventField3, voiceEmbodimentStateEventField4, voiceEmbodimentStateEventField5, voiceEmbodimentStateEventField6, voiceEmbodimentStateEventField7, voiceEmbodimentStateEventField8, voiceEmbodimentStateEventField9};
        $VALUES = voiceEmbodimentStateEventFieldArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentStateEventFieldArr);
    }

    public static Ey9<VoiceEmbodimentStateEventField> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentStateEventField valueOf(String str) {
        return (VoiceEmbodimentStateEventField) Enum.valueOf(VoiceEmbodimentStateEventField.class, str);
    }

    public static VoiceEmbodimentStateEventField[] values() {
        return (VoiceEmbodimentStateEventField[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceEmbodimentStateEventField(String str, int i, String str2) {
        this.value = str2;
    }
}
