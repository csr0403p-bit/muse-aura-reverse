package com.facebook.aura.partners.voice.intf;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceLiveAvatarUpdateStatusKt {
    public static final long LIVE_AVATAR_CLOSING_STATUS_MS = 3000;
    public static final String LIVE_AVATAR_WINNER_NOTICE = "notice";
    public static final String TAG = "VoiceLiveAvatarStatus";
    public static final Set<String> VOICE_SWITCH_ACTIVITY_DETAILS = BFI.A0H(new String[]{"changing_voices", "finding_voices"});

    public static final boolean embodimentCompatibleForCall(Boolean bool, boolean z, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 2);
        return z || (AnonymousClass002.A1b(bool, true) && AnonymousClass003.A1Y(function0));
    }

    public static final String liveAvatarStatusKind(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus) {
        int iOrdinal;
        if (voiceLiveAvatarUpdateStatus == null || (iOrdinal = voiceLiveAvatarUpdateStatus.ordinal()) == -1) {
            return null;
        }
        if (iOrdinal == 0) {
            return "updating";
        }
        if (iOrdinal == 1) {
            return "closing_failed";
        }
        if (iOrdinal == 2) {
            return "closing_not_animatable";
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoiceLiveAvatarUpdateStatus.values().length];
            try {
                AnonymousClass005.A0v(VoiceLiveAvatarUpdateStatus.UPDATING, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceLiveAvatarUpdateStatus.COULD_NOT_UPDATE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceLiveAvatarUpdateStatus.NOT_AVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoiceCallStatusLine.values().length];
            try {
                AnonymousClass005.A0v(VoiceCallStatusLine.RECONNECTING, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean isVoiceSwitchActivityDetail(String str) {
        return AbstractC0878AGe.A0k(VOICE_SWITCH_ACTIVITY_DETAILS, str);
    }

    public static final VoiceCallStatusLine voiceCallStatusLine(boolean z, VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, boolean z2) {
        if (z) {
            return VoiceCallStatusLine.RECONNECTING;
        }
        if (voiceLiveAvatarUpdateStatus == null) {
            return null;
        }
        if (voiceLiveAvatarUpdateStatus != VoiceLiveAvatarUpdateStatus.UPDATING) {
            return voiceLiveAvatarUpdateStatus == VoiceLiveAvatarUpdateStatus.COULD_NOT_UPDATE ? VoiceCallStatusLine.LIVE_AVATAR_COULD_NOT_UPDATE : VoiceCallStatusLine.LIVE_AVATAR_NOT_AVAILABLE;
        }
        VoiceCallStatusLine voiceCallStatusLine = VoiceCallStatusLine.UPDATING_LIVE_AVATAR;
        if (z2) {
            return null;
        }
        return voiceCallStatusLine;
    }

    public static final String liveAvatarStatusWinner(boolean z, VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, boolean z2) {
        int iOrdinal;
        VoiceCallStatusLine voiceCallStatusLine = voiceCallStatusLine(z, voiceLiveAvatarUpdateStatus, z2);
        return (voiceCallStatusLine == null || (iOrdinal = voiceCallStatusLine.ordinal()) == -1) ? voiceLiveAvatarUpdateStatus == null ? HatchNodeCardJsonKt.TYPE_CALLING : "voice_switch" : iOrdinal != 0 ? LIVE_AVATAR_WINNER_NOTICE : "reconnecting";
    }
}
