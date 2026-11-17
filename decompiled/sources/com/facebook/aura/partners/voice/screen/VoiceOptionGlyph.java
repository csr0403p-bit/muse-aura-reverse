package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoiceOptionGlyph {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceOptionGlyph[] $VALUES;
    public static final VoiceOptionGlyph CHECK;
    public static final VoiceOptionGlyph PAUSE;
    public static final VoiceOptionGlyph PLAY;
    public static final VoiceOptionGlyph SPINNER;

    static {
        VoiceOptionGlyph voiceOptionGlyph = new VoiceOptionGlyph("SPINNER", 0);
        SPINNER = voiceOptionGlyph;
        VoiceOptionGlyph voiceOptionGlyph2 = new VoiceOptionGlyph("PLAY", 1);
        PLAY = voiceOptionGlyph2;
        VoiceOptionGlyph voiceOptionGlyph3 = new VoiceOptionGlyph("PAUSE", 2);
        PAUSE = voiceOptionGlyph3;
        VoiceOptionGlyph voiceOptionGlyph4 = new VoiceOptionGlyph("CHECK", 3);
        CHECK = voiceOptionGlyph4;
        VoiceOptionGlyph[] voiceOptionGlyphArr = {voiceOptionGlyph, voiceOptionGlyph2, voiceOptionGlyph3, voiceOptionGlyph4};
        $VALUES = voiceOptionGlyphArr;
        $ENTRIES = C3cG.A0w(voiceOptionGlyphArr);
    }

    public static Ey9<VoiceOptionGlyph> getEntries() {
        return $ENTRIES;
    }

    public static VoiceOptionGlyph valueOf(String str) {
        return (VoiceOptionGlyph) Enum.valueOf(VoiceOptionGlyph.class, str);
    }

    public static VoiceOptionGlyph[] values() {
        return (VoiceOptionGlyph[]) $VALUES.clone();
    }

    public VoiceOptionGlyph(String str, int i) {
    }
}
