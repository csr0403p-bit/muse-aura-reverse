package com.facebook.aura.partners.voice.session.impl;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import X.HxE;
import android.os.SystemClock;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;
import com.facebook.aura.perf.HatchQplLogger;
import com.facebook.aura.threadvoicecaption.ThreadAssistantCaption;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallConnectionTracker {
    public static final Companion Companion = new Companion();
    public static final String EMBODIMENT_STATE_EVENT_NAME = "voice_embodiment_state";
    public static final String EMBODIMENT_STATE_TAG = "HatchEmbodimentState";
    public static final String END_REASON_AGENT_INACTIVITY = "agent_inactivity";
    public static final String END_REASON_APP_BACKGROUND = "app_background";
    public static final String END_REASON_CANCELLED_CONNECTING = "cancelled_connecting";
    public static final String END_REASON_CONNECT_TIMEOUT = "connect_timeout";
    public static final String END_REASON_NETWORK_DROP = "network_drop";
    public static final String END_REASON_NO_MIC_PERMISSION = "no_mic_permission";
    public static final String END_REASON_NO_NETWORK = "no_network";
    public static final String END_REASON_OTHER_SESSION_ACTIVE = "other_session_active";
    public static final String END_REASON_OUT_OF_CREDITS = "out_of_credits";
    public static final String END_REASON_REMOTE_COMMAND = "remote_command";
    public static final String END_REASON_REMOTE_ERROR = "remote_error";
    public static final String END_REASON_REMOTE_USER_REQUEST = "user_request";
    public static final String END_REASON_RESTART = "restart";
    public static final String END_REASON_RTC_REJOIN = "rtc_rejoin";
    public static final String END_REASON_SERVER_ENDED = "server_ended";
    public static final String END_REASON_SERVER_TIMEOUT = "server_timeout";
    public static final String END_REASON_SERVICE_RESTARTING = "service_restarting";
    public static final String END_REASON_SESSION_ALREADY_ACTIVE = "session_already_active";
    public static final String END_REASON_START_ERROR = "start_error";
    public static final String END_REASON_START_FAILED = "start_failed";
    public static final String END_REASON_SUPERSEDED = "superseded";
    public static final String END_REASON_TEARDOWN = "teardown";
    public static final String END_REASON_THREAD_DELETED = "thread_deleted";
    public static final String END_REASON_USER_HANGUP = "user_hangup";
    public static final String MAIN_THREAD_CAPTIONS_PREFIX = "voice_caption_main_thread";
    public static final String NETWORK_TYPE_NONE = "none";
    public static final String PHASE_AUDIO_PROXY_CREATED = "audio_proxy_created";
    public static final String PHASE_REGISTER_USER_END = "register_user_end";
    public static final String PHASE_RSYS_START_SESSION_END = "rsys_start_session_end";
    public static final String PHASE_SIGNALING_RESOLVED = "signaling_resolved";
    public static final String POINT_JOIN_ANSWERED = "join_answered";
    public static final String RECEIVED_CAPTIONS_PREFIX = "voice_caption_received";
    public static final String RECONNECT_EVENT_NAME = "voice_call_reconnect";
    public static final String STAGE_COSMOS_JOIN_REJECTED = "cosmos_join_rejected";
    public static final String STAGE_DEVICE_OFFLINE = "device_offline";
    public static final String STAGE_ENGINE_CREATION_FAILED = "engine_creation_failed";
    public static final String STAGE_ENGINE_START_SUPERSEDED = "engine_start_superseded";
    public static final String STAGE_ENGINE_START_TEARDOWN_UNCONFIRMED = "engine_start_teardown_unconfirmed";
    public static final String STAGE_EXISTING_SESSION_TEARDOWN_UNCONFIRMED = "existing_session_teardown_unconfirmed";
    public static final String STAGE_GATEWAY_BOOTSTRAP_FAILED = "gateway_bootstrap_failed";
    public static final String STAGE_GATEWAY_NOT_CONNECTED = "gateway_not_connected";
    public static final String STAGE_JOIN_NOT_ANSWERED = "join_not_answered";
    public static final String STAGE_JOIN_NOT_SENT = "join_not_sent";
    public static final String STAGE_MEDIA_NOT_CONNECTED = "media_not_connected";
    public static final String STAGE_PRIMARY_SESSION_UNAVAILABLE = "primary_session_unavailable";
    public static final String STAGE_START_EXCEPTION = "start_exception";
    public static final String TAG = "VoiceCallConnectionTracker";
    public int activityClipReentriesAfterSpeech;
    public long activityClipVisibleSinceMs;
    public boolean awaitingActivityClipReentry;
    public boolean botAudioMuted;
    public String callId;
    public boolean clipEligibleIntervalActive;
    public boolean clipEligibleIntervalAwaitingExit;
    public boolean connected;
    public long embodimentFramesTotal;
    public long embodimentHiddenMs;
    public long embodimentHiddenSinceMs;
    public int embodimentToggleCount;
    public Function0<Long> framesRenderedSupplier;
    public Object framesSupplierOwner;
    public String gatewayUnavailableReason;
    public boolean lastBusy;
    public long lastMediaStateAtMs;
    public boolean lastSpeaking;
    public long lastSpeechEndedAtMs;
    public boolean mediaStateObserved;
    public int mediaSwapsInCurrentInterval;
    public String networkType;
    public Integer openInstanceKey;
    public VoiceCallReconnectEpisodes reconnects;
    public long rtcVisibleWhileBusyMs;
    public int shortClipExposuresUnderOneSecond;
    public int shortClipExposuresUnderTwoSeconds;
    public boolean speechOccurredDuringWorkingSession;
    public long workingClipVisibleMs;
    public boolean workingVideoGateEverEnabled;
    public final AtomicInteger callCounter = new AtomicInteger(0);
    public final EnumSet<VoiceCallReconnectCause> reconnectCauses = EnumSet.noneOf(VoiceCallReconnectCause.class);
    public final Set<String> emittedOnce = C3cG.A0k();
    public final List<Integer> mediaSwapsPerClipEligibleInterval = C3cG.A0h();
    public final int[] interSpeechGapBuckets = new int[5];
    public VoiceEmbodimentVisibleMedia lastVisibleMedia = VoiceEmbodimentVisibleMedia.NONE;
    public CaptionCadence receivedCaptions = new CaptionCadence(RECEIVED_CAPTIONS_PREFIX);
    public CaptionCadence mainThreadCaptions = new CaptionCadence(MAIN_THREAD_CAPTIONS_PREFIX);
    public final VoiceEmbodimentVisibilityTracker embodimentVisibility = new VoiceEmbodimentVisibilityTracker(VoiceCallConnectionTracker$embodimentVisibility$1.INSTANCE, new VoiceCallConnectionTracker$embodimentVisibility$2(this));

    /* renamed from: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker$joinCauses$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<VoiceCallReconnectCause, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(VoiceCallReconnectCause voiceCallReconnectCause) {
            VoiceCallReconnectCause voiceCallReconnectCause2 = voiceCallReconnectCause;
            C7384Etj.A0Y(voiceCallReconnectCause2, 0);
            return voiceCallReconnectCause2.getValue();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(VoiceCallReconnectCause voiceCallReconnectCause) {
            C7384Etj.A0Y(voiceCallReconnectCause, 0);
            return voiceCallReconnectCause.getValue();
        }
    }

    public final synchronized void annotate(String str, String str2, Integer num) {
        AnonymousClass003.A0u(str, str2);
        Integer num2 = this.openInstanceKey;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (num == null || iIntValue == num.intValue()) {
                if (str.equals(VoiceEmbodimentStateEventField.CALL_ID.getValue())) {
                    this.callId = str2;
                }
                try {
                    HatchQplLogger.INSTANCE.markerAnnotate(734857354, str, str2, iIntValue);
                } catch (Exception e) {
                    CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
                }
            }
        }
    }

    public final synchronized void onAssistantCaptionOnMainThread(ThreadAssistantCaption threadAssistantCaption, boolean z, int i) {
        C7384Etj.A0Y(threadAssistantCaption, 0);
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.mainThreadCaptions.onCaption(threadAssistantCaption, z);
        }
    }

    public final synchronized void onAssistantCaptionReceived(ThreadAssistantCaption threadAssistantCaption, boolean z, int i) {
        C7384Etj.A0Y(threadAssistantCaption, 0);
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.receivedCaptions.onCaption(threadAssistantCaption, z);
        }
    }

    public final synchronized void onBotAudioMuted(int i) {
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.botAudioMuted = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: all -> 0x0076, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:15:0x0024, B:17:0x002d, B:21:0x0039, B:23:0x0041, B:25:0x0049, B:29:0x0054, B:32:0x005e, B:37:0x006a, B:40:0x0071), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onCallEnded(java.lang.String r6, java.lang.Integer r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Integer r1 = r5.openInstanceKey     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L74
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L16
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> L76
            if (r2 == r0) goto L16
            goto L74
        L16:
            boolean r4 = r5.connected     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L23
            java.lang.String r0 = "user_hangup"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            r3 = 1
            if (r0 != 0) goto L24
        L23:
            r3 = 0
        L24:
            java.lang.String r0 = "restart"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            r2 = 4
            if (r0 != 0) goto L54
            java.lang.String r0 = "rtc_rejoin"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L54
            if (r4 == 0) goto L39
            r2 = 2
            goto L54
        L39:
            java.lang.String r0 = "superseded"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L54
            java.lang.String r0 = "out_of_credits"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L54
            java.lang.String r0 = "thread_deleted"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L54
            if (r3 != 0) goto L54
            r2 = 3
        L54:
            java.lang.String r0 = "connect_timeout"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L63
            if (r8 == 0) goto L63
            java.lang.String r0 = "rsys_timeout_detail"
            r5.annotate(r0, r8, r1)     // Catch: java.lang.Throwable -> L76
        L63:
            if (r3 == 0) goto L66
            goto L68
        L66:
            r1 = r6
            goto L6a
        L68:
            java.lang.String r1 = "cancelled_connecting"
        L6a:
            java.lang.String r0 = r5.derivedSubReason(r6)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L71
            r8 = r0
        L71:
            r5.end(r2, r1, r8)     // Catch: java.lang.Throwable -> L76
        L74:
            monitor-exit(r5)
            return
        L76:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker.onCallEnded(java.lang.String, java.lang.Integer, java.lang.String):void");
    }

    public final synchronized int onCallInitiated(boolean z, String str, VoiceCallEntryPoint voiceCallEntryPoint, Map<String, String> map, boolean z2, boolean z3) {
        int iIncrementAndGet;
        C7384Etj.A0Y(map, 3);
        end((short) 4, "superseded", null);
        if (!z3) {
            finishReconnects(SystemClock.elapsedRealtime(), null);
        }
        iIncrementAndGet = this.callCounter.incrementAndGet();
        this.openInstanceKey = Integer.valueOf(iIncrementAndGet);
        this.connected = false;
        this.gatewayUnavailableReason = null;
        this.emittedOnce.clear();
        this.embodimentToggleCount = 0;
        this.embodimentHiddenMs = 0L;
        this.embodimentHiddenSinceMs = z2 ? SystemClock.elapsedRealtime() : 0L;
        this.embodimentFramesTotal = 0L;
        this.mediaSwapsPerClipEligibleInterval.clear();
        int[] iArr = this.interSpeechGapBuckets;
        Arrays.fill(iArr, 0, iArr.length, 0);
        this.mediaStateObserved = false;
        this.lastMediaStateAtMs = 0L;
        this.lastVisibleMedia = VoiceEmbodimentVisibleMedia.NONE;
        this.lastBusy = false;
        this.lastSpeaking = false;
        this.clipEligibleIntervalActive = false;
        this.clipEligibleIntervalAwaitingExit = false;
        this.mediaSwapsInCurrentInterval = 0;
        this.activityClipVisibleSinceMs = 0L;
        this.lastSpeechEndedAtMs = 0L;
        this.awaitingActivityClipReentry = false;
        this.activityClipReentriesAfterSpeech = 0;
        this.shortClipExposuresUnderOneSecond = 0;
        this.shortClipExposuresUnderTwoSeconds = 0;
        this.workingClipVisibleMs = 0L;
        this.rtcVisibleWhileBusyMs = 0L;
        this.workingVideoGateEverEnabled = false;
        this.speechOccurredDuringWorkingSession = false;
        this.receivedCaptions = new CaptionCadence(RECEIVED_CAPTIONS_PREFIX);
        this.mainThreadCaptions = new CaptionCadence(MAIN_THREAD_CAPTIONS_PREFIX);
        this.botAudioMuted = false;
        this.framesRenderedSupplier = null;
        this.framesSupplierOwner = null;
        this.callId = null;
        this.embodimentVisibility.reset();
        try {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerStart(734857354, iIncrementAndGet, false);
            hatchQplLogger.markerAnnotate(734857354, "was_restart", z, iIncrementAndGet);
            if (str != null) {
                hatchQplLogger.markerAnnotate(734857354, "thread_id", str, iIncrementAndGet);
            }
            if (voiceCallEntryPoint != null) {
                HatchQplLogger.INSTANCE.markerAnnotate(734857354, "entry_point", voiceCallEntryPoint.getValue(), iIncrementAndGet);
            }
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                HatchQplLogger.INSTANCE.markerAnnotate(734857354, (String) entryA0l.getKey(), (String) entryA0l.getValue(), iIncrementAndGet);
            }
        } catch (Exception e) {
            CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
        }
        return iIncrementAndGet;
    }

    public final synchronized boolean onConnected(int i) {
        boolean z;
        int iIntValue;
        Integer num = this.openInstanceKey;
        z = false;
        if (num != null && (iIntValue = num.intValue()) == i) {
            boolean zRemove = this.reconnectCauses.remove(VoiceCallReconnectCause.REJOIN);
            VoiceCallReconnectEpisodes voiceCallReconnectEpisodes = this.reconnects;
            if (voiceCallReconnectEpisodes == null) {
                this.reconnects = new VoiceCallReconnectEpisodes(this.callId, SystemClock.elapsedRealtime());
            } else if (zRemove) {
                voiceCallReconnectEpisodes.onRejoinEnded(VoiceCallRejoinOutcome.CONNECTED);
            }
            EnumSet<VoiceCallReconnectCause> enumSet = this.reconnectCauses;
            C7384Etj.A0T(enumSet);
            enumSet.remove(VoiceCallReconnectCause.MEDIA);
            updateReconnects();
            if (!this.connected) {
                z = true;
                this.connected = true;
                this.embodimentVisibility.start();
                try {
                    HatchQplLogger.INSTANCE.markerPoint(734857354, "connected", iIntValue);
                } catch (Exception e) {
                    CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
                }
            }
        }
        return z;
    }

    public final synchronized void onConnectivity(boolean z, AuraNetworkState auraNetworkState) {
        String strA0x;
        C7384Etj.A0Y(auraNetworkState, 1);
        setReconnectCause(VoiceCallReconnectCause.GATEWAY, z);
        setReconnectCause(VoiceCallReconnectCause.OFFLINE, auraNetworkState instanceof AuraNetworkState.Offline);
        if (auraNetworkState instanceof AuraNetworkState.Online) {
            strA0x = AnonymousClass006.A0x(((AuraNetworkState.Online) auraNetworkState).transport);
        } else if (auraNetworkState.equals(AuraNetworkState.Offline.INSTANCE)) {
            strA0x = "none";
        } else {
            if (!auraNetworkState.equals(AuraNetworkState.Unknown.INSTANCE)) {
                throw C3cG.A0q();
            }
            strA0x = null;
        }
        this.networkType = strA0x;
        updateReconnects();
    }

    public final synchronized void onEmbodimentDisplayToggled(boolean z, int i) {
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.embodimentToggleCount++;
            long j = this.embodimentHiddenSinceMs;
            long jElapsedRealtime = 0;
            if (z) {
                if (j != 0) {
                    this.embodimentHiddenMs += C3cG.A04(j);
                    this.embodimentHiddenSinceMs = jElapsedRealtime;
                }
            } else if (j == 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                this.embodimentHiddenSinceMs = jElapsedRealtime;
            }
        }
    }

    public final synchronized void onEmbodimentRendererReleased(long j, int i, Object obj) {
        C7384Etj.A0Y(obj, 2);
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.embodimentFramesTotal += j;
            if (this.framesSupplierOwner == obj) {
                this.framesRenderedSupplier = null;
                this.framesSupplierOwner = null;
            }
        }
    }

    public final synchronized void onEmbodimentState(VoiceEmbodimentPlacement voiceEmbodimentPlacement, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, VoiceEmbodimentStateReason voiceEmbodimentStateReason) {
        AnonymousClass005.A0x(voiceEmbodimentPlacement, voiceEmbodimentPaintedMedia, voiceEmbodimentStateReason);
        this.embodimentVisibility.update(voiceEmbodimentPlacement, voiceEmbodimentPaintedMedia, voiceEmbodimentStateReason);
    }

    public final synchronized void onGatewayUnavailable(String str, int i) {
        C7384Etj.A0Y(str, 0);
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.gatewayUnavailableReason = str;
        }
    }

    public final synchronized void onJoinAnswered(int i) {
        point(POINT_JOIN_ANSWERED, Integer.valueOf(i), false);
    }

    public final synchronized void onReconnecting(int i) {
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            EnumSet<VoiceCallReconnectCause> enumSet = this.reconnectCauses;
            C7384Etj.A0T(enumSet);
            enumSet.add(VoiceCallReconnectCause.MEDIA);
            updateReconnects();
        }
    }

    public final synchronized void onRejoinAbandoned() {
        finishReconnects(SystemClock.elapsedRealtime(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onWorkingVideoState(com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker.onWorkingVideoState(com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia, boolean, boolean, boolean, boolean, int):void");
    }

    public final synchronized void point(String str, Integer num, boolean z) {
        C7384Etj.A0Y(str, 0);
        Integer num2 = this.openInstanceKey;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if ((num == null || iIntValue == num.intValue()) && (z || this.emittedOnce.add(FGI.A0M("point:", str)))) {
                try {
                    HatchQplLogger.INSTANCE.markerPoint(734857354, str, iIntValue);
                } catch (Exception e) {
                    CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
                }
            }
        }
    }

    public final synchronized void setEmbodimentFramesSupplier(int i, Object obj, Function0<Long> function0) {
        Integer num = this.openInstanceKey;
        if (num != null && num.intValue() == i) {
            this.framesRenderedSupplier = function0;
            this.framesSupplierOwner = obj;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceEmbodimentVisibleMedia.values().length];
            try {
                AnonymousClass002.A13(VoiceEmbodimentVisibleMedia.ACTIVITY_CLIP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceEmbodimentVisibleMedia.LIVE_RTC, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceEmbodimentVisibleMedia.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void accumulateVisibleTime(long j) {
        long j2 = j - this.lastMediaStateAtMs;
        if (j2 < 0) {
            j2 = 0;
        }
        if (this.lastBusy) {
            int iOrdinal = this.lastVisibleMedia.ordinal();
            if (iOrdinal == 2) {
                this.workingClipVisibleMs += j2;
            } else if (iOrdinal == 1) {
                this.rtcVisibleWhileBusyMs += j2;
            } else if (iOrdinal != 0) {
                throw C3cG.A0q();
            }
        }
    }

    public static /* synthetic */ void annotate$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, boolean z, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        voiceCallConnectionTracker.annotate(str, z, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void annotateEmbodimentVisibility(VoiceEmbodimentVisibilityTotals voiceEmbodimentVisibilityTotals, int i) {
        Iterator itA0n = AnonymousClass002.A0n(voiceEmbodimentVisibilityTotals.placementMs);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            HatchQplLogger.INSTANCE.markerAnnotate(734857354, FGI.A0U("voice_embodiment_placement_", ((VoiceEmbodimentPlacement) entryA0l.getKey()).getValue(), "_ms"), toQplInt(C3cG.A05(entryA0l.getValue())), i);
        }
        Iterator itA0n2 = AnonymousClass002.A0n(voiceEmbodimentVisibilityTotals.mediaMs);
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            HatchQplLogger.INSTANCE.markerAnnotate(734857354, FGI.A0U("voice_embodiment_media_", ((VoiceEmbodimentPaintedMedia) entryA0l2.getKey()).getValue(), "_ms"), toQplInt(C3cG.A05(entryA0l2.getValue())), i);
        }
        for (HxE hxE : Arrays.asList(AnonymousClass002.A0p(VoiceCallSessionAnnotationKey.EMBODIMENT_PLACEMENT_CHANGES, voiceEmbodimentVisibilityTotals.placementChanges), AnonymousClass002.A0p(VoiceCallSessionAnnotationKey.EMBODIMENT_MEDIA_CHANGES, voiceEmbodimentVisibilityTotals.mediaChanges), AnonymousClass002.A0p(VoiceCallSessionAnnotationKey.EMBODIMENT_BACKGROUND_ENTRIES, voiceEmbodimentVisibilityTotals.backgroundEntries), AnonymousClass002.A0p(VoiceCallSessionAnnotationKey.EMBODIMENT_TIMELINE_ROWS, voiceEmbodimentVisibilityTotals.timelineRows))) {
            VoiceCallSessionAnnotationKey voiceCallSessionAnnotationKey = (VoiceCallSessionAnnotationKey) hxE.first;
            HatchQplLogger.INSTANCE.markerAnnotate(734857354, voiceCallSessionAnnotationKey.getValue(), AnonymousClass001.A0F(hxE.second), i);
        }
        HatchQplLogger.INSTANCE.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.EMBODIMENT_TIMELINE_TRUNCATED.getValue(), voiceEmbodimentVisibilityTotals.timelineTruncated, i);
    }

    private final void annotateReconnects(VoiceCallReconnectEpisodes voiceCallReconnectEpisodes, int i) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.RECONNECT_COUNT.getValue(), voiceCallReconnectEpisodes.count, i);
        hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.RECONNECT_MS.getValue(), toQplInt(voiceCallReconnectEpisodes.totalMs), i);
        hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.ENDED_WHILE_RECONNECTING.getValue(), voiceCallReconnectEpisodes.endedWhileReconnecting, i);
        EnumSet<VoiceCallReconnectCause> enumSet = voiceCallReconnectEpisodes.seen;
        C7384Etj.A0T(enumSet);
        if (enumSet.isEmpty()) {
            return;
        }
        String value = VoiceCallSessionAnnotationKey.RECONNECT_CAUSES.getValue();
        EnumSet<VoiceCallReconnectCause> enumSet2 = voiceCallReconnectEpisodes.seen;
        C7384Etj.A0T(enumSet2);
        hatchQplLogger.markerAnnotate(734857354, value, joinCauses(enumSet2), i);
    }

    private final String derivedSubReason(String str) {
        if (END_REASON_NO_NETWORK.equals(str)) {
            return this.gatewayUnavailableReason;
        }
        if (END_REASON_CONNECT_TIMEOUT.equals(str)) {
            return this.emittedOnce.contains(FGI.A0M("point:", POINT_JOIN_ANSWERED)) ? STAGE_MEDIA_NOT_CONNECTED : this.emittedOnce.contains(FGI.A0M("point:", PHASE_RSYS_START_SESSION_END)) ? STAGE_JOIN_NOT_ANSWERED : STAGE_JOIN_NOT_SENT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void end(short s, String str, String str2) {
        VoiceCallReconnectEpisodes voiceCallReconnectEpisodesFinishReconnects;
        VoiceCallReconnectEpisodes voiceCallReconnectEpisodes;
        Integer num = this.openInstanceKey;
        if (num != null) {
            int iIntValue = num.intValue();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            VoiceEmbodimentVisibilityTotals voiceEmbodimentVisibilityTotalsStop = this.embodimentVisibility.stop();
            if (this.mediaStateObserved) {
                accumulateVisibleTime(jElapsedRealtime);
                if (this.lastVisibleMedia == VoiceEmbodimentVisibleMedia.ACTIVITY_CLIP) {
                    recordActivityClipExposure(jElapsedRealtime - this.activityClipVisibleSinceMs);
                    this.activityClipVisibleSinceMs = 0L;
                }
                if (this.clipEligibleIntervalActive) {
                    finishClipEligibleInterval();
                }
            }
            this.openInstanceKey = null;
            long j = this.embodimentFramesTotal;
            Function0<Long> function0 = this.framesRenderedSupplier;
            this.embodimentFramesTotal = j + (function0 != null ? C3cG.A05(function0.invoke()) : 0L);
            this.framesRenderedSupplier = null;
            this.framesSupplierOwner = null;
            long j2 = this.embodimentHiddenSinceMs;
            if (j2 != 0) {
                this.embodimentHiddenMs += C3cG.A04(j2);
                this.embodimentHiddenSinceMs = 0L;
            }
            EnumSet<VoiceCallReconnectCause> enumSet = this.reconnectCauses;
            C7384Etj.A0T(enumSet);
            enumSet.remove(VoiceCallReconnectCause.MEDIA);
            if (END_REASON_RTC_REJOIN.equals(str)) {
                if (!this.reconnectCauses.add(VoiceCallReconnectCause.REJOIN) && (voiceCallReconnectEpisodes = this.reconnects) != null) {
                    voiceCallReconnectEpisodes.onRejoinEnded(VoiceCallRejoinOutcome.FAILED);
                }
                updateReconnects();
                voiceCallReconnectEpisodesFinishReconnects = null;
            } else {
                voiceCallReconnectEpisodesFinishReconnects = finishReconnects(jElapsedRealtime, rejoinOutcomeOnEnd(str));
            }
            try {
                HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
                hatchQplLogger.markerAnnotate(734857354, "connected", this.connected, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, "end_reason", str, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, "embodiment_toggle_count", this.embodimentToggleCount, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, "embodiment_hidden_ms", (int) this.embodimentHiddenMs, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, "embodiment_frames_received", (int) this.embodimentFramesTotal, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.MEDIA_SWAPS_PER_CLIP_ELIGIBLE_INTERVAL.getValue(), AbstractC0878AGe.A0L(",", "[", "]", this.mediaSwapsPerClipEligibleInterval, null), iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.ACTIVITY_CLIP_REENTRIES_AFTER_SPEECH.getValue(), this.activityClipReentriesAfterSpeech, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.SHORT_CLIP_EXPOSURES_UNDER_1S.getValue(), this.shortClipExposuresUnderOneSecond, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.SHORT_CLIP_EXPOSURES_UNDER_2S.getValue(), this.shortClipExposuresUnderTwoSeconds, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.WORKING_CLIP_VISIBLE_MS.getValue(), toQplInt(this.workingClipVisibleMs), iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.RTC_VISIBLE_WHILE_BUSY_MS.getValue(), toQplInt(this.rtcVisibleWhileBusyMs), iIntValue);
                String value = VoiceCallSessionAnnotationKey.INTER_SPEECH_GAP_BUCKETS.getValue();
                int[] iArr = this.interSpeechGapBuckets;
                C7384Etj.A0Y(iArr, 0);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "[");
                int i = 0;
                for (int i2 : iArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ",");
                    }
                    sb.append((CharSequence) String.valueOf(i2));
                }
                sb.append((CharSequence) "]");
                hatchQplLogger.markerAnnotate(734857354, value, sb.toString(), iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.WORKING_VIDEO_GATE_ENABLED.getValue(), this.workingVideoGateEverEnabled, iIntValue);
                hatchQplLogger.markerAnnotate(734857354, VoiceCallSessionAnnotationKey.SPEECH_DURING_WORKING_SESSION.getValue(), this.speechOccurredDuringWorkingSession, iIntValue);
                Iterator itA0i = C3cG.A0i(AGH.A02(this.receivedCaptions.annotations(), this.mainThreadCaptions.annotations()));
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    hatchQplLogger.markerAnnotate(734857354, (String) entryA0l.getKey(), AnonymousClass001.A0F(entryA0l.getValue()), iIntValue);
                }
                hatchQplLogger.markerAnnotate(734857354, "voice_caption_bot_audio_muted", this.botAudioMuted, iIntValue);
                if (str2 != null) {
                    hatchQplLogger.markerAnnotate(734857354, "end_sub_reason", str2, iIntValue);
                }
                if (voiceEmbodimentVisibilityTotalsStop != null) {
                    annotateEmbodimentVisibility(voiceEmbodimentVisibilityTotalsStop, iIntValue);
                }
                if (voiceCallReconnectEpisodesFinishReconnects != null) {
                    annotateReconnects(voiceCallReconnectEpisodesFinishReconnects, iIntValue);
                }
                hatchQplLogger.markerEnd(734857354, s, iIntValue);
            } catch (Exception e) {
                CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
            }
        }
    }

    private final void finishClipEligibleInterval() {
        this.mediaSwapsPerClipEligibleInterval.add(Integer.valueOf(this.mediaSwapsInCurrentInterval));
        this.clipEligibleIntervalActive = false;
        this.clipEligibleIntervalAwaitingExit = false;
        this.mediaSwapsInCurrentInterval = 0;
        this.awaitingActivityClipReentry = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectEpisodes finishReconnects(long r5, com.facebook.aura.partners.voice.session.impl.VoiceCallRejoinOutcome r7) {
        /*
            r4 = this;
            com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectEpisodes r3 = r4.reconnects
            r2 = 0
            r4.reconnects = r2
            java.util.EnumSet<com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectCause> r1 = r4.reconnectCauses
            com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectCause r0 = com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectCause.REJOIN
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L24
            if (r7 == 0) goto L24
            if (r3 == 0) goto L26
            r3.onRejoinEnded(r7)
        L16:
            java.lang.String r0 = r4.networkType
            com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectEpisode r1 = r3.onCallEnded(r5, r0)
            if (r1 == 0) goto L23
            java.lang.String r0 = r3.callId
            r4.logReconnectEpisode(r0, r1)
        L23:
            return r3
        L24:
            if (r3 != 0) goto L16
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker.finishReconnects(long, com.facebook.aura.partners.voice.session.impl.VoiceCallRejoinOutcome):com.facebook.aura.partners.voice.session.impl.VoiceCallReconnectEpisodes");
    }

    private final String joinCauses(Set<? extends VoiceCallReconnectCause> set) {
        return AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0c(set, new Comparator() { // from class: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker$joinCauses$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00(((VoiceCallReconnectCause) t).getValue(), ((VoiceCallReconnectCause) t2).getValue());
            }
        }), AnonymousClass2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEmbodimentTransition(VoiceEmbodimentTransition voiceEmbodimentTransition) {
        String value = VoiceEmbodimentStateEventField.CALL_ID.getValue();
        String str = this.callId;
        if (str == null) {
            str = "";
        }
        Map<String, String> mapA0D = AGH.A0D(C3cG.A0r(value, str), C3cG.A0r(VoiceEmbodimentStateEventField.SEQ.getValue(), String.valueOf(voiceEmbodimentTransition.seq)), C3cG.A0r(VoiceEmbodimentStateEventField.SINCE_CONNECT_MS.getValue(), String.valueOf(voiceEmbodimentTransition.sinceConnectMs)), C3cG.A0r(VoiceEmbodimentStateEventField.FROM_PLACEMENT.getValue(), voiceEmbodimentTransition.fromPlacement), C3cG.A0r(VoiceEmbodimentStateEventField.TO_PLACEMENT.getValue(), voiceEmbodimentTransition.toPlacement), C3cG.A0r(VoiceEmbodimentStateEventField.FROM_MEDIA.getValue(), voiceEmbodimentTransition.fromMedia), C3cG.A0r(VoiceEmbodimentStateEventField.TO_MEDIA.getValue(), voiceEmbodimentTransition.toMedia), C3cG.A0r(VoiceEmbodimentStateEventField.REASON.getValue(), voiceEmbodimentTransition.reason.getValue()), C3cG.A0r(VoiceEmbodimentStateEventField.PREV_STATE_MS.getValue(), String.valueOf(voiceEmbodimentTransition.prevStateMs)));
        CFK.A05(EMBODIMENT_STATE_TAG, AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", mapA0D.entrySet(), AnonymousClass1.INSTANCE));
        HatchAppEventLogger.INSTANCE.logEvent(EMBODIMENT_STATE_EVENT_NAME, "voice", HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID, "transition", "embodiment", mapA0D, null);
    }

    public static /* synthetic */ void onCallEnded$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        voiceCallConnectionTracker.onCallEnded(str, num, str2);
    }

    public static /* synthetic */ int onCallInitiated$default(VoiceCallConnectionTracker voiceCallConnectionTracker, boolean z, String str, VoiceCallEntryPoint voiceCallEntryPoint, Map map, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            voiceCallEntryPoint = null;
        }
        return voiceCallConnectionTracker.onCallInitiated(z, str, voiceCallEntryPoint, C3cH.A0o(map, i & 8), C3cI.A1S(i, z2), AnonymousClass002.A1R(i, z3));
    }

    public static /* synthetic */ void point$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        voiceCallConnectionTracker.point(str, num, AnonymousClass005.A1O(i, z));
    }

    private final String pointKey(String str) {
        return FGI.A0M("point:", str);
    }

    private final void recordActivityClipExposure(long j) {
        if (j < 1000) {
            this.shortClipExposuresUnderOneSecond++;
        }
        if (j < 2000) {
            this.shortClipExposuresUnderTwoSeconds++;
        }
    }

    private final void recordInterSpeechGap(long j) {
        char c;
        if (j < 1000) {
            c = 0;
        } else if (j < 2000) {
            c = 1;
        } else if (j < 4000) {
            c = 2;
        } else {
            c = 4;
            if (j < 8000) {
                c = 3;
            }
        }
        int[] iArr = this.interSpeechGapBuckets;
        iArr[c] = iArr[c] + 1;
    }

    private final void setReconnectCause(VoiceCallReconnectCause voiceCallReconnectCause, boolean z) {
        EnumSet<VoiceCallReconnectCause> enumSet = this.reconnectCauses;
        C7384Etj.A0T(enumSet);
        if (z) {
            enumSet.add(voiceCallReconnectCause);
        } else {
            enumSet.remove(voiceCallReconnectCause);
        }
    }

    private final void updateReconnects() {
        VoiceCallReconnectEpisodes voiceCallReconnectEpisodes = this.reconnects;
        if (voiceCallReconnectEpisodes != null) {
            EnumSet<VoiceCallReconnectCause> enumSet = this.reconnectCauses;
            C7384Etj.A0T(enumSet);
            VoiceCallReconnectEpisode voiceCallReconnectEpisodeUpdate = voiceCallReconnectEpisodes.update(enumSet, SystemClock.elapsedRealtime(), this.networkType);
            if (voiceCallReconnectEpisodeUpdate != null) {
                logReconnectEpisode(voiceCallReconnectEpisodes.callId, voiceCallReconnectEpisodeUpdate);
            }
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void logReconnectEpisode(String str, VoiceCallReconnectEpisode voiceCallReconnectEpisode) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String value = VoiceCallReconnectEventField.CALL_ID.getValue();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        c0924AIaA0u.put(value, str2);
        String value2 = VoiceCallReconnectEventField.CALL_ATTEMPT_ID.getValue();
        if (str == null) {
            str = "";
        }
        c0924AIaA0u.put(value2, str);
        c0924AIaA0u.put(VoiceCallReconnectEventField.EPISODE.getValue(), String.valueOf(voiceCallReconnectEpisode.index));
        c0924AIaA0u.put(VoiceCallReconnectEventField.CAUSE.getValue(), voiceCallReconnectEpisode.cause.getValue());
        c0924AIaA0u.put(VoiceCallReconnectEventField.CAUSES.getValue(), joinCauses(voiceCallReconnectEpisode.causes));
        c0924AIaA0u.put(VoiceCallReconnectEventField.OUTCOME.getValue(), voiceCallReconnectEpisode.outcome.getValue());
        C3cH.A1A(VoiceCallReconnectEventField.DURATION_MS.getValue(), c0924AIaA0u, voiceCallReconnectEpisode.durationMs);
        C3cH.A1A(VoiceCallReconnectEventField.SINCE_CONNECT_MS.getValue(), c0924AIaA0u, voiceCallReconnectEpisode.sinceConnectMs);
        VoiceCallRejoinOutcome voiceCallRejoinOutcome = voiceCallReconnectEpisode.rejoinOutcome;
        if (voiceCallRejoinOutcome != null) {
            c0924AIaA0u.put(VoiceCallReconnectEventField.REJOIN_OUTCOME.getValue(), voiceCallRejoinOutcome.getValue());
        }
        String str3 = voiceCallReconnectEpisode.networkTypeStart;
        if (str3 != null) {
            c0924AIaA0u.put(VoiceCallReconnectEventField.NETWORK_TYPE_START.getValue(), str3);
        }
        String str4 = voiceCallReconnectEpisode.networkTypeEnd;
        if (str4 != null) {
            c0924AIaA0u.put(VoiceCallReconnectEventField.NETWORK_TYPE_END.getValue(), str4);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        CFK.A03(c0924AIaA0K, TAG, "Voice call reconnect episode %s");
        HatchAppEventLogger.INSTANCE.logEvent(RECONNECT_EVENT_NAME, "voice_mode", null, "outcome", "voice_call_session", c0924AIaA0K, null);
    }

    private final VoiceCallRejoinOutcome rejoinOutcomeOnEnd(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1536448533:
                str2 = END_REASON_START_ERROR;
                break;
            case -372606278:
                str2 = END_REASON_START_FAILED;
                break;
            case -19940768:
                str2 = END_REASON_NETWORK_DROP;
                break;
            case 495510284:
                if (str.equals(END_REASON_CONNECT_TIMEOUT)) {
                    return VoiceCallRejoinOutcome.TIMEOUT;
                }
                return null;
            case 1001110960:
                str2 = END_REASON_NO_NETWORK;
                break;
            case 1149972581:
                str2 = END_REASON_SERVER_TIMEOUT;
                break;
            default:
                return null;
        }
        if (str.equals(str2)) {
            return VoiceCallRejoinOutcome.FAILED;
        }
        return null;
    }

    private final void safeQpl(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
        }
    }

    private final int toQplInt(long j) {
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker$logEmbodimentTransition$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends String>, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(Map.Entry<String, String> entry) {
            C7384Etj.A0Y(entry, 0);
            String key = entry.getKey();
            String value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) key);
            return AnonymousClass006.A0y(value, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, sb);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
            return invoke2((Map.Entry<String, String>) entry);
        }
    }

    public static /* synthetic */ void annotate$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        voiceCallConnectionTracker.annotate(str, i, num);
    }

    public final synchronized void annotate(String str, int i, Integer num) {
        C7384Etj.A0Y(str, 0);
        Integer num2 = this.openInstanceKey;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (num == null || iIntValue == num.intValue()) {
                try {
                    HatchQplLogger.INSTANCE.markerAnnotate(734857354, str, i, iIntValue);
                } catch (Exception e) {
                    CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
                }
            }
        }
    }

    public static /* synthetic */ void annotate$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, long j, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        voiceCallConnectionTracker.annotate(str, j, num);
    }

    public final synchronized void annotate(String str, boolean z, Integer num) {
        C7384Etj.A0Y(str, 0);
        Integer num2 = this.openInstanceKey;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (num == null || iIntValue == num.intValue()) {
                try {
                    HatchQplLogger.INSTANCE.markerAnnotate(734857354, str, z, iIntValue);
                } catch (Exception e) {
                    CFK.A0A(TAG, "Voice call QPL marker operation failed", e);
                }
            }
        }
    }

    public final void annotate(String str, long j, Integer num) {
        C7384Etj.A0Y(str, 0);
        annotate(str, toQplInt(j), num);
    }

    public static /* synthetic */ void annotate$default(VoiceCallConnectionTracker voiceCallConnectionTracker, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        voiceCallConnectionTracker.annotate(str, str2, num);
    }
}
