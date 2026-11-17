package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaEvent;
import java.util.Set;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentMediaReducer {
    public static final int $stable = 0;
    public static final VoiceEmbodimentMediaReducer INSTANCE = new VoiceEmbodimentMediaReducer();

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

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState finish(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState r82, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerInput r83, com.facebook.aura.partners.voice.ui.EmbodimentClipKind r84) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducer.finish(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerInput, com.facebook.aura.partners.voice.ui.EmbodimentClipKind):com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState");
    }

    private final EmbodimentClip generatedIdleClip(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput) {
        EmbodimentClip embodimentClip = voiceEmbodimentMediaReducerInput.generatedIdleClip;
        if (embodimentClip == null || ((voiceEmbodimentMediaReducerInput.liveRtcEnabled && voiceEmbodimentMediaReducerInput.paintedFlags.rtcEverPainted) || voiceEmbodimentMediaReducerState.failedVideoUris.contains(embodimentClip.uri.toString()))) {
            return null;
        }
        return embodimentClip;
    }

    private final boolean hasPaintedRtcFrame(VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput) {
        VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags = voiceEmbodimentMediaReducerInput.paintedFlags;
        return voiceEmbodimentPaintedFlags.rtcReady && voiceEmbodimentPaintedFlags.rtcLastFrameAtMs > 0;
    }

    public static /* synthetic */ VoiceEmbodimentMediaReducerState reduce$default(VoiceEmbodimentMediaReducer voiceEmbodimentMediaReducer, VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, VoiceEmbodimentMediaEvent voiceEmbodimentMediaEvent, int i, Object obj) {
        if ((i & 4) != 0) {
            voiceEmbodimentMediaEvent = VoiceEmbodimentMediaEvent.InputsChanged.INSTANCE;
        }
        return voiceEmbodimentMediaReducer.reduce(voiceEmbodimentMediaReducerState, voiceEmbodimentMediaReducerInput, voiceEmbodimentMediaEvent);
    }

    private final boolean replacementCoverReady(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, boolean z) {
        boolean z2;
        if (voiceEmbodimentMediaReducerState.activeClip != null && voiceEmbodimentMediaReducerState.activeClipReady) {
            VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags = voiceEmbodimentMediaReducerInput.paintedFlags;
            if (!voiceEmbodimentPaintedFlags.activityCoverReady) {
                if (!z) {
                    if (voiceEmbodimentMediaReducerInput.stillAvailable && voiceEmbodimentPaintedFlags.stillPainted) {
                        z2 = voiceEmbodimentPaintedFlags.stillFullyOpaque;
                    }
                    return false;
                }
                z2 = voiceEmbodimentPaintedFlags.rtcFullyOpaque;
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean shouldPrewarm(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, EmbodimentClip embodimentClip) {
        EmbodimentClip embodimentClip2 = voiceEmbodimentMediaReducerState.activeClip;
        return (embodimentClip2 == null || !C7384Etj.areEqual(embodimentClip, embodimentClip2) || voiceEmbodimentMediaReducerState.activeClipReady || voiceEmbodimentMediaReducerState.prewarmTimedOut || voiceEmbodimentMediaReducerState.retryPending || voiceEmbodimentMediaReducerState.failedVideoUris.contains(embodimentClip2.uri.toString()) || !voiceEmbodimentMediaReducerInput.lifecycleResumed) ? false : true;
    }

    private final EmbodimentClip targetClip(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, EmbodimentClipKind embodimentClipKind) {
        EmbodimentClip embodimentClipUsableActivityClip;
        return ((voiceEmbodimentMediaReducerInput.videoStateSwapEnabled || !voiceEmbodimentMediaReducerInput.isBotSpeaking) && (!((voiceEmbodimentMediaReducerState.activityQualified && voiceEmbodimentMediaReducerState.qualifiedActivityKind == embodimentClipKind) || (embodimentClipUsableActivityClip = voiceEmbodimentMediaReducerState.activeClip) == null || (embodimentClipUsableActivityClip.kind == EmbodimentClipKind.GENERATED_IDLE && voiceEmbodimentMediaReducerInput.liveRtcEnabled && voiceEmbodimentMediaReducerInput.paintedFlags.rtcEverPainted)) || ((embodimentClipUsableActivityClip = usableActivityClip(voiceEmbodimentMediaReducerInput, voiceEmbodimentMediaReducerState.failedVideoUris)) != null && embodimentClipUsableActivityClip.kind == embodimentClipKind))) ? embodimentClipUsableActivityClip : generatedIdleClip(voiceEmbodimentMediaReducerState, voiceEmbodimentMediaReducerInput);
    }

    private final EmbodimentClip usableActivityClip(VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, Set<String> set) {
        EmbodimentClip embodimentClip = voiceEmbodimentMediaReducerInput.activityClip;
        if (embodimentClip == null || set.contains(embodimentClip.uri.toString())) {
            return null;
        }
        return embodimentClip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0339, code lost:
    
        if (r8 < r2) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c8 A[PHI: r2 r5
  0x04c8: PHI (r2v32 boolean) = (r2v30 boolean), (r2v38 boolean) binds: [B:195:0x04c3, B:175:0x0448] A[DONT_GENERATE, DONT_INLINE]
  0x04c8: PHI (r5v1 java.lang.Long) = (r5v0 java.lang.Long), (r5v3 java.lang.Long) binds: [B:195:0x04c3, B:175:0x0448] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de A[PHI: r60
  0x00de: PHI (r60v3 boolean) = (r60v0 boolean), (r60v4 boolean) binds: [B:227:0x05a1, B:38:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState reduce(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState r94, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerInput r95, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaEvent r96) {
        /*
            Method dump skipped, instructions count: 1663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducer.reduce(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerInput, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaEvent):com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState");
    }

    private final VoiceEmbodimentMediaReducerState clearActiveClip(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState) {
        return VoiceEmbodimentMediaReducerState.copy$default(voiceEmbodimentMediaReducerState, null, 0L, null, false, false, 0L, null, false, null, false, false, false, 0L, 0, 0, false, null, null, false, null, false, null, false, null, null, false, false, false, false, null, 1065894143, null);
    }

    private final EmbodimentClipKind desiredActivityKind(AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip) {
        EmbodimentClipKind embodimentClipKind;
        switch (agentActivityStatus.ordinal()) {
            case 0:
            case 7:
            case 8:
                embodimentClipKind = EmbodimentClipKind.NONE;
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                embodimentClipKind = EmbodimentClipKind.WORKING;
                break;
            case 2:
                embodimentClipKind = EmbodimentClipKind.MAKING_SOMETHING;
                break;
            default:
                throw C3cG.A0q();
        }
        return (embodimentClip == null || embodimentClip.kind != embodimentClipKind) ? EmbodimentClipKind.NONE : embodimentClipKind;
    }

    private final boolean hasFreshRtcFrame(VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput) {
        return hasPaintedRtcFrame(voiceEmbodimentMediaReducerInput) && voiceEmbodimentMediaReducerInput.elapsedRealtimeMs - voiceEmbodimentMediaReducerInput.paintedFlags.rtcLastFrameAtMs <= 1000;
    }

    private final boolean rtcRenderable(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput) {
        if (!hasPaintedRtcFrame(voiceEmbodimentMediaReducerInput)) {
            return false;
        }
        if (hasFreshRtcFrame(voiceEmbodimentMediaReducerInput)) {
            return true;
        }
        return (voiceEmbodimentMediaReducerState.activityPresentationSuppressed || !voiceEmbodimentMediaReducerState.retainRtcCoverDuringActivityLoad || voiceEmbodimentMediaReducerInput.paintedFlags.stillPainted) ? false : true;
    }
}
