package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.search.SearchResultsListStateKt;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEmbodimentPlacement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentPlacement[] $VALUES;
    public static final VoiceEmbodimentPlacement AVATAR;
    public static final VoiceEmbodimentPlacement BACKGROUND;
    public static final VoiceEmbodimentPlacement FULL_SCREEN;
    public static final VoiceEmbodimentPlacement HALF_SCREEN;
    public static final VoiceEmbodimentPlacement HIDDEN;
    public static final VoiceEmbodimentPlacement SYSTEM_PIP;
    public static final VoiceEmbodimentPlacement UNAVAILABLE;
    public final String value;

    static {
        VoiceEmbodimentPlacement voiceEmbodimentPlacement = new VoiceEmbodimentPlacement("AVATAR", 0, HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID);
        AVATAR = voiceEmbodimentPlacement;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement2 = new VoiceEmbodimentPlacement("HALF_SCREEN", 1, "half_screen");
        HALF_SCREEN = voiceEmbodimentPlacement2;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement3 = new VoiceEmbodimentPlacement("FULL_SCREEN", 2, SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN);
        FULL_SCREEN = voiceEmbodimentPlacement3;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement4 = new VoiceEmbodimentPlacement("HIDDEN", 3, "hidden");
        HIDDEN = voiceEmbodimentPlacement4;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement5 = new VoiceEmbodimentPlacement("SYSTEM_PIP", 4, "system_pip");
        SYSTEM_PIP = voiceEmbodimentPlacement5;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement6 = new VoiceEmbodimentPlacement("BACKGROUND", 5, "background");
        BACKGROUND = voiceEmbodimentPlacement6;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement7 = new VoiceEmbodimentPlacement("UNAVAILABLE", 6, "unavailable");
        UNAVAILABLE = voiceEmbodimentPlacement7;
        VoiceEmbodimentPlacement[] voiceEmbodimentPlacementArr = {voiceEmbodimentPlacement, voiceEmbodimentPlacement2, voiceEmbodimentPlacement3, voiceEmbodimentPlacement4, voiceEmbodimentPlacement5, voiceEmbodimentPlacement6, voiceEmbodimentPlacement7};
        $VALUES = voiceEmbodimentPlacementArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentPlacementArr);
    }

    public static Ey9<VoiceEmbodimentPlacement> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentPlacement valueOf(String str) {
        return (VoiceEmbodimentPlacement) Enum.valueOf(VoiceEmbodimentPlacement.class, str);
    }

    public static VoiceEmbodimentPlacement[] values() {
        return (VoiceEmbodimentPlacement[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceEmbodimentPlacement(String str, int i, String str2) {
        this.value = str2;
    }
}
