package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UndeliveredSpeechSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UndeliveredSpeechSource[] $VALUES;
    public static final UndeliveredSpeechSource LIVE;
    public static final UndeliveredSpeechSource NONE;
    public static final UndeliveredSpeechSource RECORDED;
    public final String value;

    static {
        UndeliveredSpeechSource undeliveredSpeechSource = new UndeliveredSpeechSource(HatchCheckoutClientKt.CONTAINER_MODE_LIVE, 0, VoiceCallActivityRepository.MIC_STATUS_LIVE);
        LIVE = undeliveredSpeechSource;
        UndeliveredSpeechSource undeliveredSpeechSource2 = new UndeliveredSpeechSource("RECORDED", 1, "recorded");
        RECORDED = undeliveredSpeechSource2;
        UndeliveredSpeechSource undeliveredSpeechSource3 = new UndeliveredSpeechSource(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2, "none");
        NONE = undeliveredSpeechSource3;
        UndeliveredSpeechSource[] undeliveredSpeechSourceArr = {undeliveredSpeechSource, undeliveredSpeechSource2, undeliveredSpeechSource3};
        $VALUES = undeliveredSpeechSourceArr;
        $ENTRIES = C3cG.A0w(undeliveredSpeechSourceArr);
    }

    public static Ey9<UndeliveredSpeechSource> getEntries() {
        return $ENTRIES;
    }

    public static UndeliveredSpeechSource valueOf(String str) {
        return (UndeliveredSpeechSource) Enum.valueOf(UndeliveredSpeechSource.class, str);
    }

    public static UndeliveredSpeechSource[] values() {
        return (UndeliveredSpeechSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public UndeliveredSpeechSource(String str, int i, String str2) {
        this.value = str2;
    }
}
