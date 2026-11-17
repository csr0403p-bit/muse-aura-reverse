package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceLiveAvatarUpdateStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceLiveAvatarUpdateStatus[] $VALUES;
    public static final VoiceLiveAvatarUpdateStatus COULD_NOT_UPDATE;
    public static final VoiceLiveAvatarUpdateStatus NOT_AVAILABLE;
    public static final VoiceLiveAvatarUpdateStatus UPDATING;

    static {
        VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus = new VoiceLiveAvatarUpdateStatus("UPDATING", 0);
        UPDATING = voiceLiveAvatarUpdateStatus;
        VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus2 = new VoiceLiveAvatarUpdateStatus("COULD_NOT_UPDATE", 1);
        COULD_NOT_UPDATE = voiceLiveAvatarUpdateStatus2;
        VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus3 = new VoiceLiveAvatarUpdateStatus("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = voiceLiveAvatarUpdateStatus3;
        VoiceLiveAvatarUpdateStatus[] voiceLiveAvatarUpdateStatusArr = {voiceLiveAvatarUpdateStatus, voiceLiveAvatarUpdateStatus2, voiceLiveAvatarUpdateStatus3};
        $VALUES = voiceLiveAvatarUpdateStatusArr;
        $ENTRIES = C3cG.A0w(voiceLiveAvatarUpdateStatusArr);
    }

    public static Ey9<VoiceLiveAvatarUpdateStatus> getEntries() {
        return $ENTRIES;
    }

    public static VoiceLiveAvatarUpdateStatus valueOf(String str) {
        return (VoiceLiveAvatarUpdateStatus) Enum.valueOf(VoiceLiveAvatarUpdateStatus.class, str);
    }

    public static VoiceLiveAvatarUpdateStatus[] values() {
        return (VoiceLiveAvatarUpdateStatus[]) $VALUES.clone();
    }

    public VoiceLiveAvatarUpdateStatus(String str, int i) {
    }
}
