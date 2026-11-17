package com.facebook.aura.vds.compose.toast;

import X.Ey9;
import X.F3w;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class InteractionType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InteractionType[] $VALUES;
    public static final InteractionType CLICKABLE;
    public static final InteractionType NONE;

    static {
        InteractionType interactionType = new InteractionType(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = interactionType;
        InteractionType interactionType2 = new InteractionType("CLICKABLE", 1);
        CLICKABLE = interactionType2;
        InteractionType[] interactionTypeArr = {interactionType, interactionType2};
        $VALUES = interactionTypeArr;
        $ENTRIES = new F3w(interactionTypeArr);
    }

    public static Ey9<InteractionType> getEntries() {
        return $ENTRIES;
    }

    public static InteractionType valueOf(String str) {
        return (InteractionType) Enum.valueOf(InteractionType.class, str);
    }

    public static InteractionType[] values() {
        return (InteractionType[]) $VALUES.clone();
    }

    public InteractionType(String str, int i) {
    }
}
