package com.facebook.aura.onboarding;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GreetingVideoState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GreetingVideoState[] $VALUES;
    public static final GreetingVideoState FAILED;
    public static final GreetingVideoState LOADING;
    public static final GreetingVideoState PLAYING;

    static {
        GreetingVideoState greetingVideoState = new GreetingVideoState("LOADING", 0);
        LOADING = greetingVideoState;
        GreetingVideoState greetingVideoState2 = new GreetingVideoState("PLAYING", 1);
        PLAYING = greetingVideoState2;
        GreetingVideoState greetingVideoState3 = new GreetingVideoState(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = greetingVideoState3;
        GreetingVideoState[] greetingVideoStateArr = {greetingVideoState, greetingVideoState2, greetingVideoState3};
        $VALUES = greetingVideoStateArr;
        $ENTRIES = C3cG.A0w(greetingVideoStateArr);
    }

    public static Ey9<GreetingVideoState> getEntries() {
        return $ENTRIES;
    }

    public static GreetingVideoState valueOf(String str) {
        return (GreetingVideoState) Enum.valueOf(GreetingVideoState.class, str);
    }

    public static GreetingVideoState[] values() {
        return (GreetingVideoState[]) $VALUES.clone();
    }

    public GreetingVideoState(String str, int i) {
    }
}
