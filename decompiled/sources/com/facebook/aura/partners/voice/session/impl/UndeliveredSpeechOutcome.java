package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UndeliveredSpeechOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UndeliveredSpeechOutcome[] $VALUES;
    public static final UndeliveredSpeechOutcome NOT_CLAIMED;
    public static final UndeliveredSpeechOutcome SENT;
    public static final UndeliveredSpeechOutcome TIMED_OUT;
    public static final UndeliveredSpeechOutcome TRANSCRIBE_FAILED;
    public static final UndeliveredSpeechOutcome UNAVAILABLE;
    public final String value;

    static {
        UndeliveredSpeechOutcome undeliveredSpeechOutcome = new UndeliveredSpeechOutcome(HatchPersistedMessageJson.SEND_STATUS_SENT, 0, "sent");
        SENT = undeliveredSpeechOutcome;
        UndeliveredSpeechOutcome undeliveredSpeechOutcome2 = new UndeliveredSpeechOutcome("NOT_CLAIMED", 1, "not_claimed");
        NOT_CLAIMED = undeliveredSpeechOutcome2;
        UndeliveredSpeechOutcome undeliveredSpeechOutcome3 = new UndeliveredSpeechOutcome("TRANSCRIBE_FAILED", 2, "transcribe_failed");
        TRANSCRIBE_FAILED = undeliveredSpeechOutcome3;
        UndeliveredSpeechOutcome undeliveredSpeechOutcome4 = new UndeliveredSpeechOutcome("TIMED_OUT", 3, "timed_out");
        TIMED_OUT = undeliveredSpeechOutcome4;
        UndeliveredSpeechOutcome undeliveredSpeechOutcome5 = new UndeliveredSpeechOutcome("UNAVAILABLE", 4, "unavailable");
        UNAVAILABLE = undeliveredSpeechOutcome5;
        UndeliveredSpeechOutcome[] undeliveredSpeechOutcomeArr = {undeliveredSpeechOutcome, undeliveredSpeechOutcome2, undeliveredSpeechOutcome3, undeliveredSpeechOutcome4, undeliveredSpeechOutcome5};
        $VALUES = undeliveredSpeechOutcomeArr;
        $ENTRIES = C3cG.A0w(undeliveredSpeechOutcomeArr);
    }

    public static Ey9<UndeliveredSpeechOutcome> getEntries() {
        return $ENTRIES;
    }

    public static UndeliveredSpeechOutcome valueOf(String str) {
        return (UndeliveredSpeechOutcome) Enum.valueOf(UndeliveredSpeechOutcome.class, str);
    }

    public static UndeliveredSpeechOutcome[] values() {
        return (UndeliveredSpeechOutcome[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public UndeliveredSpeechOutcome(String str, int i, String str2) {
        this.value = str2;
    }
}
