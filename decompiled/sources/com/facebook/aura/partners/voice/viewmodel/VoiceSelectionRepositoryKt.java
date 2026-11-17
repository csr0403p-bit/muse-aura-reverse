package com.facebook.aura.partners.voice.viewmodel;

import X.BFI;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class VoiceSelectionRepositoryKt {
    public static final String TAG = "VoiceSelectionRepository";
    public static final Set<Integer> TRANSIENT_HTTP_STATUS_CODES = BFI.A0H(new Integer[]{408, 429});
    public static final String USER_VOICES_PATH = "user/voices.json";
    public static final String USER_VOICE_PATH = "user/voice.json";
}
