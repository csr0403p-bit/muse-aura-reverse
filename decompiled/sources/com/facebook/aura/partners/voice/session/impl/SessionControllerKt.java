package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C05663ul;
import X.C20Q;
import X.C20Z;
import X.C3cG;
import X.C7BY;
import X.G0V;
import X.HtJ;
import com.facebook.aura.avatarassets.path.AvatarPathKt;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AppearancePaths;
import com.facebook.aura.model.AvatarCallIdleVideo;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReference;
import com.facebook.aura.partners.voice.avatar.HatchAvatarSelection;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatus;
import com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class SessionControllerKt {
    public static final String APP_DEVICE = "app-audio";
    public static final int ASR_DIAGNOSTIC_UPDATE_INTERVAL = 50;
    public static final String COSMOS_JOIN_CAPACITY_UNAVAILABLE = "voice_capacity_unavailable";
    public static final String COSMOS_JOIN_OUT_OF_CREDITS = "out_of_credits";
    public static final long EMBODIMENT_OFF_SCREEN_SUPPRESS_MS = 2000;
    public static final long EMBODIMENT_RELEASE_HANDOFF_TIMEOUT_MS = 1000;
    public static final long ENDED_CALL_JOIN_WAIT_MS = 15000;
    public static final String END_SUB_REASON_EARLY_HANGUP = "early_hangup";
    public static final String END_SUB_REASON_RTC_REJOIN_FAILED = "rtc_rejoin_failed";
    public static final long GATEWAY_CONNECT_TIMEOUT_MS = 10000;
    public static final long INTEGRATED_JOIN_BIND_TIMEOUT_MS = 2000;
    public static final String LIVE_AVATAR_UPDATE_STATUS = "live_avatar_update_status";
    public static final long LIVE_AVATAR_UPDATE_STATUS_TIMEOUT_MS = 150000;
    public static final int MAX_WEAK_NETWORK_NOTICES_PER_CALL = 2;
    public static final long MEDIA_TRANSPORT_TIMEOUT_MS = 10000;
    public static final long PIN_RETRY_INTERVAL_MS = 5000;
    public static final long POST_TURN_CAPTION_TIMEOUT_MS = 4000;
    public static final long PRE_CONNECT_CAPTION_HANDOFF_MS = 10000;
    public static final String PRE_CONNECT_DICTATION_SESSION_PREFIX = "voice-preconnect-";
    public static final long PRIMARY_SESSION_ID_TIMEOUT_MS = 10000;
    public static final long RECONNECT_OFFLINE_DEBOUNCE_MS = 1500;
    public static final long REJOIN_CONNECT_TIMEOUT_MS = 30000;
    public static final long RTC_MEDIA_LOSS_DETECTION_MS = 8000;
    public static final long SESSION_END_NATIVE_WAIT_TIMEOUT_MS = 60000;
    public static final String TAG = "VoiceSessionController";
    public static final String VIDEO_OFF_REASON = "video_off_reason";
    public static final String VOICE_START_SUPERSEDED = "voice_start_superseded";
    public static final int WAIT_RETRY_LOG_EVERY = 6;
    public static final Set<String> REJOIN_FAILED_END_REASONS = BFI.A0H(new String[]{VoiceCallConnectionTracker.END_REASON_USER_HANGUP, VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT, VoiceCallConnectionTracker.END_REASON_START_FAILED, VoiceCallConnectionTracker.END_REASON_START_ERROR, VoiceCallConnectionTracker.END_REASON_NO_NETWORK, VoiceCallConnectionTracker.END_REASON_SERVER_TIMEOUT, VoiceCallConnectionTracker.END_REASON_NETWORK_DROP});
    public static final Set<String> END_REASONS_WITH_FAILURE_TOAST = BFI.A0H(new String[]{VoiceCallConnectionTracker.END_REASON_NO_NETWORK, VoiceCallConnectionTracker.END_REASON_SERVICE_RESTARTING, VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE, VoiceCallConnectionTracker.END_REASON_SESSION_ALREADY_ACTIVE, VoiceCallConnectionTracker.END_REASON_START_FAILED, VoiceCallConnectionTracker.END_REASON_START_ERROR, VoiceCallConnectionTracker.END_REASON_SERVER_ENDED, VoiceCallConnectionTracker.END_REASON_SERVER_TIMEOUT});
    public static final AtomicBoolean firstCallSinceLaunch = new AtomicBoolean(true);
    public static final VoiceEmbodimentMedia.ReferenceFraming UNCROPPED_STILL_FRAMING = new VoiceEmbodimentMedia.ReferenceFraming(0.0f, 0.0f);

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionControllerKt$pinRetryTicks$1", f = "SessionController.kt", l = {357, 358}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionControllerKt$pinRetryTicks$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C20Z<? super Unit>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0032 -> B:9:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = r6.L$0
                X.20Z r5 = (X.C20Z) r5
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L15
                if (r0 == r2) goto L25
                if (r0 == r3) goto L15
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L15:
                X.Hwg.A00(r7)
            L18:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r0 = r5.emit(r0, r6)
                if (r0 != r4) goto L28
                return r4
            L25:
                X.Hwg.A00(r7)
            L28:
                r6.L$0 = r5
                r6.label = r3
                r0 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r4) goto L18
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionControllerKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super Unit> c20z, HtJ<? super Unit> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = c20z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final C20Q<Unit> pinRetryTicks() {
        return new C05663ul(new AnonymousClass1(null));
    }

    public static final VoiceEmbodimentMedia.LiveRtc withJarvisIdle(VoiceEmbodimentMedia.LiveRtc liveRtc, HatchReadyCallIdle hatchReadyCallIdle) {
        if (hatchReadyCallIdle == null) {
            return liveRtc;
        }
        AvatarCallIdleVideo avatarCallIdleVideo = hatchReadyCallIdle.video;
        return liveRtc.copy(avatarCallIdleVideo.url, avatarCallIdleVideo.path, new VoiceEmbodimentMedia.StaticAvatar(hatchReadyCallIdle.poster.imageUri, toReferenceFraming(new HatchVideoCrop(0, 0))), hatchReadyCallIdle.getFraming(), liveRtc.liveFraming);
    }

    public static final VoiceEmbodimentMedia.LiveRtc withWwwIdlePortraitFraming(VoiceEmbodimentMedia.LiveRtc liveRtc, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, String str, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> map) {
        String str2;
        HatchAvatarIdlePoster hatchAvatarIdlePoster;
        if (referenceFraming == null || (str != null && str.equals(liveRtc.idleVideoUri))) {
            return liveRtc;
        }
        String str3 = liveRtc.referenceAssetId;
        return liveRtc.copy(liveRtc.idleVideoUri, liveRtc.referenceAssetId, (str3 == null || (str2 = liveRtc.idleVideoUri) == null || (hatchAvatarIdlePoster = map.get(new HatchAvatarIdleKey(str3, str2))) == null) ? liveRtc.fallbackAvatar : new VoiceEmbodimentMedia.StaticAvatar(hatchAvatarIdlePoster.imageUri, toReferenceFraming(new HatchVideoCrop(0, 0))), referenceFraming, liveRtc.liveFraming);
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallAvatarUpdate.FailureReason.values().length];
            try {
                AnonymousClass005.A0v(CallAvatarUpdate.FailureReason.FAILED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(CallAvatarUpdate.FailureReason.NOT_ANIMATABLE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass005.A0v(AgentActivityStatus.RESPONDING, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AgentActivityStatus.MAKING_SOMETHING, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.WORKING, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.COMPOSING, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.COMPACTING, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.ONLINE, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ VoiceEmbodimentMedia.StaticAvatar access$uncroppedStill(String str) {
        return new VoiceEmbodimentMedia.StaticAvatar(str, UNCROPPED_STILL_FRAMING);
    }

    public static final String callIdleSource(VoiceEmbodimentMedia voiceEmbodimentMedia, HatchReadyCallIdle hatchReadyCallIdle) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        String str;
        AvatarCallIdleVideo avatarCallIdleVideo;
        String str2 = null;
        if (!(voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) voiceEmbodimentMedia) == null || (str = liveRtc.idleVideoUri) == null) {
            return "none";
        }
        if (hatchReadyCallIdle != null && (avatarCallIdleVideo = hatchReadyCallIdle.video) != null) {
            str2 = avatarCallIdleVideo.url;
        }
        return str.equals(str2) ? "jarvis" : "www";
    }

    public static final AvatarStatusVideos callStatusVideos(AiIdentity aiIdentity, AvatarStatusVideos avatarStatusVideos, String str, boolean z) {
        AvatarMedia avatarMedia;
        AppearancePaths appearancePaths;
        if ((z && VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled()) || (str != null && ((aiIdentity == null || (avatarMedia = aiIdentity.avatarMedia) == null || (appearancePaths = avatarMedia.still) == null || !AbstractC0878AGe.A0k(appearancePaths.light, AvatarPathKt.avatarPath(str))) && VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled()))) {
            return new AvatarStatusVideos(null, null, null, null, null, null);
        }
        String str2 = avatarStatusVideos.working;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = avatarStatusVideos.makingSomething;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        return new AvatarStatusVideos(null, str2, str3, null, null, null);
    }

    public static final VoiceEmbodimentMedia.LiveRtc currentAvatarStillMedia(String str, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        return new VoiceEmbodimentMedia.LiveRtc(null, null, str != null ? new VoiceEmbodimentMedia.StaticAvatar(str, UNCROPPED_STILL_FRAMING) : null, referenceFraming == null ? UNCROPPED_STILL_FRAMING : referenceFraming, referenceFraming);
    }

    public static final VoiceEmbodimentMedia.ReferenceFraming embodimentPreviewFraming(PreparedHatchAvatar preparedHatchAvatar) {
        HatchAvatarSelection hatchAvatarSelection = preparedHatchAvatar.selection;
        if (!hatchAvatarSelection.fullFrame) {
            return null;
        }
        HatchAvatarReference hatchAvatarReference = hatchAvatarSelection.reference;
        return toReferenceFraming(VideoConfigJsonKt.resolveHatchVoiceVideoCrop(hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, false));
    }

    public static final VoiceEmbodimentMedia.LiveRtc liveRtcMedia(PreparedHatchAvatar preparedHatchAvatar, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z) {
        HatchAvatarReference hatchAvatarReference = preparedHatchAvatar.selection.reference;
        String str = hatchAvatarReference.idleVideoUri;
        String str2 = null;
        if (!z) {
            str2 = str;
        }
        String str3 = hatchAvatarReference.assetId;
        String str4 = null;
        if (!z) {
            str4 = str3;
        }
        return new VoiceEmbodimentMedia.LiveRtc(str2, str4, z ? null : embodimentFallback(preparedHatchAvatar), embodimentPreviewFraming(preparedHatchAvatar), referenceFraming);
    }

    public static final String prefKey(HatchAiIdentityHandler.AvatarImageKey avatarImageKey) {
        String str = avatarImageKey.path;
        if (str == null) {
            return null;
        }
        long j = avatarImageKey.updatedMs;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(":");
        return AnonymousClass001.A0v(str, sb);
    }

    public static final VoiceEmbodimentMedia.ReferenceFraming toReferenceFraming(HatchVideoCrop hatchVideoCrop) {
        return new VoiceEmbodimentMedia.ReferenceFraming(hatchVideoCrop.top / 768.0f, hatchVideoCrop.bottom / 768.0f);
    }

    public static final VoiceEmbodimentMedia.StaticAvatar uncroppedStill(String str) {
        return new VoiceEmbodimentMedia.StaticAvatar(str, UNCROPPED_STILL_FRAMING);
    }

    public static final VoiceLiveAvatarUpdateStatus closingStatus(CallAvatarUpdate.FailureReason failureReason) {
        int iOrdinal = failureReason.ordinal();
        if (iOrdinal == 0) {
            return VoiceLiveAvatarUpdateStatus.COULD_NOT_UPDATE;
        }
        if (iOrdinal == 1) {
            return VoiceLiveAvatarUpdateStatus.NOT_AVAILABLE;
        }
        throw C3cG.A0q();
    }

    public static final VoiceEmbodimentMedia.StaticAvatar embodimentFallback(PreparedHatchAvatar preparedHatchAvatar) {
        String fallbackUri = preparedHatchAvatar.getFallbackUri();
        if (fallbackUri == null) {
            return null;
        }
        HatchAvatarSelection hatchAvatarSelection = preparedHatchAvatar.selection;
        HatchAvatarReference hatchAvatarReference = hatchAvatarSelection.reference;
        return new VoiceEmbodimentMedia.StaticAvatar(fallbackUri, fallbackUri.equals(hatchAvatarReference.imageUri) ? toReferenceFraming(VideoConfigJsonKt.resolveHatchVoiceVideoCrop(hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, hatchAvatarSelection.fullFrame)) : null);
    }

    public static final boolean isWorkingVideoBusy(AgentActivityStatus agentActivityStatus) {
        switch (agentActivityStatus.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                throw C3cG.A0q();
        }
    }
}
