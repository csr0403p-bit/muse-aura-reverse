package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ResizeAxis {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ResizeAxis[] $VALUES;
    public static final ResizeAxis HALF_TO_AVATAR;
    public static final ResizeAxis HALF_TO_FULL;
    public static final ResizeAxis NONE;

    static {
        ResizeAxis resizeAxis = new ResizeAxis(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = resizeAxis;
        ResizeAxis resizeAxis2 = new ResizeAxis("HALF_TO_FULL", 1);
        HALF_TO_FULL = resizeAxis2;
        ResizeAxis resizeAxis3 = new ResizeAxis("HALF_TO_AVATAR", 2);
        HALF_TO_AVATAR = resizeAxis3;
        ResizeAxis[] resizeAxisArr = {resizeAxis, resizeAxis2, resizeAxis3};
        $VALUES = resizeAxisArr;
        $ENTRIES = C3cG.A0w(resizeAxisArr);
    }

    public static Ey9<ResizeAxis> getEntries() {
        return $ENTRIES;
    }

    public static ResizeAxis valueOf(String str) {
        return (ResizeAxis) Enum.valueOf(ResizeAxis.class, str);
    }

    public static ResizeAxis[] values() {
        return (ResizeAxis[]) $VALUES.clone();
    }

    public ResizeAxis(String str, int i) {
    }
}
