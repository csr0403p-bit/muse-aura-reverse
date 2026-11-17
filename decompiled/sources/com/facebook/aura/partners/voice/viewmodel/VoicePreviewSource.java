package com.facebook.aura.partners.voice.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoicePreviewSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoicePreviewSource[] $VALUES;
    public static final VoicePreviewSource CACHE;
    public static final VoicePreviewSource CALL;
    public static final VoicePreviewSource DESIGNED;
    public static final VoicePreviewSource STREAM;
    public static final VoicePreviewSource VM_CACHE;
    public final String value;

    static {
        VoicePreviewSource voicePreviewSource = new VoicePreviewSource("CACHE", 0, "cache");
        CACHE = voicePreviewSource;
        VoicePreviewSource voicePreviewSource2 = new VoicePreviewSource("STREAM", 1, "stream");
        STREAM = voicePreviewSource2;
        VoicePreviewSource voicePreviewSource3 = new VoicePreviewSource("DESIGNED", 2, "designed");
        DESIGNED = voicePreviewSource3;
        VoicePreviewSource voicePreviewSource4 = new VoicePreviewSource("CALL", 3, "call");
        CALL = voicePreviewSource4;
        VoicePreviewSource voicePreviewSource5 = new VoicePreviewSource("VM_CACHE", 4, "vm_cache");
        VM_CACHE = voicePreviewSource5;
        VoicePreviewSource[] voicePreviewSourceArr = {voicePreviewSource, voicePreviewSource2, voicePreviewSource3, voicePreviewSource4, voicePreviewSource5};
        $VALUES = voicePreviewSourceArr;
        $ENTRIES = C3cG.A0w(voicePreviewSourceArr);
    }

    public static Ey9<VoicePreviewSource> getEntries() {
        return $ENTRIES;
    }

    public static VoicePreviewSource valueOf(String str) {
        return (VoicePreviewSource) Enum.valueOf(VoicePreviewSource.class, str);
    }

    public static VoicePreviewSource[] values() {
        return (VoicePreviewSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoicePreviewSource(String str, int i, String str2) {
        this.value = str2;
    }
}
