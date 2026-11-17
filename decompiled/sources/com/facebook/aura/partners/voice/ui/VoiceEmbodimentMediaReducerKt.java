package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import X.C7Je;
import X.HxE;
import android.net.Uri;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AvatarStatusVideos;

/* loaded from: classes4.dex */
public abstract class VoiceEmbodimentMediaReducerKt {
    public static final long ACTIVITY_VIDEO_COVERED_PREWARM_TIMEOUT_MS = 5000;
    public static final int ACTIVITY_VIDEO_MAX_RETRIES = 1;
    public static final long ACTIVITY_VIDEO_MIN_VISIBLE_MS = 1000;
    public static final long ACTIVITY_VIDEO_REPLACEMENT_COVER_TIMEOUT_MS = 5000;
    public static final long ACTIVITY_VIDEO_RETRY_DELAY_MS = 1000;
    public static final long BOT_STATE_DEBOUNCE_MS = 300;
    public static final long RTC_FRAME_FRESHNESS_TIMEOUT_MS = 1000;

    /* JADX WARN: Multi-variable type inference failed */
    public static final EmbodimentClip clipFor(AgentActivityStatus agentActivityStatus, AvatarStatusVideos avatarStatusVideos) {
        HxE hxEA0r;
        C7384Etj.A0Y(agentActivityStatus, 0);
        switch (agentActivityStatus.ordinal()) {
            case 0:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                hxEA0r = C3cG.A0r(EmbodimentClipKind.WORKING, avatarStatusVideos != null ? avatarStatusVideos.working : null);
                break;
            case 2:
                hxEA0r = C3cG.A0r(EmbodimentClipKind.MAKING_SOMETHING, avatarStatusVideos != null ? avatarStatusVideos.makingSomething : null);
                break;
            default:
                throw C3cG.A0q();
        }
        EmbodimentClipKind embodimentClipKind = (EmbodimentClipKind) hxEA0r.first;
        String str = (String) hxEA0r.second;
        if (str == null) {
            return null;
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null) {
            return new EmbodimentClip(embodimentClipKind, uriA01, HatchVideoPlayer.ResizeMode.ZOOM);
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass002.A13(AgentActivityStatus.ONLINE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentActivityStatus.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.RESPONDING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.COMPOSING, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.COMPACTING, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
