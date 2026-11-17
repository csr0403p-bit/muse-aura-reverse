package com.facebook.aura.partners.voice.intf;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceCallUiState extends C06G {
    public static final int $stable = 0;
    public final String avatarPath;
    public final VoiceCallActivity botActivity;
    public final String botName;
    public final long callAttemptGeneration;
    public final AHD<CaptionEntry> captionEntries;
    public final String endReason;
    public final String endSubReason;
    public final boolean isBotLatestSpeaker;
    public final boolean isCaptionsEnabled;
    public final boolean isMuted;
    public final boolean isReconnecting;
    public final boolean isSpeakerOn;
    public final CaptionEntry liveAssistantCaption;
    public final long liveAssistantCaptionRevision;
    public final VoiceCallPhase phase;
    public final int userTurnCount;
    public final AHD<CaptionEntry> visibleCaptionEntries;

    public final VoiceCallUiState copy(VoiceCallPhase voiceCallPhase, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, AHD<CaptionEntry> ahd, AHD<CaptionEntry> ahd2, CaptionEntry captionEntry, long j2, int i, boolean z5, VoiceCallActivity voiceCallActivity) {
        AnonymousClass002.A1C(voiceCallPhase, 0, str3);
        AnonymousClass002.A1G(ahd, 10, ahd2);
        C7384Etj.A0Y(voiceCallActivity, 16);
        return new VoiceCallUiState(voiceCallPhase, j, str, str2, str3, str4, z, z2, z3, z4, ahd, ahd2, captionEntry, j2, i, z5, voiceCallActivity);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCallUiState) {
                VoiceCallUiState voiceCallUiState = (VoiceCallUiState) obj;
                if (this.phase != voiceCallUiState.phase || this.callAttemptGeneration != voiceCallUiState.callAttemptGeneration || !C7384Etj.areEqual(this.endReason, voiceCallUiState.endReason) || !C7384Etj.areEqual(this.endSubReason, voiceCallUiState.endSubReason) || !C7384Etj.areEqual(this.botName, voiceCallUiState.botName) || !C7384Etj.areEqual(this.avatarPath, voiceCallUiState.avatarPath) || this.isMuted != voiceCallUiState.isMuted || this.isReconnecting != voiceCallUiState.isReconnecting || this.isSpeakerOn != voiceCallUiState.isSpeakerOn || this.isCaptionsEnabled != voiceCallUiState.isCaptionsEnabled || !C7384Etj.areEqual(this.captionEntries, voiceCallUiState.captionEntries) || !C7384Etj.areEqual(this.visibleCaptionEntries, voiceCallUiState.visibleCaptionEntries) || !C7384Etj.areEqual(this.liveAssistantCaption, voiceCallUiState.liveAssistantCaption) || this.liveAssistantCaptionRevision != voiceCallUiState.liveAssistantCaptionRevision || this.userTurnCount != voiceCallUiState.userTurnCount || this.isBotLatestSpeaker != voiceCallUiState.isBotLatestSpeaker || this.botActivity != voiceCallUiState.botActivity) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoiceCallUiState(VoiceCallPhase voiceCallPhase, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, AHD ahd, AHD ahd2, CaptionEntry captionEntry, long j2, int i, boolean z5, VoiceCallActivity voiceCallActivity, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? VoiceCallPhase.ENDED : voiceCallPhase, C3cH.A03(i2 & 2, j), C3cG.A0e(str, i2 & 4), C3cG.A0e(str2, i2 & 8), (i2 & 16) != 0 ? "" : str3, C3cG.A0e(str4, i2 & 32), C3cH.A1M(i2, z), C3cH.A1N(i2, z2), (i2 & 256) != 0 ? true : z3, C3cG.A1K(i2 & 512, z4), (i2 & 1024) != 0 ? AHI.A01 : ahd, (i2 & 2048) != 0 ? AHI.A01 : ahd2, (i2 & 4096) != 0 ? null : captionEntry, C3cH.A03(i2 & 8192, j2), (i2 & 16384) != 0 ? 0 : i, C3cH.A1L(i2, 32768, z5), (i2 & 65536) != 0 ? VoiceCallActivity.IDLE : voiceCallActivity);
    }

    public final VoiceCallPhase component1() {
        return this.phase;
    }

    public final boolean component10() {
        return this.isCaptionsEnabled;
    }

    public final AHD<CaptionEntry> component11() {
        return this.captionEntries;
    }

    public final AHD<CaptionEntry> component12() {
        return this.visibleCaptionEntries;
    }

    public final CaptionEntry component13() {
        return this.liveAssistantCaption;
    }

    public final long component14() {
        return this.liveAssistantCaptionRevision;
    }

    public final int component15() {
        return this.userTurnCount;
    }

    public final boolean component16() {
        return this.isBotLatestSpeaker;
    }

    public final VoiceCallActivity component17() {
        return this.botActivity;
    }

    public final long component2() {
        return this.callAttemptGeneration;
    }

    public final String component3() {
        return this.endReason;
    }

    public final String component4() {
        return this.endSubReason;
    }

    public final String component5() {
        return this.botName;
    }

    public final String component6() {
        return this.avatarPath;
    }

    public final boolean component7() {
        return this.isMuted;
    }

    public final boolean component8() {
        return this.isReconnecting;
    }

    public final boolean component9() {
        return this.isSpeakerOn;
    }

    public final String getAvatarPath() {
        return this.avatarPath;
    }

    public final VoiceCallActivity getBotActivity() {
        return this.botActivity;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final long getCallAttemptGeneration() {
        return this.callAttemptGeneration;
    }

    public final AHD<CaptionEntry> getCaptionEntries() {
        return this.captionEntries;
    }

    public final String getEndReason() {
        return this.endReason;
    }

    public final String getEndSubReason() {
        return this.endSubReason;
    }

    public final CaptionEntry getLiveAssistantCaption() {
        return this.liveAssistantCaption;
    }

    public final long getLiveAssistantCaptionRevision() {
        return this.liveAssistantCaptionRevision;
    }

    public final VoiceCallPhase getPhase() {
        return this.phase;
    }

    public final int getUserTurnCount() {
        return this.userTurnCount;
    }

    public final AHD<CaptionEntry> getVisibleCaptionEntries() {
        return this.visibleCaptionEntries;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.botActivity, C0KA.A01((AnonymousClass006.A06(this.liveAssistantCaptionRevision, (AnonymousClass005.A0F(this.visibleCaptionEntries, AnonymousClass005.A0F(this.captionEntries, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.botName, (((AnonymousClass006.A06(this.callAttemptGeneration, AnonymousClass005.A0E(this.phase)) + AnonymousClass006.A0G(this.endReason)) * 31) + AnonymousClass006.A0G(this.endSubReason)) * 31) + AnonymousClass006.A0G(this.avatarPath)) * 31, this.isMuted), this.isReconnecting), this.isSpeakerOn), this.isCaptionsEnabled))) + C3cH.A02(this.liveAssistantCaption)) * 31) + this.userTurnCount) * 31, this.isBotLatestSpeaker));
    }

    public final boolean isBotLatestSpeaker() {
        return this.isBotLatestSpeaker;
    }

    public final boolean isCaptionsEnabled() {
        return this.isCaptionsEnabled;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isReconnecting() {
        return this.isReconnecting;
    }

    public final boolean isSpeakerOn() {
        return this.isSpeakerOn;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ VoiceCallUiState copy$default(VoiceCallUiState voiceCallUiState, VoiceCallPhase voiceCallPhase, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, AHD ahd, AHD ahd2, CaptionEntry captionEntry, long j2, int i, boolean z5, VoiceCallActivity voiceCallActivity, int i2, Object obj) {
        long j3 = j;
        VoiceCallPhase voiceCallPhase2 = voiceCallPhase;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        CaptionEntry captionEntry2 = captionEntry;
        long j4 = j2;
        int i3 = i;
        boolean z10 = z5;
        VoiceCallActivity voiceCallActivity2 = voiceCallActivity;
        if ((i2 & 1) != 0) {
            voiceCallPhase2 = voiceCallUiState.phase;
        }
        if ((i2 & 2) != 0) {
            j3 = voiceCallUiState.callAttemptGeneration;
        }
        if ((i2 & 4) != 0) {
            str = voiceCallUiState.endReason;
        }
        if ((i2 & 8) != 0) {
            str5 = voiceCallUiState.endSubReason;
        }
        if ((i2 & 16) != 0) {
            str6 = voiceCallUiState.botName;
        }
        if ((i2 & 32) != 0) {
            str7 = voiceCallUiState.avatarPath;
        }
        if ((i2 & 64) != 0) {
            z6 = voiceCallUiState.isMuted;
        }
        if ((i2 & 128) != 0) {
            z7 = voiceCallUiState.isReconnecting;
        }
        if ((i2 & 256) != 0) {
            z8 = voiceCallUiState.isSpeakerOn;
        }
        if ((i2 & 512) != 0) {
            z9 = voiceCallUiState.isCaptionsEnabled;
        }
        if ((i2 & 1024) != 0) {
            ahd3 = voiceCallUiState.captionEntries;
        }
        if ((i2 & 2048) != 0) {
            ahd4 = voiceCallUiState.visibleCaptionEntries;
        }
        if ((i2 & 4096) != 0) {
            captionEntry2 = voiceCallUiState.liveAssistantCaption;
        }
        if ((i2 & 8192) != 0) {
            j4 = voiceCallUiState.liveAssistantCaptionRevision;
        }
        if ((i2 & 16384) != 0) {
            i3 = voiceCallUiState.userTurnCount;
        }
        if ((i2 & 32768) != 0) {
            z10 = voiceCallUiState.isBotLatestSpeaker;
        }
        if ((i2 & 65536) != 0) {
            voiceCallActivity2 = voiceCallUiState.botActivity;
        }
        boolean z11 = z7;
        boolean z12 = z8;
        boolean z13 = z9;
        return voiceCallUiState.copy(voiceCallPhase2, j3, str, str5, str6, str7, z6, z11, z12, z13, ahd3, ahd4, captionEntry2, j4, i3, z10, voiceCallActivity2);
    }

    public VoiceCallUiState(VoiceCallPhase voiceCallPhase, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, AHD<CaptionEntry> ahd, AHD<CaptionEntry> ahd2, CaptionEntry captionEntry, long j2, int i, boolean z5, VoiceCallActivity voiceCallActivity) {
        AnonymousClass002.A1C(voiceCallPhase, 0, str3);
        AnonymousClass002.A1G(ahd, 10, ahd2);
        C7384Etj.A0Y(voiceCallActivity, 16);
        this.phase = voiceCallPhase;
        this.callAttemptGeneration = j;
        this.endReason = str;
        this.endSubReason = str2;
        this.botName = str3;
        this.avatarPath = str4;
        this.isMuted = z;
        this.isReconnecting = z2;
        this.isSpeakerOn = z3;
        this.isCaptionsEnabled = z4;
        this.captionEntries = ahd;
        this.visibleCaptionEntries = ahd2;
        this.liveAssistantCaption = captionEntry;
        this.liveAssistantCaptionRevision = j2;
        this.userTurnCount = i;
        this.isBotLatestSpeaker = z5;
        this.botActivity = voiceCallActivity;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCallUiState() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        this(null, j, objArr, objArr2, objArr3, objArr4, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr5, objArr6, objArr7, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr8, 131071, objArr9);
    }
}
