package com.facebook.aura.partners.voice.infra;

import X.BFI;
import com.facebook.aura.graduation.repo.HatchGraduationRepositoryKt;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class VoiceAnnouncementJsonKt {
    public static final Set<String> VOICE_ANNOUNCEMENT_FINAL_REASONS = BFI.A0H(new String[]{HatchGraduationRepositoryKt.SEEN, "voice_started"});
    public static final String VOICE_ANNOUNCEMENT_PATH = "user/voice_announcement.json";

    public static final Set<String> getVOICE_ANNOUNCEMENT_FINAL_REASONS() {
        return VOICE_ANNOUNCEMENT_FINAL_REASONS;
    }
}
