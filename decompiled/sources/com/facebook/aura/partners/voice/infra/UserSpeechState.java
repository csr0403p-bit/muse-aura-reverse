package com.facebook.aura.partners.voice.infra;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UserSpeechState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UserSpeechState[] $VALUES;
    public static final UserSpeechState CANCELLED;
    public static final UserSpeechState ENDED;
    public static final UserSpeechState RESUMED;
    public final String wireValue;

    static {
        UserSpeechState userSpeechState = new UserSpeechState("ENDED", 0, "ended");
        ENDED = userSpeechState;
        UserSpeechState userSpeechState2 = new UserSpeechState("RESUMED", 1, "resumed");
        RESUMED = userSpeechState2;
        UserSpeechState userSpeechState3 = new UserSpeechState("CANCELLED", 2, "cancelled");
        CANCELLED = userSpeechState3;
        UserSpeechState[] userSpeechStateArr = {userSpeechState, userSpeechState2, userSpeechState3};
        $VALUES = userSpeechStateArr;
        $ENTRIES = C3cG.A0w(userSpeechStateArr);
    }

    public static Ey9<UserSpeechState> getEntries() {
        return $ENTRIES;
    }

    public static UserSpeechState valueOf(String str) {
        return (UserSpeechState) Enum.valueOf(UserSpeechState.class, str);
    }

    public static UserSpeechState[] values() {
        return (UserSpeechState[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public UserSpeechState(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
