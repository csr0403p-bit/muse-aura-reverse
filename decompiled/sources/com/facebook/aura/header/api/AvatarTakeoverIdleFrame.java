package com.facebook.aura.header.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AvatarTakeoverIdleFrame {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AvatarTakeoverIdleFrame[] $VALUES;
    public static final AvatarTakeoverIdleFrame POSTER;
    public static final AvatarTakeoverIdleFrame VIDEO;

    static {
        AvatarTakeoverIdleFrame avatarTakeoverIdleFrame = new AvatarTakeoverIdleFrame("POSTER", 0);
        POSTER = avatarTakeoverIdleFrame;
        AvatarTakeoverIdleFrame avatarTakeoverIdleFrame2 = new AvatarTakeoverIdleFrame("VIDEO", 1);
        VIDEO = avatarTakeoverIdleFrame2;
        AvatarTakeoverIdleFrame[] avatarTakeoverIdleFrameArr = {avatarTakeoverIdleFrame, avatarTakeoverIdleFrame2};
        $VALUES = avatarTakeoverIdleFrameArr;
        $ENTRIES = C3cG.A0w(avatarTakeoverIdleFrameArr);
    }

    public static Ey9<AvatarTakeoverIdleFrame> getEntries() {
        return $ENTRIES;
    }

    public static AvatarTakeoverIdleFrame valueOf(String str) {
        return (AvatarTakeoverIdleFrame) Enum.valueOf(AvatarTakeoverIdleFrame.class, str);
    }

    public static AvatarTakeoverIdleFrame[] values() {
        return (AvatarTakeoverIdleFrame[]) $VALUES.clone();
    }

    public AvatarTakeoverIdleFrame(String str, int i) {
    }
}
