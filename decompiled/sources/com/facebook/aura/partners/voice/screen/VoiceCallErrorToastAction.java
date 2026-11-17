package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.DBJ;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallErrorToastAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallErrorToastAction[] $VALUES;
    public static final VoiceCallErrorToastAction NONE;
    public static final VoiceCallErrorToastAction RETRY;
    public static final VoiceCallErrorToastAction UPGRADE;
    public final String value;

    static {
        VoiceCallErrorToastAction voiceCallErrorToastAction = new VoiceCallErrorToastAction("RETRY", 0, "retry");
        RETRY = voiceCallErrorToastAction;
        VoiceCallErrorToastAction voiceCallErrorToastAction2 = new VoiceCallErrorToastAction("UPGRADE", 1, DBJ.FIRST_RUN_UPGRADE);
        UPGRADE = voiceCallErrorToastAction2;
        VoiceCallErrorToastAction voiceCallErrorToastAction3 = new VoiceCallErrorToastAction(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2, "none");
        NONE = voiceCallErrorToastAction3;
        VoiceCallErrorToastAction[] voiceCallErrorToastActionArr = {voiceCallErrorToastAction, voiceCallErrorToastAction2, voiceCallErrorToastAction3};
        $VALUES = voiceCallErrorToastActionArr;
        $ENTRIES = C3cG.A0w(voiceCallErrorToastActionArr);
    }

    public static Ey9<VoiceCallErrorToastAction> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallErrorToastAction valueOf(String str) {
        return (VoiceCallErrorToastAction) Enum.valueOf(VoiceCallErrorToastAction.class, str);
    }

    public static VoiceCallErrorToastAction[] values() {
        return (VoiceCallErrorToastAction[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallErrorToastAction(String str, int i, String str2) {
        this.value = str2;
    }
}
