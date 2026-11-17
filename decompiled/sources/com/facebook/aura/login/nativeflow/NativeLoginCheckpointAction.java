package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginCheckpointAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginCheckpointAction[] $VALUES;
    public static final NativeLoginCheckpointAction CONTINUE;
    public static final NativeLoginCheckpointAction SIGN_IN_AGAIN;

    static {
        NativeLoginCheckpointAction nativeLoginCheckpointAction = new NativeLoginCheckpointAction("CONTINUE", 0);
        CONTINUE = nativeLoginCheckpointAction;
        NativeLoginCheckpointAction nativeLoginCheckpointAction2 = new NativeLoginCheckpointAction("SIGN_IN_AGAIN", 1);
        SIGN_IN_AGAIN = nativeLoginCheckpointAction2;
        NativeLoginCheckpointAction[] nativeLoginCheckpointActionArr = {nativeLoginCheckpointAction, nativeLoginCheckpointAction2};
        $VALUES = nativeLoginCheckpointActionArr;
        $ENTRIES = C3cG.A0w(nativeLoginCheckpointActionArr);
    }

    public static Ey9<NativeLoginCheckpointAction> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginCheckpointAction valueOf(String str) {
        return (NativeLoginCheckpointAction) Enum.valueOf(NativeLoginCheckpointAction.class, str);
    }

    public static NativeLoginCheckpointAction[] values() {
        return (NativeLoginCheckpointAction[]) $VALUES.clone();
    }

    public NativeLoginCheckpointAction(String str, int i) {
    }
}
