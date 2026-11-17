package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibilityKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentVisibilityTrackerKt {
    public static final long EMBODIMENT_STATE_SETTLE_MS = 250;
    public static final int EMBODIMENT_TIMELINE_ROW_CAP = 200;
    public static final String STATE_NONE = "none";

    public static final VoiceEmbodimentPlacement placement(VoiceEmbodimentInputs voiceEmbodimentInputs) {
        C7384Etj.A0Y(voiceEmbodimentInputs, 0);
        if (voiceEmbodimentInputs.systemPipActive) {
            if (voiceEmbodimentInputs.displayEnabled) {
                return VoiceEmbodimentPlacement.SYSTEM_PIP;
            }
        } else if (voiceEmbodimentInputs.appInForeground) {
            return !voiceEmbodimentInputs.embodimentAvailable ? VoiceEmbodimentPlacement.UNAVAILABLE : (voiceEmbodimentInputs.displayEnabled && voiceEmbodimentInputs.liveAvatarEnabled) ? voiceEmbodimentInputs.inAppPlacement : VoiceEmbodimentPlacement.HIDDEN;
        }
        return VoiceEmbodimentPlacement.BACKGROUND;
    }

    public static final VoiceEmbodimentStateReason reasonSince(VoiceEmbodimentInputs voiceEmbodimentInputs, VoiceEmbodimentInputs voiceEmbodimentInputs2, Function0<? extends VoiceEmbodimentStateReason> function0) {
        AnonymousClass003.A0v(voiceEmbodimentInputs, function0);
        if (voiceEmbodimentInputs2 != null) {
            if (voiceEmbodimentInputs.displayEnabled != voiceEmbodimentInputs2.displayEnabled) {
                VoiceEmbodimentStateReason voiceEmbodimentStateReasonInvoke = function0.invoke();
                if (voiceEmbodimentStateReasonInvoke != null) {
                    return voiceEmbodimentStateReasonInvoke;
                }
            } else {
                boolean z = voiceEmbodimentInputs.systemPipActive;
                if (z != voiceEmbodimentInputs2.systemPipActive) {
                    return z ? VoiceEmbodimentStateReason.PIP_ENTER : voiceEmbodimentInputs.appInForeground ? VoiceEmbodimentStateReason.PIP_EXIT : VoiceEmbodimentStateReason.PIP_DISMISSED;
                }
                boolean z2 = voiceEmbodimentInputs.appInForeground;
                if (z2 != voiceEmbodimentInputs2.appInForeground) {
                    return z2 ? VoiceEmbodimentStateReason.APP_FOREGROUND : VoiceEmbodimentStateReason.APP_BACKGROUND;
                }
                if (voiceEmbodimentInputs.liveAvatarEnabled == voiceEmbodimentInputs2.liveAvatarEnabled) {
                    if (voiceEmbodimentInputs.embodimentAvailable == voiceEmbodimentInputs2.embodimentAvailable) {
                        if (voiceEmbodimentInputs.inAppPlacement != voiceEmbodimentInputs2.inAppPlacement) {
                            VoiceEmbodimentStateReason voiceEmbodimentStateReasonInvoke2 = function0.invoke();
                            if (voiceEmbodimentStateReasonInvoke2 != null) {
                                return voiceEmbodimentStateReasonInvoke2;
                            }
                        } else {
                            if (voiceEmbodimentInputs.reconnecting != voiceEmbodimentInputs2.reconnecting) {
                                return VoiceEmbodimentStateReason.RECONNECT;
                            }
                            if (VoiceEmbodimentVisibilityKt.isActivity(voiceEmbodimentInputs.media) || VoiceEmbodimentVisibilityKt.isActivity(voiceEmbodimentInputs2.media)) {
                                return VoiceEmbodimentStateReason.ACTIVITY_CHANGE;
                            }
                            if (voiceEmbodimentInputs.media != voiceEmbodimentInputs2.media) {
                                return VoiceEmbodimentStateReason.MEDIA;
                            }
                        }
                    }
                }
            }
            return VoiceEmbodimentStateReason.DISPLAY_TOGGLE;
        }
        return VoiceEmbodimentStateReason.SYSTEM;
    }
}
