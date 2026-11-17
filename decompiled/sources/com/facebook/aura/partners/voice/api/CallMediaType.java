package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CallMediaType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CallMediaType[] $VALUES;
    public static final CallMediaType AUDIO;
    public static final CallMediaType VIDEO;
    public final String wireValue;

    static {
        CallMediaType callMediaType = new CallMediaType("AUDIO", 0, "audio");
        AUDIO = callMediaType;
        CallMediaType callMediaType2 = new CallMediaType("VIDEO", 1, "video");
        VIDEO = callMediaType2;
        CallMediaType[] callMediaTypeArr = {callMediaType, callMediaType2};
        $VALUES = callMediaTypeArr;
        $ENTRIES = C3cG.A0w(callMediaTypeArr);
    }

    public static Ey9<CallMediaType> getEntries() {
        return $ENTRIES;
    }

    public static CallMediaType valueOf(String str) {
        return (CallMediaType) Enum.valueOf(CallMediaType.class, str);
    }

    public static CallMediaType[] values() {
        return (CallMediaType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public CallMediaType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
