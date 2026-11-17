package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallReconnectEventField {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallReconnectEventField[] $VALUES;
    public static final VoiceCallReconnectEventField CALL_ATTEMPT_ID;
    public static final VoiceCallReconnectEventField CALL_ID;
    public static final VoiceCallReconnectEventField CAUSE;
    public static final VoiceCallReconnectEventField CAUSES;
    public static final VoiceCallReconnectEventField DURATION_MS;
    public static final VoiceCallReconnectEventField EPISODE;
    public static final VoiceCallReconnectEventField NETWORK_TYPE_END;
    public static final VoiceCallReconnectEventField NETWORK_TYPE_START;
    public static final VoiceCallReconnectEventField OUTCOME;
    public static final VoiceCallReconnectEventField REJOIN_OUTCOME;
    public static final VoiceCallReconnectEventField SINCE_CONNECT_MS;
    public final String value;

    static {
        VoiceCallReconnectEventField voiceCallReconnectEventField = new VoiceCallReconnectEventField("CALL_ID", 0, VoiceCallStateHolderKt.CALL_ID_PARAM);
        CALL_ID = voiceCallReconnectEventField;
        VoiceCallReconnectEventField voiceCallReconnectEventField2 = new VoiceCallReconnectEventField("CALL_ATTEMPT_ID", 1, "call_attempt_id");
        CALL_ATTEMPT_ID = voiceCallReconnectEventField2;
        VoiceCallReconnectEventField voiceCallReconnectEventField3 = new VoiceCallReconnectEventField("EPISODE", 2, "episode");
        EPISODE = voiceCallReconnectEventField3;
        VoiceCallReconnectEventField voiceCallReconnectEventField4 = new VoiceCallReconnectEventField("CAUSE", 3, "cause");
        CAUSE = voiceCallReconnectEventField4;
        VoiceCallReconnectEventField voiceCallReconnectEventField5 = new VoiceCallReconnectEventField("CAUSES", 4, "causes");
        CAUSES = voiceCallReconnectEventField5;
        VoiceCallReconnectEventField voiceCallReconnectEventField6 = new VoiceCallReconnectEventField("OUTCOME", 5, "outcome");
        OUTCOME = voiceCallReconnectEventField6;
        VoiceCallReconnectEventField voiceCallReconnectEventField7 = new VoiceCallReconnectEventField("DURATION_MS", 6, "duration_ms");
        DURATION_MS = voiceCallReconnectEventField7;
        VoiceCallReconnectEventField voiceCallReconnectEventField8 = new VoiceCallReconnectEventField("SINCE_CONNECT_MS", 7, "since_connect_ms");
        SINCE_CONNECT_MS = voiceCallReconnectEventField8;
        VoiceCallReconnectEventField voiceCallReconnectEventField9 = new VoiceCallReconnectEventField("REJOIN_OUTCOME", 8, "rejoin_outcome");
        REJOIN_OUTCOME = voiceCallReconnectEventField9;
        VoiceCallReconnectEventField voiceCallReconnectEventField10 = new VoiceCallReconnectEventField("NETWORK_TYPE_START", 9, "network_type_start");
        NETWORK_TYPE_START = voiceCallReconnectEventField10;
        VoiceCallReconnectEventField voiceCallReconnectEventField11 = new VoiceCallReconnectEventField("NETWORK_TYPE_END", 10, "network_type_end");
        NETWORK_TYPE_END = voiceCallReconnectEventField11;
        VoiceCallReconnectEventField[] voiceCallReconnectEventFieldArr = {voiceCallReconnectEventField, voiceCallReconnectEventField2, voiceCallReconnectEventField3, voiceCallReconnectEventField4, voiceCallReconnectEventField5, voiceCallReconnectEventField6, voiceCallReconnectEventField7, voiceCallReconnectEventField8, voiceCallReconnectEventField9, voiceCallReconnectEventField10, voiceCallReconnectEventField11};
        $VALUES = voiceCallReconnectEventFieldArr;
        $ENTRIES = C3cG.A0w(voiceCallReconnectEventFieldArr);
    }

    public static Ey9<VoiceCallReconnectEventField> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallReconnectEventField valueOf(String str) {
        return (VoiceCallReconnectEventField) Enum.valueOf(VoiceCallReconnectEventField.class, str);
    }

    public static VoiceCallReconnectEventField[] values() {
        return (VoiceCallReconnectEventField[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallReconnectEventField(String str, int i, String str2) {
        this.value = str2;
    }
}
