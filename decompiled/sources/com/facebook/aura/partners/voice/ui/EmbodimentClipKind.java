package com.facebook.aura.partners.voice.ui;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EmbodimentClipKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmbodimentClipKind[] $VALUES;
    public static final EmbodimentClipKind GENERATED_IDLE;
    public static final EmbodimentClipKind MAKING_SOMETHING;
    public static final EmbodimentClipKind NONE;
    public static final EmbodimentClipKind WORKING;

    static {
        EmbodimentClipKind embodimentClipKind = new EmbodimentClipKind(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = embodimentClipKind;
        EmbodimentClipKind embodimentClipKind2 = new EmbodimentClipKind("GENERATED_IDLE", 1);
        GENERATED_IDLE = embodimentClipKind2;
        EmbodimentClipKind embodimentClipKind3 = new EmbodimentClipKind("WORKING", 2);
        WORKING = embodimentClipKind3;
        EmbodimentClipKind embodimentClipKind4 = new EmbodimentClipKind("MAKING_SOMETHING", 3);
        MAKING_SOMETHING = embodimentClipKind4;
        EmbodimentClipKind[] embodimentClipKindArr = {embodimentClipKind, embodimentClipKind2, embodimentClipKind3, embodimentClipKind4};
        $VALUES = embodimentClipKindArr;
        $ENTRIES = C3cG.A0w(embodimentClipKindArr);
    }

    public static Ey9<EmbodimentClipKind> getEntries() {
        return $ENTRIES;
    }

    public static EmbodimentClipKind valueOf(String str) {
        return (EmbodimentClipKind) Enum.valueOf(EmbodimentClipKind.class, str);
    }

    public static EmbodimentClipKind[] values() {
        return (EmbodimentClipKind[]) $VALUES.clone();
    }

    public final boolean isActivity() {
        return this == WORKING || this == MAKING_SOMETHING;
    }

    public EmbodimentClipKind(String str, int i) {
    }
}
