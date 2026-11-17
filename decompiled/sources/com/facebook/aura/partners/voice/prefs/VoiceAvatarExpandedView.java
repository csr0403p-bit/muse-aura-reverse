package com.facebook.aura.partners.voice.prefs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceAvatarExpandedView {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceAvatarExpandedView[] $VALUES;
    public static final VoiceAvatarExpandedView FULL_SCREEN;
    public static final VoiceAvatarExpandedView HALF_SCREEN;

    static {
        VoiceAvatarExpandedView voiceAvatarExpandedView = new VoiceAvatarExpandedView("HALF_SCREEN", 0);
        HALF_SCREEN = voiceAvatarExpandedView;
        VoiceAvatarExpandedView voiceAvatarExpandedView2 = new VoiceAvatarExpandedView("FULL_SCREEN", 1);
        FULL_SCREEN = voiceAvatarExpandedView2;
        VoiceAvatarExpandedView[] voiceAvatarExpandedViewArr = {voiceAvatarExpandedView, voiceAvatarExpandedView2};
        $VALUES = voiceAvatarExpandedViewArr;
        $ENTRIES = C3cG.A0w(voiceAvatarExpandedViewArr);
    }

    public static Ey9<VoiceAvatarExpandedView> getEntries() {
        return $ENTRIES;
    }

    public static VoiceAvatarExpandedView valueOf(String str) {
        return (VoiceAvatarExpandedView) Enum.valueOf(VoiceAvatarExpandedView.class, str);
    }

    public static VoiceAvatarExpandedView[] values() {
        return (VoiceAvatarExpandedView[]) $VALUES.clone();
    }

    public VoiceAvatarExpandedView(String str, int i) {
    }
}
