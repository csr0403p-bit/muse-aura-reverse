package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public abstract class VoiceCallStateKt {
    public static final boolean getEmbodimentAvailable(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        return getEmbodimentMedia(voiceCallSurfaceState) != null;
    }

    public static final VoiceEmbodimentMedia getEmbodimentMedia(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Unavailable) {
            return null;
        }
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Hidden) {
            return ((VoiceCallSurfaceState.Hidden) voiceCallSurfaceState).media;
        }
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Loading) {
            return ((VoiceCallSurfaceState.Loading) voiceCallSurfaceState).media;
        }
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Visible) {
            return ((VoiceCallSurfaceState.Visible) voiceCallSurfaceState).media;
        }
        throw C3cG.A0q();
    }

    public static final boolean getShouldShowEmbodiment(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        return (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Loading) || (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Visible);
    }

    public static final boolean isEmbodimentDisplayEnabled(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Unavailable) {
            return ((VoiceCallSurfaceState.Unavailable) voiceCallSurfaceState).displayEnabled;
        }
        if (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Hidden) {
            return false;
        }
        if ((voiceCallSurfaceState instanceof VoiceCallSurfaceState.Loading) || (voiceCallSurfaceState instanceof VoiceCallSurfaceState.Visible)) {
            return true;
        }
        throw C3cG.A0q();
    }

    public static final boolean isEmbodimentVisible(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        return voiceCallSurfaceState instanceof VoiceCallSurfaceState.Visible;
    }

    public static final boolean isReadyToRender(VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z, boolean z2) {
        C7384Etj.A0Y(voiceEmbodimentMedia, 0);
        if (voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) {
            if (!z && !z2 && ((VoiceEmbodimentMedia.LiveRtc) voiceEmbodimentMedia).fallbackAvatar == null) {
                return false;
            }
        } else if (!(voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.StaticAvatar)) {
            throw C3cG.A0q();
        }
        return true;
    }

    public static final boolean isLiveRtcReadyForSurface(Integer num, Integer num2) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (num2 != null && iIntValue == num2.intValue()) {
                return true;
            }
        }
        return false;
    }
}
